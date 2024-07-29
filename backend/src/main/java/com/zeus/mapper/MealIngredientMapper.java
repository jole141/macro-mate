package com.zeus.mapper;

import com.zeus.dto.MealIngredientDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MealIngredientMapper implements RowMapper<MealIngredientDTO> {
    @Override
    public MealIngredientDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        return new MealIngredientDTO(
                resultSet.getLong("ingredient_id"),
                resultSet.getString("ingredient_quantity"),
                resultSet.getString("ingredient_name")
        );
    }
}
