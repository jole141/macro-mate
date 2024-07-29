package com.zeus.service.impl;

import com.zeus.model.Ingredient;
import com.zeus.repository.IngredientRepository;
import com.zeus.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> searchIngredient(String name) {
        return ingredientRepository.searchIngredient(name);
    }
}
