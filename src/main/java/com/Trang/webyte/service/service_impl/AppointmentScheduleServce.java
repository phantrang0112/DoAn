package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.Appointment_ScheduleMapper;
import com.Trang.webyte.model.Appointment_Schedule;
import com.Trang.webyte.model.Appointment_ScheduleExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointmentScheduleServce implements com.Trang.webyte.service.AppointmentScheduleServce {
    @Autowired
    Appointment_ScheduleMapper appointment_scheduleMapper;
    @Override
    public List<Appointment_Schedule> getAllListAppointmentSchedule() {
        Appointment_ScheduleExample appointment_scheduleExample= new Appointment_ScheduleExample();
          List<Appointment_Schedule> listAppoint=  appointment_scheduleMapper.selectByExample(appointment_scheduleExample);
        return null;
    }

    @Override
    public Appointment_Schedule getAppointmentSchedule(int key) {
         Appointment_Schedule appointment_schedule=  appointment_scheduleMapper.selectByPrimaryKey(key);
         if( appointment_schedule!=null){
             return appointment_schedule;

         }
         else{
             return  null;
         }
    }

    @Override
    public Appointment_Schedule insertAppointmentSchedule(Appointment_Schedule appointment_schedule) {
        Appointment_Schedule appointment_schedule1 = new Appointment_Schedule();
        int success=  appointment_scheduleMapper.insertSelective(appointment_schedule);
        if(success>0){
            return appointment_schedule;
        }else{
            return  null;
        }
    }

    @Override
    public Appointment_Schedule updateAppointmentSchedule(Appointment_Schedule appointment_schedule) {
        int success=  appointment_scheduleMapper.updateByPrimaryKeySelective(appointment_schedule);
        if(success>0){
            return  appointment_schedule;
        }
        else{
            return  null;
        }
    }

    @Override
    public int deleteAppointmentSchedule(int id) {
         int success= appointment_scheduleMapper.deleteByPrimaryKey(id);
         if(success<=0){
             return 0;
         }else{
             return 1;
         }
    }
}
