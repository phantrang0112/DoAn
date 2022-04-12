package com.Trang.webyte.service;

import com.Trang.webyte.DTO.PatientDTO;
import com.Trang.webyte.DTO.RoleDTO;
import com.Trang.webyte.model.Patient;
import com.Trang.webyte.model.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAllListRole();

    public Role getRole(int id);

    public RoleDTO insertRole(RoleDTO roleDTO);

    public RoleDTO updateRole(RoleDTO roleDTO);

    public int deleteRole(int id);
}
