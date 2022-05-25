package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class Type_SickExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Type_SickExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
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

		public Criteria andIdtypesickIsNull() {
			addCriterion("idtypesick is null");
			return (Criteria) this;
		}

		public Criteria andIdtypesickIsNotNull() {
			addCriterion("idtypesick is not null");
			return (Criteria) this;
		}

		public Criteria andIdtypesickEqualTo(Integer value) {
			addCriterion("idtypesick =", value, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickNotEqualTo(Integer value) {
			addCriterion("idtypesick <>", value, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickGreaterThan(Integer value) {
			addCriterion("idtypesick >", value, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickGreaterThanOrEqualTo(Integer value) {
			addCriterion("idtypesick >=", value, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickLessThan(Integer value) {
			addCriterion("idtypesick <", value, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickLessThanOrEqualTo(Integer value) {
			addCriterion("idtypesick <=", value, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickIn(List<Integer> values) {
			addCriterion("idtypesick in", values, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickNotIn(List<Integer> values) {
			addCriterion("idtypesick not in", values, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickBetween(Integer value1, Integer value2) {
			addCriterion("idtypesick between", value1, value2, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andIdtypesickNotBetween(Integer value1, Integer value2) {
			addCriterion("idtypesick not between", value1, value2, "idtypesick");
			return (Criteria) this;
		}

		public Criteria andTypesicknameIsNull() {
			addCriterion("typesickname is null");
			return (Criteria) this;
		}

		public Criteria andTypesicknameIsNotNull() {
			addCriterion("typesickname is not null");
			return (Criteria) this;
		}

		public Criteria andTypesicknameEqualTo(String value) {
			addCriterion("typesickname =", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameNotEqualTo(String value) {
			addCriterion("typesickname <>", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameGreaterThan(String value) {
			addCriterion("typesickname >", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameGreaterThanOrEqualTo(String value) {
			addCriterion("typesickname >=", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameLessThan(String value) {
			addCriterion("typesickname <", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameLessThanOrEqualTo(String value) {
			addCriterion("typesickname <=", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameLike(String value) {
			addCriterion("typesickname like", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameNotLike(String value) {
			addCriterion("typesickname not like", value, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameIn(List<String> values) {
			addCriterion("typesickname in", values, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameNotIn(List<String> values) {
			addCriterion("typesickname not in", values, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameBetween(String value1, String value2) {
			addCriterion("typesickname between", value1, value2, "typesickname");
			return (Criteria) this;
		}

		public Criteria andTypesicknameNotBetween(String value1, String value2) {
			addCriterion("typesickname not between", value1, value2, "typesickname");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table typesick
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
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
     * This class corresponds to the database table typesick
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}