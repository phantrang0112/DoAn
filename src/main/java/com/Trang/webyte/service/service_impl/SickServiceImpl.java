package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.SickDTO;
import com.Trang.webyte.mapper.SickMapper;
import com.Trang.webyte.model.Sick;
import com.Trang.webyte.model.SickExample;
import com.Trang.webyte.service.SickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SickServiceImpl implements SickService {
    @Autowired
    SickMapper sickMapper;

    @Override
    public List<Sick> getAllSick() {
        SickExample sickExample= new SickExample();
        List<Sick> sickList= sickMapper.selectByExample(sickExample);
        return sickList!=null ? sickList : null;
    }

    @Override
    public Sick getSick(int id) {
        Sick sick = sickMapper.selectByPrimaryKey(id);
        return sick!=null ? sick : null;
    }

    @Override
    public SickDTO insertSick(SickDTO sickDTO) {
        Sick sick = new Sick();
        sick.setSickid(sickDTO.getSickId());
        sick.setSickname(sickDTO.getSickName());
        sick.setSicktypeid(sickDTO.getSickTypeId());
        return sickMapper.insertSelective(sick)>0 ? sickDTO : null;
    }

    @Override
    public SickDTO updateSick(SickDTO sickDTO) {
        Sick sick = new Sick();
        sick.setSickid(sickDTO.getSickId());
        sick.setSickname(sickDTO.getSickName());
        sick.setSicktypeid(sickDTO.getSickTypeId());
        return sickMapper.updateByPrimaryKeySelective(sick)>0 ? sickDTO : null;
    }

    @Override
    public int deleteSick(int id) {
        Sick sick= sickMapper.selectByPrimaryKey(id);
        return sick!=null ? sickMapper.deleteByPrimaryKey(id) : -1;
    }
}
