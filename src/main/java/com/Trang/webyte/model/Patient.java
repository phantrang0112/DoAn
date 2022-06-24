package com.Trang.webyte.model;

import java.util.Date;

public class Patient {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.id
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.fullname
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private String fullname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.address
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.phone
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.email
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.accountid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer accountid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.img
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private String img;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column patient.birthday
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Date birthday;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.id
	 * @return  the value of patient.id
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.id
	 * @param id  the value for patient.id
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.fullname
	 * @return  the value of patient.fullname
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.fullname
	 * @param fullname  the value for patient.fullname
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.address
	 * @return  the value of patient.address
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.address
	 * @param address  the value for patient.address
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.phone
	 * @return  the value of patient.phone
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.phone
	 * @param phone  the value for patient.phone
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.email
	 * @return  the value of patient.email
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.email
	 * @param email  the value for patient.email
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.accountid
	 * @return  the value of patient.accountid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getAccountid() {
		return accountid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.accountid
	 * @param accountid  the value for patient.accountid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.img
	 * @return  the value of patient.img
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getImg() {
		return img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.img
	 * @param img  the value for patient.img
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column patient.birthday
	 * @return  the value of patient.birthday
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column patient.birthday
	 * @param birthday  the value for patient.birthday
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Patient{" +
				"id=" + id +
				", fullname='" + fullname + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", accountid=" + accountid +
				", img='" + img + '\'' +
				", birthday=" + birthday +
				'}';
	}
}
