package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.TopicDTO;
import com.Trang.webyte.mapper.TopicMapper;
import com.Trang.webyte.model.Topic;
import com.Trang.webyte.model.TopicExample;
import com.Trang.webyte.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    TopicMapper topicMapper;

    @Override
    public List<Topic> getAllTopic() {
        TopicExample topicExample= new TopicExample();
        List<Topic> topicList= topicMapper.selectByExample(topicExample);
        return topicList!=null ? topicList : null;
    }

    @Override
    public Topic getTopic(int id) {
        Topic topic;
        topic= topicMapper.selectByPrimaryKey(id);
        if (topic!=null){
            return topic;
        } else {
            return null;
        }
    }

    @Override
    public TopicDTO insertTopic(TopicDTO topicDTO) {
        Topic topic= new Topic();
        topic.setTopicid(topicDTO.getTopicId());
        topic.setTopicname(topicDTO.getTopicName());
        topic.setTopiccontent(topicDTO.getTopicContent());
        int success= topicMapper.insertSelective(topic);
        if(success>0){
            return topicDTO;
        } else {
            return null;
        }
    }

    @Override
    public TopicDTO updateTopic(TopicDTO topicDTO) {
        Topic topic= new Topic();
        topic.setTopicid(topicDTO.getTopicId());
        topic.setTopicname(topicDTO.getTopicName());
        topic.setTopiccontent(topicDTO.getTopicContent());
        int success= topicMapper.updateByPrimaryKeySelective(topic);
        if(success>0){
            return topicDTO;
        } else {
            return null;
        }
    }

    @Override
    public int deleteTopic(int id) {
        Topic topic= topicMapper.selectByPrimaryKey(id);
        return topic!=null ? topicMapper.deleteByPrimaryKey(id) : -1;
    }
}
