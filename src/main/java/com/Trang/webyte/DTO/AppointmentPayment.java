package com.Trang.webyte.DTO;

import java.util.Date;

public class AppointmentPayment {
    private Integer idappointmentSchedule;

    private int doctorid;

    private int patientid;

    private Date date;
    private Integer number;
    private String status;
    private double price;
    private String time;
    private  String typeclinic;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeclinic() {
        return typeclinic;
    }

    public void setTypeclinic(String typeclinic) {
        this.typeclinic = typeclinic;
    }

    @Override
    public String toString() {
        return "AppointmentPayment{" +
                "idappointmentSchedule=" + idappointmentSchedule +
                ", doctorid=" + doctorid +
                ", patientid=" + patientid +
                ", date=" + date +
                ", number=" + number +
                ", status='" + status + '\'' +
                ", price=" + price +
                ", time='" + time + '\'' +
                ", typeclinic='" + typeclinic + '\'' +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIdappointmentSchedule() {
        return idappointmentSchedule;
    }

    public void setIdappointmentSchedule(Integer idappointmentSchedule) {
        this.idappointmentSchedule = idappointmentSchedule;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
