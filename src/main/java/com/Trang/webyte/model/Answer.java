package com.Trang.webyte.model;

public class Answer {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column answer.answerid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	private Integer answerid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column answer.answercontent
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	private String answercontent;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column answer.questionid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	private Integer questionid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column answer.accountid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	private Integer accountid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.answerid
	 * @return  the value of answer.answerid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public Integer getAnswerid() {
		return answerid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.answerid
	 * @param answerid  the value for answer.answerid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void setAnswerid(Integer answerid) {
		this.answerid = answerid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.answercontent
	 * @return  the value of answer.answercontent
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public String getAnswercontent() {
		return answercontent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.answercontent
	 * @param answercontent  the value for answer.answercontent
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void setAnswercontent(String answercontent) {
		this.answercontent = answercontent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.questionid
	 * @return  the value of answer.questionid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public Integer getQuestionid() {
		return questionid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.questionid
	 * @param questionid  the value for answer.questionid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column answer.accountid
	 * @return  the value of answer.accountid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public Integer getAccountid() {
		return accountid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column answer.accountid
	 * @param accountid  the value for answer.accountid
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}
}