package com.zeus.repository;

import com.zeus.model.AppUser;

import java.util.Date;
import java.util.List;

public interface UserRepository {

    AppUser findByUsername(String username);

    AppUser findByEmail(String email);

    AppUser findById(Long id);

    Long findClientsTrainer(Long clientId);

    Long saveUser(AppUser appUser);

    Long insertWeighingDate();

    Long findWeighingDate(Date date);

    void saveUserWeight(double weight, Long appUserId, Long weighingDateId);

    void deleteUserWeight(Long appUserId, Long weighingDateId);

    Double getUserWeight(Long appUserId);

    Double getUserBmi(Long appUserId);

    void updateClientsInfo(String username, Double height);

    void updateTrainersInfo(String username, String description);

    List<AppUser> findAllTrainers();

    List<AppUser> findTrainersClients(Long trainer_id);

}
