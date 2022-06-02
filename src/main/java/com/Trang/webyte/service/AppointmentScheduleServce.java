package com.Trang.webyte.service;

import com.Trang.webyte.DTO.AppointmentScheduleDTO;
import com.Trang.webyte.model.Answer;
import com.Trang.webyte.model.Appointment_Schedule;

import java.util.List;

public interface AppointmentScheduleServce {
    public List<Appointment_Schedule> getAllListAppointmentSchedule();
    public List<AppointmentScheduleDTO> getAllAppointmentSchedule();
    public List<AppointmentScheduleDTO> getAllAppointmentScheduleByDoctor(String username);
    public Appointment_Schedule getAppointmentSchedule(int key);
    public Appointment_Schedule insertAppointmentSchedule(Appointment_Schedule appointment_schedule);
    public Appointment_Schedule updateAppointmentSchedule(Appointment_Schedule appointment_schedule);
    public int deleteAppointmentSchedule(int id);
}
