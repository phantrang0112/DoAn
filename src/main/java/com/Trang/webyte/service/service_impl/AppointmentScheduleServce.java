package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.AppointmentScheduleDTO;
import com.Trang.webyte.mapper.Appointment_ScheduleMapper;
import com.Trang.webyte.mapper.DoctorMapper;
import com.Trang.webyte.mapper.PatientMapper;
import com.Trang.webyte.mapper.PriceOfMedicalExaminationServiceMapper;
import com.Trang.webyte.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.nio.file.LinkOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.*;


@Service
public class AppointmentScheduleServce implements com.Trang.webyte.service.AppointmentScheduleServce {
    @Autowired
    Appointment_ScheduleMapper appointment_scheduleMapper;
    @Autowired
    DoctorMapper doctorMapper;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    PriceOfMedicalExaminationServiceMapper priceOfMedicalExaminationServiceMapper;

    @Override
    public List<Appointment_Schedule> getAllListAppointmentSchedule() {
        Appointment_ScheduleExample appointment_scheduleExample = new Appointment_ScheduleExample();
        List<Appointment_Schedule> listAppoint = appointment_scheduleMapper.selectByExample(appointment_scheduleExample);
        return listAppoint;
    }

    @Override
    public List<AppointmentScheduleDTO> getAllAppointmentSchedule() throws ParseException {
        Appointment_ScheduleExample appointment_scheduleExample = new Appointment_ScheduleExample();
        LocalDate dateNow = LocalDate.now();
        java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateNow.toString());

        appointment_scheduleExample.setOrderByClause(appointment_scheduleExample.getOrderByClause() + "," + "date DESC");
        List<Appointment_Schedule> listAppoint = appointment_scheduleMapper.selectByExample(appointment_scheduleExample);

        List<AppointmentScheduleDTO> listAppointSchedule = new ArrayList<AppointmentScheduleDTO>();
        AppointmentScheduleDTO itemDTO;
        for (Appointment_Schedule item : listAppoint) {
            Patient patient = patientMapper.selectByPrimaryKey(item.getPatientid());
            if (item.getStatus().equals("Đã đăng ký") && item.getDate().compareTo(date) <= 0) {
                item.setStatus("Chờ khám");
                updateStatus(item.getIdappointmentSchedule(), "Chờ khám");
//                LocalTime time= LocalTime.now();
//
////                LocalTime timeLichkham=LocalTime.of()
//                LocalTime timeAppoint= LocalTime.parse(item.getTime());
//                timeAppoint.plusMinutes(10);
//                if(time.compareTo(timeAppoint)==0){
//
//                }
//                    System.out.println();

            }
            if (item.getTypeclinic().equals("Online")) {
                Doctor doctor = doctorMapper.selectByPrimaryKey(item.getDoctorid());
                itemDTO = new AppointmentScheduleDTO(item, doctor.getFullname(), patient.getFullname());
                System.out.println(itemDTO.getDate());
            } else {
                itemDTO = new AppointmentScheduleDTO(item, patient.getFullname());
                System.out.println(itemDTO.getDate());
            }

            listAppointSchedule.add(itemDTO);
        }
        return listAppointSchedule;
    }

    @Override
    public List<AppointmentScheduleDTO> getAllAppointmentScheduleByDoctor(String username) {
        Appointment_ScheduleExample appointment_scheduleExample = new Appointment_ScheduleExample();
        List<Appointment_Schedule> listAppoint = appointment_scheduleMapper.selectByExample(appointment_scheduleExample);
        List<AppointmentScheduleDTO> listAppointSchedule = new ArrayList<AppointmentScheduleDTO>();
        for (Appointment_Schedule item : listAppoint) {
            Doctor doctor = doctorMapper.selectByPrimaryKey(item.getDoctorid());
            Patient patient = patientMapper.selectByPrimaryKey(item.getPatientid());
            System.out.println(item.getDate());
            AppointmentScheduleDTO itemDTO = new AppointmentScheduleDTO(item, doctor.getFullname(), patient.getFullname());
            System.out.println(itemDTO.getDate());
            listAppointSchedule.add(itemDTO);
        }
        return listAppointSchedule;
    }

    @Override
    public Appointment_Schedule getAppointmentSchedule(int key) {
        Appointment_Schedule appointment_schedule = appointment_scheduleMapper.selectByPrimaryKey(key);
        if (appointment_schedule != null) {
            return appointment_schedule;
        } else {
            return null;
        }
    }

    @Override
    public Appointment_Schedule insertAppointmentSchedule(Appointment_Schedule appointment_schedule) {
        Appointment_ScheduleExample appointment_scheduleExample = new Appointment_ScheduleExample();
        int success = 0;
        if (appointment_schedule != null) {
            appointment_schedule.setStatus("Đã đăng ký");
            if (appointment_schedule.getTypeclinic().equals("Offline")) {
                appointment_scheduleExample.createCriteria().andDateEqualTo(appointment_schedule.getDate()).andTimeEqualTo(appointment_schedule.getTime()).andTypeclinicEqualTo(appointment_schedule.getTypeclinic());
                appointment_scheduleExample.setOrderByClause(appointment_scheduleExample.getOrderByClause() + "," + "number DESC");
                try {
                    List<Appointment_Schedule> listTime = appointment_scheduleMapper.selectByExample(appointment_scheduleExample);
                    System.out.println(listTime);
                    if (listTime != null) {
                        appointment_schedule.setNumber(listTime.get(0).getNumber() + 1);
                    } else {
                        appointment_schedule.setNumber(1);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                success = appointment_scheduleMapper.insertSelective(appointment_schedule);
                if (success > 0) {
                    appointment_scheduleExample.createCriteria().andPatientidEqualTo(appointment_schedule.getPatientid()).andDateEqualTo(appointment_schedule.getDate()).andTimeEqualTo(appointment_schedule.getTime());
                    List<Appointment_Schedule> list = appointment_scheduleMapper.selectByExample(appointment_scheduleExample);
                    return list.get(0);
                }
                return null;
            } else {
                success = appointment_scheduleMapper.insertSelective(appointment_schedule);
            }


            if (success > 0) {
                appointment_scheduleExample.createCriteria().andPatientidEqualTo(appointment_schedule.getPatientid()).andDoctoridEqualTo(appointment_schedule.getDoctorid()).andDateEqualTo(appointment_schedule.getDate()).andTimeEqualTo(appointment_schedule.getTime());
                List<Appointment_Schedule> list = appointment_scheduleMapper.selectByExample(appointment_scheduleExample);
                return list.get(0);
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public Appointment_Schedule updateAppointmentSchedule(Appointment_Schedule appointment_schedule) {
        int success = appointment_scheduleMapper.updateByPrimaryKeySelective(appointment_schedule);
        if (success > 0) {
            return appointment_schedule;
        } else {
            return null;
        }
    }

    @Override
    public int deleteAppointmentSchedule(int id) {
        int success = appointment_scheduleMapper.deleteByPrimaryKey(id);
        if (success <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public Appointment_Schedule selectTop1Appoint() {
        return null;
    }

    @Override
    public List<Map<String, Object>> getCountTimeFull(Date date) {
        try {
            List<Map<String, Object>> listCountTime = appointment_scheduleMapper.countTimeFull(date);
            return listCountTime;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public AppointmentScheduleDTO getAppointmentScheduleById(int id) {
        try {
            Appointment_Schedule appointment_schedule = appointment_scheduleMapper.selectByPrimaryKey(id);
            Doctor doctor = doctorMapper.selectByPrimaryKey(appointment_schedule.getDoctorid());
            Patient patient = patientMapper.selectByPrimaryKey(appointment_schedule.getPatientid());
            System.out.println(appointment_schedule.getDate());
            PriceOfMedicalExaminationServiceExample price = new PriceOfMedicalExaminationServiceExample();
            price.createCriteria().andDoctortidEqualTo(appointment_schedule.getDoctorid());
            List<PriceOfMedicalExaminationService> list = priceOfMedicalExaminationServiceMapper.selectByExample(price);
            System.out.println(list.get(0));
            AppointmentScheduleDTO itemDTO = new AppointmentScheduleDTO(appointment_schedule, doctor.getFullname(), patient.getFullname());
            itemDTO.setPrice(list.get(0).getPrice());
            System.out.println(itemDTO.getDate() + "trang nha" + itemDTO.getPrice());
            return itemDTO;
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Appointment_Schedule updateStatus(int id, String status) {
        Appointment_Schedule appointment_schedule = appointment_scheduleMapper.selectByPrimaryKey(id);
        appointment_schedule.setStatus(status);
        int sussecc = appointment_scheduleMapper.updateByPrimaryKeySelective(appointment_schedule);
        if (sussecc > 0) {
            return appointment_schedule;
        } else {
            return null;
        }
    }

    @Override
    public Map<String, Object> getAppointDate(int id) {
        Doctor doctor = doctorMapper.selectByPrimaryKey(id);
        Map<String, Object> map = new HashMap<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -6);
        int ngay = cal.get(cal.DAY_OF_WEEK);
        // lay ngày đầu tuần nè
        cal.add(Calendar.DAY_OF_MONTH, -ngay + 2);
        java.util.Date ngaydautuan = cal.getTime();

        Object[] listngay = new Object[7];
        Object[] listngayhuy = new Object[7];
        String khoangngay = "Từ ngày " + format.format(cal.getTime());
        for (int i = 0; i < 7; i++) {
            Map<String, Object> item = new HashMap<>();
            Map<String, Object> item1 = new HashMap<>();
            java.util.Date ngayHienTai = cal.getTime();
            Appointment_ScheduleExample appointment_scheduleExample = new Appointment_ScheduleExample();
            appointment_scheduleExample.createCriteria().andDoctoridEqualTo(doctor.getDoctorid()).andDateEqualTo(ngayHienTai).andStatusEqualTo("Đã khám");
            Appointment_ScheduleExample appointment_scheduleExample1 = new Appointment_ScheduleExample();
            appointment_scheduleExample1.createCriteria().andDoctoridEqualTo(doctor.getDoctorid()).andDateEqualTo(ngayHienTai).andStatusEqualTo("Đã hủy");


            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String formatted = format1.format(ngayHienTai);
            item.put("date", formatted);
            item.put("count", appointment_scheduleMapper.countByExample(appointment_scheduleExample));
            item1.put("date", formatted);
            System.out.println(appointment_scheduleMapper.countByExample(appointment_scheduleExample1));
            item1.put("count", appointment_scheduleMapper.countByExample(appointment_scheduleExample1));
            listngay[i]=item;
            listngayhuy[i]=item1;

            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
        cal.add(Calendar.DAY_OF_MONTH, -1);
        khoangngay += "  đến ngày  " + format.format(cal.getTime());

        map.put("listDateSuccess", listngay);
        map.put("listDateError", listngayhuy);
        return map;
    }
}
