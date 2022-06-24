package com.Trang.webyte.controller;

import com.Trang.webyte.model.Schedule;
import com.Trang.webyte.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/webyte/schedule")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @GetMapping("/all-doctor-schedule/{id}")
    public List<Schedule> getAllDoctorSchedule(@PathVariable("id") int id){
        System.err.println("id doctor = " + id);
        return scheduleService.getAllScheduleOfDoctor(id);
    }
}
