package com.Trang.webyte.service;

import com.Trang.webyte.DTO.DoctorDTO;
import com.Trang.webyte.model.Dept;
import com.Trang.webyte.model.Doctor;

import java.util.List;
import java.util.Map;

public interface DoctorService {
    public List<Doctor> getAllListDoctor();
    public Doctor getDoctor(int key);
    public Doctor getDoctorFormLogin(int key);
    public Doctor insertDoctor(Doctor doctor);
    public Doctor updateDoctor(Doctor doctor);
    public int deleteDoctor(int id);
    List<Map<String,Object>>  selectAllDoctor();
}
