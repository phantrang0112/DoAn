package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.DoctorDTO;
import com.Trang.webyte.mapper.Appointment_ScheduleMapper;
import com.Trang.webyte.mapper.DoctorMapper;
import com.Trang.webyte.mapper.PriceOfMedicalExaminationServiceMapper;
import com.Trang.webyte.model.*;
import com.Trang.webyte.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorMapper doctorMapper;
    @Autowired
    Appointment_ScheduleMapper appointment_scheduleMapper;
    @Autowired
    PriceOfMedicalExaminationServiceMapper priceOfMedicalExaminationServiceMapper;
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
        DoctorExample doctorExample= new DoctorExample();
        doctorExample.createCriteria().andAccountidEqualTo(key);
        List<Doctor> doctorList= doctorMapper.selectByExample(doctorExample);
        return doctorList.get(0);
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
    public DoctorDTO updateDoctor(DoctorDTO doctorDTO) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = formatter.parse(doctorDTO.getBirthday());
            System.err.println(date);
            Doctor doctorUpdate = new Doctor();
            doctorUpdate.setAccountid(doctorDTO.getAccountid());
            doctorUpdate.setDoctorid(doctorDTO.getDoctorid());
            doctorUpdate.setFullname(doctorDTO.getFullname());
            doctorUpdate.setEmail(doctorDTO.getEmail());
            doctorUpdate.setAddress(doctorDTO.getAddress());
//            doctorUpdate.setImg(doctorDTO.getImg());
            doctorUpdate.setPhone(doctorDTO.getPhone());
            doctorUpdate.setBirthday(date);
            System.err.println(doctorUpdate.toString());
            int success = doctorMapper.updateByPrimaryKeySelective(doctorUpdate);
            if (success > 0) {
                return doctorDTO;
            } else {
                return null;
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
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

    @Override
    public List<Map<String,Object>> getListDoctorByDept(int depId, Date date) {
        Map<String,Object> resul= new HashMap<>();
        resul.put("deptid",depId);
        resul.put("date",date);
        List<Map<String,Object>> listDoctor= doctorMapper.getListDoctorByDept(resul);
        return listDoctor;
    }

    @Override
    public Map<String, Object> getPriceDoctor(int id, Date date) {
        Map<String,Object> resual= new HashMap<>();

        PriceOfMedicalExaminationServiceExample price= new PriceOfMedicalExaminationServiceExample();
        price.createCriteria().andDoctortidEqualTo(id);
        List<PriceOfMedicalExaminationService> list = priceOfMedicalExaminationServiceMapper.selectByExample(price);
        Appointment_ScheduleExample appointment_scheduleExample= new Appointment_ScheduleExample();
        appointment_scheduleExample.createCriteria().andDoctoridEqualTo(id).andDateEqualTo(date);
        List<Appointment_Schedule> listApp= appointment_scheduleMapper.selectByExample(appointment_scheduleExample);
        resual.put("price",list.get(0));
        resual.put("listAppoint",listApp);

        return resual;
    }


}
