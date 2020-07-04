package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChengjiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChengjiExample() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andStunoIsNull() {
            addCriterion("stuNo is null");
            return (Criteria) this;
        }

        public Criteria andStunoIsNotNull() {
            addCriterion("stuNo is not null");
            return (Criteria) this;
        }

        public Criteria andStunoEqualTo(Integer value) {
            addCriterion("stuNo =", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotEqualTo(Integer value) {
            addCriterion("stuNo <>", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThan(Integer value) {
            addCriterion("stuNo >", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuNo >=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThan(Integer value) {
            addCriterion("stuNo <", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThanOrEqualTo(Integer value) {
            addCriterion("stuNo <=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoIn(List<Integer> values) {
            addCriterion("stuNo in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotIn(List<Integer> values) {
            addCriterion("stuNo not in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoBetween(Integer value1, Integer value2) {
            addCriterion("stuNo between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotBetween(Integer value1, Integer value2) {
            addCriterion("stuNo not between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andKcnoIsNull() {
            addCriterion("kcNo is null");
            return (Criteria) this;
        }

        public Criteria andKcnoIsNotNull() {
            addCriterion("kcNo is not null");
            return (Criteria) this;
        }

        public Criteria andKcnoEqualTo(Integer value) {
            addCriterion("kcNo =", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoNotEqualTo(Integer value) {
            addCriterion("kcNo <>", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoGreaterThan(Integer value) {
            addCriterion("kcNo >", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("kcNo >=", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoLessThan(Integer value) {
            addCriterion("kcNo <", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoLessThanOrEqualTo(Integer value) {
            addCriterion("kcNo <=", value, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoIn(List<Integer> values) {
            addCriterion("kcNo in", values, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoNotIn(List<Integer> values) {
            addCriterion("kcNo not in", values, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoBetween(Integer value1, Integer value2) {
            addCriterion("kcNo between", value1, value2, "kcno");
            return (Criteria) this;
        }

        public Criteria andKcnoNotBetween(Integer value1, Integer value2) {
            addCriterion("kcNo not between", value1, value2, "kcno");
            return (Criteria) this;
        }

        public Criteria andCjIsNull() {
            addCriterion("cj is null");
            return (Criteria) this;
        }

        public Criteria andCjIsNotNull() {
            addCriterion("cj is not null");
            return (Criteria) this;
        }

        public Criteria andCjEqualTo(Integer value) {
            addCriterion("cj =", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotEqualTo(Integer value) {
            addCriterion("cj <>", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThan(Integer value) {
            addCriterion("cj >", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThanOrEqualTo(Integer value) {
            addCriterion("cj >=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThan(Integer value) {
            addCriterion("cj <", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThanOrEqualTo(Integer value) {
            addCriterion("cj <=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjIn(List<Integer> values) {
            addCriterion("cj in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotIn(List<Integer> values) {
            addCriterion("cj not in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjBetween(Integer value1, Integer value2) {
            addCriterion("cj between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotBetween(Integer value1, Integer value2) {
            addCriterion("cj not between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("sj is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("sj is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(Date value) {
            addCriterionForJDBCDate("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(Date value) {
            addCriterionForJDBCDate("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(Date value) {
            addCriterionForJDBCDate("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(Date value) {
            addCriterionForJDBCDate("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<Date> values) {
            addCriterionForJDBCDate("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<Date> values) {
            addCriterionForJDBCDate("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sj not between", value1, value2, "sj");
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