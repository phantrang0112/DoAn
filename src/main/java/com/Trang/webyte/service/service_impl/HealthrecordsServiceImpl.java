package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.HealthrecordsMapper;
import com.Trang.webyte.model.Healthrecords;
import com.Trang.webyte.model.HealthrecordsExample;
import com.Trang.webyte.service.HealthrecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HealthrecordsServiceImpl implements HealthrecordsService {
    @Autowired
    HealthrecordsMapper healthrecordsMapper;
    @Override
    public List<Healthrecords> getAllListHealthrecords() {
        HealthrecordsExample healthrecordsExample= new HealthrecordsExample();
        List<Healthrecords> healthrecordsList= healthrecordsMapper.selectByExample(healthrecordsExample);
        if(healthrecordsList!=null){
            return  healthrecordsList;
        }
        return null;
    }

    @Override
    public Healthrecords getHealthrecords(int key) {
        Healthrecords healthrecords= healthrecordsMapper.selectByPrimaryKey(key);
        return healthrecords!=null?healthrecords:null;
    }

    @Override
    public Healthrecords insertHealthrecords(Healthrecords healthrecords) {
        int success=   healthrecordsMapper.insertSelective(healthrecords);
        return success>0?healthrecords:null;
    }

    @Override
    public Healthrecords updateHealthrecords(Healthrecords healthrecords) {
        int success= healthrecordsMapper.updateByPrimaryKeySelective(healthrecords);

        return success>0?healthrecords:null;
    }

    @Override
    public int deleteHealthrecords(int id) {
        int success= healthrecordsMapper.deleteByPrimaryKey(id);
        return success>0?1:0;
    }

    @Override
    public List<Map<String, Object>> getListMedicine(int id) {
        try{
            List<Map<String,Object>> listMedicine= healthrecordsMapper.getListMedicine(id);
            if(Objects.nonNull(listMedicine)){
                return  listMedicine;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public Map<String, Object> getListSick(int id) {
        try {
            List<Map<String,Object>> listMedicine= healthrecordsMapper.getListSick(id);
            Map<String,Object> map= new HashMap<>();
            List<Map<String,Object>> listSymptom= new ArrayList<>();
            for(Map<String,Object> item: listMedicine){
                List<Map<String,Object>> sysptom= new ArrayList<>();
                sysptom= healthrecordsMapper.getListSymptom((Integer) item.get("sickid"));
                for (Map<String,Object> item1: sysptom){
                    listSymptom.add(item1);
                }
            }
            map.put("listSick",listMedicine);
            map.put("listSympom",listSymptom);
            if(Objects.nonNull(map)){
                return  map;
            }
        } catch (Exception e) {
            return null;
        }

        return null;
    }
}
