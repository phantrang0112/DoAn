package com.Trang.webyte.service;

import com.Trang.webyte.DTO.TypeSickDTO;
import com.Trang.webyte.model.Type_Sick;

import java.util.List;

public interface TypeSickService {
    public List<Type_Sick> getAllTypeSick();

    public Type_Sick getTypeSick(int id);

    public TypeSickDTO insertTypeSick(TypeSickDTO typeSickDTO);

    public TypeSickDTO updateTypeSick(TypeSickDTO typeSickDTO);

    public int deleteTypeSick(int id);
}
