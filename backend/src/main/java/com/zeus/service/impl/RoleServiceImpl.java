package com.zeus.service.impl;

import com.zeus.model.Role;
import com.zeus.repository.RoleRepository;
import com.zeus.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id);
    }
}
