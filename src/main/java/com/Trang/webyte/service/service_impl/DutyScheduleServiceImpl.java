package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.DutyScheduleMapper;
import com.Trang.webyte.model.DutySchedule;
import com.Trang.webyte.model.DutyScheduleExample;
import com.Trang.webyte.service.DutyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyScheduleServiceImpl implements DutyScheduleService {
  @Autowired
  DutyScheduleMapper dutyScheduleMapper;

  @Override
  public List<DutySchedule> getAllListDutySchedule() {
    DutyScheduleExample dutyScheduleExample= new DutyScheduleExample();
    List<DutySchedule> listDutySchedule=dutyScheduleMapper.selectByExample(dutyScheduleExample);
    if(listDutySchedule.size()>0){
      return listDutySchedule;
    }
    return null;
  }

  @Override
  public DutySchedule getDutySchedule(int key) {
    DutySchedule dutySchedule= dutyScheduleMapper.selectByPrimaryKey(key);
    if(dutySchedule!= null){
      return dutySchedule;
    }
    return null;
  }

  @Override
  public DutySchedule insertDutySchedule(DutySchedule dutySchedule) {
   int success= dutyScheduleMapper.insertSelective(dutySchedule);
    if(success>0){
      return  dutySchedule;
    }else {
      return null;
    }

  }

  @Override
  public DutySchedule updateDutySchedule(DutySchedule dutySchedule) {
    int success= dutyScheduleMapper.updateByPrimaryKeySelective(dutySchedule);
    if(success>0){
      return  dutySchedule;
    }else {
      return null;
    }
  }
  @Override
  public int deleteDutySchedule(int id) {
    int success= dutyScheduleMapper.deleteByPrimaryKey(id);
    if(success>0){
      return 1;
    }
    else {
      return 0;
    }

  }
}
