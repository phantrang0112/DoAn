package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.PrescriptionDetailDTO;
import com.Trang.webyte.mapper.Prescription_DetailMapper;
import com.Trang.webyte.model.Prescription;
import com.Trang.webyte.model.Prescription_Detail;
import com.Trang.webyte.model.Prescription_DetailExample;
import com.Trang.webyte.model.Prescription_DetailKey;
import com.Trang.webyte.service.PrescriptionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionDetailServiceImpl implements PrescriptionDetailService {
    @Autowired
    Prescription_DetailMapper prescription_detailMapper;

    @Override
    public List<Prescription_Detail> getAllPrescriptionDetails() {
        Prescription_DetailExample prescription_detailExample = new Prescription_DetailExample();
        List<Prescription_Detail> prescriptionDetailList = prescription_detailMapper.selectByExample(prescription_detailExample);
        return prescriptionDetailList != null ? prescriptionDetailList : null;
    }

    @Override
    public Prescription_Detail getPrescriptionDetail(Prescription_DetailKey key) {
        Prescription_Detail prescription_detail = prescription_detailMapper.selectByPrimaryKey(key);
        return prescription_detail != null ? prescription_detail : null;
    }

    @Override
    public PrescriptionDetailDTO insertPrescriptionDetail(PrescriptionDetailDTO prescriptionDetailDTO) {
        Prescription_Detail prescription_detail = new Prescription_Detail();
        prescription_detail.setPrescriptionid(prescriptionDetailDTO.getPrescriptionId());
        prescription_detail.setMedicineid(prescriptionDetailDTO.getMedicineId());
        prescription_detail.setAmount(prescriptionDetailDTO.getAmount());
        prescription_detail.setDosage(prescriptionDetailDTO.getDosage());
        prescription_detail.setDuration(prescriptionDetailDTO.getDuration());
        prescription_detail.setTimes(prescriptionDetailDTO.getTimes());
        return prescription_detailMapper.insertSelective(prescription_detail) > 0 ? prescriptionDetailDTO : null;
    }

    @Override
    public PrescriptionDetailDTO updatePrescriptionDetail(PrescriptionDetailDTO prescriptionDetailDTO) {
        Prescription_Detail prescription_detail = new Prescription_Detail();
        prescription_detail.setPrescriptionid(prescriptionDetailDTO.getPrescriptionId());
        prescription_detail.setMedicineid(prescriptionDetailDTO.getMedicineId());
        prescription_detail.setAmount(prescriptionDetailDTO.getAmount());
        prescription_detail.setDosage(prescriptionDetailDTO.getDosage());
        prescription_detail.setDuration(prescriptionDetailDTO.getDuration());
        prescription_detail.setTimes(prescriptionDetailDTO.getTimes());
        return prescription_detailMapper.updateByPrimaryKeySelective(prescription_detail) > 0 ? prescriptionDetailDTO : null;
    }

    @Override
    public int deletePrescriptionDetail(Prescription_DetailKey key) {
        Prescription_Detail prescription_detail = prescription_detailMapper.selectByPrimaryKey(key);
        return prescription_detail != null ? prescription_detailMapper.deleteByPrimaryKey(key) : null;
    }
}
