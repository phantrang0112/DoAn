package com.Trang.webyte.service;




import com.Trang.webyte.model.Answer;

import java.util.List;

public interface AnswerService {
    public List<Answer> getAllListAnswer();
    public Answer getAnswer(int key);
    public Answer insertAnswer(Answer answer);
    public Answer updateAnswer(Answer accountDTO);
    public int deleteAnswer(int id);
}
