package com.Trang.webyte.DTO;

import com.Trang.webyte.model.Question;

import java.util.Date;

public class QuestionDTOs {
  public int questionId;
  public String questionContent;
  public int topicId;
  public  String accountName;
  public Date date;

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public  String img;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public QuestionDTOs() {
  }

  public QuestionDTOs(int questionId, String questionContent, int topicId, String accountName) {
    this.questionId = questionId;
    this.questionContent = questionContent;
    this.topicId = topicId;
    this.accountName = accountName;
  }
  public QuestionDTOs(Question question, String accountName,String img) {
    this.questionId = question.getQuestionid();
    this.questionContent = question.getQuestioncontent();
    this.topicId = question.getTopicid();
    this.accountName = accountName;
    this.date= question.getDate();
    this.img= img;
  }
  public int getQuestionId() {
    return questionId;
  }

  public void setQuestionId(int questionId) {
    this.questionId = questionId;
  }

  public String getQuestionContent() {
    return questionContent;
  }

  public void setQuestionContent(String questionContent) {
    this.questionContent = questionContent;
  }

  public int getTopicId() {
    return topicId;
  }

  public void setTopicId(int topicId) {
    this.topicId = topicId;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }
}
