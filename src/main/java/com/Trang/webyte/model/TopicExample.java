package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.List;

public class TopicExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public TopicExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table topic
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

		public Criteria andTopicidIsNull() {
			addCriterion("topicid is null");
			return (Criteria) this;
		}

		public Criteria andTopicidIsNotNull() {
			addCriterion("topicid is not null");
			return (Criteria) this;
		}

		public Criteria andTopicidEqualTo(Integer value) {
			addCriterion("topicid =", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidNotEqualTo(Integer value) {
			addCriterion("topicid <>", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidGreaterThan(Integer value) {
			addCriterion("topicid >", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidGreaterThanOrEqualTo(Integer value) {
			addCriterion("topicid >=", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidLessThan(Integer value) {
			addCriterion("topicid <", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidLessThanOrEqualTo(Integer value) {
			addCriterion("topicid <=", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidIn(List<Integer> values) {
			addCriterion("topicid in", values, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidNotIn(List<Integer> values) {
			addCriterion("topicid not in", values, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidBetween(Integer value1, Integer value2) {
			addCriterion("topicid between", value1, value2, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidNotBetween(Integer value1, Integer value2) {
			addCriterion("topicid not between", value1, value2, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicnameIsNull() {
			addCriterion("topicname is null");
			return (Criteria) this;
		}

		public Criteria andTopicnameIsNotNull() {
			addCriterion("topicname is not null");
			return (Criteria) this;
		}

		public Criteria andTopicnameEqualTo(String value) {
			addCriterion("topicname =", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameNotEqualTo(String value) {
			addCriterion("topicname <>", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameGreaterThan(String value) {
			addCriterion("topicname >", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameGreaterThanOrEqualTo(String value) {
			addCriterion("topicname >=", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameLessThan(String value) {
			addCriterion("topicname <", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameLessThanOrEqualTo(String value) {
			addCriterion("topicname <=", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameLike(String value) {
			addCriterion("topicname like", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameNotLike(String value) {
			addCriterion("topicname not like", value, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameIn(List<String> values) {
			addCriterion("topicname in", values, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameNotIn(List<String> values) {
			addCriterion("topicname not in", values, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameBetween(String value1, String value2) {
			addCriterion("topicname between", value1, value2, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopicnameNotBetween(String value1, String value2) {
			addCriterion("topicname not between", value1, value2, "topicname");
			return (Criteria) this;
		}

		public Criteria andTopiccontentIsNull() {
			addCriterion("topiccontent is null");
			return (Criteria) this;
		}

		public Criteria andTopiccontentIsNotNull() {
			addCriterion("topiccontent is not null");
			return (Criteria) this;
		}

		public Criteria andTopiccontentEqualTo(String value) {
			addCriterion("topiccontent =", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentNotEqualTo(String value) {
			addCriterion("topiccontent <>", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentGreaterThan(String value) {
			addCriterion("topiccontent >", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentGreaterThanOrEqualTo(String value) {
			addCriterion("topiccontent >=", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentLessThan(String value) {
			addCriterion("topiccontent <", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentLessThanOrEqualTo(String value) {
			addCriterion("topiccontent <=", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentLike(String value) {
			addCriterion("topiccontent like", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentNotLike(String value) {
			addCriterion("topiccontent not like", value, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentIn(List<String> values) {
			addCriterion("topiccontent in", values, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentNotIn(List<String> values) {
			addCriterion("topiccontent not in", values, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentBetween(String value1, String value2) {
			addCriterion("topiccontent between", value1, value2, "topiccontent");
			return (Criteria) this;
		}

		public Criteria andTopiccontentNotBetween(String value1, String value2) {
			addCriterion("topiccontent not between", value1, value2, "topiccontent");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table topic
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
     * This class corresponds to the database table topic
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}