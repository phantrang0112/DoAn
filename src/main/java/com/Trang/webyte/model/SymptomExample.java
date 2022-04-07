package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class SymptomExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public SymptomExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdsymptomIsNull() {
            addCriterion("idsymptom is null");
            return (Criteria) this;
        }

        public Criteria andIdsymptomIsNotNull() {
            addCriterion("idsymptom is not null");
            return (Criteria) this;
        }

        public Criteria andIdsymptomEqualTo(Integer value) {
            addCriterion("idsymptom =", value, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomNotEqualTo(Integer value) {
            addCriterion("idsymptom <>", value, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomGreaterThan(Integer value) {
            addCriterion("idsymptom >", value, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomGreaterThanOrEqualTo(Integer value) {
            addCriterion("idsymptom >=", value, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomLessThan(Integer value) {
            addCriterion("idsymptom <", value, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomLessThanOrEqualTo(Integer value) {
            addCriterion("idsymptom <=", value, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomIn(List<Integer> values) {
            addCriterion("idsymptom in", values, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomNotIn(List<Integer> values) {
            addCriterion("idsymptom not in", values, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomBetween(Integer value1, Integer value2) {
            addCriterion("idsymptom between", value1, value2, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andIdsymptomNotBetween(Integer value1, Integer value2) {
            addCriterion("idsymptom not between", value1, value2, "idsymptom");
            return (Criteria) this;
        }

        public Criteria andSymptomnameIsNull() {
            addCriterion("symptomname is null");
            return (Criteria) this;
        }

        public Criteria andSymptomnameIsNotNull() {
            addCriterion("symptomname is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomnameEqualTo(String value) {
            addCriterion("symptomname =", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameNotEqualTo(String value) {
            addCriterion("symptomname <>", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameGreaterThan(String value) {
            addCriterion("symptomname >", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameGreaterThanOrEqualTo(String value) {
            addCriterion("symptomname >=", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameLessThan(String value) {
            addCriterion("symptomname <", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameLessThanOrEqualTo(String value) {
            addCriterion("symptomname <=", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameLike(String value) {
            addCriterion("symptomname like", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameNotLike(String value) {
            addCriterion("symptomname not like", value, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameIn(List<String> values) {
            addCriterion("symptomname in", values, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameNotIn(List<String> values) {
            addCriterion("symptomname not in", values, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameBetween(String value1, String value2) {
            addCriterion("symptomname between", value1, value2, "symptomname");
            return (Criteria) this;
        }

        public Criteria andSymptomnameNotBetween(String value1, String value2) {
            addCriterion("symptomname not between", value1, value2, "symptomname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table symptom
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table symptom
     *
     * @mbg.generated Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}