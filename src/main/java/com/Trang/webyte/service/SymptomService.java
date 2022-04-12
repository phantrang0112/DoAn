package com.Trang.webyte.service;

import com.Trang.webyte.DTO.SymptomDTO;
import com.Trang.webyte.model.Symptom;

import java.util.List;

public interface SymptomService {
    public List<Symptom> getAllSymptom();

    public Symptom getSymptom(int id);

    public SymptomDTO insertSymptom(SymptomDTO symptomDTO);

    public SymptomDTO updateSymptom(SymptomDTO symptomDTO);

    public int deleteSymptom(int id);
}
