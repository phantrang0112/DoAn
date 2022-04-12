package com.Trang.webyte.service;

import com.Trang.webyte.DTO.TypeOfClinicDTO;
import com.Trang.webyte.model.Type_Of_Clinic;

import java.util.List;

public interface TypeOfClinicService {
    public List<Type_Of_Clinic> getAllTOCList();

    public Type_Of_Clinic getTOC(int id);

    public TypeOfClinicDTO insertTOC(TypeOfClinicDTO typeOfClinicDTO);

    public TypeOfClinicDTO updateTOC(TypeOfClinicDTO typeOfClinicDTO);

    public int deleteTOC(int id);
}
