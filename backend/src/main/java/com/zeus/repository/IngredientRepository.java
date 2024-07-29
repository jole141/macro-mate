package com.zeus.repository;

import com.zeus.dto.MealIngredientDTO;
import com.zeus.model.Ingredient;

import java.util.List;

public interface IngredientRepository {

    List<Ingredient> searchIngredient(String name);

    void saveMealIngredient(MealIngredientDTO mealIngredientDTO, Long mealId);

    List<MealIngredientDTO> getMealIngredients(Long mealId);

}
