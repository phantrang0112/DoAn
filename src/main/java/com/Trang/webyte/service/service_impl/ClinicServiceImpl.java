package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.ClinicMapper;
import com.Trang.webyte.model.Clinic;
import com.Trang.webyte.model.ClinicExample;
import com.Trang.webyte.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClinicServiceImpl implements ClinicService {
    @Autowired
    ClinicMapper clinicMapper;
    @Override
    public List<com.Trang.webyte.model.Clinic> getAllListClinic() {
        ClinicExample clinicExample= new ClinicExample();
        List<com.Trang.webyte.model.Clinic> listClinic= clinicMapper.selectByExample(clinicExample);
        if(listClinic!=null){
            return listClinic;
        }
        else{
            return  null;
        }
    }

    @Override
    public Clinic getClinic(int key) {
        Clinic clinic= clinicMapper.selectByPrimaryKey(key);
        if(clinic!=null){
            return clinic;
        }
        else {
            return  null;
        }
    }

    @Override
    public Clinic insertClinic(Clinic clinic) {
        int success= clinicMapper.insertSelective(clinic);
        if(success>0){
            return  clinic;
        }else{
            return null;
        }

    }

    @Override
    public Clinic updateClinic(Clinic clinic) {
        int success= clinicMapper.updateByPrimaryKeySelective(clinic);
        if(success>0){
            return clinic;
        }
        else
        {
            return null;
        }
    }

    @Override
    public int deleteClinic(int id) {
        int success= clinicMapper.deleteByPrimaryKey(id);
        if(success>0){
            return 1;
        }else{
            return 0;
        }
    }
}
