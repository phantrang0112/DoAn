package com.Trang.webyte.DTO;

import java.util.Map;

public class PatientDTO {
    public int patientID;
    public int accountID;
    public String address;
    public String email;
    public String fullName;
    public String img;
    public String phone;

    public PatientDTO() {
    }

    public PatientDTO(int patientID, int accountID, String address, String email, String fullName, String img, String phone) {
        this.patientID = patientID;
        this.accountID = accountID;
        this.address = address;
        this.email = email;
        this.fullName = fullName;
        this.img = img;
        this.phone = phone;
    }

    public PatientDTO(Map<String, Object> obj){
        this.email = (String) obj.get("email");
        this.phone = (String) obj.get("phone");
    }

    public int getId() {
        return patientID;
    }

    public void setId(int patientID) {
        this.patientID = patientID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
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

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientID=" + patientID +
                ", accountID=" + accountID +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", img='" + img + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
