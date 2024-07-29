package com.zeus.repository.impl;

import com.zeus.constants.Sql;
import com.zeus.mapper.RoleRowMapper;
import com.zeus.model.Role;
import com.zeus.repository.RoleRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class RoleRepositoryImpl implements RoleRepository {

    private final JdbcTemplate jdbcTemplate;

    public RoleRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Role findById(Long id) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_ROLE_BY_ID, new RoleRowMapper(), id);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Role findByName(String name) {
        try {
            return jdbcTemplate.queryForObject(Sql.GET_ROLE_BY_NAME, new RoleRowMapper(), name);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
