package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.AnswerMapper;
import com.Trang.webyte.model.Answer;
import com.Trang.webyte.model.AnswerExample;
import com.Trang.webyte.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerMapper answerMapper;
    @Override
    public List<Answer> getAllListAnswer() {
        AnswerExample answerExample= new AnswerExample();
        List<Answer> listAnswer= answerMapper.selectByExample(answerExample);
        return  listAnswer;
    }

    @Override
    public Answer getAnswer(int key) {
        Answer answer= answerMapper.selectByPrimaryKey(key);
        if(answer!=null){
            return answer;
        }
        else {
            return null;
        }

    }

    @Override
    public Answer insertAnswer(Answer answer) {
        int success= answerMapper.insertSelective(answer);
        if(success>0){
            return  answer;
        }
        else {
            return null;
        }

    }

    @Override
    public Answer updateAnswer(Answer answer) {
       int updateSuccess= answerMapper.updateByPrimaryKeySelective(answer);
       if(updateSuccess>0){
           return  answer;
       }
       else {
           return  null;
       }
    }

    @Override
    public int deleteAnswer(int id) {
        int success = answerMapper.deleteByPrimaryKey(id);
        return success;
    }
}
