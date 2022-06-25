package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.TopicDTO;
import com.Trang.webyte.DTO.TypeSickDTO;
import com.Trang.webyte.model.Topic;
import com.Trang.webyte.model.Type_Of_Clinic;
import com.Trang.webyte.model.Type_Sick;
import com.Trang.webyte.service.TopicService;
import com.Trang.webyte.service.TypeOfClinicService;
import com.Trang.webyte.service.TypeSickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/typeSicks")
public class TypeSickController {
    @Autowired
    TypeSickService typeSickService;

    @GetMapping("/get-all-typeSick")
    public List<Type_Sick> getAllTopicList() {
        List<Type_Sick> typeSickList = typeSickService.getAllTypeSick();
        return typeSickList != null ? typeSickList : null;
    }

    @GetMapping("/{typeSickId}")
    public Type_Sick getTypeSick(@PathVariable int typeSickId) {
        Type_Sick type_sick = typeSickService.getTypeSick(typeSickId);
        return type_sick != null ? type_sick : null;
    }

    @PostMapping("")
    public TypeSickDTO insertTypeSick(@RequestBody TypeSickDTO typeSickDTO) {
        TypeSickDTO sickDTO = typeSickService.insertTypeSick(typeSickDTO);
        return sickDTO != null ? sickDTO : null;
    }

    @PutMapping("")
    public TypeSickDTO updateTypeSick(@RequestBody TypeSickDTO typeSickDTO) {
        TypeSickDTO typeSick = typeSickService.updateTypeSick(typeSickDTO);
        return typeSick != null ? typeSick : null;
    }

    @DeleteMapping("/{typeSickId}")
    public int deleteTypeSick(@PathVariable int typeSickId) {
        return typeSickService.deleteTypeSick(typeSickId);
    }
}
