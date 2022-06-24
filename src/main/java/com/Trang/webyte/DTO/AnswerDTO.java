
package com.Trang.webyte.DTO;

import com.Trang.webyte.model.Answer;

import java.util.Date;

public class AnswerDTO {
    private Integer answerid;

    private String answercontent;

    private Integer questionid;

    private String accountName;
    private  String img;

    private Date date;
    private String account;

    public AnswerDTO() {
    }

    public AnswerDTO(Integer answerid, String answercontent, Integer questionid, String accountName, String img, Date date) {
        this.answerid = answerid;
        this.answercontent = answercontent;
        this.questionid = questionid;
        this.accountName = accountName;
        this.img = img;
        this.date = date;
    }
    public AnswerDTO(Answer answer,String name, String img,String account) {
        this.answerid = answer.getAnswerid();
        this.answercontent = answer.getAnswercontent();
        this.questionid = answer.getQuestionid();
        this.accountName = name;
        this.img = img;
        this.date = answer.getDate();
        this.account=account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public String getAnswercontent() {
        return answercontent;
    }

    public void setAnswercontent(String answercontent) {
        this.answercontent = answercontent;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
