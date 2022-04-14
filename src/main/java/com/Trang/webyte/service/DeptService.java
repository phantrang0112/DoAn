package com.Trang.webyte.service;

import com.Trang.webyte.model.Dept;

import java.util.List;

public interface DeptService {
    public List<Dept> getAllListDept();
    public Dept getDept(int key);
    public Dept insertDept(Dept answer);
    public Dept updateDept(Dept accountDTO);
    public int deleteDept(int id);
}
