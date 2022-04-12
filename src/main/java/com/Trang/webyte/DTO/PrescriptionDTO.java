package com.Trang.webyte.DTO;

import java.util.Date;

public class PrescriptionDTO {
    public int prescriptionId;
    public Date createDate;

    public PrescriptionDTO() {
    }

    public PrescriptionDTO(int prescriptionId, Date createDate) {
        this.prescriptionId = prescriptionId;
        this.createDate = createDate;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
