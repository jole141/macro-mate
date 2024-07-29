package com.zeus.mapper;

import com.zeus.model.MealType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MealTypeRowMapper implements RowMapper<MealType> {
    @Override
    public MealType mapRow(ResultSet resultSet, int i) throws SQLException {
        return new MealType(
                resultSet.getLong("meal_type_id"),
                resultSet.getString("meal_type_name")
        );
    }
}
