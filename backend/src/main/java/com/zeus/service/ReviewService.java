package com.zeus.service;

import com.zeus.model.Review;

public interface ReviewService {

    void ratePersonalTrainer(String username, Long personalTrainerId, int rating);

    Review isPersonalTrainerRatedByClient(String username, Long personalTrainerId);

    Review getPersonalTrainerRating(Long trainerId);

}
