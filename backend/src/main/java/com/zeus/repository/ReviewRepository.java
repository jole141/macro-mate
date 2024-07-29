package com.zeus.repository;

import com.zeus.model.Review;

public interface ReviewRepository {

    void ratePersonalTrainer(Long clientId, Long personalTrainerId, int rating);

    Review isPersonalTrainerRatedByClient(Long clientId, Long personalTrainerId);

    Review getPersonalTrainerRating(Long personalTrainerId);

}
