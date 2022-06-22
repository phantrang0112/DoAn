package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.PrescriptionDTO;
import com.Trang.webyte.DTO.SickDTO;
import com.Trang.webyte.model.Prescription;
import com.Trang.webyte.model.Sick;
import com.Trang.webyte.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webyte/prescriptions")
public class PrescriptionController {
    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping("/get-all-prescription")
    public List<Prescription> getAllPrescriptionList(){
        List<Prescription> prescriptionList= prescriptionService.getAllPrescriptions();
        System.err.println(prescriptionList);
        return prescriptionList!=null ? prescriptionList : null;
    }

    @GetMapping("/{prescriptionId}")
    public Prescription getPrescription(@PathVariable int prescriptionId){
        Prescription prescription= prescriptionService.getPrescription(prescriptionId);
        return prescription!=null ? prescription : null;
    }

    @PostMapping("")
    public PrescriptionDTO insertPrescription(@RequestBody PrescriptionDTO prescriptionDTO){
        PrescriptionDTO prescription = prescriptionService.insertPrescription(prescriptionDTO);
        return prescription!=null ? prescription : null;
    }

    @PutMapping("")
    public PrescriptionDTO updatePrescription(@RequestBody PrescriptionDTO prescriptionDTO){
        PrescriptionDTO prescriptionDTO1 = prescriptionService.updatePrescription(prescriptionDTO);
        return prescriptionDTO1!=null ? prescriptionDTO1 : null;
    }

    @DeleteMapping("/{prescriptionId}")
    public int deletePrescription(@PathVariable int prescriptionId){
        return prescriptionService.deletePrescription(prescriptionId);
    }
}
