package com.zeus.service;

import com.zeus.model.Ingredient;

import java.util.List;

public interface IngredientService {

    List<Ingredient> searchIngredient(String name);

}
