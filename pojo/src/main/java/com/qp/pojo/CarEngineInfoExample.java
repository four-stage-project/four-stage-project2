package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarEngineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarEngineInfoExample() {
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

        public Criteria andDisplacementIsNull() {
            addCriterion("displacement is null");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNotNull() {
            addCriterion("displacement is not null");
            return (Criteria) this;
        }

        public Criteria andDisplacementEqualTo(Double value) {
            addCriterion("displacement =", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotEqualTo(Double value) {
            addCriterion("displacement <>", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThan(Double value) {
            addCriterion("displacement >", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThanOrEqualTo(Double value) {
            addCriterion("displacement >=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThan(Double value) {
            addCriterion("displacement <", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThanOrEqualTo(Double value) {
            addCriterion("displacement <=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementIn(List<Double> values) {
            addCriterion("displacement in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotIn(List<Double> values) {
            addCriterion("displacement not in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementBetween(Double value1, Double value2) {
            addCriterion("displacement between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotBetween(Double value1, Double value2) {
            addCriterion("displacement not between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andIntakeFormIsNull() {
            addCriterion("intake_form is null");
            return (Criteria) this;
        }

        public Criteria andIntakeFormIsNotNull() {
            addCriterion("intake_form is not null");
            return (Criteria) this;
        }

        public Criteria andIntakeFormEqualTo(String value) {
            addCriterion("intake_form =", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormNotEqualTo(String value) {
            addCriterion("intake_form <>", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormGreaterThan(String value) {
            addCriterion("intake_form >", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormGreaterThanOrEqualTo(String value) {
            addCriterion("intake_form >=", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormLessThan(String value) {
            addCriterion("intake_form <", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormLessThanOrEqualTo(String value) {
            addCriterion("intake_form <=", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormLike(String value) {
            addCriterion("intake_form like", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormNotLike(String value) {
            addCriterion("intake_form not like", value, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormIn(List<String> values) {
            addCriterion("intake_form in", values, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormNotIn(List<String> values) {
            addCriterion("intake_form not in", values, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormBetween(String value1, String value2) {
            addCriterion("intake_form between", value1, value2, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andIntakeFormNotBetween(String value1, String value2) {
            addCriterion("intake_form not between", value1, value2, "intakeForm");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementIsNull() {
            addCriterion("cylinder_arrangement is null");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementIsNotNull() {
            addCriterion("cylinder_arrangement is not null");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementEqualTo(String value) {
            addCriterion("cylinder_arrangement =", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementNotEqualTo(String value) {
            addCriterion("cylinder_arrangement <>", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementGreaterThan(String value) {
            addCriterion("cylinder_arrangement >", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementGreaterThanOrEqualTo(String value) {
            addCriterion("cylinder_arrangement >=", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementLessThan(String value) {
            addCriterion("cylinder_arrangement <", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementLessThanOrEqualTo(String value) {
            addCriterion("cylinder_arrangement <=", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementLike(String value) {
            addCriterion("cylinder_arrangement like", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementNotLike(String value) {
            addCriterion("cylinder_arrangement not like", value, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementIn(List<String> values) {
            addCriterion("cylinder_arrangement in", values, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementNotIn(List<String> values) {
            addCriterion("cylinder_arrangement not in", values, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementBetween(String value1, String value2) {
            addCriterion("cylinder_arrangement between", value1, value2, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylinderArrangementNotBetween(String value1, String value2) {
            addCriterion("cylinder_arrangement not between", value1, value2, "cylinderArrangement");
            return (Criteria) this;
        }

        public Criteria andCylindersIsNull() {
            addCriterion("cylinders is null");
            return (Criteria) this;
        }

        public Criteria andCylindersIsNotNull() {
            addCriterion("cylinders is not null");
            return (Criteria) this;
        }

        public Criteria andCylindersEqualTo(String value) {
            addCriterion("cylinders =", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersNotEqualTo(String value) {
            addCriterion("cylinders <>", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersGreaterThan(String value) {
            addCriterion("cylinders >", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersGreaterThanOrEqualTo(String value) {
            addCriterion("cylinders >=", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersLessThan(String value) {
            addCriterion("cylinders <", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersLessThanOrEqualTo(String value) {
            addCriterion("cylinders <=", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersLike(String value) {
            addCriterion("cylinders like", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersNotLike(String value) {
            addCriterion("cylinders not like", value, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersIn(List<String> values) {
            addCriterion("cylinders in", values, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersNotIn(List<String> values) {
            addCriterion("cylinders not in", values, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersBetween(String value1, String value2) {
            addCriterion("cylinders between", value1, value2, "cylinders");
            return (Criteria) this;
        }

        public Criteria andCylindersNotBetween(String value1, String value2) {
            addCriterion("cylinders not between", value1, value2, "cylinders");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerIsNull() {
            addCriterion("maximum_horsepower is null");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerIsNotNull() {
            addCriterion("maximum_horsepower is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerEqualTo(String value) {
            addCriterion("maximum_horsepower =", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerNotEqualTo(String value) {
            addCriterion("maximum_horsepower <>", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerGreaterThan(String value) {
            addCriterion("maximum_horsepower >", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerGreaterThanOrEqualTo(String value) {
            addCriterion("maximum_horsepower >=", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerLessThan(String value) {
            addCriterion("maximum_horsepower <", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerLessThanOrEqualTo(String value) {
            addCriterion("maximum_horsepower <=", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerLike(String value) {
            addCriterion("maximum_horsepower like", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerNotLike(String value) {
            addCriterion("maximum_horsepower not like", value, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerIn(List<String> values) {
            addCriterion("maximum_horsepower in", values, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerNotIn(List<String> values) {
            addCriterion("maximum_horsepower not in", values, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerBetween(String value1, String value2) {
            addCriterion("maximum_horsepower between", value1, value2, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andMaximumHorsepowerNotBetween(String value1, String value2) {
            addCriterion("maximum_horsepower not between", value1, value2, "maximumHorsepower");
            return (Criteria) this;
        }

        public Criteria andFuelIsNull() {
            addCriterion("fuel is null");
            return (Criteria) this;
        }

        public Criteria andFuelIsNotNull() {
            addCriterion("fuel is not null");
            return (Criteria) this;
        }

        public Criteria andFuelEqualTo(String value) {
            addCriterion("fuel =", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotEqualTo(String value) {
            addCriterion("fuel <>", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThan(String value) {
            addCriterion("fuel >", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThanOrEqualTo(String value) {
            addCriterion("fuel >=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThan(String value) {
            addCriterion("fuel <", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThanOrEqualTo(String value) {
            addCriterion("fuel <=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLike(String value) {
            addCriterion("fuel like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotLike(String value) {
            addCriterion("fuel not like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelIn(List<String> values) {
            addCriterion("fuel in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotIn(List<String> values) {
            addCriterion("fuel not in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelBetween(String value1, String value2) {
            addCriterion("fuel between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotBetween(String value1, String value2) {
            addCriterion("fuel not between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelIsNull() {
            addCriterion("fuel_label is null");
            return (Criteria) this;
        }

        public Criteria andFuelLabelIsNotNull() {
            addCriterion("fuel_label is not null");
            return (Criteria) this;
        }

        public Criteria andFuelLabelEqualTo(String value) {
            addCriterion("fuel_label =", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotEqualTo(String value) {
            addCriterion("fuel_label <>", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelGreaterThan(String value) {
            addCriterion("fuel_label >", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_label >=", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelLessThan(String value) {
            addCriterion("fuel_label <", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelLessThanOrEqualTo(String value) {
            addCriterion("fuel_label <=", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelLike(String value) {
            addCriterion("fuel_label like", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotLike(String value) {
            addCriterion("fuel_label not like", value, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelIn(List<String> values) {
            addCriterion("fuel_label in", values, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotIn(List<String> values) {
            addCriterion("fuel_label not in", values, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelBetween(String value1, String value2) {
            addCriterion("fuel_label between", value1, value2, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andFuelLabelNotBetween(String value1, String value2) {
            addCriterion("fuel_label not between", value1, value2, "fuelLabel");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeIsNull() {
            addCriterion("oilsupply_mode is null");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeIsNotNull() {
            addCriterion("oilsupply_mode is not null");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeEqualTo(String value) {
            addCriterion("oilsupply_mode =", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeNotEqualTo(String value) {
            addCriterion("oilsupply_mode <>", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeGreaterThan(String value) {
            addCriterion("oilsupply_mode >", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeGreaterThanOrEqualTo(String value) {
            addCriterion("oilsupply_mode >=", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeLessThan(String value) {
            addCriterion("oilsupply_mode <", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeLessThanOrEqualTo(String value) {
            addCriterion("oilsupply_mode <=", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeLike(String value) {
            addCriterion("oilsupply_mode like", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeNotLike(String value) {
            addCriterion("oilsupply_mode not like", value, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeIn(List<String> values) {
            addCriterion("oilsupply_mode in", values, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeNotIn(List<String> values) {
            addCriterion("oilsupply_mode not in", values, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeBetween(String value1, String value2) {
            addCriterion("oilsupply_mode between", value1, value2, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andOilsupplyModeNotBetween(String value1, String value2) {
            addCriterion("oilsupply_mode not between", value1, value2, "oilsupplyMode");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardIsNull() {
            addCriterion("enviroment_standard is null");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardIsNotNull() {
            addCriterion("enviroment_standard is not null");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardEqualTo(String value) {
            addCriterion("enviroment_standard =", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardNotEqualTo(String value) {
            addCriterion("enviroment_standard <>", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardGreaterThan(String value) {
            addCriterion("enviroment_standard >", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardGreaterThanOrEqualTo(String value) {
            addCriterion("enviroment_standard >=", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardLessThan(String value) {
            addCriterion("enviroment_standard <", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardLessThanOrEqualTo(String value) {
            addCriterion("enviroment_standard <=", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardLike(String value) {
            addCriterion("enviroment_standard like", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardNotLike(String value) {
            addCriterion("enviroment_standard not like", value, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardIn(List<String> values) {
            addCriterion("enviroment_standard in", values, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardNotIn(List<String> values) {
            addCriterion("enviroment_standard not in", values, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardBetween(String value1, String value2) {
            addCriterion("enviroment_standard between", value1, value2, "enviromentStandard");
            return (Criteria) this;
        }

        public Criteria andEnviromentStandardNotBetween(String value1, String value2) {
            addCriterion("enviroment_standard not between", value1, value2, "enviromentStandard");
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