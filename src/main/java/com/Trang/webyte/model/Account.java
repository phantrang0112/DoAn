package com.Trang.webyte.model;

import javax.validation.Valid;

public class Account extends AccountKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.password
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.idrole
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	private Integer idrole;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.password
	 * @return  the value of account.password
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.password
	 * @param password  the value for account.password
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.idrole
	 * @return  the value of account.idrole
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public Integer getIdrole() {
		return idrole;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.idrole
	 * @param idrole  the value for account.idrole
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public void setIdrole(Integer idrole) {
		this.idrole = idrole;
	}

}