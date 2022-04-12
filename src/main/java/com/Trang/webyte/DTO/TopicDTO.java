package com.Trang.webyte.DTO;

public class TopicDTO {
    public int topicId;
    public String topicName;
    public String topicContent;

    public TopicDTO() {
    }

    public TopicDTO(int topicId, String topicName, String topicContent) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicContent = topicContent;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }
}
