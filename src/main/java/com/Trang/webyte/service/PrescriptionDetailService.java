package com.Trang.webyte.service;

import com.Trang.webyte.DTO.PrescriptionDetailDTO;
import com.Trang.webyte.model.Prescription_Detail;
import com.Trang.webyte.model.Prescription_DetailKey;

import java.util.List;

public interface PrescriptionDetailService {
    public List<Prescription_Detail> getAllPrescriptionDetails();

    public Prescription_Detail getPrescriptionDetail(Prescription_DetailKey key);

    public PrescriptionDetailDTO insertPrescriptionDetail(PrescriptionDetailDTO prescriptionDetailDTO);

    public PrescriptionDetailDTO updatePrescriptionDetail(PrescriptionDetailDTO prescriptionDetailDTO);

    public int deletePrescriptionDetail(Prescription_DetailKey key);
}
