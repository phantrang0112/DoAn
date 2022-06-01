package com.Trang.webyte.service;



import com.Trang.webyte.model.DutySchedule;

import java.util.List;

public interface DutyScheduleService {
  public List<DutySchedule> getAllListDutySchedule();

  public DutySchedule getDutySchedule(int key);
  public DutySchedule insertDutySchedule(DutySchedule dutySchedule);
  public DutySchedule updateDutySchedule(DutySchedule dutySchedule);
  public int deleteDutySchedule(int id);

}
