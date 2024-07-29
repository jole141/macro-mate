package com.zeus.repository.impl;

import com.zeus.constants.Sql;
import com.zeus.mapper.ReviewRowMapper;
import com.zeus.model.Review;
import com.zeus.repository.ReviewRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository {

    private final JdbcTemplate jdbcTemplate;

    public ReviewRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void ratePersonalTrainer(Long clientId, Long personalTrainerId, int rating) {
        try {
            jdbcTemplate.update(Sql.RATE_PERSONAL_TRAINER, rating, clientId, personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public Review isPersonalTrainerRatedByClient(Long clientId, Long personalTrainerId) {
        try {
            return jdbcTemplate.queryForObject(Sql.IS_PERSONAL_TRAINER_RATED_BY_CLIENT, new ReviewRowMapper(), clientId, personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Review getPersonalTrainerRating(Long personalTrainerId) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_PERSONAL_TRAINER_RATING, new ReviewRowMapper(), personalTrainerId);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
