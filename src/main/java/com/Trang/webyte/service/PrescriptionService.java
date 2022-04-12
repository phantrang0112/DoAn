package com.Trang.webyte.service;

import com.Trang.webyte.DTO.PrescriptionDTO;
import com.Trang.webyte.model.Prescription;

import java.util.List;

public interface PrescriptionService {
    public List<Prescription> getAllPrescriptions();

    public Prescription getPrescription(int id);

    public PrescriptionDTO insertPrescription(PrescriptionDTO prescriptionDTO);

    public PrescriptionDTO updatePrescription(PrescriptionDTO prescriptionDTO);

    public int deletePrescription(int id);
}
