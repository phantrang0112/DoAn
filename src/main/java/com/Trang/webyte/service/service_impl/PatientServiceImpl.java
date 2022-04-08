package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.PatientDTO;
import com.Trang.webyte.mapper.PatientMapper;
import com.Trang.webyte.model.Patient;
import com.Trang.webyte.model.PatientExample;
import com.Trang.webyte.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientMapper patientMapper;

    @Override
    public List<Patient> getAllListPatient() {
        PatientExample patientExample = new PatientExample();
        List<Patient> patientList = patientMapper.selectByExample(patientExample);
        return patientList;
    }

    @Override
    public Patient getPatient(int id) {
        Patient patient = patientMapper.selectByPrimaryKey(id);
        if (patient != null) {
            return patient;
        }
        return null;
    }

    @Override
    public PatientDTO insertPatient(PatientDTO patientDTO) {
        Patient patient = new Patient();
        patient.setAccountid(patientDTO.getAccountID());
        patient.setId(patientDTO.getId());
        patient.setFullname(patientDTO.getFullName());
        patient.setEmail(patientDTO.getEmail());
        patient.setAddress(patientDTO.getAddress());
        patient.setImg(patientDTO.getImg());
        patient.setPhone(patientDTO.getPhone());
        int success = patientMapper.insertSelective(patient);
        if (success > 0) {
            return patientDTO;
        } else {
            return null;
        }
    }

    @Override
    public PatientDTO updatePatient(PatientDTO patientDTO) {
        Patient patientUpdate = new Patient();
        patientUpdate.setAccountid(patientDTO.getAccountID());
        patientUpdate.setId(patientDTO.getId());
        patientUpdate.setFullname(patientDTO.getFullName());
        patientUpdate.setEmail(patientDTO.getEmail());
        patientUpdate.setAddress(patientDTO.getAddress());
        patientUpdate.setImg(patientDTO.getImg());
        patientUpdate.setPhone(patientDTO.getPhone());
        int success = patientMapper.updateByPrimaryKeySelective(patientUpdate);
        if (success > 0) {
            return patientDTO;
        } else {
            return null;
        }
    }

    @Override
    public int deletePatient(int id) {
        Patient key = new Patient();
        key.setId(id);
        int success = patientMapper.deleteByPrimaryKey(key.getId());
        return success;
    }
}
