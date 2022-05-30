package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public MedicineExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
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
			addCriterion("medicineid is null");
			return (Criteria) this;
		}

		public Criteria andMedicineidIsNotNull() {
			addCriterion("medicineid is not null");
			return (Criteria) this;
		}

		public Criteria andMedicineidEqualTo(Integer value) {
			addCriterion("medicineid =", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidNotEqualTo(Integer value) {
			addCriterion("medicineid <>", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidGreaterThan(Integer value) {
			addCriterion("medicineid >", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidGreaterThanOrEqualTo(Integer value) {
			addCriterion("medicineid >=", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidLessThan(Integer value) {
			addCriterion("medicineid <", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidLessThanOrEqualTo(Integer value) {
			addCriterion("medicineid <=", value, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidIn(List<Integer> values) {
			addCriterion("medicineid in", values, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidNotIn(List<Integer> values) {
			addCriterion("medicineid not in", values, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidBetween(Integer value1, Integer value2) {
			addCriterion("medicineid between", value1, value2, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicineidNotBetween(Integer value1, Integer value2) {
			addCriterion("medicineid not between", value1, value2, "medicineid");
			return (Criteria) this;
		}

		public Criteria andMedicinenameIsNull() {
			addCriterion("medicinename is null");
			return (Criteria) this;
		}

		public Criteria andMedicinenameIsNotNull() {
			addCriterion("medicinename is not null");
			return (Criteria) this;
		}

		public Criteria andMedicinenameEqualTo(String value) {
			addCriterion("medicinename =", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameNotEqualTo(String value) {
			addCriterion("medicinename <>", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameGreaterThan(String value) {
			addCriterion("medicinename >", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameGreaterThanOrEqualTo(String value) {
			addCriterion("medicinename >=", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameLessThan(String value) {
			addCriterion("medicinename <", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameLessThanOrEqualTo(String value) {
			addCriterion("medicinename <=", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameLike(String value) {
			addCriterion("medicinename like", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameNotLike(String value) {
			addCriterion("medicinename not like", value, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameIn(List<String> values) {
			addCriterion("medicinename in", values, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameNotIn(List<String> values) {
			addCriterion("medicinename not in", values, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameBetween(String value1, String value2) {
			addCriterion("medicinename between", value1, value2, "medicinename");
			return (Criteria) this;
		}

		public Criteria andMedicinenameNotBetween(String value1, String value2) {
			addCriterion("medicinename not between", value1, value2, "medicinename");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andCountIsNull() {
			addCriterion("count is null");
			return (Criteria) this;
		}

		public Criteria andCountIsNotNull() {
			addCriterion("count is not null");
			return (Criteria) this;
		}

		public Criteria andCountEqualTo(Integer value) {
			addCriterion("count =", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotEqualTo(Integer value) {
			addCriterion("count <>", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThan(Integer value) {
			addCriterion("count >", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("count >=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThan(Integer value) {
			addCriterion("count <", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThanOrEqualTo(Integer value) {
			addCriterion("count <=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountIn(List<Integer> values) {
			addCriterion("count in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotIn(List<Integer> values) {
			addCriterion("count not in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountBetween(Integer value1, Integer value2) {
			addCriterion("count between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotBetween(Integer value1, Integer value2) {
			addCriterion("count not between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andPackIsNull() {
			addCriterion("pack is null");
			return (Criteria) this;
		}

		public Criteria andPackIsNotNull() {
			addCriterion("pack is not null");
			return (Criteria) this;
		}

		public Criteria andPackEqualTo(String value) {
			addCriterion("pack =", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackNotEqualTo(String value) {
			addCriterion("pack <>", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackGreaterThan(String value) {
			addCriterion("pack >", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackGreaterThanOrEqualTo(String value) {
			addCriterion("pack >=", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackLessThan(String value) {
			addCriterion("pack <", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackLessThanOrEqualTo(String value) {
			addCriterion("pack <=", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackLike(String value) {
			addCriterion("pack like", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackNotLike(String value) {
			addCriterion("pack not like", value, "pack");
			return (Criteria) this;
		}

		public Criteria andPackIn(List<String> values) {
			addCriterion("pack in", values, "pack");
			return (Criteria) this;
		}

		public Criteria andPackNotIn(List<String> values) {
			addCriterion("pack not in", values, "pack");
			return (Criteria) this;
		}

		public Criteria andPackBetween(String value1, String value2) {
			addCriterion("pack between", value1, value2, "pack");
			return (Criteria) this;
		}

		public Criteria andPackNotBetween(String value1, String value2) {
			addCriterion("pack not between", value1, value2, "pack");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table medicine
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
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
     * This class corresponds to the database table medicine
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}