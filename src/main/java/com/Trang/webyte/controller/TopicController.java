package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.TopicDTO;
import com.Trang.webyte.model.Topic;
import com.Trang.webyte.model.TopicExample;
import com.Trang.webyte.service.TopicService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    TopicService topicService;

    @GetMapping("/get-all-topic")
    public List<Topic> getAllTopicList(){
        List<Topic> topicList= topicService.getAllTopic();
        return topicList!=null ? topicList : null;
    }

    @GetMapping("/{topicId}")
    public Topic getTopic(@PathVariable int topicId){
        Topic topic= topicService.getTopic(topicId);
        return topic!=null ? topic : null;
    }

    @PostMapping("")
    public TopicDTO insertTopic(@RequestBody TopicDTO topicDTO){
        TopicDTO topic = topicService.insertTopic(topicDTO);
        return topic!=null ? topic : null;
    }

    @PutMapping("")
    public TopicDTO updateTopic(@RequestBody TopicDTO topicDTO){
        TopicDTO topic = topicService.updateTopic(topicDTO);
        return topic!=null ? topic : null;
    }

    @DeleteMapping("/{topicId}")
    public int deleteTopic(@PathVariable int topicId){
        return topicService.deleteTopic(topicId);
    }
}
