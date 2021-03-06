package com.Trang.webyte.service;

import com.Trang.webyte.DTO.DoctorDTO;
import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.model.PriceOfMedicalExaminationService;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DoctorService {
    public List<Doctor> getAllListDoctor();
    public Doctor getDoctor(int key);
    public Doctor getDoctorFormLogin(int key);
    public Doctor insertDoctor(Doctor doctor);
    public DoctorDTO updateDoctor(DoctorDTO doctor);
    public int deleteDoctor(int id);
    List<Map<String,Object>>  selectAllDoctor();
    public List<Map<String,Object>>getListDoctorByDept(int deptId, Date date);
    public Map<String,Object> getPriceDoctor(int id,Date date);
}
