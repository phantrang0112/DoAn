package com.Trang.webyte.model;

import java.util.Date;

public class Prescription {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prescription.prescriptionid
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	private Integer prescriptionid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prescription.createdate
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	private Date createdate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prescription.prescriptionid
	 * @return  the value of prescription.prescriptionid
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public Integer getPrescriptionid() {
		return prescriptionid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prescription.prescriptionid
	 * @param prescriptionid  the value for prescription.prescriptionid
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void setPrescriptionid(Integer prescriptionid) {
		this.prescriptionid = prescriptionid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prescription.createdate
	 * @return  the value of prescription.createdate
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public Date getCreatedate() {
		return createdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prescription.createdate
	 * @param createdate  the value for prescription.createdate
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
}