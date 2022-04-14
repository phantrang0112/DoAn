package com.Trang.webyte.service;

import com.Trang.webyte.model.Dept;
import com.Trang.webyte.model.Doctor;

import java.util.List;

public interface DoctorService {
    public List<Doctor> getAllListDoctor();
    public Doctor getDoctor(int key);
    public Doctor insertDoctor(Doctor doctor);
    public Doctor updateDoctor(Doctor doctor);
    public int deleteDoctor(int id);
}
