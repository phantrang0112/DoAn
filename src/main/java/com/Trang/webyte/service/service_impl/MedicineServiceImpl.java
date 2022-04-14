package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.MedicineMapper;
import com.Trang.webyte.model.Medicine;
import com.Trang.webyte.model.MedicineExample;
import com.Trang.webyte.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    MedicineMapper medicineMapper;
    @Override
    public List<Medicine> getAllListMedicine() {
        MedicineExample medicineExample= new MedicineExample();
        List<Medicine> medicineList= medicineMapper.selectByExample(medicineExample);
        if(medicineList!= null){
            return medicineList;
        }
        else {
            return  null;
        }
    }

    @Override
    public Medicine getMedicine(int key) {
        Medicine medicine= medicineMapper.selectByPrimaryKey(key);
        if(medicine!=null){
            return medicine;
        }
        return null;
    }

    @Override
    public Medicine insertMedicine(Medicine Medicine) {
       int success= medicineMapper.insertSelective(Medicine);
       if(success>0){
           return Medicine;
       }
        return null;
    }

    @Override
    public Medicine updateMedicine(Medicine Medicine) {
       int success= medicineMapper.updateByPrimaryKeySelective(Medicine);
       if(success>0){
            return  Medicine;
       }
        return null;
    }

    @Override
    public int deleteMedicine(int id) {
        int success= medicineMapper.deleteByPrimaryKey(id);
        if(success>0){
            return  1;
        }
        return 0;
    }
}
