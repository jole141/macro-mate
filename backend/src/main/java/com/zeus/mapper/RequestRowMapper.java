package com.zeus.mapper;

import com.zeus.model.Request;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestRowMapper implements RowMapper<Request> {
    @Override
    public Request mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Request(
                resultSet.getLong("client_id"),
                resultSet.getLong("personal_trainer_id")
        );
    }
}
