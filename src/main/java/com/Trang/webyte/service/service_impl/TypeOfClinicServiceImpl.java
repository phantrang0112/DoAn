package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.TypeOfClinicDTO;
import com.Trang.webyte.mapper.Type_Of_ClinicMapper;
import com.Trang.webyte.model.Type_Of_Clinic;
import com.Trang.webyte.model.Type_Of_ClinicExample;
import com.Trang.webyte.service.TypeOfClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfClinicServiceImpl implements TypeOfClinicService {
    @Autowired
    Type_Of_ClinicMapper type_of_clinicMapper;

    @Override
    public List<Type_Of_Clinic> getAllTOCList() {
        Type_Of_ClinicExample type_of_clinicExample = new Type_Of_ClinicExample();
        List<Type_Of_Clinic> type_of_clinicList = type_of_clinicMapper.selectByExample(type_of_clinicExample);
        return type_of_clinicList != null ? type_of_clinicList : null;
    }

    @Override
    public Type_Of_Clinic getTOC(int id) {
        Type_Of_Clinic type_of_clinic;
        type_of_clinic = type_of_clinicMapper.selectByPrimaryKey(id);
        if (type_of_clinic != null) {
            return type_of_clinic;
        } else {
            return null;
        }
    }

    @Override
    public TypeOfClinicDTO insertTOC(TypeOfClinicDTO typeOfClinicDTO) {
        Type_Of_Clinic type_of_clinic = new Type_Of_Clinic();
        type_of_clinic.setTypeofclinicid(typeOfClinicDTO.getTypeOfClinicID());
        type_of_clinic.setTypeofclinicname(typeOfClinicDTO.getTypeOfClinicName());
        int success = type_of_clinicMapper.insertSelective(type_of_clinic);
        if (success > 0) {
            return typeOfClinicDTO;
        } else {
            return null;
        }
    }

    @Override
    public TypeOfClinicDTO updateTOC(TypeOfClinicDTO typeOfClinicDTO) {
        Type_Of_Clinic type_of_clinic = new Type_Of_Clinic();
        type_of_clinic.setTypeofclinicid(typeOfClinicDTO.getTypeOfClinicID());
        type_of_clinic.setTypeofclinicname(typeOfClinicDTO.getTypeOfClinicName());
        int success = type_of_clinicMapper.updateByPrimaryKeySelective(type_of_clinic);
        if (success > 0) {
            return typeOfClinicDTO;
        } else {
            return null;
        }
    }

    @Override
    public int deleteTOC(int id) {
        Type_Of_Clinic type_of_clinic = type_of_clinicMapper.selectByPrimaryKey(id);
        return type_of_clinic != null ? type_of_clinicMapper.deleteByPrimaryKey(id) : -1;
    }
}
