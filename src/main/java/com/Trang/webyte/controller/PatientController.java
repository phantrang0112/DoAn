package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.PatientDTO;
import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.Patient;
import com.Trang.webyte.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/get-all-patient")
    public List<Patient> getAllPatients() {
        List<Patient> patientList = patientService.getAllListPatient();
        if (patientList != null) {
            return patientList;
        } else {
            return null;
        }
    }

    @GetMapping("/{patientId}")
    public Patient getPatient(@PathVariable int patientId) {
        Patient patient;
        patient = patientService.getPatient(patientId);
        System.err.println("PatientInfo = " + patient.toString());
        if (patient != null) {
            return patient;
        } else {
            return null;
        }
    }

    @PutMapping("/update")
    public PatientDTO updatePatient(@RequestBody PatientDTO patientDTO) {
        PatientDTO patient;
        System.err.println("PatientUpdate = "+patientDTO.toString());
        patient = patientService.updatePatient(patientDTO);
        if (patient != null) {
            return patient;
        } else {
            return null;
        }
    }

    @PostMapping("")
    public PatientDTO insertPatient(@RequestBody PatientDTO patientDTO){
        PatientDTO patient;
        patient= patientService.insertPatient(patientDTO);
        if (patient!=null){
            return patient;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{patientId}")
    public int deletePatient(@PathVariable int patientId){
        return patientService.deletePatient(patientId) ;
    }
}
