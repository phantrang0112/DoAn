package com.Trang.webyte.model;

import java.util.Date;

public class News {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column news.newsid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private Integer newsid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column news.title
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column news.date
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private Date date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column news.content
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column news.adminid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	private Integer adminid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column news.newsid
	 * @return  the value of news.newsid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Integer getNewsid() {
		return newsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column news.newsid
	 * @param newsid  the value for news.newsid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setNewsid(Integer newsid) {
		this.newsid = newsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column news.title
	 * @return  the value of news.title
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column news.title
	 * @param title  the value for news.title
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column news.date
	 * @return  the value of news.date
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column news.date
	 * @param date  the value for news.date
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column news.content
	 * @return  the value of news.content
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column news.content
	 * @param content  the value for news.content
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column news.adminid
	 * @return  the value of news.adminid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Integer getAdminid() {
		return adminid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column news.adminid
	 * @param adminid  the value for news.adminid
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
}