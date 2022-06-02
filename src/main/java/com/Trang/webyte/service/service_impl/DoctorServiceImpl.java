package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.DoctorDTO;
import com.Trang.webyte.mapper.DoctorMapper;
import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.model.DoctorExample;
import com.Trang.webyte.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public Doctor getDoctorFormLogin(int key) {
        DoctorExample doctorExample = new DoctorExample();
        doctorExample.createCriteria().andAccountidEqualTo(key);
        List<Doctor> doctor = doctorMapper.selectByExample(doctorExample);
        if(doctor!=null){
            return  doctor.get(0);
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

    @Override
    public List<Map<String,Object>> selectAllDoctor() {
        List<Map<String,Object>>  listDoctorDTO=  doctorMapper.selectAllDoctor();
        if(listDoctorDTO.size()>0){
            return listDoctorDTO;
        }
        else {
            return null;
        }

    }

}
