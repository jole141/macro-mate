package com.zeus.service.impl;

import com.zeus.dto.UserInfoDTO;
import com.zeus.exception.DuplicateEmailException;
import com.zeus.exception.DuplicateUsernameException;
import com.zeus.exception.EntityNotFoundException;
import com.zeus.model.AppUser;
import com.zeus.model.Review;
import com.zeus.model.Role;
import com.zeus.repository.ReviewRepository;
import com.zeus.repository.RoleRepository;
import com.zeus.repository.UserRepository;
import com.zeus.service.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final static String CLIENT_ROLE = "client";
    private final static String USER_NOT_FOUND = "User not found in the database";
    private final static String ROLE_NOT_FOUND = "Role not found in the database";

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final ReviewRepository reviewRepository;

    public UserServiceImpl(PasswordEncoder passwordEncoder, UserRepository userRepository, RoleRepository roleRepository, ReviewRepository reviewRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.reviewRepository = reviewRepository;
    }

    @Override
    public AppUser saveUser(AppUser appUser, String roleName) {
        Role role = roleRepository.findByName(roleName);
        if (role == null) throw new EntityNotFoundException(ROLE_NOT_FOUND);
        AppUser oUserWithSameUsername = userRepository.findByUsername(appUser.getUsername());
        if (oUserWithSameUsername != null) throw new DuplicateUsernameException();
        AppUser oUserWithSameEmail = userRepository.findByEmail(appUser.getEmail());
        if (oUserWithSameEmail != null) throw new DuplicateEmailException();
        appUser.setRoleId(role.getId());
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        Long appUserId = userRepository.saveUser(appUser);
        Long weighingDateId = userRepository.findWeighingDate(new Date());
        if (weighingDateId == null) weighingDateId = userRepository.insertWeighingDate();
        if(roleName.equals(CLIENT_ROLE)) userRepository.saveUserWeight(appUser.getWeight(), appUserId, weighingDateId);
        return appUser;
    }

    @Override
    public AppUser getUserByUsername(String username) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        return appUser;
    }

    @Override
    public UserInfoDTO getUserInfoByUsername(String username) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Role role = roleRepository.findById(appUser.getRoleId());
        Double weight = userRepository.getUserWeight(appUser.getId());
        Double bmi = userRepository.getUserBmi(appUser.getId());
        UserInfoDTO userInfoDTO = new UserInfoDTO(appUser.getId(), appUser.getFirstName(), appUser.getLastName(),
                appUser.getUsername(), appUser.getEmail(), weight, appUser.getHeight(), bmi, null, appUser.getDescription(), role);
        if (role.getName().equals(CLIENT_ROLE)) {
            Long personalTrainerId = userRepository.findClientsTrainer(appUser.getId());
            if (personalTrainerId != null) {
                AppUser personalTrainer = userRepository.findById(personalTrainerId);
                Review review = reviewRepository.getPersonalTrainerRating(appUser.getId());
                Double rating = null;
                if (review != null) {
                    rating = review.getRating();
                }
                userInfoDTO.setPersonalTrainer(new UserInfoDTO(personalTrainer.getId(), personalTrainer.getFirstName(), personalTrainer.getLastName(),
                        personalTrainer.getUsername(), personalTrainer.getEmail(), null, personalTrainer.getHeight(), null, rating, personalTrainer.getDescription(), null));
            }
        }
        return userInfoDTO;
    }

    @Override
    public void updateClientsInfo(String username, Double height, Double weight) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Long weighingDateId = userRepository.findWeighingDate(new Date());
        if (weighingDateId == null) weighingDateId = userRepository.insertWeighingDate();
        Double weightMaybe = userRepository.getUserWeight(appUser.getId());
        if (weightMaybe != null) userRepository.deleteUserWeight(appUser.getId(), weighingDateId);
        userRepository.saveUserWeight(weight, appUser.getId(), weighingDateId);
        userRepository.updateClientsInfo(username, height);
    }

    @Override
    public void updateTrainersInfo(String username, String description) {
        userRepository.updateTrainersInfo(username, description);
    }

    @Override
    public List<UserInfoDTO> getAllTrainers() {
        List<AppUser> appUsers = userRepository.findAllTrainers();
        if (appUsers == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        List<UserInfoDTO> trainers = new ArrayList<>();
        for (AppUser appUser : appUsers) {
            Role role = roleRepository.findById(appUser.getRoleId());
            Review review = reviewRepository.getPersonalTrainerRating(appUser.getId());
            Double rating = null;
            if (review != null) {
                rating = review.getRating();
            }
            trainers.add(new UserInfoDTO(appUser.getId(), appUser.getFirstName(), appUser.getLastName(),
                    appUser.getUsername(), appUser.getEmail(), null, appUser.getHeight(), null, rating, appUser.getDescription(), role));
        }

        return trainers;
    }

    @Override
    public List<UserInfoDTO> getTrainersClients(String username) {
        AppUser trainer = getUserByUsername(username);
        List<AppUser> appUsers = userRepository.findTrainersClients(trainer.getId());
        if (appUsers == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        List<UserInfoDTO> clients = new ArrayList<>();
        for (AppUser appUser : appUsers) {
            Role role = roleRepository.findById(appUser.getRoleId());
            Double weight = userRepository.getUserWeight(appUser.getId());
            Double bmi = userRepository.getUserBmi(appUser.getId());
            clients.add(new UserInfoDTO(appUser.getId(), appUser.getFirstName(), appUser.getLastName(),
                    appUser.getUsername(), appUser.getEmail(), weight, appUser.getHeight(), bmi, null, appUser.getDescription(), role));
        }

        return clients;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        Role role = roleRepository.findById(appUser.getRoleId());
        authorities.add(new SimpleGrantedAuthority(role.getName()));
        return new org.springframework.security.core.userdetails.User(appUser.getUsername(), appUser.getPassword(), authorities);
    }

}
