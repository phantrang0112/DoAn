package com.Trang.webyte.model;

public class Dept {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dept.deptid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private Integer deptid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dept.deptname
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	private String deptname;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dept.deptid
	 * @return  the value of dept.deptid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Integer getDeptid() {
		return deptid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dept.deptid
	 * @param deptid  the value for dept.deptid
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dept.deptname
	 * @return  the value of dept.deptname
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getDeptname() {
		return deptname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dept.deptname
	 * @param deptname  the value for dept.deptname
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}