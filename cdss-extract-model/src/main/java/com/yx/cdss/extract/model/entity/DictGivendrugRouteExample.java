package com.yx.cdss.extract.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictGivendrugRouteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public DictGivendrugRouteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andDgrIdIsNull() {
            addCriterion("dgr_id is null");
            return (Criteria) this;
        }

        public Criteria andDgrIdIsNotNull() {
            addCriterion("dgr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDgrIdEqualTo(Long value) {
            addCriterion("dgr_id =", value, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdNotEqualTo(Long value) {
            addCriterion("dgr_id <>", value, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdGreaterThan(Long value) {
            addCriterion("dgr_id >", value, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dgr_id >=", value, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdLessThan(Long value) {
            addCriterion("dgr_id <", value, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdLessThanOrEqualTo(Long value) {
            addCriterion("dgr_id <=", value, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdIn(List<Long> values) {
            addCriterion("dgr_id in", values, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdNotIn(List<Long> values) {
            addCriterion("dgr_id not in", values, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdBetween(Long value1, Long value2) {
            addCriterion("dgr_id between", value1, value2, "dgrId");
            return (Criteria) this;
        }

        public Criteria andDgrIdNotBetween(Long value1, Long value2) {
            addCriterion("dgr_id not between", value1, value2, "dgrId");
            return (Criteria) this;
        }

        public Criteria andGdrNameIsNull() {
            addCriterion("gdr_name is null");
            return (Criteria) this;
        }

        public Criteria andGdrNameIsNotNull() {
            addCriterion("gdr_name is not null");
            return (Criteria) this;
        }

        public Criteria andGdrNameEqualTo(String value) {
            addCriterion("gdr_name =", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameNotEqualTo(String value) {
            addCriterion("gdr_name <>", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameGreaterThan(String value) {
            addCriterion("gdr_name >", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameGreaterThanOrEqualTo(String value) {
            addCriterion("gdr_name >=", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameLessThan(String value) {
            addCriterion("gdr_name <", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameLessThanOrEqualTo(String value) {
            addCriterion("gdr_name <=", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameLike(String value) {
            addCriterion("gdr_name like", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameNotLike(String value) {
            addCriterion("gdr_name not like", value, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameIn(List<String> values) {
            addCriterion("gdr_name in", values, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameNotIn(List<String> values) {
            addCriterion("gdr_name not in", values, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameBetween(String value1, String value2) {
            addCriterion("gdr_name between", value1, value2, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrNameNotBetween(String value1, String value2) {
            addCriterion("gdr_name not between", value1, value2, "gdrName");
            return (Criteria) this;
        }

        public Criteria andGdrCodeIsNull() {
            addCriterion("gdr_code is null");
            return (Criteria) this;
        }

        public Criteria andGdrCodeIsNotNull() {
            addCriterion("gdr_code is not null");
            return (Criteria) this;
        }

        public Criteria andGdrCodeEqualTo(String value) {
            addCriterion("gdr_code =", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeNotEqualTo(String value) {
            addCriterion("gdr_code <>", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeGreaterThan(String value) {
            addCriterion("gdr_code >", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gdr_code >=", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeLessThan(String value) {
            addCriterion("gdr_code <", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeLessThanOrEqualTo(String value) {
            addCriterion("gdr_code <=", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeLike(String value) {
            addCriterion("gdr_code like", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeNotLike(String value) {
            addCriterion("gdr_code not like", value, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeIn(List<String> values) {
            addCriterion("gdr_code in", values, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeNotIn(List<String> values) {
            addCriterion("gdr_code not in", values, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeBetween(String value1, String value2) {
            addCriterion("gdr_code between", value1, value2, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andGdrCodeNotBetween(String value1, String value2) {
            addCriterion("gdr_code not between", value1, value2, "gdrCode");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIsNull() {
            addCriterion("extract_time is null");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIsNotNull() {
            addCriterion("extract_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtractTimeEqualTo(Date value) {
            addCriterion("extract_time =", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotEqualTo(Date value) {
            addCriterion("extract_time <>", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeGreaterThan(Date value) {
            addCriterion("extract_time >", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("extract_time >=", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeLessThan(Date value) {
            addCriterion("extract_time <", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeLessThanOrEqualTo(Date value) {
            addCriterion("extract_time <=", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIn(List<Date> values) {
            addCriterion("extract_time in", values, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotIn(List<Date> values) {
            addCriterion("extract_time not in", values, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeBetween(Date value1, Date value2) {
            addCriterion("extract_time between", value1, value2, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotBetween(Date value1, Date value2) {
            addCriterion("extract_time not between", value1, value2, "extractTime");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("attribute1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("attribute1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("attribute1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("attribute1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("attribute1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("attribute1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("attribute1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("attribute1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("attribute1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("attribute1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("attribute1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("attribute1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("attribute1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("attribute1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("attribute2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("attribute2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("attribute2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("attribute2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("attribute2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("attribute2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("attribute2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("attribute2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("attribute2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("attribute2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("attribute2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("attribute2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("attribute2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("attribute2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("attribute3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("attribute3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("attribute3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("attribute3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("attribute3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("attribute3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("attribute3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("attribute3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("attribute3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("attribute3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("attribute3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("attribute3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("attribute3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("attribute3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("attribute4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("attribute4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("attribute4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("attribute4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("attribute4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("attribute4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("attribute4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("attribute4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("attribute4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("attribute4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("attribute4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("attribute4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("attribute4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("attribute4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("attribute5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("attribute5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("attribute5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("attribute5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("attribute5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("attribute5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("attribute5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("attribute5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("attribute5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("attribute5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("attribute5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("attribute5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("attribute5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("attribute5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
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
}