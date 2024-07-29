package com.zeus.mapper;

import com.zeus.model.MealPlan;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MealPlanRowMapper implements RowMapper<MealPlan> {
    @Override
    public MealPlan mapRow(ResultSet resultSet, int i) throws SQLException {
        return new MealPlan(
                resultSet.getLong("meal_plan_id"),
                resultSet.getLong("personal_trainer_id"),
                resultSet.getLong("client_id")
        );
    }
}
