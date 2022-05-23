package com.Trang.webyte.service;

import com.Trang.webyte.DTO.PatientDTO;
import com.Trang.webyte.model.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> getAllListPatient();

    public Patient getPatient(int id);

    public PatientDTO insertPatient(PatientDTO patient);

    public PatientDTO insertPatientSignup(int id, PatientDTO patientDTO);

    public PatientDTO updatePatient(PatientDTO patientDTO);

    public int deletePatient(int id);
}
