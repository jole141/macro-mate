package com.zeus.service;

import com.zeus.dto.UserInfoDTO;
import com.zeus.model.AppUser;

import java.util.List;

public interface UserService {

    AppUser saveUser(AppUser appUser, String roleName);

    AppUser getUserByUsername(String username);

    UserInfoDTO getUserInfoByUsername(String username);

    void updateClientsInfo(String username, Double height, Double weight);

    void updateTrainersInfo(String username, String description);

    List<UserInfoDTO> getAllTrainers();

    List<UserInfoDTO> getTrainersClients(String username);

}
