package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ZhuanyeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZhuanyeExample() {
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

        public Criteria andZyidIsNull() {
            addCriterion("zyId is null");
            return (Criteria) this;
        }

        public Criteria andZyidIsNotNull() {
            addCriterion("zyId is not null");
            return (Criteria) this;
        }

        public Criteria andZyidEqualTo(String value) {
            addCriterion("zyId =", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotEqualTo(String value) {
            addCriterion("zyId <>", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidGreaterThan(String value) {
            addCriterion("zyId >", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidGreaterThanOrEqualTo(String value) {
            addCriterion("zyId >=", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLessThan(String value) {
            addCriterion("zyId <", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLessThanOrEqualTo(String value) {
            addCriterion("zyId <=", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLike(String value) {
            addCriterion("zyId like", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotLike(String value) {
            addCriterion("zyId not like", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidIn(List<String> values) {
            addCriterion("zyId in", values, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotIn(List<String> values) {
            addCriterion("zyId not in", values, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidBetween(String value1, String value2) {
            addCriterion("zyId between", value1, value2, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotBetween(String value1, String value2) {
            addCriterion("zyId not between", value1, value2, "zyid");
            return (Criteria) this;
        }

        public Criteria andZynameIsNull() {
            addCriterion("zyName is null");
            return (Criteria) this;
        }

        public Criteria andZynameIsNotNull() {
            addCriterion("zyName is not null");
            return (Criteria) this;
        }

        public Criteria andZynameEqualTo(String value) {
            addCriterion("zyName =", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameNotEqualTo(String value) {
            addCriterion("zyName <>", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameGreaterThan(String value) {
            addCriterion("zyName >", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameGreaterThanOrEqualTo(String value) {
            addCriterion("zyName >=", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameLessThan(String value) {
            addCriterion("zyName <", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameLessThanOrEqualTo(String value) {
            addCriterion("zyName <=", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameLike(String value) {
            addCriterion("zyName like", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameNotLike(String value) {
            addCriterion("zyName not like", value, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameIn(List<String> values) {
            addCriterion("zyName in", values, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameNotIn(List<String> values) {
            addCriterion("zyName not in", values, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameBetween(String value1, String value2) {
            addCriterion("zyName between", value1, value2, "zyname");
            return (Criteria) this;
        }

        public Criteria andZynameNotBetween(String value1, String value2) {
            addCriterion("zyName not between", value1, value2, "zyname");
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