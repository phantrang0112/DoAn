package com.Trang.webyte.service;

import com.Trang.webyte.model.Dept;
import com.Trang.webyte.model.Medicine;

import java.util.List;

public interface MedicineService {
    public List<Medicine> getAllListMedicine();
    public Medicine getMedicine(int key);
    public Medicine insertMedicine(Medicine Medicine);
    public Medicine updateMedicine(Medicine Medicine);
    public int deleteMedicine(int id);
}
