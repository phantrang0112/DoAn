package com.Trang.webyte.service;

import com.Trang.webyte.model.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllScheduleOfDoctor(int id);
}
