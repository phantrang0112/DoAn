package com.Trang.webyte.service;

import com.Trang.webyte.DTO.TopicDTO;
import com.Trang.webyte.model.Topic;

import java.util.List;

public interface TopicService {
    public List<Topic> getAllTopic();

    public Topic getTopic(int id);

    public TopicDTO insertTopic(TopicDTO topicDTO);

    public TopicDTO updateTopic(TopicDTO topicDTO);

    public int deleteTopic(int id);
}
