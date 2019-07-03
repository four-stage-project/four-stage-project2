package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarSafetyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarSafetyInfoExample() {
        oredCriteria = new ArrayList<>();
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagIsNull() {
            addCriterion("front_airbag is null");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagIsNotNull() {
            addCriterion("front_airbag is not null");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagEqualTo(String value) {
            addCriterion("front_airbag =", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagNotEqualTo(String value) {
            addCriterion("front_airbag <>", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagGreaterThan(String value) {
            addCriterion("front_airbag >", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagGreaterThanOrEqualTo(String value) {
            addCriterion("front_airbag >=", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagLessThan(String value) {
            addCriterion("front_airbag <", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagLessThanOrEqualTo(String value) {
            addCriterion("front_airbag <=", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagLike(String value) {
            addCriterion("front_airbag like", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagNotLike(String value) {
            addCriterion("front_airbag not like", value, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagIn(List<String> values) {
            addCriterion("front_airbag in", values, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagNotIn(List<String> values) {
            addCriterion("front_airbag not in", values, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagBetween(String value1, String value2) {
            addCriterion("front_airbag between", value1, value2, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontAirbagNotBetween(String value1, String value2) {
            addCriterion("front_airbag not between", value1, value2, "frontAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagIsNull() {
            addCriterion("head_airbag is null");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagIsNotNull() {
            addCriterion("head_airbag is not null");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagEqualTo(String value) {
            addCriterion("head_airbag =", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagNotEqualTo(String value) {
            addCriterion("head_airbag <>", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagGreaterThan(String value) {
            addCriterion("head_airbag >", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagGreaterThanOrEqualTo(String value) {
            addCriterion("head_airbag >=", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagLessThan(String value) {
            addCriterion("head_airbag <", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagLessThanOrEqualTo(String value) {
            addCriterion("head_airbag <=", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagLike(String value) {
            addCriterion("head_airbag like", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagNotLike(String value) {
            addCriterion("head_airbag not like", value, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagIn(List<String> values) {
            addCriterion("head_airbag in", values, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagNotIn(List<String> values) {
            addCriterion("head_airbag not in", values, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagBetween(String value1, String value2) {
            addCriterion("head_airbag between", value1, value2, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andHeadAirbagNotBetween(String value1, String value2) {
            addCriterion("head_airbag not between", value1, value2, "headAirbag");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntIsNull() {
            addCriterion("child_seat_int is null");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntIsNotNull() {
            addCriterion("child_seat_int is not null");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntEqualTo(String value) {
            addCriterion("child_seat_int =", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntNotEqualTo(String value) {
            addCriterion("child_seat_int <>", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntGreaterThan(String value) {
            addCriterion("child_seat_int >", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntGreaterThanOrEqualTo(String value) {
            addCriterion("child_seat_int >=", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntLessThan(String value) {
            addCriterion("child_seat_int <", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntLessThanOrEqualTo(String value) {
            addCriterion("child_seat_int <=", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntLike(String value) {
            addCriterion("child_seat_int like", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntNotLike(String value) {
            addCriterion("child_seat_int not like", value, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntIn(List<String> values) {
            addCriterion("child_seat_int in", values, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntNotIn(List<String> values) {
            addCriterion("child_seat_int not in", values, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntBetween(String value1, String value2) {
            addCriterion("child_seat_int between", value1, value2, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andChildSeatIntNotBetween(String value1, String value2) {
            addCriterion("child_seat_int not between", value1, value2, "childSeatInt");
            return (Criteria) this;
        }

        public Criteria andTpmsIsNull() {
            addCriterion("tpms is null");
            return (Criteria) this;
        }

        public Criteria andTpmsIsNotNull() {
            addCriterion("tpms is not null");
            return (Criteria) this;
        }

        public Criteria andTpmsEqualTo(String value) {
            addCriterion("tpms =", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsNotEqualTo(String value) {
            addCriterion("tpms <>", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsGreaterThan(String value) {
            addCriterion("tpms >", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsGreaterThanOrEqualTo(String value) {
            addCriterion("tpms >=", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsLessThan(String value) {
            addCriterion("tpms <", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsLessThanOrEqualTo(String value) {
            addCriterion("tpms <=", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsLike(String value) {
            addCriterion("tpms like", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsNotLike(String value) {
            addCriterion("tpms not like", value, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsIn(List<String> values) {
            addCriterion("tpms in", values, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsNotIn(List<String> values) {
            addCriterion("tpms not in", values, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsBetween(String value1, String value2) {
            addCriterion("tpms between", value1, value2, "tpms");
            return (Criteria) this;
        }

        public Criteria andTpmsNotBetween(String value1, String value2) {
            addCriterion("tpms not between", value1, value2, "tpms");
            return (Criteria) this;
        }

        public Criteria andCarLockIsNull() {
            addCriterion("car_lock is null");
            return (Criteria) this;
        }

        public Criteria andCarLockIsNotNull() {
            addCriterion("car_lock is not null");
            return (Criteria) this;
        }

        public Criteria andCarLockEqualTo(String value) {
            addCriterion("car_lock =", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockNotEqualTo(String value) {
            addCriterion("car_lock <>", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockGreaterThan(String value) {
            addCriterion("car_lock >", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockGreaterThanOrEqualTo(String value) {
            addCriterion("car_lock >=", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockLessThan(String value) {
            addCriterion("car_lock <", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockLessThanOrEqualTo(String value) {
            addCriterion("car_lock <=", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockLike(String value) {
            addCriterion("car_lock like", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockNotLike(String value) {
            addCriterion("car_lock not like", value, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockIn(List<String> values) {
            addCriterion("car_lock in", values, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockNotIn(List<String> values) {
            addCriterion("car_lock not in", values, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockBetween(String value1, String value2) {
            addCriterion("car_lock between", value1, value2, "carLock");
            return (Criteria) this;
        }

        public Criteria andCarLockNotBetween(String value1, String value2) {
            addCriterion("car_lock not between", value1, value2, "carLock");
            return (Criteria) this;
        }

        public Criteria andAbsIsNull() {
            addCriterion("`abs` is null");
            return (Criteria) this;
        }

        public Criteria andAbsIsNotNull() {
            addCriterion("`abs` is not null");
            return (Criteria) this;
        }

        public Criteria andAbsEqualTo(String value) {
            addCriterion("`abs` =", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotEqualTo(String value) {
            addCriterion("`abs` <>", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsGreaterThan(String value) {
            addCriterion("`abs` >", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsGreaterThanOrEqualTo(String value) {
            addCriterion("`abs` >=", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsLessThan(String value) {
            addCriterion("`abs` <", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsLessThanOrEqualTo(String value) {
            addCriterion("`abs` <=", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsLike(String value) {
            addCriterion("`abs` like", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotLike(String value) {
            addCriterion("`abs` not like", value, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsIn(List<String> values) {
            addCriterion("`abs` in", values, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotIn(List<String> values) {
            addCriterion("`abs` not in", values, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsBetween(String value1, String value2) {
            addCriterion("`abs` between", value1, value2, "abs");
            return (Criteria) this;
        }

        public Criteria andAbsNotBetween(String value1, String value2) {
            addCriterion("`abs` not between", value1, value2, "abs");
            return (Criteria) this;
        }

        public Criteria andUscIsNull() {
            addCriterion("usc is null");
            return (Criteria) this;
        }

        public Criteria andUscIsNotNull() {
            addCriterion("usc is not null");
            return (Criteria) this;
        }

        public Criteria andUscEqualTo(String value) {
            addCriterion("usc =", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscNotEqualTo(String value) {
            addCriterion("usc <>", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscGreaterThan(String value) {
            addCriterion("usc >", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscGreaterThanOrEqualTo(String value) {
            addCriterion("usc >=", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscLessThan(String value) {
            addCriterion("usc <", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscLessThanOrEqualTo(String value) {
            addCriterion("usc <=", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscLike(String value) {
            addCriterion("usc like", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscNotLike(String value) {
            addCriterion("usc not like", value, "usc");
            return (Criteria) this;
        }

        public Criteria andUscIn(List<String> values) {
            addCriterion("usc in", values, "usc");
            return (Criteria) this;
        }

        public Criteria andUscNotIn(List<String> values) {
            addCriterion("usc not in", values, "usc");
            return (Criteria) this;
        }

        public Criteria andUscBetween(String value1, String value2) {
            addCriterion("usc between", value1, value2, "usc");
            return (Criteria) this;
        }

        public Criteria andUscNotBetween(String value1, String value2) {
            addCriterion("usc not between", value1, value2, "usc");
            return (Criteria) this;
        }

        public Criteria andPssIsNull() {
            addCriterion("pss is null");
            return (Criteria) this;
        }

        public Criteria andPssIsNotNull() {
            addCriterion("pss is not null");
            return (Criteria) this;
        }

        public Criteria andPssEqualTo(String value) {
            addCriterion("pss =", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssNotEqualTo(String value) {
            addCriterion("pss <>", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssGreaterThan(String value) {
            addCriterion("pss >", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssGreaterThanOrEqualTo(String value) {
            addCriterion("pss >=", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssLessThan(String value) {
            addCriterion("pss <", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssLessThanOrEqualTo(String value) {
            addCriterion("pss <=", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssLike(String value) {
            addCriterion("pss like", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssNotLike(String value) {
            addCriterion("pss not like", value, "pss");
            return (Criteria) this;
        }

        public Criteria andPssIn(List<String> values) {
            addCriterion("pss in", values, "pss");
            return (Criteria) this;
        }

        public Criteria andPssNotIn(List<String> values) {
            addCriterion("pss not in", values, "pss");
            return (Criteria) this;
        }

        public Criteria andPssBetween(String value1, String value2) {
            addCriterion("pss between", value1, value2, "pss");
            return (Criteria) this;
        }

        public Criteria andPssNotBetween(String value1, String value2) {
            addCriterion("pss not between", value1, value2, "pss");
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