package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PrescriptionExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public PrescriptionExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

		public Criteria andCreatedateIsNull() {
			addCriterion("createdate is null");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNotNull() {
			addCriterion("createdate is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedateEqualTo(Date value) {
			addCriterionForJDBCDate("createdate =", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotEqualTo(Date value) {
			addCriterionForJDBCDate("createdate <>", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThan(Date value) {
			addCriterionForJDBCDate("createdate >", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("createdate >=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThan(Date value) {
			addCriterionForJDBCDate("createdate <", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("createdate <=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateIn(List<Date> values) {
			addCriterionForJDBCDate("createdate in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotIn(List<Date> values) {
			addCriterionForJDBCDate("createdate not in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("createdate between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("createdate not between", value1, value2, "createdate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table prescription
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
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
     * This class corresponds to the database table prescription
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}