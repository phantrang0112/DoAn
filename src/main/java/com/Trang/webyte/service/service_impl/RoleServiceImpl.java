package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.RoleDTO;
import com.Trang.webyte.mapper.RoleMapper;
import com.Trang.webyte.model.Role;
import com.Trang.webyte.model.RoleExample;
import com.Trang.webyte.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getAllListRole() {
        RoleExample roleExample = new RoleExample();
        List<Role> roleList = roleMapper.selectByExample(roleExample);
        return roleList;
    }

    @Override
    public Role getRole(int id) {
        return null;
    }

    @Override
    public RoleDTO insertRole(RoleDTO roleDTO) {
        Role role = new Role();
        role.setIdrole(roleDTO.getRoleID());
        role.setRole(roleDTO.getRoleName());
        int success = roleMapper.insertSelective(role);
        if (success > 0) {
            return roleDTO;
        } else {
            return null;
        }
    }

    @Override
    public RoleDTO updateRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public int deleteRole(int id) {
        return 0;
    }
}
