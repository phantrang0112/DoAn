package com.Trang.webyte.controller;

import com.Trang.webyte.model.Healthrecords;
import com.Trang.webyte.service.HealthrecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webyte/healthrecord")
public class HealthrecordsController {
    @Autowired
    HealthrecordsService healthrecordsService;
    @GetMapping()
    public List<Healthrecords> getAllHealthrecord(){
        List<Healthrecords> healthrecordsList = healthrecordsService.getAllListHealthrecords();
        return healthrecordsList;
    }
    @GetMapping("{id}")
    public Healthrecords getHealthrecords(@PathVariable("id") int id){
        if(id>0){
            Healthrecords healthrecords= healthrecordsService.getHealthrecords(id);
            return healthrecords;
        }else{
            return null;
        }
    }
    @PostMapping()
    public  Healthrecords insertHealthrecord(@RequestBody Healthrecords healthrecords){
        if(healthrecords!=null){
            Healthrecords newHealthrecord= healthrecordsService.insertHealthrecords(healthrecords);
            return newHealthrecord;
        }
        else {
            return null;
        }
    }
    @PutMapping("/{id}")
    public Healthrecords update(@PathVariable("id") int id,@RequestBody Healthrecords healthrecords){
        if(healthrecords!=null){
            Healthrecords updateHealthrecord= healthrecordsService.updateHealthrecords(healthrecords);
            return updateHealthrecord;
        }
        else {
            return null;
        }
    }
    @DeleteMapping("/{id}")
    public int deleteHealthrecord(@PathVariable("id")int id){
        if(id>0){
            int success= healthrecordsService.deleteHealthrecords(id);
            return  success;
        }
        else {
            return  0;
        }
    }
}
