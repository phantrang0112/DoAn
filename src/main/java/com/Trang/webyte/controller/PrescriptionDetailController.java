package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.PrescriptionDTO;
import com.Trang.webyte.DTO.PrescriptionDetailDTO;
import com.Trang.webyte.model.Prescription;
import com.Trang.webyte.model.Prescription_Detail;
import com.Trang.webyte.model.Prescription_DetailKey;
import com.Trang.webyte.service.PrescriptionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescriptionDetails")
public class PrescriptionDetailController {
    @Autowired
    PrescriptionDetailService prescriptionDetailService;

    @GetMapping("/get-all-prescriptionDetail")
    public List<Prescription_Detail> getAllPrescriptionDetailList(){
        List<Prescription_Detail> prescriptionList= prescriptionDetailService.getAllPrescriptionDetails();
        return prescriptionList!=null ? prescriptionList : null;
    }

    @GetMapping("/{prescriptionDetailId}")
    public Prescription_Detail getPrescriptionDetail(@PathVariable Prescription_DetailKey prescriptionDetailId){

        Prescription_Detail prescription= prescriptionDetailService.getPrescriptionDetail(prescriptionDetailId);
        return prescription!=null ? prescription : null;
    }

    @PostMapping("")
    public PrescriptionDetailDTO insertPrescriptionDetail(@RequestBody PrescriptionDetailDTO prescriptionDetailDTO){
        PrescriptionDetailDTO prescription = prescriptionDetailService.insertPrescriptionDetail(prescriptionDetailDTO);
        return prescription!=null ? prescription : null;
    }

    @PutMapping("")
    public PrescriptionDetailDTO updatePrescriptionDetail(@RequestBody PrescriptionDetailDTO prescriptionDetailDTO){
        PrescriptionDetailDTO prescription = prescriptionDetailService.updatePrescriptionDetail(prescriptionDetailDTO);
        return prescription!=null ? prescription : null;
    }

    @DeleteMapping("/{prescriptionDetailId}")
    public int deletePrescriptionDetail(@PathVariable Prescription_DetailKey prescriptionDetailId){
        return prescriptionDetailService.deletePrescriptionDetail(prescriptionDetailId);
    }
}
