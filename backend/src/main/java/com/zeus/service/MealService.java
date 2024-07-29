package com.zeus.service;

import com.zeus.dto.MealDTO;
import com.zeus.model.MealType;

import java.util.Date;
import java.util.List;

public interface MealService {

    void saveNewMeal(MealDTO mealDTO, Long clientId, String username);

    List<List<MealDTO>> getClientMeals(String username, Date weekDate);

    List<MealDTO> getClientMealsDay(String username, Date dayDate);

    List<MealType> getAllMealTypes();

    List<List<MealDTO>> getTrainerClientMeals(String username, Long clientId, Date weekDate);

    List<MealDTO> getTrainerClientMealsDay(String username, Long clientId, Date dayDate);

    void deleteMeal(String username, Long mealId);

    void updateMeal(String username, MealDTO mealDTO);

}
