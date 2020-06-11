package com.qakj.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("productprice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productprice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(Integer value) {
            addCriterion("productprice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(Integer value) {
            addCriterion("productprice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(Integer value) {
            addCriterion("productprice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("productprice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(Integer value) {
            addCriterion("productprice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(Integer value) {
            addCriterion("productprice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<Integer> values) {
            addCriterion("productprice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<Integer> values) {
            addCriterion("productprice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(Integer value1, Integer value2) {
            addCriterion("productprice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("productprice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductdesIsNull() {
            addCriterion("productdes is null");
            return (Criteria) this;
        }

        public Criteria andProductdesIsNotNull() {
            addCriterion("productdes is not null");
            return (Criteria) this;
        }

        public Criteria andProductdesEqualTo(String value) {
            addCriterion("productdes =", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotEqualTo(String value) {
            addCriterion("productdes <>", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesGreaterThan(String value) {
            addCriterion("productdes >", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesGreaterThanOrEqualTo(String value) {
            addCriterion("productdes >=", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesLessThan(String value) {
            addCriterion("productdes <", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesLessThanOrEqualTo(String value) {
            addCriterion("productdes <=", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesLike(String value) {
            addCriterion("productdes like", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotLike(String value) {
            addCriterion("productdes not like", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesIn(List<String> values) {
            addCriterion("productdes in", values, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotIn(List<String> values) {
            addCriterion("productdes not in", values, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesBetween(String value1, String value2) {
            addCriterion("productdes between", value1, value2, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotBetween(String value1, String value2) {
            addCriterion("productdes not between", value1, value2, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductsizeIsNull() {
            addCriterion("productsize is null");
            return (Criteria) this;
        }

        public Criteria andProductsizeIsNotNull() {
            addCriterion("productsize is not null");
            return (Criteria) this;
        }

        public Criteria andProductsizeEqualTo(String value) {
            addCriterion("productsize =", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeNotEqualTo(String value) {
            addCriterion("productsize <>", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeGreaterThan(String value) {
            addCriterion("productsize >", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeGreaterThanOrEqualTo(String value) {
            addCriterion("productsize >=", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeLessThan(String value) {
            addCriterion("productsize <", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeLessThanOrEqualTo(String value) {
            addCriterion("productsize <=", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeLike(String value) {
            addCriterion("productsize like", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeNotLike(String value) {
            addCriterion("productsize not like", value, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeIn(List<String> values) {
            addCriterion("productsize in", values, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeNotIn(List<String> values) {
            addCriterion("productsize not in", values, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeBetween(String value1, String value2) {
            addCriterion("productsize between", value1, value2, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductsizeNotBetween(String value1, String value2) {
            addCriterion("productsize not between", value1, value2, "productsize");
            return (Criteria) this;
        }

        public Criteria andProductimgIsNull() {
            addCriterion("productimg is null");
            return (Criteria) this;
        }

        public Criteria andProductimgIsNotNull() {
            addCriterion("productimg is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgEqualTo(String value) {
            addCriterion("productimg =", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotEqualTo(String value) {
            addCriterion("productimg <>", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgGreaterThan(String value) {
            addCriterion("productimg >", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgGreaterThanOrEqualTo(String value) {
            addCriterion("productimg >=", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgLessThan(String value) {
            addCriterion("productimg <", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgLessThanOrEqualTo(String value) {
            addCriterion("productimg <=", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgLike(String value) {
            addCriterion("productimg like", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotLike(String value) {
            addCriterion("productimg not like", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgIn(List<String> values) {
            addCriterion("productimg in", values, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotIn(List<String> values) {
            addCriterion("productimg not in", values, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgBetween(String value1, String value2) {
            addCriterion("productimg between", value1, value2, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotBetween(String value1, String value2) {
            addCriterion("productimg not between", value1, value2, "productimg");
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