package com.Trang.webyte.DTO;

public class TypeOfClinicDTO {
    public int typeOfClinicID;
    public String typeOfClinicName;

    public TypeOfClinicDTO() {
    }

    public TypeOfClinicDTO(int typeOfClinicID, String typeOfClinicName) {
        this.typeOfClinicID = typeOfClinicID;
        this.typeOfClinicName = typeOfClinicName;
    }

    public int getTypeOfClinicID() {
        return typeOfClinicID;
    }

    public void setTypeOfClinicID(int typeOfClinicID) {
        this.typeOfClinicID = typeOfClinicID;
    }

    public String getTypeOfClinicName() {
        return typeOfClinicName;
    }

    public void setTypeOfClinicName(String typeOfClinicName) {
        this.typeOfClinicName = typeOfClinicName;
    }
}
