package com.Trang.webyte.model;

public class Symptom {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom.idsymptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    private Integer idsymptom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom.symptomname
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    private String symptomname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom.idsymptom
     *
     * @return the value of symptom.idsymptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public Integer getIdsymptom() {
        return idsymptom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom.idsymptom
     *
     * @param idsymptom the value for symptom.idsymptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public void setIdsymptom(Integer idsymptom) {
        this.idsymptom = idsymptom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom.symptomname
     *
     * @return the value of symptom.symptomname
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public String getSymptomname() {
        return symptomname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom.symptomname
     *
     * @param symptomname the value for symptom.symptomname
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public void setSymptomname(String symptomname) {
        this.symptomname = symptomname;
    }
}