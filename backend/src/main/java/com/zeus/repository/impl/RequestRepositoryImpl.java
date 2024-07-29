package com.zeus.repository.impl;

import com.zeus.constants.Sql;
import com.zeus.mapper.AppUserRowMapper;
import com.zeus.mapper.RequestRowMapper;
import com.zeus.model.AppUser;
import com.zeus.model.Request;
import com.zeus.repository.RequestRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RequestRepositoryImpl implements RequestRepository {

    private final JdbcTemplate jdbcTemplate;

    public RequestRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Request getRequestByIds(Long clientId, Long personalTrainerId) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_REQUEST_BY_IDS, new RequestRowMapper(), clientId, personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void sendRequest(Long clientId, Long personalTrainerId) {
        try {
            jdbcTemplate.update(Sql.SEND_REQUEST, clientId, personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void acceptRequest(Long clientId, Long personalTrainerId) {
        try {
            jdbcTemplate.update(Sql.DELETE_REQUEST, clientId, personalTrainerId);
            jdbcTemplate.update(Sql.ACCEPT_REQUEST, clientId, personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void declineRequest(Long clientId, Long personalTrainerId) {
        try {
            jdbcTemplate.update(Sql.DELETE_REQUEST, clientId, personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public List<AppUser> getTrainersRequests(Long personalTrainerId) {
        try {
            return jdbcTemplate.query(Sql.GET_TRAINERS_REQUESTS, new AppUserRowMapper(), personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void quitMembership(Long clientId, Long personalTrainerId) {
        try {
            jdbcTemplate.update(Sql.DELETE_USERS_TRAINER, clientId, personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
