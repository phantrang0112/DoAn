package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.SickDTO;
import com.Trang.webyte.DTO.SymptomDTO;
import com.Trang.webyte.model.Sick;
import com.Trang.webyte.model.Symptom;
import com.Trang.webyte.service.SickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sicks")
public class SickController {
    @Autowired
    SickService sickService;

    @GetMapping("/get-all-sick")
    public List<Sick> getAllSickList(){
        List<Sick> symptomList= sickService.getAllSick();
        return symptomList!=null ? symptomList : null;
    }

    @GetMapping("/{sickId}")
    public Sick getSick(@PathVariable int sickId){
        Sick symptom= sickService.getSick(sickId);
        return symptom!=null ? symptom : null;
    }

    @PostMapping("")
    public SickDTO insertSick(@RequestBody SickDTO sickDTO){
        SickDTO sickDTO1 = sickService.insertSick(sickDTO);
        return sickDTO1!=null ? sickDTO1 : null;
    }

    @PutMapping("")
    public SickDTO updateSick(@RequestBody SickDTO sickDTO){
        SickDTO sickDTO1 = sickService.updateSick(sickDTO);
        return sickDTO1!=null ? sickDTO1 : null;
    }

    @DeleteMapping("/{sickId}")
    public int deleteSick(@PathVariable int sickId){
        return sickService.deleteSick(sickId);
    }
}
