package com.Trang.webyte.model;

public class Sick {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sick.sickid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private Integer sickid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sick.sickname
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private String sickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sick.sicktypeid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private Integer sicktypeid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sick.symptomid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private Integer symptomid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sick.sickid
	 * @return  the value of sick.sickid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Integer getSickid() {
		return sickid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sick.sickid
	 * @param sickid  the value for sick.sickid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setSickid(Integer sickid) {
		this.sickid = sickid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sick.sickname
	 * @return  the value of sick.sickname
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public String getSickname() {
		return sickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sick.sickname
	 * @param sickname  the value for sick.sickname
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setSickname(String sickname) {
		this.sickname = sickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sick.sicktypeid
	 * @return  the value of sick.sicktypeid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Integer getSicktypeid() {
		return sicktypeid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sick.sicktypeid
	 * @param sicktypeid  the value for sick.sicktypeid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setSicktypeid(Integer sicktypeid) {
		this.sicktypeid = sicktypeid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sick.symptomid
	 * @return  the value of sick.symptomid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Integer getSymptomid() {
		return symptomid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sick.symptomid
	 * @param symptomid  the value for sick.symptomid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setSymptomid(Integer symptomid) {
		this.symptomid = symptomid;
	}
}