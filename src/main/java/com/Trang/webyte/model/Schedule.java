package com.Trang.webyte.model;

import java.util.Date;

public class Schedule {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column schedule.scheduleid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer scheduleid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column schedule.doctorid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer doctorid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column schedule.dutyday
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Date dutyday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column schedule.dutyweek
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer dutyweek;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column schedule.scheduleid
	 * @return  the value of schedule.scheduleid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getScheduleid() {
		return scheduleid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column schedule.scheduleid
	 * @param scheduleid  the value for schedule.scheduleid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setScheduleid(Integer scheduleid) {
		this.scheduleid = scheduleid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column schedule.doctorid
	 * @return  the value of schedule.doctorid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getDoctorid() {
		return doctorid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column schedule.doctorid
	 * @param doctorid  the value for schedule.doctorid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDoctorid(Integer doctorid) {
		this.doctorid = doctorid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column schedule.dutyday
	 * @return  the value of schedule.dutyday
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Date getDutyday() {
		return dutyday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column schedule.dutyday
	 * @param dutyday  the value for schedule.dutyday
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDutyday(Date dutyday) {
		this.dutyday = dutyday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column schedule.dutyweek
	 * @return  the value of schedule.dutyweek
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getDutyweek() {
		return dutyweek;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column schedule.dutyweek
	 * @param dutyweek  the value for schedule.dutyweek
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDutyweek(Integer dutyweek) {
		this.dutyweek = dutyweek;
	}
}
