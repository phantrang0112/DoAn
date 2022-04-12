package com.Trang.webyte.DTO;

public class PrescriptionDetailDTO {
    public int prescriptionId;
    public int medicineId;
    public int amount;
    public int dosage;
    public String duration;
    public int times;

    public PrescriptionDetailDTO() {
    }

    public PrescriptionDetailDTO(int prescriptionId, int medicineId, int amount, int dosage, String duration, int times) {
        this.prescriptionId = prescriptionId;
        this.medicineId = medicineId;
        this.amount = amount;
        this.dosage = dosage;
        this.duration = duration;
        this.times = times;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}
