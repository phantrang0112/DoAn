package com.Trang.webyte.DTO;

import com.Trang.webyte.model.Dept;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class DoctorDTO {
  private Integer doctorid;

  private String fullname;

  private String address;

  private String phone;

  private String email;

  private Integer accountid;

  private Dept dept;

  private String birthday;

  private MultipartFile img;

  public DoctorDTO(Integer doctorid, String fullname, String address, String phone, String email, Integer accountid, Dept dept, String birthday, MultipartFile img) {
    this.doctorid = doctorid;
    this.fullname = fullname;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.accountid = accountid;
    this.dept = dept;
    this.birthday = birthday;
    this.img = img;
  }

  public DoctorDTO() {
  }

  public Integer getDoctorid() {
    return doctorid;
  }

  public void setDoctorid(Integer doctorid) {
    this.doctorid = doctorid;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAccountid() {
    return accountid;
  }

  public void setAccountid(Integer accountid) {
    this.accountid = accountid;
  }

  public Dept getDept() {
    return dept;
  }

  public void setDept(Dept dept) {
    this.dept = dept;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public MultipartFile getImg() {
    return img;
  }

  public void setImg(MultipartFile img) {
    this.img = img;
  }
}
