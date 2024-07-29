package com.zeus.repository;

import com.zeus.model.AppUser;
import com.zeus.model.Request;

import java.util.List;

public interface RequestRepository {

    Request getRequestByIds(Long clientId, Long personalTrainerId);

    void sendRequest(Long clientId, Long personalTrainerId);

    void acceptRequest(Long clientId, Long personalTrainerId);

    void declineRequest(Long clientId, Long personalTrainerId);

    List<AppUser> getTrainersRequests(Long personalTrainerId);

    void quitMembership(Long clientId, Long personalTrainerId);
}
