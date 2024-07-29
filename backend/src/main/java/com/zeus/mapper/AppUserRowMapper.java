package com.zeus.mapper;

import com.zeus.model.AppUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppUserRowMapper implements RowMapper<AppUser> {
    @Override
    public AppUser mapRow(ResultSet resultSet, int i) throws SQLException {
        return new AppUser(
                resultSet.getLong("user_id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getString("email"),
                resultSet.getDouble("height"),
                resultSet.getString("description"),
                resultSet.getLong("role_id")
        );
    }
}
