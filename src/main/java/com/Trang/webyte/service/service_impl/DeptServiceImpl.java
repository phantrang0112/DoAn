package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.DeptMapper;
import com.Trang.webyte.mapper.DoctorMapper;
import com.Trang.webyte.model.Dept;
import com.Trang.webyte.model.DeptExample;
import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.model.DoctorExample;
import com.Trang.webyte.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;

    @Autowired
    DoctorMapper doctorMapper;
    @Override
    public List<Dept> getAllListDept() {
        DeptExample deptExample= new DeptExample();
        List<Dept> listDept= deptMapper.selectByExample(deptExample);
        if(listDept!=null){
            return  listDept;
        }
        else {
            return  null;
        }

    }

    @Override
    public Dept getDept(int key) {
        Dept dept= deptMapper.selectByPrimaryKey(key);
        if(dept!=null){
            return dept;
        }
        else {
            return  null;
        }

    }

    @Override
    public Dept insertDept(Dept dept) {
        int success= deptMapper.insertSelective(dept);
        if(success>0){
            return dept;
        }
        else {
            return null;
        }
    }

    @Override
    public Dept updateDept(Dept updateDept) {
       int success= deptMapper.updateByPrimaryKeySelective(updateDept);
       if(success>0){
           return updateDept;
       }else{
           return  null;
       }
    }

    @Override
    public int deleteDept(int id) {
        DoctorExample doctorExample= new DoctorExample();
        doctorExample.createCriteria().andDeptidEqualTo(id);
        List<Doctor> doctorList = doctorMapper.selectByExample(doctorExample);
        if (Objects.isNull(doctorList.get(0))){
            int success= deptMapper.deleteByPrimaryKey(id);
            if(success>0){
                return  1;
            }
        }
        return 0;
    }
}
