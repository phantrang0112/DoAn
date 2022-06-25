package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.DoctorDTO;
import com.Trang.webyte.DTO.PatientDTO;
import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.model.PriceOfMedicalExaminationService;
import com.Trang.webyte.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/webyte/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping()
    public List<Doctor> getAllDoctor() {
        List<Doctor> listDoctor = doctorService.getAllListDoctor();
        return listDoctor;
    }
//    @GetMapping("")
//    public Doctor getDoctor(@PathVariable("id")int id){
//        Doctor doctor;
//        System.err.println("doctorId = " + id);
//        doctor = doctorService.getDoctor(id);
//        if(doctor != null){
//            return  doctor;
//        }
//        else {
//            return  null;
//        }
//    }


    @GetMapping("/{deptid}/{date}")
    public List<Map<String,Object>> getAllDoctorByDept(@PathVariable("deptid") int deptid, @PathVariable("date") String day) throws ParseException {
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(deptid+day);
        Date date = formatter2.parse(day);
        List<Map<String,Object>> listDoctor= doctorService.getListDoctorByDept(deptid,date);
        return  listDoctor;
    }
    @GetMapping("get-price-doctor/{id}")
    public Map<String,Object> getPriceDoctor(@PathVariable("id")int id, @RequestParam("date") String date1) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date= dateFormat.parse(date1);
        Map<String,Object> price= doctorService.getPriceDoctor(id,date);
        return  price;
    }
    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable("id")int id) {
        return doctorService.getDoctor(id);
    }

    @PostMapping()
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        if (doctor != null) {
            Doctor newDoctor = doctorService.insertDoctor(doctor);
            return newDoctor;
        } else {
            return null;
        }
    }

    @PutMapping("/update")
    public DoctorDTO updateDoctor(@RequestBody DoctorDTO doctorDTO) {
        DoctorDTO doctor;
        System.err.println("PatientUpdate = "+doctorDTO.toString());
        doctor = doctorService.updateDoctor(doctorDTO);
        if (doctor != null) {
            return doctor;
        } else {
            return null;
        }
    }

    @DeleteMapping("{id}")
    public int deleteDoctor(@PathVariable("id") int id) {
        return doctorService.deleteDoctor(id);
    }

    @GetMapping("/all")
    public List<Map<String, Object>> getAllDoctor1() {
        List<Map<String, Object>> listDoctor = doctorService.selectAllDoctor();
        return listDoctor;
    }
}
