package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class ClinicExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public ClinicExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
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

		public Criteria andClinicinumberIsNull() {
			addCriterion("clinicinumber is null");
			return (Criteria) this;
		}

		public Criteria andClinicinumberIsNotNull() {
			addCriterion("clinicinumber is not null");
			return (Criteria) this;
		}

		public Criteria andClinicinumberEqualTo(Integer value) {
			addCriterion("clinicinumber =", value, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberNotEqualTo(Integer value) {
			addCriterion("clinicinumber <>", value, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberGreaterThan(Integer value) {
			addCriterion("clinicinumber >", value, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("clinicinumber >=", value, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberLessThan(Integer value) {
			addCriterion("clinicinumber <", value, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberLessThanOrEqualTo(Integer value) {
			addCriterion("clinicinumber <=", value, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberIn(List<Integer> values) {
			addCriterion("clinicinumber in", values, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberNotIn(List<Integer> values) {
			addCriterion("clinicinumber not in", values, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberBetween(Integer value1, Integer value2) {
			addCriterion("clinicinumber between", value1, value2, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicinumberNotBetween(Integer value1, Integer value2) {
			addCriterion("clinicinumber not between", value1, value2, "clinicinumber");
			return (Criteria) this;
		}

		public Criteria andClinicilinkIsNull() {
			addCriterion("clinicilink is null");
			return (Criteria) this;
		}

		public Criteria andClinicilinkIsNotNull() {
			addCriterion("clinicilink is not null");
			return (Criteria) this;
		}

		public Criteria andClinicilinkEqualTo(String value) {
			addCriterion("clinicilink =", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkNotEqualTo(String value) {
			addCriterion("clinicilink <>", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkGreaterThan(String value) {
			addCriterion("clinicilink >", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkGreaterThanOrEqualTo(String value) {
			addCriterion("clinicilink >=", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkLessThan(String value) {
			addCriterion("clinicilink <", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkLessThanOrEqualTo(String value) {
			addCriterion("clinicilink <=", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkLike(String value) {
			addCriterion("clinicilink like", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkNotLike(String value) {
			addCriterion("clinicilink not like", value, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkIn(List<String> values) {
			addCriterion("clinicilink in", values, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkNotIn(List<String> values) {
			addCriterion("clinicilink not in", values, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkBetween(String value1, String value2) {
			addCriterion("clinicilink between", value1, value2, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicilinkNotBetween(String value1, String value2) {
			addCriterion("clinicilink not between", value1, value2, "clinicilink");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidIsNull() {
			addCriterion("clinicitypeid is null");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidIsNotNull() {
			addCriterion("clinicitypeid is not null");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidEqualTo(Integer value) {
			addCriterion("clinicitypeid =", value, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidNotEqualTo(Integer value) {
			addCriterion("clinicitypeid <>", value, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidGreaterThan(Integer value) {
			addCriterion("clinicitypeid >", value, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidGreaterThanOrEqualTo(Integer value) {
			addCriterion("clinicitypeid >=", value, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidLessThan(Integer value) {
			addCriterion("clinicitypeid <", value, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidLessThanOrEqualTo(Integer value) {
			addCriterion("clinicitypeid <=", value, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidIn(List<Integer> values) {
			addCriterion("clinicitypeid in", values, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidNotIn(List<Integer> values) {
			addCriterion("clinicitypeid not in", values, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidBetween(Integer value1, Integer value2) {
			addCriterion("clinicitypeid between", value1, value2, "clinicitypeid");
			return (Criteria) this;
		}

		public Criteria andClinicitypeidNotBetween(Integer value1, Integer value2) {
			addCriterion("clinicitypeid not between", value1, value2, "clinicitypeid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table clinic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
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
     * This class corresponds to the database table clinic
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}