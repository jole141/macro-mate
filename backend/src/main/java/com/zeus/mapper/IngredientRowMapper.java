package com.zeus.mapper;

import com.zeus.model.Ingredient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IngredientRowMapper implements RowMapper<Ingredient> {
    @Override
    public Ingredient mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Ingredient(
                resultSet.getLong("ingredient_id"),
                resultSet.getString("ingredient_name")
        );
    }
}
