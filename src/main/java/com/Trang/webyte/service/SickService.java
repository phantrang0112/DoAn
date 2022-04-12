package com.Trang.webyte.service;

import com.Trang.webyte.DTO.SickDTO;
import com.Trang.webyte.model.Sick;

import java.util.List;

public interface SickService {
    public List<Sick> getAllSick();

    public Sick getSick(int id);

    public SickDTO insertSick(SickDTO sickDTO);

    public SickDTO updateSick(SickDTO sickDTO);

    public int deleteSick(int id);
}
