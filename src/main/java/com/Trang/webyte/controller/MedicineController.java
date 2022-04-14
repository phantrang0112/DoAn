package com.Trang.webyte.controller;

import com.Trang.webyte.model.Medicine;
import com.Trang.webyte.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webyte/medicine")
public class MedicineController {
    @Autowired
    MedicineService medicineService;
    @GetMapping()
    public List<Medicine>  getAllMedicine(){
        List<Medicine> medicineList = medicineService.getAllListMedicine();
        return medicineList;
    }
    @GetMapping("{id}")
    public Medicine getMedicine(@PathVariable("id") int id){
        if( id>0){
            Medicine medicine= medicineService.getMedicine(id);
            return medicine;
        }
        else {
            return  null;
        }
    }
    @PostMapping()
    public Medicine insertMedicine(@RequestBody Medicine medicine){
        if(medicine!=null){
            Medicine newMedicine= medicineService.insertMedicine(medicine);
            return newMedicine;
        }
        return  null;
    }
    @PutMapping("{id}")
    public Medicine updateMedicine(@RequestBody Medicine medicine){
        if(medicine!=null){
            Medicine medicine1= medicineService.updateMedicine(medicine);
            return  medicine1;
        }
        return  null;
    }
    @DeleteMapping("{id}")
    public int deleteMedicine(@PathVariable("")int id){
        if(id>0){
            int success= medicineService.deleteMedicine(id);
            return  success;
        }
        return  0;
    }
}
