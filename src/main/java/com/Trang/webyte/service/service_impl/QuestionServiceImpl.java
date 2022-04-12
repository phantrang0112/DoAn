package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.QuestionDTO;
import com.Trang.webyte.mapper.QuestionMapper;
import com.Trang.webyte.model.Question;
import com.Trang.webyte.model.QuestionExample;
import com.Trang.webyte.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;


    @Override
    public List<Question> getAllQuestion() {
        QuestionExample questionExample= new QuestionExample();
        List<Question> questionList= questionMapper.selectByExample(questionExample);
        return questionList!=null ? questionList : null;
    }

    @Override
    public Question getQuestion(int id) {
        Question question= questionMapper.selectByPrimaryKey(id);
        return question!=null ? question : null;
    }

    @Override
    public QuestionDTO insertQuestion(QuestionDTO questionDTO) {
        Question question = new Question();
        question.setQuestionid(questionDTO.getQuestionId());
        question.setQuestioncontent(questionDTO.getQuestionContent());
        question.setTopicid(questionDTO.getTopicId());
        return questionMapper.insertSelective(question)>0 ? questionDTO : null;
    }

    @Override
    public QuestionDTO updateQuestion(QuestionDTO questionDTO) {
        Question question = new Question();
        question.setQuestionid(questionDTO.getQuestionId());
        question.setQuestioncontent(questionDTO.getQuestionContent());
        question.setTopicid(questionDTO.getTopicId());
        return questionMapper.updateByPrimaryKeySelective(question)>0 ? questionDTO : null;
    }

    @Override
    public int deleteQuestion(int id) {
        return questionMapper.selectByPrimaryKey(id)!=null ? questionMapper.deleteByPrimaryKey(id) : -1;
    }
}
