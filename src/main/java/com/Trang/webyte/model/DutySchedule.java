package com.Trang.webyte.model;

import java.util.Date;

public class DutySchedule {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dutyschedule.dutyscheduleid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer dutyscheduleid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dutyschedule.date
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Date date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dutyschedule.appointmentid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer appointmentid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dutyschedule.clinicid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer clinicid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dutyschedule.dutyscheduleid
	 * @return  the value of dutyschedule.dutyscheduleid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getDutyscheduleid() {
		return dutyscheduleid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dutyschedule.dutyscheduleid
	 * @param dutyscheduleid  the value for dutyschedule.dutyscheduleid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDutyscheduleid(Integer dutyscheduleid) {
		this.dutyscheduleid = dutyscheduleid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dutyschedule.date
	 * @return  the value of dutyschedule.date
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dutyschedule.date
	 * @param date  the value for dutyschedule.date
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dutyschedule.appointmentid
	 * @return  the value of dutyschedule.appointmentid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getAppointmentid() {
		return appointmentid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dutyschedule.appointmentid
	 * @param appointmentid  the value for dutyschedule.appointmentid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setAppointmentid(Integer appointmentid) {
		this.appointmentid = appointmentid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dutyschedule.clinicid
	 * @return  the value of dutyschedule.clinicid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getClinicid() {
		return clinicid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dutyschedule.clinicid
	 * @param clinicid  the value for dutyschedule.clinicid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setClinicid(Integer clinicid) {
		this.clinicid = clinicid;
	}
}