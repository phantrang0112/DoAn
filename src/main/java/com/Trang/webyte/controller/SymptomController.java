package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.SymptomDTO;
import com.Trang.webyte.DTO.TopicDTO;
import com.Trang.webyte.model.Symptom;
import com.Trang.webyte.model.Topic;
import com.Trang.webyte.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/symptoms")
public class SymptomController {
    @Autowired
    SymptomService symptomService;

    @GetMapping("/get-all-symptom")
    public List<Symptom> getAllSymptomList(){
        List<Symptom> symptomList= symptomService.getAllSymptom();
        return symptomList!=null ? symptomList : null;
    }

    @GetMapping("/{symptomId}")
    public Symptom getSymptom(@PathVariable int symptomId){
        Symptom symptom= symptomService.getSymptom(symptomId);
        return symptom!=null ? symptom : null;
    }

    @PostMapping("")
    public SymptomDTO insertSymptom(@RequestBody SymptomDTO symptomDTO){
        SymptomDTO symptom = symptomService.insertSymptom(symptomDTO);
        return symptomDTO!=null ? symptomDTO : null;
    }

    @PutMapping("")
    public SymptomDTO updateSymptom(@RequestBody SymptomDTO symptomDTO){
        SymptomDTO symptom = symptomService.updateSymptom(symptomDTO);
        return symptom!=null ? symptom : null;
    }

    @DeleteMapping("/{symptomId}")
    public int deleteSymptom(@PathVariable int symptomId){
        return symptomService.deleteSymptom(symptomId);
    }
}
