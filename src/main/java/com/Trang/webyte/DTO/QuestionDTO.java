package com.Trang.webyte.DTO;

import java.util.Date;

public class QuestionDTO {
    public int questionId;
    public String questionContent;
    public int topicId;
    public  int accountId;
    public Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public QuestionDTO() {
    }

    public QuestionDTO(int questionId, String questionContent, int topicId) {
        this.questionId = questionId;
        this.questionContent = questionContent;
        this.topicId = topicId;
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
}
