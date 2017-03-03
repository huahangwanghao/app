package aop.bean;

import java.util.ArrayList;
import java.util.List;

public class XueShengCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public XueShengCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andS_idIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andS_idIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andS_idEqualTo(Integer value) {
            addCriterion("s_id =", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idGreaterThan(Integer value) {
            addCriterion("s_id >", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idLessThan(Integer value) {
            addCriterion("s_id <", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idIn(List<Integer> values) {
            addCriterion("s_id in", values, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_nameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andS_nameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andS_nameEqualTo(String value) {
            addCriterion("s_name =", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameGreaterThan(String value) {
            addCriterion("s_name >", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLessThan(String value) {
            addCriterion("s_name <", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLike(String value) {
            addCriterion("s_name like", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotLike(String value) {
            addCriterion("s_name not like", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameIn(List<String> values) {
            addCriterion("s_name in", values, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_ageIsNull() {
            addCriterion("s_age is null");
            return (Criteria) this;
        }

        public Criteria andS_ageIsNotNull() {
            addCriterion("s_age is not null");
            return (Criteria) this;
        }

        public Criteria andS_ageEqualTo(Integer value) {
            addCriterion("s_age =", value, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageNotEqualTo(Integer value) {
            addCriterion("s_age <>", value, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageGreaterThan(Integer value) {
            addCriterion("s_age >", value, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_age >=", value, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageLessThan(Integer value) {
            addCriterion("s_age <", value, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageLessThanOrEqualTo(Integer value) {
            addCriterion("s_age <=", value, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageIn(List<Integer> values) {
            addCriterion("s_age in", values, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageNotIn(List<Integer> values) {
            addCriterion("s_age not in", values, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageBetween(Integer value1, Integer value2) {
            addCriterion("s_age between", value1, value2, "s_age");
            return (Criteria) this;
        }

        public Criteria andS_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("s_age not between", value1, value2, "s_age");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idIsNull() {
            addCriterion("laoshi_id is null");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idIsNotNull() {
            addCriterion("laoshi_id is not null");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idEqualTo(Integer value) {
            addCriterion("laoshi_id =", value, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idNotEqualTo(Integer value) {
            addCriterion("laoshi_id <>", value, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idGreaterThan(Integer value) {
            addCriterion("laoshi_id >", value, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("laoshi_id >=", value, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idLessThan(Integer value) {
            addCriterion("laoshi_id <", value, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idLessThanOrEqualTo(Integer value) {
            addCriterion("laoshi_id <=", value, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idIn(List<Integer> values) {
            addCriterion("laoshi_id in", values, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idNotIn(List<Integer> values) {
            addCriterion("laoshi_id not in", values, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idBetween(Integer value1, Integer value2) {
            addCriterion("laoshi_id between", value1, value2, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andLaoshi_idNotBetween(Integer value1, Integer value2) {
            addCriterion("laoshi_id not between", value1, value2, "laoshi_id");
            return (Criteria) this;
        }

        public Criteria andCustomCriteria(String value) {
            addCriterion( "("+ value +")" );
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