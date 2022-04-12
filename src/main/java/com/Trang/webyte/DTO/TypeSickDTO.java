package com.Trang.webyte.DTO;

public class TypeSickDTO {
    public int typeSickId;
    public String typeSickName;

    public TypeSickDTO() {
    }

    public TypeSickDTO(int typeSickId, String typeSickName) {
        this.typeSickId = typeSickId;
        this.typeSickName = typeSickName;
    }

    public int getTypeSickId() {
        return typeSickId;
    }

    public void setTypeSickId(int typeSickId) {
        this.typeSickId = typeSickId;
    }

    public String getTypeSickName() {
        return typeSickName;
    }

    public void setTypeSickName(String typeSickName) {
        this.typeSickName = typeSickName;
    }
}
