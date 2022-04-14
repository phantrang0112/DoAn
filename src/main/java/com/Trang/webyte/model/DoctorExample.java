package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public DoctorExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table doctor
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table doctor
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

		public Criteria andDoctoridIsNull() {
			addCriterion("doctorid is null");
			return (Criteria) this;
		}

		public Criteria andDoctoridIsNotNull() {
			addCriterion("doctorid is not null");
			return (Criteria) this;
		}

		public Criteria andDoctoridEqualTo(Integer value) {
			addCriterion("doctorid =", value, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridNotEqualTo(Integer value) {
			addCriterion("doctorid <>", value, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridGreaterThan(Integer value) {
			addCriterion("doctorid >", value, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
			addCriterion("doctorid >=", value, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridLessThan(Integer value) {
			addCriterion("doctorid <", value, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
			addCriterion("doctorid <=", value, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridIn(List<Integer> values) {
			addCriterion("doctorid in", values, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridNotIn(List<Integer> values) {
			addCriterion("doctorid not in", values, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridBetween(Integer value1, Integer value2) {
			addCriterion("doctorid between", value1, value2, "doctorid");
			return (Criteria) this;
		}

		public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
			addCriterion("doctorid not between", value1, value2, "doctorid");
			return (Criteria) this;
		}

		public Criteria andFullnameIsNull() {
			addCriterion("fullname is null");
			return (Criteria) this;
		}

		public Criteria andFullnameIsNotNull() {
			addCriterion("fullname is not null");
			return (Criteria) this;
		}

		public Criteria andFullnameEqualTo(String value) {
			addCriterion("fullname =", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameNotEqualTo(String value) {
			addCriterion("fullname <>", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameGreaterThan(String value) {
			addCriterion("fullname >", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameGreaterThanOrEqualTo(String value) {
			addCriterion("fullname >=", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameLessThan(String value) {
			addCriterion("fullname <", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameLessThanOrEqualTo(String value) {
			addCriterion("fullname <=", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameLike(String value) {
			addCriterion("fullname like", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameNotLike(String value) {
			addCriterion("fullname not like", value, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameIn(List<String> values) {
			addCriterion("fullname in", values, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameNotIn(List<String> values) {
			addCriterion("fullname not in", values, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameBetween(String value1, String value2) {
			addCriterion("fullname between", value1, value2, "fullname");
			return (Criteria) this;
		}

		public Criteria andFullnameNotBetween(String value1, String value2) {
			addCriterion("fullname not between", value1, value2, "fullname");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andAccountidIsNull() {
			addCriterion("accountid is null");
			return (Criteria) this;
		}

		public Criteria andAccountidIsNotNull() {
			addCriterion("accountid is not null");
			return (Criteria) this;
		}

		public Criteria andAccountidEqualTo(Integer value) {
			addCriterion("accountid =", value, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidNotEqualTo(Integer value) {
			addCriterion("accountid <>", value, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidGreaterThan(Integer value) {
			addCriterion("accountid >", value, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidGreaterThanOrEqualTo(Integer value) {
			addCriterion("accountid >=", value, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidLessThan(Integer value) {
			addCriterion("accountid <", value, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidLessThanOrEqualTo(Integer value) {
			addCriterion("accountid <=", value, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidIn(List<Integer> values) {
			addCriterion("accountid in", values, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidNotIn(List<Integer> values) {
			addCriterion("accountid not in", values, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidBetween(Integer value1, Integer value2) {
			addCriterion("accountid between", value1, value2, "accountid");
			return (Criteria) this;
		}

		public Criteria andAccountidNotBetween(Integer value1, Integer value2) {
			addCriterion("accountid not between", value1, value2, "accountid");
			return (Criteria) this;
		}

		public Criteria andDeptidIsNull() {
			addCriterion("deptid is null");
			return (Criteria) this;
		}

		public Criteria andDeptidIsNotNull() {
			addCriterion("deptid is not null");
			return (Criteria) this;
		}

		public Criteria andDeptidEqualTo(Integer value) {
			addCriterion("deptid =", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidNotEqualTo(Integer value) {
			addCriterion("deptid <>", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidGreaterThan(Integer value) {
			addCriterion("deptid >", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
			addCriterion("deptid >=", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidLessThan(Integer value) {
			addCriterion("deptid <", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidLessThanOrEqualTo(Integer value) {
			addCriterion("deptid <=", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidIn(List<Integer> values) {
			addCriterion("deptid in", values, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidNotIn(List<Integer> values) {
			addCriterion("deptid not in", values, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidBetween(Integer value1, Integer value2) {
			addCriterion("deptid between", value1, value2, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
			addCriterion("deptid not between", value1, value2, "deptid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table doctor
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
     * This class corresponds to the database table doctor
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}