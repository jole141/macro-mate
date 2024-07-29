package com.zeus.service.impl;

import com.zeus.dto.UserInfoDTO;
import com.zeus.exception.EntityNotFoundException;
import com.zeus.exception.RequestAlreadySentException;
import com.zeus.model.AppUser;
import com.zeus.model.Request;
import com.zeus.model.Role;
import com.zeus.repository.RequestRepository;
import com.zeus.repository.RoleRepository;
import com.zeus.repository.UserRepository;
import com.zeus.service.RequestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private final static String USER_NOT_FOUND = "User not found in the database";
    private final static String REQUEST_NOT_FOUND = "Request not found in the database";

    private final RequestRepository requestRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public RequestServiceImpl(RequestRepository requestRepository, UserRepository userRepository, RoleRepository roleRepository) {
        this.requestRepository = requestRepository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void sendRequest(String clientUsername, Long trainerId) {
        AppUser appUser = userRepository.findByUsername(clientUsername);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Request request = requestRepository.getRequestByIds(appUser.getId(), trainerId);
        if (request != null) {
            throw new RequestAlreadySentException();
        }
        requestRepository.sendRequest(appUser.getId(), trainerId);
    }

    @Override
    public void acceptRequest(String personalTrainerUsername, Long clientId) {
        AppUser appUser = userRepository.findByUsername(personalTrainerUsername);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Request request = requestRepository.getRequestByIds(clientId, appUser.getId());
        if (request == null) {
            throw new EntityNotFoundException(REQUEST_NOT_FOUND);
        }
        requestRepository.acceptRequest(clientId, appUser.getId());
    }

    @Override
    public void declineRequest(String personalTrainerUsername, Long clientId) {
        AppUser appUser = userRepository.findByUsername(personalTrainerUsername);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Request request = requestRepository.getRequestByIds(clientId, appUser.getId());
        if (request == null) {
            throw new EntityNotFoundException(REQUEST_NOT_FOUND);
        }
        requestRepository.declineRequest(clientId, appUser.getId());
    }

    @Override
    public List<UserInfoDTO> getTrainersRequests(String personalTrainerUsername) {
        AppUser trainer = userRepository.findByUsername(personalTrainerUsername);
        if (trainer == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        List<AppUser> appUsers = requestRepository.getTrainersRequests(trainer.getId());
        List<UserInfoDTO> requests = new ArrayList<>();
        for (AppUser appUser : appUsers) {
            Role role = roleRepository.findById(appUser.getRoleId());
            Double weight = userRepository.getUserWeight(appUser.getId());
            Double bmi = userRepository.getUserBmi(appUser.getId());
            requests.add(new UserInfoDTO(appUser.getId(), appUser.getFirstName(), appUser.getLastName(),
                    appUser.getUsername(), appUser.getEmail(), weight, appUser.getHeight(), bmi, null, appUser.getDescription(), role));
        }
        return requests;
    }

    @Override
    public void quitMembership(String username, Long userId) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Role role = roleRepository.findById(appUser.getRoleId());
        if (role.getName().equals("client")) {
            requestRepository.quitMembership(appUser.getId(), userId);
        } else {
            requestRepository.quitMembership(userId, appUser.getId());
        }
    }

}
