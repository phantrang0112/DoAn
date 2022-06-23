package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.QuestionDTO;
import com.Trang.webyte.DTO.QuestionDTOs;
import com.Trang.webyte.model.Question;
import com.Trang.webyte.model.QuestionExample;
import com.Trang.webyte.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/get-all-question")
    public List<QuestionDTOs> getAllQuestionList(){
        List<QuestionDTOs> questionList= questionService.getAllQuestion();
        return questionList!=null ? questionList : null;
    }
    @GetMapping("/get-all-question-answers")
    public List<QuestionDTOs> getAllQuestionListAnswer(){
        List<QuestionDTOs> questionList= questionService.getAllQuestion();
        return questionList!=null ? questionList : null;
    }

    @GetMapping("/{questionId}")
    public Question getQuestion(@PathVariable int questionId){
        Question question= questionService.getQuestion(questionId);
        return question!=null? question : null;
    }

    @PostMapping("")
    public QuestionDTO insertQuestion(@RequestBody QuestionDTO questionDTO){
        QuestionDTO question= questionService.insertQuestion(questionDTO);
        return question!=null ? question :null;
    }

    @PutMapping("")
    public QuestionDTO updateQuestion(@RequestBody QuestionDTO questionDTO){
        QuestionDTO questionDTO1= questionService.updateQuestion(questionDTO);
        return questionDTO1!=null ? questionDTO1 : null;
    }

    @DeleteMapping("/{questionId}")
    public int deleteQuestion(@PathVariable int questionId){
        return questionService.deleteQuestion(questionId);
    }
}
