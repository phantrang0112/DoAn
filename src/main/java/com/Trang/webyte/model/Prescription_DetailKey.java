package com.Trang.webyte.model;

public class Prescription_DetailKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prescription_detail.medicineId
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	private Integer medicineid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prescription_detail.prescriptionid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	private Integer prescriptionid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prescription_detail.medicineId
	 * @return  the value of prescription_detail.medicineId
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public Integer getMedicineid() {
		return medicineid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prescription_detail.medicineId
	 * @param medicineid  the value for prescription_detail.medicineId
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public void setMedicineid(Integer medicineid) {
		this.medicineid = medicineid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prescription_detail.prescriptionid
	 * @return  the value of prescription_detail.prescriptionid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public Integer getPrescriptionid() {
		return prescriptionid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prescription_detail.prescriptionid
	 * @param prescriptionid  the value for prescription_detail.prescriptionid
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	public void setPrescriptionid(Integer prescriptionid) {
		this.prescriptionid = prescriptionid;
	}
}