package com.Trang.webyte.service;

import com.Trang.webyte.DTO.AppointmentScheduleDTO;
import com.Trang.webyte.model.Answer;
import com.Trang.webyte.model.Appointment_Schedule;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface AppointmentScheduleServce {
    public List<Appointment_Schedule> getAllListAppointmentSchedule();
    public List<AppointmentScheduleDTO> getAllAppointmentSchedule() throws ParseException;
    public List<AppointmentScheduleDTO> getAllAppointmentScheduleByDoctor(int id);
    public Appointment_Schedule getAppointmentSchedule(int key);
    public Appointment_Schedule insertAppointmentSchedule(Appointment_Schedule appointment_schedule);
    public Appointment_Schedule updateAppointmentSchedule(Appointment_Schedule appointment_schedule);
    public int deleteAppointmentSchedule(int id);
    public  Appointment_Schedule selectTop1Appoint();
    public List<Map<String,Object>> getCountTimeFull(Date date);
    public AppointmentScheduleDTO getAppointmentScheduleById(int id);
    public Appointment_Schedule updateStatus(int id, String status);
    public  Map<String,Object> getAppointDate(int id);
}
