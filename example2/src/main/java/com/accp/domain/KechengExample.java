package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KechengExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KechengExample() {
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

        public Criteria andKcnoIsNull() {
            addCriterion("kcNo is null");
            return (Criteria) this;
        }

        public Criteria andKcnoIsNotNull() {
            addCriterion("kcNo is not null");
            return (Criteria) this;
        }

        public Criteria andKcnoEqualTo(String value) {
            addCriterion("kcNo =", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoNotEqualTo(String value) {
            addCriterion("kcNo <>", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoGreaterThan(String value) {
            addCriterion("kcNo >", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoGreaterThanOrEqualTo(String value) {
            addCriterion("kcNo >=", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoLessThan(String value) {
            addCriterion("kcNo <", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoLessThanOrEqualTo(String value) {
            addCriterion("kcNo <=", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoLike(String value) {
            addCriterion("kcNo like", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoNotLike(String value) {
            addCriterion("kcNo not like", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoIn(List<String> values) {
            addCriterion("kcNo in", values, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoNotIn(List<String> values) {
            addCriterion("kcNo not in", values, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoBetween(String value1, String value2) {
            addCriterion("kcNo between", value1, value2, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoNotBetween(String value1, String value2) {
            addCriterion("kcNo not between", value1, value2, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnameIsNull() {
            addCriterion("kcName is null");
            return (Criteria) this;
        }

        public Criteria andKcnameIsNotNull() {
            addCriterion("kcName is not null");
            return (Criteria) this;
        }

        public Criteria andKcnameEqualTo(String value) {
            addCriterion("kcName =", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotEqualTo(String value) {
            addCriterion("kcName <>", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameGreaterThan(String value) {
            addCriterion("kcName >", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameGreaterThanOrEqualTo(String value) {
            addCriterion("kcName >=", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameLessThan(String value) {
            addCriterion("kcName <", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameLessThanOrEqualTo(String value) {
            addCriterion("kcName <=", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameLike(String value) {
            addCriterion("kcName like", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotLike(String value) {
            addCriterion("kcName not like", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameIn(List<String> values) {
            addCriterion("kcName in", values, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotIn(List<String> values) {
            addCriterion("kcName not in", values, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameBetween(String value1, String value2) {
            addCriterion("kcName between", value1, value2, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotBetween(String value1, String value2) {
            addCriterion("kcName not between", value1, value2, "kcname");
            return (Criteria) this;
        }

        public Criteria andZyidIsNull() {
            addCriterion("zyId is null");
            return (Criteria) this;
        }

        public Criteria andZyidIsNotNull() {
            addCriterion("zyId is not null");
            return (Criteria) this;
        }

        public Criteria andZyidEqualTo(Integer value) {
            addCriterion("zyId =", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotEqualTo(Integer value) {
            addCriterion("zyId <>", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidGreaterThan(Integer value) {
            addCriterion("zyId >", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zyId >=", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLessThan(Integer value) {
            addCriterion("zyId <", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLessThanOrEqualTo(Integer value) {
            addCriterion("zyId <=", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidIn(List<Integer> values) {
            addCriterion("zyId in", values, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotIn(List<Integer> values) {
            addCriterion("zyId not in", values, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidBetween(Integer value1, Integer value2) {
            addCriterion("zyId between", value1, value2, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotBetween(Integer value1, Integer value2) {
            addCriterion("zyId not between", value1, value2, "zyid");
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