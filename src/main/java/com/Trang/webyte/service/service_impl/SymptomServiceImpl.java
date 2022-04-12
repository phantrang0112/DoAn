package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.SymptomDTO;
import com.Trang.webyte.mapper.SymptomMapper;
import com.Trang.webyte.model.Symptom;
import com.Trang.webyte.model.SymptomExample;
import com.Trang.webyte.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomServiceImpl implements SymptomService {
    @Autowired
    SymptomMapper symptomMapper;

    @Override
    public List<Symptom> getAllSymptom() {
        SymptomExample symptomExample= new SymptomExample();
        List<Symptom> symptomList= symptomMapper.selectByExample(symptomExample);
        return symptomList!=null ? symptomList : null;
    }

    @Override
    public Symptom getSymptom(int id) {
        Symptom symptom =symptomMapper.selectByPrimaryKey(id);
        return  symptom!=null ? symptom : null;
    }

    @Override
    public SymptomDTO insertSymptom(SymptomDTO symptomDTO) {
        Symptom symptom = new Symptom();
        symptom.setIdsymptom(symptomDTO.getSymptomId());
        symptom.setSymptomname(symptomDTO.getSymptomName());
        int success= symptomMapper.insertSelective(symptom);
        return success>0 ? symptomDTO : null;
    }

    @Override
    public SymptomDTO updateSymptom(SymptomDTO symptomDTO) {
        Symptom symptom = new Symptom();
        symptom.setIdsymptom(symptomDTO.getSymptomId());
        symptom.setSymptomname(symptomDTO.getSymptomName());
        int success= symptomMapper.updateByPrimaryKeySelective(symptom);
        return success>0 ? symptomDTO : null;
    }

    @Override
    public int deleteSymptom(int id) {
        Symptom symptom= symptomMapper.selectByPrimaryKey(id);
        return symptom!=null ? symptomMapper.deleteByPrimaryKey(id) : -1;
    }
}
