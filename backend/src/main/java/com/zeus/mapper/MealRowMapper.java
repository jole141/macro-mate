package com.zeus.mapper;

import com.zeus.model.Meal;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MealRowMapper implements RowMapper<Meal> {
    @Override
    public Meal mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Meal(
                resultSet.getLong("meal_id"),
                resultSet.getString("meal_name"),
                resultSet.getLong("meal_plan_id"),
                resultSet.getString("description"),
                resultSet.getString("preparation_time"),
                resultSet.getLong("meal_type_id"),
                resultSet.getTimestamp("meal_date_time")
        );
    }
}
