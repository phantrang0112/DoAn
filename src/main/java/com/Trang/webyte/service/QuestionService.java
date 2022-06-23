package com.Trang.webyte.service;

import com.Trang.webyte.DTO.QuestionDTO;
import com.Trang.webyte.DTO.QuestionDTOs;
import com.Trang.webyte.model.Question;

import java.util.List;
import java.util.Map;

public interface QuestionService {
    public List<QuestionDTOs> getAllQuestion();
    public List<Map<String,Object>> getAllQuestionAnswer();
    public Question getQuestion(int id);

    public QuestionDTO insertQuestion(QuestionDTO questionDTO);

    public QuestionDTO updateQuestion(QuestionDTO questionDTO);

    public int deleteQuestion(int id);
}
