package com.Trang.webyte.service;

import com.Trang.webyte.DTO.QuestionDTO;
import com.Trang.webyte.model.Question;

import java.util.List;

public interface QuestionService {
    public List<Question> getAllQuestion();

    public Question getQuestion(int id);

    public QuestionDTO insertQuestion(QuestionDTO questionDTO);

    public QuestionDTO updateQuestion(QuestionDTO questionDTO);

    public int deleteQuestion(int id);
}
