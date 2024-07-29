package com.zeus.service;

import com.zeus.dto.UserInfoDTO;

import java.util.List;

public interface RequestService {
    void sendRequest(String clientUsername, Long trainerId);

    void acceptRequest(String personalTrainerUsername, Long clientId);

    void declineRequest(String personalTrainerUsername, Long clientId);

    List<UserInfoDTO> getTrainersRequests(String personalTrainerUsername);

    void quitMembership(String username, Long userId);
}
