package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStunoIsNull() {
            addCriterion("stuNo is null");
            return (Criteria) this;
        }

        public Criteria andStunoIsNotNull() {
            addCriterion("stuNo is not null");
            return (Criteria) this;
        }

        public Criteria andStunoEqualTo(String value) {
            addCriterion("stuNo =", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotEqualTo(String value) {
            addCriterion("stuNo <>", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThan(String value) {
            addCriterion("stuNo >", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThanOrEqualTo(String value) {
            addCriterion("stuNo >=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThan(String value) {
            addCriterion("stuNo <", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThanOrEqualTo(String value) {
            addCriterion("stuNo <=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLike(String value) {
            addCriterion("stuNo like", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotLike(String value) {
            addCriterion("stuNo not like", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoIn(List<String> values) {
            addCriterion("stuNo in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotIn(List<String> values) {
            addCriterion("stuNo not in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoBetween(String value1, String value2) {
            addCriterion("stuNo between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotBetween(String value1, String value2) {
            addCriterion("stuNo not between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuName is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuName is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuName =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuName <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuName >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuName >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuName <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuName <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuName like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuName not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuName in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuName not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuName between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuName not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andClazzIsNull() {
            addCriterion("clazz is null");
            return (Criteria) this;
        }

        public Criteria andClazzIsNotNull() {
            addCriterion("clazz is not null");
            return (Criteria) this;
        }

        public Criteria andClazzEqualTo(String value) {
            addCriterion("clazz =", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotEqualTo(String value) {
            addCriterion("clazz <>", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzGreaterThan(String value) {
            addCriterion("clazz >", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzGreaterThanOrEqualTo(String value) {
            addCriterion("clazz >=", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzLessThan(String value) {
            addCriterion("clazz <", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzLessThanOrEqualTo(String value) {
            addCriterion("clazz <=", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzLike(String value) {
            addCriterion("clazz like", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotLike(String value) {
            addCriterion("clazz not like", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzIn(List<String> values) {
            addCriterion("clazz in", values, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotIn(List<String> values) {
            addCriterion("clazz not in", values, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzBetween(String value1, String value2) {
            addCriterion("clazz between", value1, value2, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotBetween(String value1, String value2) {
            addCriterion("clazz not between", value1, value2, "clazz");
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