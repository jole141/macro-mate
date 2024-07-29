package com.zeus.service.impl;

import com.zeus.exception.EntityNotFoundException;
import com.zeus.exception.PersonalTrainerAlreadyRatedException;
import com.zeus.model.AppUser;
import com.zeus.model.MealPlan;
import com.zeus.model.Review;
import com.zeus.repository.MealRepository;
import com.zeus.repository.ReviewRepository;
import com.zeus.repository.UserRepository;
import com.zeus.service.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final static String USER_NOT_FOUND = "User not found in the database";
    private final static String TRAINER_CLIENT_EXCEPTION = "Trainer is not connected to that client";

    private final UserRepository userRepository;
    private final ReviewRepository reviewRepository;
    private final MealRepository mealRepository;

    public ReviewServiceImpl(UserRepository userRepository, ReviewRepository reviewRepository, MealRepository mealRepository) {
        this.userRepository = userRepository;
        this.reviewRepository = reviewRepository;
        this.mealRepository = mealRepository;
    }


    @Override
    public void ratePersonalTrainer(String username, Long personalTrainerId, int rating) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        MealPlan mealPlan = mealRepository.isTrainerConnectedToClient(personalTrainerId, appUser.getId());
        if (mealPlan == null) {
            throw new EntityNotFoundException(TRAINER_CLIENT_EXCEPTION);
        }
        Review review = reviewRepository.isPersonalTrainerRatedByClient(appUser.getId(), personalTrainerId);
        if (review != null) {
            throw new PersonalTrainerAlreadyRatedException();
        }
        reviewRepository.ratePersonalTrainer(appUser.getId(), personalTrainerId, rating);
    }

    @Override
    public Review isPersonalTrainerRatedByClient(String username, Long personalTrainerId) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        MealPlan mealPlan = mealRepository.isTrainerConnectedToClient(personalTrainerId, appUser.getId());
        if (mealPlan == null) {
            throw new EntityNotFoundException(TRAINER_CLIENT_EXCEPTION);
        }
        Review review = reviewRepository.isPersonalTrainerRatedByClient(appUser.getId(), personalTrainerId);
        if(review == null) {
            review = new Review(null);
        }
        return review;
    }

    @Override
    public Review getPersonalTrainerRating(Long trainerId) {
        AppUser appUser = userRepository.findById(trainerId);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        return reviewRepository.getPersonalTrainerRating(appUser.getId());
    }
}
