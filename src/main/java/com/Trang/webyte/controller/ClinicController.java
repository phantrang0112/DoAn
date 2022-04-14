package com.Trang.webyte.controller;

import com.Trang.webyte.model.Clinic;
import com.Trang.webyte.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webyte/clinic")
public class ClinicController {
    @Autowired
    ClinicService clinicService;
    @GetMapping("")
    public List<Clinic> getAllClinic(){
        List<Clinic> clinicList= clinicService.getAllListClinic();
        return clinicList;
    }
    @GetMapping("{id}")
    public Clinic getClinic(@PathVariable("id") int id){
        Clinic clinic= clinicService.getClinic(id);
        return clinic;
    }
    @PostMapping("")
    public Clinic createClinic(@RequestBody Clinic clinic){
        Clinic newClinic= clinicService.insertClinic(clinic);
        return  newClinic;
    }
    @PutMapping("{id}")
    public Clinic updateClinic(@PathVariable("id") int id, @RequestBody Clinic clinic){
        Clinic updateClinic= clinicService.updateClinic(clinic);
        return updateClinic;
    }
    @DeleteMapping("{id}")
    public int deleteClinic(@PathVariable("id")int id){
        int success= clinicService.deleteClinic(id);
        return success;
    }
}
