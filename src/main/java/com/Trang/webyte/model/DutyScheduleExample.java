package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DutyScheduleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public DutyScheduleExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
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

		public Criteria andDutyscheduleidIsNull() {
			addCriterion("dutyscheduleid is null");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidIsNotNull() {
			addCriterion("dutyscheduleid is not null");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidEqualTo(Integer value) {
			addCriterion("dutyscheduleid =", value, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidNotEqualTo(Integer value) {
			addCriterion("dutyscheduleid <>", value, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidGreaterThan(Integer value) {
			addCriterion("dutyscheduleid >", value, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidGreaterThanOrEqualTo(Integer value) {
			addCriterion("dutyscheduleid >=", value, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidLessThan(Integer value) {
			addCriterion("dutyscheduleid <", value, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidLessThanOrEqualTo(Integer value) {
			addCriterion("dutyscheduleid <=", value, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidIn(List<Integer> values) {
			addCriterion("dutyscheduleid in", values, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidNotIn(List<Integer> values) {
			addCriterion("dutyscheduleid not in", values, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidBetween(Integer value1, Integer value2) {
			addCriterion("dutyscheduleid between", value1, value2, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDutyscheduleidNotBetween(Integer value1, Integer value2) {
			addCriterion("dutyscheduleid not between", value1, value2, "dutyscheduleid");
			return (Criteria) this;
		}

		public Criteria andDateIsNull() {
			addCriterion("date is null");
			return (Criteria) this;
		}

		public Criteria andDateIsNotNull() {
			addCriterion("date is not null");
			return (Criteria) this;
		}

		public Criteria andDateEqualTo(Date value) {
			addCriterionForJDBCDate("date =", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("date <>", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThan(Date value) {
			addCriterionForJDBCDate("date >", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("date >=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThan(Date value) {
			addCriterionForJDBCDate("date <", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("date <=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateIn(List<Date> values) {
			addCriterionForJDBCDate("date in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("date not in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("date between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("date not between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andAppointmentidIsNull() {
			addCriterion("appointmentid is null");
			return (Criteria) this;
		}

		public Criteria andAppointmentidIsNotNull() {
			addCriterion("appointmentid is not null");
			return (Criteria) this;
		}

		public Criteria andAppointmentidEqualTo(Integer value) {
			addCriterion("appointmentid =", value, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidNotEqualTo(Integer value) {
			addCriterion("appointmentid <>", value, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidGreaterThan(Integer value) {
			addCriterion("appointmentid >", value, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidGreaterThanOrEqualTo(Integer value) {
			addCriterion("appointmentid >=", value, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidLessThan(Integer value) {
			addCriterion("appointmentid <", value, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidLessThanOrEqualTo(Integer value) {
			addCriterion("appointmentid <=", value, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidIn(List<Integer> values) {
			addCriterion("appointmentid in", values, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidNotIn(List<Integer> values) {
			addCriterion("appointmentid not in", values, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidBetween(Integer value1, Integer value2) {
			addCriterion("appointmentid between", value1, value2, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andAppointmentidNotBetween(Integer value1, Integer value2) {
			addCriterion("appointmentid not between", value1, value2, "appointmentid");
			return (Criteria) this;
		}

		public Criteria andClinicidIsNull() {
			addCriterion("clinicid is null");
			return (Criteria) this;
		}

		public Criteria andClinicidIsNotNull() {
			addCriterion("clinicid is not null");
			return (Criteria) this;
		}

		public Criteria andClinicidEqualTo(Integer value) {
			addCriterion("clinicid =", value, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidNotEqualTo(Integer value) {
			addCriterion("clinicid <>", value, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidGreaterThan(Integer value) {
			addCriterion("clinicid >", value, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidGreaterThanOrEqualTo(Integer value) {
			addCriterion("clinicid >=", value, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidLessThan(Integer value) {
			addCriterion("clinicid <", value, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidLessThanOrEqualTo(Integer value) {
			addCriterion("clinicid <=", value, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidIn(List<Integer> values) {
			addCriterion("clinicid in", values, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidNotIn(List<Integer> values) {
			addCriterion("clinicid not in", values, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidBetween(Integer value1, Integer value2) {
			addCriterion("clinicid between", value1, value2, "clinicid");
			return (Criteria) this;
		}

		public Criteria andClinicidNotBetween(Integer value1, Integer value2) {
			addCriterion("clinicid not between", value1, value2, "clinicid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table dutyschedule
	 * @mbg.generated  Tue May 31 14:47:12 ICT 2022
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
     * This class corresponds to the database table dutyschedule
     *
     * @mbg.generated do_not_delete_during_merge Tue May 31 11:37:29 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}