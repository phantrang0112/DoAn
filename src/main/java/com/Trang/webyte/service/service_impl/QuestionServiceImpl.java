package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.QuestionDTO;
import com.Trang.webyte.DTO.QuestionDTOs;
import com.Trang.webyte.mapper.AnswerMapper;
import com.Trang.webyte.mapper.PatientMapper;
import com.Trang.webyte.mapper.QuestionMapper;
import com.Trang.webyte.model.*;
import com.Trang.webyte.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {
  @Autowired
  QuestionMapper questionMapper;
  @Autowired
  PatientMapper patientMapper;
  @Autowired
  AnswerMapper answerMapper;

  @Override
  public List<QuestionDTOs> getAllQuestion() {
    QuestionExample questionExample = new QuestionExample();
    List<QuestionDTOs> questionsList = new ArrayList<>();
    questionExample.setOrderByClause(questionExample.getOrderByClause()+"," + "questionid DESC");
    List<Question> questionList = questionMapper.selectByExample(questionExample);
    for (Question item : questionList) {
      PatientExample patientExample = new PatientExample();
      patientExample.createCriteria().andAccountidEqualTo(item.getAccountid());
      List<Patient> patient = patientMapper.selectByExample(patientExample);
      QuestionDTOs questionDTOs = new QuestionDTOs(item, patient.get(0).getFullname(),patient.get(0).getImg());
      questionsList.add(questionDTOs);
    }
    return questionList != null ? questionsList : null;
  }

  @Override
  public List<Map<String,Object>> getAllQuestionAnswer() {
    QuestionExample questionExample = new QuestionExample();
    List<QuestionDTOs> questionsList = new ArrayList<>();
    questionExample.setOrderByClause(questionExample.getOrderByClause()+"," + "questionid DESC");
    List<Question> questionList = questionMapper.selectByExample(questionExample);
    for (Question item : questionList) {
      PatientExample patientExample = new PatientExample();
      patientExample.createCriteria().andAccountidEqualTo(item.getAccountid());
      List<Patient> patient = patientMapper.selectByExample(patientExample);
      QuestionDTOs questionDTOs = new QuestionDTOs(item, patient.get(0).getFullname(),patient.get(0).getImg());
      questionsList.add(questionDTOs);
    }
    return questionList != null ? questionsList : null;
  }

  @Override
  public Question getQuestion(int id) {
    Question question = questionMapper.selectByPrimaryKey(id);
    return question != null ? question : null;
  }

  @Override
  public QuestionDTO insertQuestion(QuestionDTO questionDTO) {
    Question question = new Question();
    Date datenow= new Date();
    question.setQuestionid(questionDTO.getQuestionId());
    question.setQuestioncontent(questionDTO.getQuestionContent());
    question.setTopicid(questionDTO.getTopicId());
    question.setAccountid(questionDTO.getAccountId());
    question.setDate(datenow);
    return questionMapper.insertSelective(question) > 0 ? questionDTO : null;
  }

  @Override
  public QuestionDTO updateQuestion(QuestionDTO questionDTO) {
    Question question = new Question();
    question.setQuestionid(questionDTO.getQuestionId());
    question.setQuestioncontent(questionDTO.getQuestionContent());
    question.setTopicid(questionDTO.getTopicId());
    question.setAccountid(questionDTO.getAccountId());
    return questionMapper.updateByPrimaryKeySelective(question) > 0 ? questionDTO : null;
  }

  @Override
  public int deleteQuestion(int id) {
    return questionMapper.selectByPrimaryKey(id) != null ? questionMapper.deleteByPrimaryKey(id) : -1;
  }
}
