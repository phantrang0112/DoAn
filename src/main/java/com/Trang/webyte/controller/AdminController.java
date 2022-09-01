package com.Trang.webyte.controller;

import com.Trang.webyte.model.admin;
import com.Trang.webyte.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/{id}")
    public admin getAdminByIdAccount(@PathVariable("id") int id) {
        return adminService.getAdmin(id);
    }
}
