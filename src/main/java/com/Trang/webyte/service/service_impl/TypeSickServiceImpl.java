package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.TypeSickDTO;
import com.Trang.webyte.mapper.Type_SickMapper;
import com.Trang.webyte.model.Type_Sick;
import com.Trang.webyte.model.Type_SickExample;
import com.Trang.webyte.service.TypeSickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeSickServiceImpl implements TypeSickService {
    @Autowired
    Type_SickMapper typeSickMapper;

    @Override
    public List<Type_Sick> getAllTypeSick() {
        Type_SickExample typeSickExample = new Type_SickExample();
        List<Type_Sick> typeSickList = typeSickMapper.selectByExample(typeSickExample);
        return typeSickList != null ? typeSickList : null;
    }

    @Override
    public Type_Sick getTypeSick(int id) {
        Type_Sick type_sick;
        type_sick = typeSickMapper.selectByPrimaryKey(id);
        if (type_sick != null) {
            return type_sick;
        } else {
            return null;
        }
    }

    @Override
    public TypeSickDTO insertTypeSick(TypeSickDTO typeSickDTO) {
        Type_Sick type_sick = new Type_Sick();
        type_sick.setIdtypesick(typeSickDTO.getTypeSickId());
        type_sick.setTypesickname(typeSickDTO.getTypeSickName());
        int success = typeSickMapper.insertSelective(type_sick);
        if (success > 0) {
            return typeSickDTO;
        } else {
            return null;
        }
    }

    @Override
    public TypeSickDTO updateTypeSick(TypeSickDTO typeSickDTO) {
        Type_Sick type_sick = new Type_Sick();
        type_sick.setIdtypesick(typeSickDTO.getTypeSickId());
        type_sick.setTypesickname(typeSickDTO.getTypeSickName());
        int success = typeSickMapper.updateByPrimaryKeySelective(type_sick);
        if (success > 0) {
            return typeSickDTO;
        } else {
            return null;
        }
    }

    @Override
    public int deleteTypeSick(int id) {
        Type_Sick type_sick = typeSickMapper.selectByPrimaryKey(id);
        return type_sick != null ? typeSickMapper.deleteByPrimaryKey(id) : -1;
    }
}
