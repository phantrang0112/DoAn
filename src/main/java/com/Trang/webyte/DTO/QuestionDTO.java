package com.Trang.webyte.DTO;

public class QuestionDTO {
    public int questionId;
    public String questionContent;
    public int topicId;

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
