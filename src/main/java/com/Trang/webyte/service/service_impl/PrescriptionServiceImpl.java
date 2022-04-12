package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.PrescriptionDTO;
import com.Trang.webyte.mapper.PrescriptionMapper;
import com.Trang.webyte.model.Prescription;
import com.Trang.webyte.model.PrescriptionExample;
import com.Trang.webyte.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    @Autowired
    PrescriptionMapper prescriptionMapper;

    @Override
    public List<Prescription> getAllPrescriptions() {
        PrescriptionExample prescriptionExample = new PrescriptionExample();
        List<Prescription> prescriptionList = prescriptionMapper.selectByExample(prescriptionExample);
        return prescriptionList != null ? prescriptionList : null;
    }

    @Override
    public Prescription getPrescription(int id) {
        Prescription prescription = prescriptionMapper.selectByPrimaryKey(id);
        return prescription != null ? prescription : null;
    }

    @Override
    public PrescriptionDTO insertPrescription(PrescriptionDTO prescriptionDTO) {
        Prescription prescription = new Prescription();
        prescription.setPrescriptionid(prescriptionDTO.getPrescriptionId());
        prescription.setCreatedate(prescriptionDTO.getCreateDate());
        return prescriptionMapper.insertSelective(prescription) > 0 ? prescriptionDTO : null;
    }

    @Override
    public PrescriptionDTO updatePrescription(PrescriptionDTO prescriptionDTO) {
        Prescription prescription = new Prescription();
        prescription.setPrescriptionid(prescriptionDTO.getPrescriptionId());
        prescription.setCreatedate(prescriptionDTO.getCreateDate());
        return prescriptionMapper.updateByPrimaryKeySelective(prescription) > 0 ? prescriptionDTO : null;
    }

    @Override
    public int deletePrescription(int id) {
        Prescription prescription= prescriptionMapper.selectByPrimaryKey(id);
        return prescription!=null? prescriptionMapper.deleteByPrimaryKey(id) : null;
    }
}
