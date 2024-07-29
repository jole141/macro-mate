package com.zeus.repository;

import com.zeus.dto.MealDTO;
import com.zeus.model.Meal;
import com.zeus.model.MealPlan;
import com.zeus.model.MealType;

import java.util.Date;
import java.util.List;

public interface MealRepository {

    List<Meal> getClientMealPlan(Long clientId, Date weekDate);

    Long saveNewMeal(MealDTO mealDTO, Long mealTypeId);

    MealPlan isTrainerConnectedToPlan(Long personalTrainerId, Long mealPlanId);

    MealPlan isTrainerConnectedToClient(Long personalTrainerId, Long clientId);

    void deleteMeal(Long mealId);

    void updateMeal(MealDTO mealDTO, MealType mealType);

    void deleteMealIngredients(Long mealId);
}
