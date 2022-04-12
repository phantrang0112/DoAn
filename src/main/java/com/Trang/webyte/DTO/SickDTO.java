package com.Trang.webyte.DTO;

public class SickDTO {
    public int sickId;
    public String sickName;
    public int sickTypeId;
    public int symptomId;

    public SickDTO() {
    }

    public SickDTO(int sickId, String sickName, int sickTypeId, int symptomId) {
        this.sickId = sickId;
        this.sickName = sickName;
        this.sickTypeId = sickTypeId;
        this.symptomId = symptomId;
    }

    public int getSickId() {
        return sickId;
    }

    public void setSickId(int sickId) {
        this.sickId = sickId;
    }

    public String getSickName() {
        return sickName;
    }

    public void setSickName(String sickName) {
        this.sickName = sickName;
    }

    public int getSickTypeId() {
        return sickTypeId;
    }

    public void setSickTypeId(int sickTypeId) {
        this.sickTypeId = sickTypeId;
    }

    public int getSymptomId() {
        return symptomId;
    }

    public void setSymptomId(int symptomId) {
        this.symptomId = symptomId;
    }
}
