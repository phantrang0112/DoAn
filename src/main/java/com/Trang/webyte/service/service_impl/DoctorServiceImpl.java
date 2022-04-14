package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.DoctorMapper;
import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.model.DoctorExample;
import com.Trang.webyte.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorMapper doctorMapper;
    @Override
    public List<Doctor> getAllListDoctor() {
        DoctorExample doctorExample= new DoctorExample();
        List<Doctor> listDoctor= doctorMapper.selectByExample(doctorExample);
        if(listDoctor!=null){
            return  listDoctor;
        }
        else{
            return null;
        }

    }

    @Override
    public Doctor getDoctor(int key) {
        Doctor doctor= doctorMapper.selectByPrimaryKey(key);
        if(doctor!=null){
            return  doctor;
        }
        else {
            return null;
        }

    }

    @Override
    public Doctor insertDoctor(Doctor doctor) {
        int success= doctorMapper.insertSelective(doctor);
        if(success>0){
            return doctor;
        }
        else {
            return null;
        }

    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        int success= doctorMapper.updateByPrimaryKeySelective(doctor);
        if(success>0){
            return  doctor;
        }
        else{
            return null;
        }

    }

    @Override
    public int deleteDoctor(int id) {
        int success=doctorMapper.deleteByPrimaryKey(id);
        if(success>0){
            return 1;
        }
        else{
            return 0;
        }

    }

}
