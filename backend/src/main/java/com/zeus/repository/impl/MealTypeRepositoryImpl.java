package com.zeus.repository.impl;

import com.zeus.constants.Sql;
import com.zeus.mapper.MealTypeRowMapper;
import com.zeus.model.MealType;
import com.zeus.repository.MealTypeRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MealTypeRepositoryImpl implements MealTypeRepository {

    private final JdbcTemplate jdbcTemplate;

    public MealTypeRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<MealType> getAllMealTypes() {
        try {
            return jdbcTemplate.query(Sql.GET_ALL_MEAL_TYPE, new MealTypeRowMapper());
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public MealType getMealTypeByName(String name) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_MEAL_TYPE_BY_NAME, new MealTypeRowMapper(), name);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public MealType getMealTypeById(Long id) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_MEAL_TYPE_BY_ID, new MealTypeRowMapper(), id);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
