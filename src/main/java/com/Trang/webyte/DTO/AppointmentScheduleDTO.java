package com.Trang.webyte.DTO;

import com.Trang.webyte.model.Appointment_Schedule;

import java.util.Date;

public class AppointmentScheduleDTO {
  private Integer idappointmentSchedule;

  private String doctorName;

  private String patientName;

  private Date date;

  private String status;

  public AppointmentScheduleDTO() {
  }

  private Integer number;

  public AppointmentScheduleDTO(Integer idappointmentSchedule, String doctorName, String patientName, Date date, String status, Integer number, String time, String typeClinic) {
    this.idappointmentSchedule = idappointmentSchedule;
    this.doctorName = doctorName;
    this.patientName = patientName;
    this.date = date;
    this.status = status;
    this.number = number;
    this.time = time;
    this.typeClinic = typeClinic;
  }

  private String time;
  private  String typeClinic;

  public Integer getIdappointmentSchedule() {
    return idappointmentSchedule;
  }

  public void setIdappointmentSchedule(Integer idappointmentSchedule) {
    this.idappointmentSchedule = idappointmentSchedule;
  }

  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getTypeClinic() {
    return typeClinic;
  }

  public void setTypeClinic(String typeClinic) {
    this.typeClinic = typeClinic;
  }

  public AppointmentScheduleDTO(Integer idappointmentSchedule) {
    this.idappointmentSchedule = idappointmentSchedule;
  }
  public AppointmentScheduleDTO(Appointment_Schedule appointment_schedule, String doctor, String patient) {
    this.idappointmentSchedule = appointment_schedule.getIdappointmentSchedule();
    this.doctorName = doctor;
    this.patientName = patient;
    this.date = appointment_schedule.getDate();
    this.status = appointment_schedule.getStatus();
    this.number = appointment_schedule.getNumber();
    this.time = appointment_schedule.getTime();
    this.typeClinic = appointment_schedule.getTypeclinic();
  }
}
