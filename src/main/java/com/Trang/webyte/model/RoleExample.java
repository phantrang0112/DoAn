package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class RoleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public RoleExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue May 24 09:26:52 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table role
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

		public Criteria andIdroleIsNull() {
			addCriterion("idrole is null");
			return (Criteria) this;
		}

		public Criteria andIdroleIsNotNull() {
			addCriterion("idrole is not null");
			return (Criteria) this;
		}

		public Criteria andIdroleEqualTo(Integer value) {
			addCriterion("idrole =", value, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleNotEqualTo(Integer value) {
			addCriterion("idrole <>", value, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleGreaterThan(Integer value) {
			addCriterion("idrole >", value, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleGreaterThanOrEqualTo(Integer value) {
			addCriterion("idrole >=", value, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleLessThan(Integer value) {
			addCriterion("idrole <", value, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleLessThanOrEqualTo(Integer value) {
			addCriterion("idrole <=", value, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleIn(List<Integer> values) {
			addCriterion("idrole in", values, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleNotIn(List<Integer> values) {
			addCriterion("idrole not in", values, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleBetween(Integer value1, Integer value2) {
			addCriterion("idrole between", value1, value2, "idrole");
			return (Criteria) this;
		}

		public Criteria andIdroleNotBetween(Integer value1, Integer value2) {
			addCriterion("idrole not between", value1, value2, "idrole");
			return (Criteria) this;
		}

		public Criteria andRoleIsNull() {
			addCriterion("role is null");
			return (Criteria) this;
		}

		public Criteria andRoleIsNotNull() {
			addCriterion("role is not null");
			return (Criteria) this;
		}

		public Criteria andRoleEqualTo(String value) {
			addCriterion("role =", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotEqualTo(String value) {
			addCriterion("role <>", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleGreaterThan(String value) {
			addCriterion("role >", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleGreaterThanOrEqualTo(String value) {
			addCriterion("role >=", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleLessThan(String value) {
			addCriterion("role <", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleLessThanOrEqualTo(String value) {
			addCriterion("role <=", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleLike(String value) {
			addCriterion("role like", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotLike(String value) {
			addCriterion("role not like", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleIn(List<String> values) {
			addCriterion("role in", values, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotIn(List<String> values) {
			addCriterion("role not in", values, "role");
			return (Criteria) this;
		}

		public Criteria andRoleBetween(String value1, String value2) {
			addCriterion("role between", value1, value2, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotBetween(String value1, String value2) {
			addCriterion("role not between", value1, value2, "role");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table role
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
     * This class corresponds to the database table role
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}