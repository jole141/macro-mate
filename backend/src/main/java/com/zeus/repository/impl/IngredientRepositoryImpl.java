package com.zeus.repository.impl;

import com.zeus.constants.Sql;
import com.zeus.dto.MealIngredientDTO;
import com.zeus.mapper.IngredientRowMapper;
import com.zeus.mapper.MealIngredientMapper;
import com.zeus.model.Ingredient;
import com.zeus.repository.IngredientRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IngredientRepositoryImpl implements IngredientRepository {

    private final JdbcTemplate jdbcTemplate;

    public IngredientRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Ingredient> searchIngredient(String name) {
        try {
            return jdbcTemplate.query(Sql.SEARCH_INGREDIENT, new IngredientRowMapper(), "%" + name + "%");
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void saveMealIngredient(MealIngredientDTO mealIngredientDTO, Long mealId) {
        try {
            jdbcTemplate.update(Sql.SAVE_MEAL_INGREDIENTS, mealIngredientDTO.getQuantity(), mealId, mealIngredientDTO.getId());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public List<MealIngredientDTO> getMealIngredients(Long mealId) {
        try {
            return jdbcTemplate.query(Sql.GET_MEAL_INGREDIENTS, new MealIngredientMapper(), mealId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
