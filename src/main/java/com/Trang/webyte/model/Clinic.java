package com.Trang.webyte.model;

public class Clinic {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column clinic.clinicid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	private Integer clinicid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column clinic.clinicinumber
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	private Integer clinicinumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column clinic.clinicilink
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	private String clinicilink;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column clinic.clinicitypeid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	private Integer clinicitypeid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column clinic.clinicid
	 * @return  the value of clinic.clinicid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public Integer getClinicid() {
		return clinicid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column clinic.clinicid
	 * @param clinicid  the value for clinic.clinicid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public void setClinicid(Integer clinicid) {
		this.clinicid = clinicid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column clinic.clinicinumber
	 * @return  the value of clinic.clinicinumber
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public Integer getClinicinumber() {
		return clinicinumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column clinic.clinicinumber
	 * @param clinicinumber  the value for clinic.clinicinumber
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public void setClinicinumber(Integer clinicinumber) {
		this.clinicinumber = clinicinumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column clinic.clinicilink
	 * @return  the value of clinic.clinicilink
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public String getClinicilink() {
		return clinicilink;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column clinic.clinicilink
	 * @param clinicilink  the value for clinic.clinicilink
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public void setClinicilink(String clinicilink) {
		this.clinicilink = clinicilink;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column clinic.clinicitypeid
	 * @return  the value of clinic.clinicitypeid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public Integer getClinicitypeid() {
		return clinicitypeid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column clinic.clinicitypeid
	 * @param clinicitypeid  the value for clinic.clinicitypeid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public void setClinicitypeid(Integer clinicitypeid) {
		this.clinicitypeid = clinicitypeid;
	}
}