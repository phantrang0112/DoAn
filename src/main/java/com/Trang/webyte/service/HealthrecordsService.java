package com.Trang.webyte.service;

import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.model.Healthrecords;

import java.util.List;

public interface HealthrecordsService {
    public List<Healthrecords> getAllListHealthrecords();
    public Healthrecords getHealthrecords(int key);
    public Healthrecords insertHealthrecords(Healthrecords healthrecords);
    public Healthrecords updateHealthrecords(Healthrecords healthrecords);
    public int deleteHealthrecords(int id);
}
