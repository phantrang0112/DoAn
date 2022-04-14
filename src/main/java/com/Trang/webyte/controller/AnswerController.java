package com.Trang.webyte.controller;

import com.Trang.webyte.model.Answer;
import com.Trang.webyte.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/webyte/answer")
public class AnswerController {
    @Autowired
    AnswerService answerService;
    @GetMapping()
    public List<Answer> getAllListAnswer(){
        List<Answer> listAnswer= answerService.getAllListAnswer();
        return  listAnswer;
    }
    @GetMapping("/{id}")
    public Answer getAnswer(@PathVariable("id") int id){
        if(id>0){
            Answer answer= answerService.getAnswer(id);
            return  answer;
        }
        else {
            return null;
        }

    }
    @PostMapping()
    public Answer insertAnswer(@RequestBody Answer answer){
        if(answer!=null){
            Answer answer1= answerService.insertAnswer(answer);
            return  answer1;
        }
        return  null;
    }
    @PutMapping()
    public Answer updateAnswer(@RequestBody Answer answer){
        if(answer!= null){
            Answer answer1= answerService.updateAnswer(answer);
            return  answer1;
        }
        return null;
    }
    @DeleteMapping("{id}")
    public int deleteAnswer(@PathVariable("id")int id){
        if(id>0){
          int success= answerService.deleteAnswer(id);
          return  success;
        }
        return 0;
    }
}
