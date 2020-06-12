package com.qakj.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProgrammeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProgrammeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andMondayIsNull() {
            addCriterion("Monday is null");
            return (Criteria) this;
        }

        public Criteria andMondayIsNotNull() {
            addCriterion("Monday is not null");
            return (Criteria) this;
        }

        public Criteria andMondayEqualTo(String value) {
            addCriterion("Monday =", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotEqualTo(String value) {
            addCriterion("Monday <>", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThan(String value) {
            addCriterion("Monday >", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThanOrEqualTo(String value) {
            addCriterion("Monday >=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThan(String value) {
            addCriterion("Monday <", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThanOrEqualTo(String value) {
            addCriterion("Monday <=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLike(String value) {
            addCriterion("Monday like", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotLike(String value) {
            addCriterion("Monday not like", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayIn(List<String> values) {
            addCriterion("Monday in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotIn(List<String> values) {
            addCriterion("Monday not in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayBetween(String value1, String value2) {
            addCriterion("Monday between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotBetween(String value1, String value2) {
            addCriterion("Monday not between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNull() {
            addCriterion("Tuesday is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNotNull() {
            addCriterion("Tuesday is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayEqualTo(String value) {
            addCriterion("Tuesday =", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotEqualTo(String value) {
            addCriterion("Tuesday <>", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThan(String value) {
            addCriterion("Tuesday >", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThanOrEqualTo(String value) {
            addCriterion("Tuesday >=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThan(String value) {
            addCriterion("Tuesday <", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThanOrEqualTo(String value) {
            addCriterion("Tuesday <=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLike(String value) {
            addCriterion("Tuesday like", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotLike(String value) {
            addCriterion("Tuesday not like", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIn(List<String> values) {
            addCriterion("Tuesday in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotIn(List<String> values) {
            addCriterion("Tuesday not in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayBetween(String value1, String value2) {
            addCriterion("Tuesday between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotBetween(String value1, String value2) {
            addCriterion("Tuesday not between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNull() {
            addCriterion("Wednesday is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNotNull() {
            addCriterion("Wednesday is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayEqualTo(String value) {
            addCriterion("Wednesday =", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotEqualTo(String value) {
            addCriterion("Wednesday <>", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThan(String value) {
            addCriterion("Wednesday >", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThanOrEqualTo(String value) {
            addCriterion("Wednesday >=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThan(String value) {
            addCriterion("Wednesday <", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThanOrEqualTo(String value) {
            addCriterion("Wednesday <=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLike(String value) {
            addCriterion("Wednesday like", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotLike(String value) {
            addCriterion("Wednesday not like", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIn(List<String> values) {
            addCriterion("Wednesday in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotIn(List<String> values) {
            addCriterion("Wednesday not in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayBetween(String value1, String value2) {
            addCriterion("Wednesday between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotBetween(String value1, String value2) {
            addCriterion("Wednesday not between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNull() {
            addCriterion("Thursday is null");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNotNull() {
            addCriterion("Thursday is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayEqualTo(String value) {
            addCriterion("Thursday =", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotEqualTo(String value) {
            addCriterion("Thursday <>", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThan(String value) {
            addCriterion("Thursday >", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThanOrEqualTo(String value) {
            addCriterion("Thursday >=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThan(String value) {
            addCriterion("Thursday <", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThanOrEqualTo(String value) {
            addCriterion("Thursday <=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLike(String value) {
            addCriterion("Thursday like", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotLike(String value) {
            addCriterion("Thursday not like", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayIn(List<String> values) {
            addCriterion("Thursday in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotIn(List<String> values) {
            addCriterion("Thursday not in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayBetween(String value1, String value2) {
            addCriterion("Thursday between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotBetween(String value1, String value2) {
            addCriterion("Thursday not between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andFridayIsNull() {
            addCriterion("Friday is null");
            return (Criteria) this;
        }

        public Criteria andFridayIsNotNull() {
            addCriterion("Friday is not null");
            return (Criteria) this;
        }

        public Criteria andFridayEqualTo(String value) {
            addCriterion("Friday =", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotEqualTo(String value) {
            addCriterion("Friday <>", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThan(String value) {
            addCriterion("Friday >", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThanOrEqualTo(String value) {
            addCriterion("Friday >=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThan(String value) {
            addCriterion("Friday <", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThanOrEqualTo(String value) {
            addCriterion("Friday <=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLike(String value) {
            addCriterion("Friday like", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotLike(String value) {
            addCriterion("Friday not like", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayIn(List<String> values) {
            addCriterion("Friday in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotIn(List<String> values) {
            addCriterion("Friday not in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayBetween(String value1, String value2) {
            addCriterion("Friday between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotBetween(String value1, String value2) {
            addCriterion("Friday not between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNull() {
            addCriterion("Saturday is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNotNull() {
            addCriterion("Saturday is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayEqualTo(String value) {
            addCriterion("Saturday =", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotEqualTo(String value) {
            addCriterion("Saturday <>", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThan(String value) {
            addCriterion("Saturday >", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThanOrEqualTo(String value) {
            addCriterion("Saturday >=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThan(String value) {
            addCriterion("Saturday <", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThanOrEqualTo(String value) {
            addCriterion("Saturday <=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLike(String value) {
            addCriterion("Saturday like", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotLike(String value) {
            addCriterion("Saturday not like", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIn(List<String> values) {
            addCriterion("Saturday in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotIn(List<String> values) {
            addCriterion("Saturday not in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayBetween(String value1, String value2) {
            addCriterion("Saturday between", value1, value2, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotBetween(String value1, String value2) {
            addCriterion("Saturday not between", value1, value2, "saturday");
            return (Criteria) this;
        }

        public Criteria andSundayIsNull() {
            addCriterion("Sunday is null");
            return (Criteria) this;
        }

        public Criteria andSundayIsNotNull() {
            addCriterion("Sunday is not null");
            return (Criteria) this;
        }

        public Criteria andSundayEqualTo(String value) {
            addCriterion("Sunday =", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotEqualTo(String value) {
            addCriterion("Sunday <>", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThan(String value) {
            addCriterion("Sunday >", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThanOrEqualTo(String value) {
            addCriterion("Sunday >=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThan(String value) {
            addCriterion("Sunday <", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThanOrEqualTo(String value) {
            addCriterion("Sunday <=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLike(String value) {
            addCriterion("Sunday like", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotLike(String value) {
            addCriterion("Sunday not like", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayIn(List<String> values) {
            addCriterion("Sunday in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotIn(List<String> values) {
            addCriterion("Sunday not in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayBetween(String value1, String value2) {
            addCriterion("Sunday between", value1, value2, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotBetween(String value1, String value2) {
            addCriterion("Sunday not between", value1, value2, "sunday");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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