package com.Trang.webyte.model;

import java.util.Date;

public class Role {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.idrole
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	private Integer idrole;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.role
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	private String role;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.idrole
	 * @return  the value of role.idrole
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	public Integer getIdrole() {
		return idrole;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.idrole
	 * @param idrole  the value for role.idrole
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	public void setIdrole(Integer idrole) {
		this.idrole = idrole;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.role
	 * @return  the value of role.role
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.role
	 * @param role  the value for role.role
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	public void setRole(String role) {
		this.role = role;
	}
}