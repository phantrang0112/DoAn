package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.ScheduleMapper;
import com.Trang.webyte.model.Schedule;
import com.Trang.webyte.model.ScheduleExample;
import com.Trang.webyte.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public List<Schedule> getAllScheduleOfDoctor(int id) {
        ScheduleExample scheduleExample = new ScheduleExample();
        scheduleExample.createCriteria().andDoctoridEqualTo(id);
        List<Schedule> scheduleList= scheduleMapper.selectByExample(scheduleExample);
        System.err.println(scheduleList);
        return scheduleList;
    }
}
