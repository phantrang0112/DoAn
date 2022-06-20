package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.Medical_billsMapper;
import com.Trang.webyte.model.Medical_bills;
import com.Trang.webyte.model.Medical_billsExample;
import com.Trang.webyte.service.MedicalbillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalbillImpl implements MedicalbillService {

    @Autowired
    Medical_billsMapper medical_billsMapper;
    @Override
    public List<Medical_bills> getAllListMedicalbill() {
        Medical_billsExample medical_billsExample= new Medical_billsExample();
        List<Medical_bills> medicalBillsList= medical_billsMapper.selectByExample(medical_billsExample);
        if(medicalBillsList!=null){
            return  medicalBillsList;
        }
        return null;
    }

    @Override
    public Medical_bills getMedical_bills(int key) {
        if(key>0){
            Medical_bills medical_bills= medical_billsMapper.selectByPrimaryKey(key);
            return  medical_bills;
        }
        return null;
    }

    @Override
    public Medical_bills insertMedical_bills(Medical_bills medical_bills) {
        if( medical_bills!=null){
            int succes= medical_billsMapper.insert(medical_bills);
            if(succes>0){
                return  medical_bills;
            }
            return null;
        }
        return null;
    }

    @Override
    public Medical_bills updateMedical_bills(Medical_bills medical_bills) {
        if( medical_bills!=null){
            int succes= medical_billsMapper.updateByPrimaryKeySelective(medical_bills);
            if(succes>0){
                return  medical_bills;
            }
            return null;
        }
        return null;
    }

    @Override
    public int deleteMedical_bills(int id) {
        try{
            if(id>0){
                int succes= medical_billsMapper.deleteByPrimaryKey(id);
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }
}
