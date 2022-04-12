package com.Trang.webyte.DTO;

public class SymptomDTO {
    public int symptomId;
    public String symptomName;

    public SymptomDTO() {
    }

    public SymptomDTO(int symptomId, String symptomName) {
        this.symptomId = symptomId;
        this.symptomName = symptomName;
    }

    public int getSymptomId() {
        return symptomId;
    }

    public void setSymptomId(int symptomId) {
        this.symptomId = symptomId;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }
}
