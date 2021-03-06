package com.Trang.webyte.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public NewsExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table news
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

		public Criteria andNewsidIsNull() {
			addCriterion("newsid is null");
			return (Criteria) this;
		}

		public Criteria andNewsidIsNotNull() {
			addCriterion("newsid is not null");
			return (Criteria) this;
		}

		public Criteria andNewsidEqualTo(Integer value) {
			addCriterion("newsid =", value, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidNotEqualTo(Integer value) {
			addCriterion("newsid <>", value, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidGreaterThan(Integer value) {
			addCriterion("newsid >", value, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
			addCriterion("newsid >=", value, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidLessThan(Integer value) {
			addCriterion("newsid <", value, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidLessThanOrEqualTo(Integer value) {
			addCriterion("newsid <=", value, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidIn(List<Integer> values) {
			addCriterion("newsid in", values, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidNotIn(List<Integer> values) {
			addCriterion("newsid not in", values, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidBetween(Integer value1, Integer value2) {
			addCriterion("newsid between", value1, value2, "newsid");
			return (Criteria) this;
		}

		public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
			addCriterion("newsid not between", value1, value2, "newsid");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
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

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andAdminidIsNull() {
			addCriterion("adminid is null");
			return (Criteria) this;
		}

		public Criteria andAdminidIsNotNull() {
			addCriterion("adminid is not null");
			return (Criteria) this;
		}

		public Criteria andAdminidEqualTo(Integer value) {
			addCriterion("adminid =", value, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidNotEqualTo(Integer value) {
			addCriterion("adminid <>", value, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidGreaterThan(Integer value) {
			addCriterion("adminid >", value, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
			addCriterion("adminid >=", value, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidLessThan(Integer value) {
			addCriterion("adminid <", value, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidLessThanOrEqualTo(Integer value) {
			addCriterion("adminid <=", value, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidIn(List<Integer> values) {
			addCriterion("adminid in", values, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidNotIn(List<Integer> values) {
			addCriterion("adminid not in", values, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidBetween(Integer value1, Integer value2) {
			addCriterion("adminid between", value1, value2, "adminid");
			return (Criteria) this;
		}

		public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
			addCriterion("adminid not between", value1, value2, "adminid");
			return (Criteria) this;
		}

		public Criteria andAuthorIsNull() {
			addCriterion("author is null");
			return (Criteria) this;
		}

		public Criteria andAuthorIsNotNull() {
			addCriterion("author is not null");
			return (Criteria) this;
		}

		public Criteria andAuthorEqualTo(String value) {
			addCriterion("author =", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorNotEqualTo(String value) {
			addCriterion("author <>", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorGreaterThan(String value) {
			addCriterion("author >", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorGreaterThanOrEqualTo(String value) {
			addCriterion("author >=", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorLessThan(String value) {
			addCriterion("author <", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorLessThanOrEqualTo(String value) {
			addCriterion("author <=", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorLike(String value) {
			addCriterion("author like", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorNotLike(String value) {
			addCriterion("author not like", value, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorIn(List<String> values) {
			addCriterion("author in", values, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorNotIn(List<String> values) {
			addCriterion("author not in", values, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorBetween(String value1, String value2) {
			addCriterion("author between", value1, value2, "author");
			return (Criteria) this;
		}

		public Criteria andAuthorNotBetween(String value1, String value2) {
			addCriterion("author not between", value1, value2, "author");
			return (Criteria) this;
		}

		public Criteria andTextIsNull() {
			addCriterion("text is null");
			return (Criteria) this;
		}

		public Criteria andTextIsNotNull() {
			addCriterion("text is not null");
			return (Criteria) this;
		}

		public Criteria andTextEqualTo(String value) {
			addCriterion("text =", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotEqualTo(String value) {
			addCriterion("text <>", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextGreaterThan(String value) {
			addCriterion("text >", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextGreaterThanOrEqualTo(String value) {
			addCriterion("text >=", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextLessThan(String value) {
			addCriterion("text <", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextLessThanOrEqualTo(String value) {
			addCriterion("text <=", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextLike(String value) {
			addCriterion("text like", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotLike(String value) {
			addCriterion("text not like", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextIn(List<String> values) {
			addCriterion("text in", values, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotIn(List<String> values) {
			addCriterion("text not in", values, "text");
			return (Criteria) this;
		}

		public Criteria andTextBetween(String value1, String value2) {
			addCriterion("text between", value1, value2, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotBetween(String value1, String value2) {
			addCriterion("text not between", value1, value2, "text");
			return (Criteria) this;
		}

		public Criteria andImgIsNull() {
			addCriterion("img is null");
			return (Criteria) this;
		}

		public Criteria andImgIsNotNull() {
			addCriterion("img is not null");
			return (Criteria) this;
		}

		public Criteria andImgEqualTo(String value) {
			addCriterion("img =", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotEqualTo(String value) {
			addCriterion("img <>", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThan(String value) {
			addCriterion("img >", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThanOrEqualTo(String value) {
			addCriterion("img >=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThan(String value) {
			addCriterion("img <", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThanOrEqualTo(String value) {
			addCriterion("img <=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLike(String value) {
			addCriterion("img like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotLike(String value) {
			addCriterion("img not like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgIn(List<String> values) {
			addCriterion("img in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotIn(List<String> values) {
			addCriterion("img not in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgBetween(String value1, String value2) {
			addCriterion("img between", value1, value2, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotBetween(String value1, String value2) {
			addCriterion("img not between", value1, value2, "img");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table news
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
     * This class corresponds to the database table news
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 04 14:21:11 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}