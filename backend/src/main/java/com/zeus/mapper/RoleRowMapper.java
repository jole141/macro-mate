package com.zeus.mapper;

import com.zeus.model.Role;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleRowMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Role(
                resultSet.getLong("role_id"),
                resultSet.getString("role_name")
        );
    }
}
