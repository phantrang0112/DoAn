package com.Trang.webyte.service;

import com.Trang.webyte.model.Clinic;

import java.util.List;

public interface ClinicService {
    public List<com.Trang.webyte.model.Clinic> getAllListClinic();
    public Clinic getClinic(int key);
    public Clinic insertClinic(Clinic answer);
    public Clinic updateClinic(Clinic accountDTO);
    public int deleteClinic(int id);
}
