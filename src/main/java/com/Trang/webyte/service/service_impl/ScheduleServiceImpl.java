package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.ScheduleMapper;
import com.Trang.webyte.model.Schedule;
import com.Trang.webyte.model.ScheduleExample;
import com.Trang.webyte.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public List<Schedule> getAllScheduleOfDoctor(int id) {
        ScheduleExample scheduleExample = new ScheduleExample();
        scheduleExample.createCriteria().andDoctoridEqualTo(id);
        List<Schedule> scheduleList = scheduleMapper.selectByExample(scheduleExample);
        List<Schedule> scheduleList1 = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        int ngay = calendar.get(calendar.DAY_OF_WEEK);
        //lấy ngày đầu tuần
        calendar.add(Calendar.DAY_OF_MONTH, -ngay + 2);
        Date ngayDauTuan = calendar.getTime();
        int thuHai = ngayDauTuan.getDate();
        for (Schedule schedule : scheduleList) {
            if (schedule.getDutyday().compareTo(ngayDauTuan) >= 0) {
                scheduleList1.add(schedule);
            }
        }
        System.err.println(scheduleList1);
        return scheduleList1;
    }
}
