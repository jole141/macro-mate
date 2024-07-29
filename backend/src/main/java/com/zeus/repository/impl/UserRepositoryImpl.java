package com.zeus.repository.impl;

import com.zeus.constants.Sql;
import com.zeus.mapper.AppUserRowMapper;
import com.zeus.model.AppUser;
import com.zeus.repository.UserRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public AppUser findByUsername(String username) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_USER_BY_USERNAME, new AppUserRowMapper(), username);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public AppUser findByEmail(String email) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_USER_BY_EMAIL, new AppUserRowMapper(), email);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public AppUser findById(Long id) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_USER_BY_ID, new AppUserRowMapper(), id);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Long findClientsTrainer(Long clientId) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_CLIENTS_TRAINER, (rs, rowNum) -> rs.getLong("personal_trainer_id"), clientId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Long saveUser(AppUser appUser) {
        try {
            return jdbcTemplate.queryForObject(Sql.SAVE_USER, (rs, rowNum) -> rs.getLong("user_id"), appUser.getFirstName(), appUser.getLastName(), appUser.getUsername(), appUser.getPassword(),
                    appUser.getEmail(), appUser.getHeight(), appUser.getDescription(), appUser.getRoleId());
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Long insertWeighingDate() {
        try {
            return jdbcTemplate.queryForObject(Sql.SAVE_WEIGHING_DATE, (rs, rowNum) -> rs.getLong("weighing_date_id"), new Date());
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Long findWeighingDate(Date date) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_WEIGHING_DATE, (rs, rowNum) -> rs.getLong("weighing_date_id"), new Date());
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void saveUserWeight(double weight, Long appUserId, Long weighingDateId) {
        try {
            jdbcTemplate.update(Sql.SAVE_USER_WEIGHT, weight, appUserId, weighingDateId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void deleteUserWeight(Long appUserId, Long weighingDateId) {
        try {
            jdbcTemplate.update(Sql.DELETE_USER_WEIGHT, appUserId, weighingDateId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public Double getUserWeight(Long appUserId) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_USER_WEIGHT_BMI, (rs, rowNum) -> rs.getDouble("weight"), appUserId, appUserId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Double getUserBmi(Long appUserId) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_USER_WEIGHT_BMI, (rs, rowNum) -> rs.getDouble("bmi"), appUserId, appUserId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateClientsInfo(String username, Double height) {
        try {
            jdbcTemplate.update(Sql.UPDATE_CLIENT_HEIGHT, height, username);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void updateTrainersInfo(String username, String description) {
        try {
            jdbcTemplate.update(Sql.UPDATE_TRAINER_INFO, description, username);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public List<AppUser> findAllTrainers() {
        try {
            return jdbcTemplate.query(Sql.GET_ALL_TRAINERS, new AppUserRowMapper());
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public List<AppUser> findTrainersClients(Long trainer_id) {
        try {
            return jdbcTemplate.query(Sql.GET_TRAINERS_CLIENTS, new AppUserRowMapper(), trainer_id);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
