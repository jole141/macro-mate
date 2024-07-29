package com.zeus.repository;

import com.zeus.model.Role;

public interface RoleRepository {

    Role findById(Long id);

    Role findByName(String name);
}
