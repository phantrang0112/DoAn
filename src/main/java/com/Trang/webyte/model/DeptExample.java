package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public DeptExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
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

		public Criteria andDeptnameIsNull() {
			addCriterion("deptname is null");
			return (Criteria) this;
		}

		public Criteria andDeptnameIsNotNull() {
			addCriterion("deptname is not null");
			return (Criteria) this;
		}

		public Criteria andDeptnameEqualTo(String value) {
			addCriterion("deptname =", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameNotEqualTo(String value) {
			addCriterion("deptname <>", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameGreaterThan(String value) {
			addCriterion("deptname >", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
			addCriterion("deptname >=", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameLessThan(String value) {
			addCriterion("deptname <", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameLessThanOrEqualTo(String value) {
			addCriterion("deptname <=", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameLike(String value) {
			addCriterion("deptname like", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameNotLike(String value) {
			addCriterion("deptname not like", value, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameIn(List<String> values) {
			addCriterion("deptname in", values, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameNotIn(List<String> values) {
			addCriterion("deptname not in", values, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameBetween(String value1, String value2) {
			addCriterion("deptname between", value1, value2, "deptname");
			return (Criteria) this;
		}

		public Criteria andDeptnameNotBetween(String value1, String value2) {
			addCriterion("deptname not between", value1, value2, "deptname");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table dept
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
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
     * This class corresponds to the database table dept
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}