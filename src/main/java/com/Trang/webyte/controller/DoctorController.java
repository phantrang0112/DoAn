package com.Trang.webyte.controller;

import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/webyte/Doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping()
    public List<Doctor> getAllDoctor(){
        List<Doctor> listDoctor= doctorService.getAllListDoctor();
        return  listDoctor;
    }
    @GetMapping("{id}")
    public Doctor getDoctor(@PathVariable("id")int id){
        if(id>0){
            Doctor doctor= doctorService.getDoctor(id);
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
}