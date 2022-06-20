package com.Trang.webyte.service;

import com.Trang.webyte.model.Healthrecords;
import com.Trang.webyte.model.Medical_bills;

import java.util.List;

public interface MedicalbillService {
    public List<Medical_bills> getAllListMedicalbill();
    public Medical_bills getMedical_bills(int key);
    public Medical_bills insertMedical_bills(Medical_bills Medical_bills);
    public Medical_bills updateMedical_bills(Medical_bills Medical_bills);
    public int deleteMedical_bills(int id);
}
