package com.Trang.webyte.controller;

import com.Trang.webyte.model.Answer;
import com.Trang.webyte.model.DutySchedule;
import com.Trang.webyte.service.DutyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/webyte/duty-schedule")
public class DutyScheduleController {
  @Autowired
  DutyScheduleService dutyScheduleService;
  @GetMapping()
  public List<DutySchedule> getAllListDutySchedule(){
    List<DutySchedule> listDutySchedule= dutyScheduleService.getAllListDutySchedule();
    return  listDutySchedule;
  }
  @GetMapping("/{id}")
  public DutySchedule getDutySchedule(@PathVariable("id") int id){
    if(id>0){
      DutySchedule dutySchedule= dutyScheduleService.getDutySchedule(id);
      return  dutySchedule;
    }
    else {
      return null;
    }

  }
  @PostMapping()
  public DutySchedule insertDutySchedule(@RequestBody DutySchedule dutySchedule){
    if(dutySchedule!=null){
      DutySchedule dutySchedule1= dutyScheduleService.insertDutySchedule(dutySchedule);
      return  dutySchedule1;
    }
    return  null;
  }
  @PutMapping()
  public DutySchedule updateDutySchedule(@RequestBody DutySchedule dutySchedule){
    if(dutySchedule!= null){
      DutySchedule dutySchedule1= dutyScheduleService.updateDutySchedule(dutySchedule);
      return  dutySchedule1;
    }
    return null;
  }
  @DeleteMapping("{id}")
  public int deleteDutySchedule(@PathVariable("id")int id){
    if(id>0){
      int success= dutyScheduleService.deleteDutySchedule(id);
      return  success;
    }
    return 0;
  }
}
