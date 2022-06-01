package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.AppointmentScheduleDTO;
import com.Trang.webyte.model.Appointment_Schedule;
import com.Trang.webyte.service.AppointmentScheduleServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/webyte/appointment-schedule")
public class AppointmentScheduleController {
    @Autowired
    AppointmentScheduleServce appointmentScheduleServce;
    @GetMapping()
    public List<Appointment_Schedule> getAllAppointment(){
        List<Appointment_Schedule> listAppointment= appointmentScheduleServce.getAllListAppointmentSchedule();
        return listAppointment;
    }
    @GetMapping("/all")
    public List<AppointmentScheduleDTO> getAllAppoint(){
        List<AppointmentScheduleDTO> listAppointment=  appointmentScheduleServce.getAllAppointmentSchedule();
        return listAppointment;
    }

    @GetMapping("/allByDoctor")
    public List<AppointmentScheduleDTO> getAllAppoint(@PathVariable("username") String username){
        List<AppointmentScheduleDTO> listAppointment=  appointmentScheduleServce.getAllAppointmentScheduleByDoctor(username);
        return listAppointment;
    }

    @GetMapping("/{id}")
    public Appointment_Schedule getAppointment(@PathVariable("id") int id){
        if(id>0){
            Appointment_Schedule appointment_schedule= appointmentScheduleServce.getAppointmentSchedule(id);
            return  appointment_schedule;
        }
        return null;
    }
    @PostMapping()
    public  Appointment_Schedule insertAppointment(@RequestBody Appointment_Schedule appointment_schedule){
        if(appointment_schedule!=null){
            Appointment_Schedule appointment_schedule1= appointmentScheduleServce.insertAppointmentSchedule(appointment_schedule);
            return  appointment_schedule1;
        }
        return null;
    }
    @PutMapping("")
    public Appointment_Schedule updateAppointmen(@RequestBody Appointment_Schedule appointment_schedule){
        if(appointment_schedule != null){
            Appointment_Schedule appointment_schedule1= appointmentScheduleServce.updateAppointmentSchedule(appointment_schedule);
            return  appointment_schedule1;
        }
        return  null;
    }
    @DeleteMapping("{id}")
    public int deleteAppointment(@PathVariable("id") int id){
        if(id>0){
            int success= appointmentScheduleServce.deleteAppointmentSchedule(id);
            return  success;
        }
        else {
            return  0;
        }
    }
}
