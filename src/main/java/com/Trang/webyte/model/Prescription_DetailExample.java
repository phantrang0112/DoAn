package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class Prescription_DetailExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public Prescription_DetailExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
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

		public Criteria andMedicineidIsNull() {
			addCriterion("medicineId is null");
			return (Criteria) this;
		}

		public Criteria andMedicineidIsNotNull() {
			addCriterion("medicineId is not null");
			return (Criteria) this;
		}

		public Criteria andMedicineidEqualTo(Integer value) {
			addCriterion("medicineId =", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidNotEqualTo(Integer value) {
			addCriterion("medicineId <>", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidGreaterThan(Integer value) {
			addCriterion("medicineId >", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidGreaterThanOrEqualTo(Integer value) {
			addCriterion("medicineId >=", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidLessThan(Integer value) {
			addCriterion("medicineId <", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidLessThanOrEqualTo(Integer value) {
			addCriterion("medicineId <=", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidIn(List<Integer> values) {
			addCriterion("medicineId in", values, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidNotIn(List<Integer> values) {
			addCriterion("medicineId not in", values, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidBetween(Integer value1, Integer value2) {
			addCriterion("medicineId between", value1, value2, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidNotBetween(Integer value1, Integer value2) {
			addCriterion("medicineId not between", value1, value2, "medicineid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidIsNull() {
			addCriterion("prescriptionid is null");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidIsNotNull() {
			addCriterion("prescriptionid is not null");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidEqualTo(Integer value) {
			addCriterion("prescriptionid =", value, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidNotEqualTo(Integer value) {
			addCriterion("prescriptionid <>", value, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidGreaterThan(Integer value) {
			addCriterion("prescriptionid >", value, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidGreaterThanOrEqualTo(Integer value) {
			addCriterion("prescriptionid >=", value, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidLessThan(Integer value) {
			addCriterion("prescriptionid <", value, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidLessThanOrEqualTo(Integer value) {
			addCriterion("prescriptionid <=", value, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidIn(List<Integer> values) {
			addCriterion("prescriptionid in", values, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidNotIn(List<Integer> values) {
			addCriterion("prescriptionid not in", values, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidBetween(Integer value1, Integer value2) {
			addCriterion("prescriptionid between", value1, value2, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andPrescriptionidNotBetween(Integer value1, Integer value2) {
			addCriterion("prescriptionid not between", value1, value2, "prescriptionid");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(Integer value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(Integer value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(Integer value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(Integer value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(Integer value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<Integer> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<Integer> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(Integer value1, Integer value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(Integer value1, Integer value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andDosageIsNull() {
			addCriterion("dosage is null");
			return (Criteria) this;
		}

		public Criteria andDosageIsNotNull() {
			addCriterion("dosage is not null");
			return (Criteria) this;
		}

		public Criteria andDosageEqualTo(Integer value) {
			addCriterion("dosage =", value, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageNotEqualTo(Integer value) {
			addCriterion("dosage <>", value, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageGreaterThan(Integer value) {
			addCriterion("dosage >", value, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageGreaterThanOrEqualTo(Integer value) {
			addCriterion("dosage >=", value, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageLessThan(Integer value) {
			addCriterion("dosage <", value, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageLessThanOrEqualTo(Integer value) {
			addCriterion("dosage <=", value, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageIn(List<Integer> values) {
			addCriterion("dosage in", values, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageNotIn(List<Integer> values) {
			addCriterion("dosage not in", values, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageBetween(Integer value1, Integer value2) {
			addCriterion("dosage between", value1, value2, "dosage");
			return (Criteria) this;
		}

		public Criteria andDosageNotBetween(Integer value1, Integer value2) {
			addCriterion("dosage not between", value1, value2, "dosage");
			return (Criteria) this;
		}

		public Criteria andDurationIsNull() {
			addCriterion("duration is null");
			return (Criteria) this;
		}

		public Criteria andDurationIsNotNull() {
			addCriterion("duration is not null");
			return (Criteria) this;
		}

		public Criteria andDurationEqualTo(String value) {
			addCriterion("duration =", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationNotEqualTo(String value) {
			addCriterion("duration <>", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationGreaterThan(String value) {
			addCriterion("duration >", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationGreaterThanOrEqualTo(String value) {
			addCriterion("duration >=", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationLessThan(String value) {
			addCriterion("duration <", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationLessThanOrEqualTo(String value) {
			addCriterion("duration <=", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationLike(String value) {
			addCriterion("duration like", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationNotLike(String value) {
			addCriterion("duration not like", value, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationIn(List<String> values) {
			addCriterion("duration in", values, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationNotIn(List<String> values) {
			addCriterion("duration not in", values, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationBetween(String value1, String value2) {
			addCriterion("duration between", value1, value2, "duration");
			return (Criteria) this;
		}

		public Criteria andDurationNotBetween(String value1, String value2) {
			addCriterion("duration not between", value1, value2, "duration");
			return (Criteria) this;
		}

		public Criteria andTimesIsNull() {
			addCriterion("times is null");
			return (Criteria) this;
		}

		public Criteria andTimesIsNotNull() {
			addCriterion("times is not null");
			return (Criteria) this;
		}

		public Criteria andTimesEqualTo(Integer value) {
			addCriterion("times =", value, "times");
			return (Criteria) this;
		}

		public Criteria andTimesNotEqualTo(Integer value) {
			addCriterion("times <>", value, "times");
			return (Criteria) this;
		}

		public Criteria andTimesGreaterThan(Integer value) {
			addCriterion("times >", value, "times");
			return (Criteria) this;
		}

		public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
			addCriterion("times >=", value, "times");
			return (Criteria) this;
		}

		public Criteria andTimesLessThan(Integer value) {
			addCriterion("times <", value, "times");
			return (Criteria) this;
		}

		public Criteria andTimesLessThanOrEqualTo(Integer value) {
			addCriterion("times <=", value, "times");
			return (Criteria) this;
		}

		public Criteria andTimesIn(List<Integer> values) {
			addCriterion("times in", values, "times");
			return (Criteria) this;
		}

		public Criteria andTimesNotIn(List<Integer> values) {
			addCriterion("times not in", values, "times");
			return (Criteria) this;
		}

		public Criteria andTimesBetween(Integer value1, Integer value2) {
			addCriterion("times between", value1, value2, "times");
			return (Criteria) this;
		}

		public Criteria andTimesNotBetween(Integer value1, Integer value2) {
			addCriterion("times not between", value1, value2, "times");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table prescription_detail
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prescription_detail
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}