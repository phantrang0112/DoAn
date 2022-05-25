package com.Trang.webyte.DTO;

import java.util.Date;
import java.util.Map;

public class PatientDTO {
    public int patientID;
    public int accountid;
    public String address;
    public String email;
    public String fullName;
    public String img;
    public String phone;

    public Date birthday;

    public PatientDTO() {
    }

    public PatientDTO(int patientID, int accountid, String address, String email, String fullName, String img, String phone, Date birthday) {
        this.patientID = patientID;
        this.accountid = accountid;
        this.address = address;
        this.email = email;
        this.fullName = fullName;
        this.img = img;
        this.phone = phone;
        this.birthday = birthday;
    }

    public PatientDTO(Map<String, Object> obj) {
        this.email = (String) obj.get("email");
        this.phone = (String) obj.get("phone");
    }

    public int getId() {
        return patientID;
    }

    public void setId(int patientID) {
        this.patientID = patientID;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountID) {
        this.accountid = accountID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int accountid) {
        this.patientID = accountid;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientID=" + patientID +
                ", accountID=" + accountid +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", img='" + img + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
