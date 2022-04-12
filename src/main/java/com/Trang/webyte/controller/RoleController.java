package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.RoleDTO;
import com.Trang.webyte.model.Role;
import com.Trang.webyte.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/get-all-role")
    public List<Role> gelAllListRole(){
        List<Role> roleList= roleService.getAllListRole();
        if (roleList!=null){
            return roleList;
        } else {
            return null;
        }
    }

    @PostMapping("")
    public RoleDTO insertRole(@RequestBody RoleDTO roleDTO){
        RoleDTO role;
        role= roleService.insertRole(roleDTO);
        if (role!=null){
            return role;
        } else {
            return null;
        }
    }
}
