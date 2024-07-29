package com.zeus.repository.impl;

import com.zeus.constants.Sql;
import com.zeus.dto.MealDTO;
import com.zeus.mapper.MealPlanRowMapper;
import com.zeus.mapper.MealRowMapper;
import com.zeus.model.Meal;
import com.zeus.model.MealPlan;
import com.zeus.model.MealType;
import com.zeus.repository.MealRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class MealRepositoryImpl implements MealRepository {

    private final JdbcTemplate jdbcTemplate;

    public MealRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Meal> getClientMealPlan(Long clientId, Date weekDay) {
        try {
            return jdbcTemplate.query(Sql.GET_CLIENTS_MEALS, new MealRowMapper(), clientId, weekDay);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Long saveNewMeal(MealDTO mealDTO, Long mealTypeId) {
        try {
            return jdbcTemplate.queryForObject(Sql.SAVE_NEW_MEAL, (rs, rowNum) -> rs.getLong("meal_id"),
                    mealDTO.getMealDateTime(), mealDTO.getName(), mealDTO.getMealPlanId(),
                    mealDTO.getDescription(), mealDTO.getPreparationTime(), mealTypeId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public MealPlan isTrainerConnectedToPlan(Long personalTrainerId, Long mealPlanId) {
        try {
            return jdbcTemplate.queryForObject(Sql.IS_TRAINER_CONNECTED_TO_PLAN, new MealPlanRowMapper(), personalTrainerId, mealPlanId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public MealPlan isTrainerConnectedToClient(Long personalTrainerId, Long clientId) {
        try {
            return jdbcTemplate.queryForObject(Sql.IS_TRAINER_CONNECTED_TO_CLIENT, new MealPlanRowMapper(), personalTrainerId, clientId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void deleteMeal(Long mealId) {
        try {
            jdbcTemplate.update(Sql.DELETE_MEAL, mealId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void updateMeal(MealDTO mealDTO, MealType mealType) {
        try {
            jdbcTemplate.update(Sql.UPDATE_MEAL, mealDTO.getName(), mealDTO.getDescription(), mealDTO.getPreparationTime(), mealDTO.getMealDateTime(), mealType.getId(), mealDTO.getId());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void deleteMealIngredients(Long mealId) {
        try {
            jdbcTemplate.update(Sql.DELETE_MEAL_INGREDIENTS, mealId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
