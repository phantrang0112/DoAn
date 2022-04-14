package com.Trang.webyte.controller;

import com.Trang.webyte.model.Dept;
import com.Trang.webyte.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webyte/dept")
public class DeptController {
    @Autowired
    DeptService deptService;
    @GetMapping()
    public List<Dept> getAllDept(){
       List<Dept> listDept= deptService.getAllListDept();
       return  listDept;
    }
    @GetMapping("/{id}")
    public Dept getDept(@PathVariable("id") int id){
        if(id>0){
            Dept dept= deptService.getDept(id);
            return  dept;
        }
        else {
            return  null;
        }
    }
    @PostMapping()
    public Dept insertDept(@RequestBody Dept dept){
        if(dept!=null){
            Dept dept1= deptService.insertDept(dept);
            return dept1;
        }
        else{
            return  null;
        }
    }
    @PutMapping()
    public  Dept updateDept(@RequestBody Dept dept){
        if(dept!=null){
            Dept dept1= deptService.updateDept(dept);
            return dept1;
        }
        else {
            return  null;
        }
    }
    @DeleteMapping("{id}")
    public int deleteDept(@PathVariable("id") int id){
        if(id>0){
            int success= deptService.deleteDept(id);
            return  success;
        }
        else {
            return  0;
        }
    }
}
