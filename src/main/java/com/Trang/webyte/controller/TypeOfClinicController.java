package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.TopicDTO;
import com.Trang.webyte.DTO.TypeOfClinicDTO;
import com.Trang.webyte.model.Topic;
import com.Trang.webyte.model.Type_Of_Clinic;
import com.Trang.webyte.service.TypeOfClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeOfClinics")
public class TypeOfClinicController {
    @Autowired
    TypeOfClinicService typeOfClinicService;

    @GetMapping("/get-all-typeOfClinics")
    public List<Type_Of_Clinic> getAllTypeOfClinicsList() {
        List<Type_Of_Clinic> type_of_clinicList = typeOfClinicService.getAllTOCList();
        return type_of_clinicList != null ? type_of_clinicList : null;
    }

    @GetMapping("/{typeOfClinicId}")
    public Type_Of_Clinic getTypeOfClinic(@PathVariable int typeOfClinicId) {
        Type_Of_Clinic type_of_clinic = typeOfClinicService.getTOC(typeOfClinicId);
        return type_of_clinic != null ? type_of_clinic : null;
    }

    @PostMapping("")
    public TypeOfClinicDTO insertTopic(@RequestBody TypeOfClinicDTO typeOfClinicDTO) {
        TypeOfClinicDTO type = typeOfClinicService.insertTOC(typeOfClinicDTO);
        return type != null ? type : null;
    }

    @PutMapping("")
    public TypeOfClinicDTO updateTopic(@RequestBody TypeOfClinicDTO topicDTO) {
        TypeOfClinicDTO type = typeOfClinicService.updateTOC(topicDTO);
        return type != null ? type : null;
    }

    @DeleteMapping("/{typeOfClinicId}")
    public int deleteTypeOfClinic(@PathVariable int typeOfClinicId) {
        return typeOfClinicService.deleteTOC(typeOfClinicId);
    }
}
