package com.Trang.webyte.service.service_impl;


import com.Trang.webyte.mapper.adminMapper;
import com.Trang.webyte.model.admin;
import com.Trang.webyte.model.adminExample;
import com.Trang.webyte.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    com.Trang.webyte.mapper.adminMapper adminMapper;

    @Override
    public admin getAdmin(int key) {
        System.err.println("id = "+ key);
        adminExample adminExample= new adminExample();
        adminExample.createCriteria().andAccountidEqualTo(key);
        List<admin> adminList= adminMapper.selectByExample(adminExample);
        return adminList.get(0);
    }
}
