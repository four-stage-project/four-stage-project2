package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarChassisBrakeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarChassisBrakeInfoExample() {
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

        public Criteria andDriveModeIsNull() {
            addCriterion("drive_mode is null");
            return (Criteria) this;
        }

        public Criteria andDriveModeIsNotNull() {
            addCriterion("drive_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDriveModeEqualTo(String value) {
            addCriterion("drive_mode =", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotEqualTo(String value) {
            addCriterion("drive_mode <>", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeGreaterThan(String value) {
            addCriterion("drive_mode >", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeGreaterThanOrEqualTo(String value) {
            addCriterion("drive_mode >=", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLessThan(String value) {
            addCriterion("drive_mode <", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLessThanOrEqualTo(String value) {
            addCriterion("drive_mode <=", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeLike(String value) {
            addCriterion("drive_mode like", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotLike(String value) {
            addCriterion("drive_mode not like", value, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeIn(List<String> values) {
            addCriterion("drive_mode in", values, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotIn(List<String> values) {
            addCriterion("drive_mode not in", values, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeBetween(String value1, String value2) {
            addCriterion("drive_mode between", value1, value2, "driveMode");
            return (Criteria) this;
        }

        public Criteria andDriveModeNotBetween(String value1, String value2) {
            addCriterion("drive_mode not between", value1, value2, "driveMode");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeIsNull() {
            addCriterion("auto_power_type is null");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeIsNotNull() {
            addCriterion("auto_power_type is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeEqualTo(String value) {
            addCriterion("auto_power_type =", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeNotEqualTo(String value) {
            addCriterion("auto_power_type <>", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeGreaterThan(String value) {
            addCriterion("auto_power_type >", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("auto_power_type >=", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeLessThan(String value) {
            addCriterion("auto_power_type <", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeLessThanOrEqualTo(String value) {
            addCriterion("auto_power_type <=", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeLike(String value) {
            addCriterion("auto_power_type like", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeNotLike(String value) {
            addCriterion("auto_power_type not like", value, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeIn(List<String> values) {
            addCriterion("auto_power_type in", values, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeNotIn(List<String> values) {
            addCriterion("auto_power_type not in", values, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeBetween(String value1, String value2) {
            addCriterion("auto_power_type between", value1, value2, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andAutoPowerTypeNotBetween(String value1, String value2) {
            addCriterion("auto_power_type not between", value1, value2, "autoPowerType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeIsNull() {
            addCriterion("front_suspension_type is null");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeIsNotNull() {
            addCriterion("front_suspension_type is not null");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeEqualTo(String value) {
            addCriterion("front_suspension_type =", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeNotEqualTo(String value) {
            addCriterion("front_suspension_type <>", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeGreaterThan(String value) {
            addCriterion("front_suspension_type >", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("front_suspension_type >=", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeLessThan(String value) {
            addCriterion("front_suspension_type <", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeLessThanOrEqualTo(String value) {
            addCriterion("front_suspension_type <=", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeLike(String value) {
            addCriterion("front_suspension_type like", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeNotLike(String value) {
            addCriterion("front_suspension_type not like", value, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeIn(List<String> values) {
            addCriterion("front_suspension_type in", values, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeNotIn(List<String> values) {
            addCriterion("front_suspension_type not in", values, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeBetween(String value1, String value2) {
            addCriterion("front_suspension_type between", value1, value2, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontSuspensionTypeNotBetween(String value1, String value2) {
            addCriterion("front_suspension_type not between", value1, value2, "frontSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeIsNull() {
            addCriterion("rear_suspension_type is null");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeIsNotNull() {
            addCriterion("rear_suspension_type is not null");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeEqualTo(String value) {
            addCriterion("rear_suspension_type =", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeNotEqualTo(String value) {
            addCriterion("rear_suspension_type <>", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeGreaterThan(String value) {
            addCriterion("rear_suspension_type >", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rear_suspension_type >=", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeLessThan(String value) {
            addCriterion("rear_suspension_type <", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeLessThanOrEqualTo(String value) {
            addCriterion("rear_suspension_type <=", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeLike(String value) {
            addCriterion("rear_suspension_type like", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeNotLike(String value) {
            addCriterion("rear_suspension_type not like", value, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeIn(List<String> values) {
            addCriterion("rear_suspension_type in", values, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeNotIn(List<String> values) {
            addCriterion("rear_suspension_type not in", values, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeBetween(String value1, String value2) {
            addCriterion("rear_suspension_type between", value1, value2, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andRearSuspensionTypeNotBetween(String value1, String value2) {
            addCriterion("rear_suspension_type not between", value1, value2, "rearSuspensionType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeIsNull() {
            addCriterion("front_brake_type is null");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeIsNotNull() {
            addCriterion("front_brake_type is not null");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeEqualTo(String value) {
            addCriterion("front_brake_type =", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeNotEqualTo(String value) {
            addCriterion("front_brake_type <>", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeGreaterThan(String value) {
            addCriterion("front_brake_type >", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("front_brake_type >=", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeLessThan(String value) {
            addCriterion("front_brake_type <", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeLessThanOrEqualTo(String value) {
            addCriterion("front_brake_type <=", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeLike(String value) {
            addCriterion("front_brake_type like", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeNotLike(String value) {
            addCriterion("front_brake_type not like", value, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeIn(List<String> values) {
            addCriterion("front_brake_type in", values, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeNotIn(List<String> values) {
            addCriterion("front_brake_type not in", values, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeBetween(String value1, String value2) {
            addCriterion("front_brake_type between", value1, value2, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontBrakeTypeNotBetween(String value1, String value2) {
            addCriterion("front_brake_type not between", value1, value2, "frontBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeIsNull() {
            addCriterion("rear_brake_type is null");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeIsNotNull() {
            addCriterion("rear_brake_type is not null");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeEqualTo(String value) {
            addCriterion("rear_brake_type =", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeNotEqualTo(String value) {
            addCriterion("rear_brake_type <>", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeGreaterThan(String value) {
            addCriterion("rear_brake_type >", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rear_brake_type >=", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeLessThan(String value) {
            addCriterion("rear_brake_type <", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeLessThanOrEqualTo(String value) {
            addCriterion("rear_brake_type <=", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeLike(String value) {
            addCriterion("rear_brake_type like", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeNotLike(String value) {
            addCriterion("rear_brake_type not like", value, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeIn(List<String> values) {
            addCriterion("rear_brake_type in", values, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeNotIn(List<String> values) {
            addCriterion("rear_brake_type not in", values, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeBetween(String value1, String value2) {
            addCriterion("rear_brake_type between", value1, value2, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andRearBrakeTypeNotBetween(String value1, String value2) {
            addCriterion("rear_brake_type not between", value1, value2, "rearBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeIsNull() {
            addCriterion("parking_brake_type is null");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeIsNotNull() {
            addCriterion("parking_brake_type is not null");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeEqualTo(String value) {
            addCriterion("parking_brake_type =", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeNotEqualTo(String value) {
            addCriterion("parking_brake_type <>", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeGreaterThan(String value) {
            addCriterion("parking_brake_type >", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("parking_brake_type >=", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeLessThan(String value) {
            addCriterion("parking_brake_type <", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeLessThanOrEqualTo(String value) {
            addCriterion("parking_brake_type <=", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeLike(String value) {
            addCriterion("parking_brake_type like", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeNotLike(String value) {
            addCriterion("parking_brake_type not like", value, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeIn(List<String> values) {
            addCriterion("parking_brake_type in", values, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeNotIn(List<String> values) {
            addCriterion("parking_brake_type not in", values, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeBetween(String value1, String value2) {
            addCriterion("parking_brake_type between", value1, value2, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andParkingBrakeTypeNotBetween(String value1, String value2) {
            addCriterion("parking_brake_type not between", value1, value2, "parkingBrakeType");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeIsNull() {
            addCriterion("front_wheel_size is null");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeIsNotNull() {
            addCriterion("front_wheel_size is not null");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeEqualTo(String value) {
            addCriterion("front_wheel_size =", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeNotEqualTo(String value) {
            addCriterion("front_wheel_size <>", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeGreaterThan(String value) {
            addCriterion("front_wheel_size >", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeGreaterThanOrEqualTo(String value) {
            addCriterion("front_wheel_size >=", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeLessThan(String value) {
            addCriterion("front_wheel_size <", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeLessThanOrEqualTo(String value) {
            addCriterion("front_wheel_size <=", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeLike(String value) {
            addCriterion("front_wheel_size like", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeNotLike(String value) {
            addCriterion("front_wheel_size not like", value, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeIn(List<String> values) {
            addCriterion("front_wheel_size in", values, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeNotIn(List<String> values) {
            addCriterion("front_wheel_size not in", values, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeBetween(String value1, String value2) {
            addCriterion("front_wheel_size between", value1, value2, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andFrontWheelSizeNotBetween(String value1, String value2) {
            addCriterion("front_wheel_size not between", value1, value2, "frontWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeIsNull() {
            addCriterion("rear_wheel_size is null");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeIsNotNull() {
            addCriterion("rear_wheel_size is not null");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeEqualTo(String value) {
            addCriterion("rear_wheel_size =", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeNotEqualTo(String value) {
            addCriterion("rear_wheel_size <>", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeGreaterThan(String value) {
            addCriterion("rear_wheel_size >", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeGreaterThanOrEqualTo(String value) {
            addCriterion("rear_wheel_size >=", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeLessThan(String value) {
            addCriterion("rear_wheel_size <", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeLessThanOrEqualTo(String value) {
            addCriterion("rear_wheel_size <=", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeLike(String value) {
            addCriterion("rear_wheel_size like", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeNotLike(String value) {
            addCriterion("rear_wheel_size not like", value, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeIn(List<String> values) {
            addCriterion("rear_wheel_size in", values, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeNotIn(List<String> values) {
            addCriterion("rear_wheel_size not in", values, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeBetween(String value1, String value2) {
            addCriterion("rear_wheel_size between", value1, value2, "rearWheelSize");
            return (Criteria) this;
        }

        public Criteria andRearWheelSizeNotBetween(String value1, String value2) {
            addCriterion("rear_wheel_size not between", value1, value2, "rearWheelSize");
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