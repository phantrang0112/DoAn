package com.Trang.webyte.controller;

import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.model.PriceOfMedicalExaminationService;
import com.Trang.webyte.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/webyte/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping()
    public List<Doctor> getAllDoctor(){
        List<Doctor> listDoctor= doctorService.getAllListDoctor();
        return  listDoctor;
    }
    @GetMapping("/{deptid}/{date}")
    public List<Map<String,Object>> getAllDoctorByDept(@PathVariable("deptid") int deptid, @PathVariable("date") String day) throws ParseException {
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(deptid+day);
        Date date = formatter2.parse(day);
        List<Map<String,Object>> listDoctor= doctorService.getListDoctorByDept(deptid,date);
        return  listDoctor;
    }
    @GetMapping("get-price-doctor/{id}")
    public PriceOfMedicalExaminationService getPriceDoctor(@PathVariable("id")int id){
        PriceOfMedicalExaminationService price= doctorService.getPriceDoctor(id);
        return  price;
    }
    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable("id")int id){
        Doctor doctor;
        doctor = doctorService.getDoctor(id);
        if(doctor != null){
            return  doctor;
        }
        else {
            return  null;
        }


    }
    @PostMapping()
    public Doctor createDoctor(@RequestBody Doctor doctor){
        if(doctor!=null){
            Doctor newDoctor= doctorService.insertDoctor(doctor);
            return  newDoctor;
        }
        else{
            return  null;
        }
    }
    @PutMapping("{id}")
    public Doctor updateDoctor(@PathVariable("id") int id, @RequestBody Doctor doctor){
        if(doctor!=null){
            Doctor updateDoctor= doctorService.updateDoctor(doctor);
            return  updateDoctor;
        }
        else{
            return null;
        }
    }
    @DeleteMapping("{id}")
    public int deleteDoctor(@PathVariable("id")int id){
        if(id>0){
             int success= doctorService.deleteDoctor(id);
             return success;
        }
        else {
            return 0;
        }
    }
    @GetMapping("/all")
    public List<Map<String,Object>>  getAllDoctor1(){
        List<Map<String,Object>>  listDoctor= doctorService.selectAllDoctor();
        return listDoctor;
    }
}
