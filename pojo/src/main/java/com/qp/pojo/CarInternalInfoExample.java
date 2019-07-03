package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarInternalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarInternalInfoExample() {
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

        public Criteria andMfSteeringWheelIsNull() {
            addCriterion("mf_steering_wheel is null");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelIsNotNull() {
            addCriterion("mf_steering_wheel is not null");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelEqualTo(String value) {
            addCriterion("mf_steering_wheel =", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelNotEqualTo(String value) {
            addCriterion("mf_steering_wheel <>", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelGreaterThan(String value) {
            addCriterion("mf_steering_wheel >", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelGreaterThanOrEqualTo(String value) {
            addCriterion("mf_steering_wheel >=", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelLessThan(String value) {
            addCriterion("mf_steering_wheel <", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelLessThanOrEqualTo(String value) {
            addCriterion("mf_steering_wheel <=", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelLike(String value) {
            addCriterion("mf_steering_wheel like", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelNotLike(String value) {
            addCriterion("mf_steering_wheel not like", value, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelIn(List<String> values) {
            addCriterion("mf_steering_wheel in", values, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelNotIn(List<String> values) {
            addCriterion("mf_steering_wheel not in", values, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelBetween(String value1, String value2) {
            addCriterion("mf_steering_wheel between", value1, value2, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andMfSteeringWheelNotBetween(String value1, String value2) {
            addCriterion("mf_steering_wheel not between", value1, value2, "mfSteeringWheel");
            return (Criteria) this;
        }

        public Criteria andDlccIsNull() {
            addCriterion("dlcc is null");
            return (Criteria) this;
        }

        public Criteria andDlccIsNotNull() {
            addCriterion("dlcc is not null");
            return (Criteria) this;
        }

        public Criteria andDlccEqualTo(String value) {
            addCriterion("dlcc =", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccNotEqualTo(String value) {
            addCriterion("dlcc <>", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccGreaterThan(String value) {
            addCriterion("dlcc >", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccGreaterThanOrEqualTo(String value) {
            addCriterion("dlcc >=", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccLessThan(String value) {
            addCriterion("dlcc <", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccLessThanOrEqualTo(String value) {
            addCriterion("dlcc <=", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccLike(String value) {
            addCriterion("dlcc like", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccNotLike(String value) {
            addCriterion("dlcc not like", value, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccIn(List<String> values) {
            addCriterion("dlcc in", values, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccNotIn(List<String> values) {
            addCriterion("dlcc not in", values, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccBetween(String value1, String value2) {
            addCriterion("dlcc between", value1, value2, "dlcc");
            return (Criteria) this;
        }

        public Criteria andDlccNotBetween(String value1, String value2) {
            addCriterion("dlcc not between", value1, value2, "dlcc");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConIsNull() {
            addCriterion("automatic_air_con is null");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConIsNotNull() {
            addCriterion("automatic_air_con is not null");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConEqualTo(String value) {
            addCriterion("automatic_air_con =", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConNotEqualTo(String value) {
            addCriterion("automatic_air_con <>", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConGreaterThan(String value) {
            addCriterion("automatic_air_con >", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConGreaterThanOrEqualTo(String value) {
            addCriterion("automatic_air_con >=", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConLessThan(String value) {
            addCriterion("automatic_air_con <", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConLessThanOrEqualTo(String value) {
            addCriterion("automatic_air_con <=", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConLike(String value) {
            addCriterion("automatic_air_con like", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConNotLike(String value) {
            addCriterion("automatic_air_con not like", value, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConIn(List<String> values) {
            addCriterion("automatic_air_con in", values, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConNotIn(List<String> values) {
            addCriterion("automatic_air_con not in", values, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConBetween(String value1, String value2) {
            addCriterion("automatic_air_con between", value1, value2, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andAutomaticAirConNotBetween(String value1, String value2) {
            addCriterion("automatic_air_con not between", value1, value2, "automaticAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConIsNull() {
            addCriterion("manual_air_con is null");
            return (Criteria) this;
        }

        public Criteria andManualAirConIsNotNull() {
            addCriterion("manual_air_con is not null");
            return (Criteria) this;
        }

        public Criteria andManualAirConEqualTo(String value) {
            addCriterion("manual_air_con =", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConNotEqualTo(String value) {
            addCriterion("manual_air_con <>", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConGreaterThan(String value) {
            addCriterion("manual_air_con >", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConGreaterThanOrEqualTo(String value) {
            addCriterion("manual_air_con >=", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConLessThan(String value) {
            addCriterion("manual_air_con <", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConLessThanOrEqualTo(String value) {
            addCriterion("manual_air_con <=", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConLike(String value) {
            addCriterion("manual_air_con like", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConNotLike(String value) {
            addCriterion("manual_air_con not like", value, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConIn(List<String> values) {
            addCriterion("manual_air_con in", values, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConNotIn(List<String> values) {
            addCriterion("manual_air_con not in", values, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConBetween(String value1, String value2) {
            addCriterion("manual_air_con between", value1, value2, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andManualAirConNotBetween(String value1, String value2) {
            addCriterion("manual_air_con not between", value1, value2, "manualAirCon");
            return (Criteria) this;
        }

        public Criteria andGpsIsNull() {
            addCriterion("gps is null");
            return (Criteria) this;
        }

        public Criteria andGpsIsNotNull() {
            addCriterion("gps is not null");
            return (Criteria) this;
        }

        public Criteria andGpsEqualTo(String value) {
            addCriterion("gps =", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotEqualTo(String value) {
            addCriterion("gps <>", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThan(String value) {
            addCriterion("gps >", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThanOrEqualTo(String value) {
            addCriterion("gps >=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThan(String value) {
            addCriterion("gps <", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThanOrEqualTo(String value) {
            addCriterion("gps <=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLike(String value) {
            addCriterion("gps like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotLike(String value) {
            addCriterion("gps not like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsIn(List<String> values) {
            addCriterion("gps in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotIn(List<String> values) {
            addCriterion("gps not in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsBetween(String value1, String value2) {
            addCriterion("gps between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotBetween(String value1, String value2) {
            addCriterion("gps not between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andParkingRedarIsNull() {
            addCriterion("parking_redar is null");
            return (Criteria) this;
        }

        public Criteria andParkingRedarIsNotNull() {
            addCriterion("parking_redar is not null");
            return (Criteria) this;
        }

        public Criteria andParkingRedarEqualTo(String value) {
            addCriterion("parking_redar =", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarNotEqualTo(String value) {
            addCriterion("parking_redar <>", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarGreaterThan(String value) {
            addCriterion("parking_redar >", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarGreaterThanOrEqualTo(String value) {
            addCriterion("parking_redar >=", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarLessThan(String value) {
            addCriterion("parking_redar <", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarLessThanOrEqualTo(String value) {
            addCriterion("parking_redar <=", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarLike(String value) {
            addCriterion("parking_redar like", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarNotLike(String value) {
            addCriterion("parking_redar not like", value, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarIn(List<String> values) {
            addCriterion("parking_redar in", values, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarNotIn(List<String> values) {
            addCriterion("parking_redar not in", values, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarBetween(String value1, String value2) {
            addCriterion("parking_redar between", value1, value2, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andParkingRedarNotBetween(String value1, String value2) {
            addCriterion("parking_redar not between", value1, value2, "parkingRedar");
            return (Criteria) this;
        }

        public Criteria andReverseVideoIsNull() {
            addCriterion("reverse_video is null");
            return (Criteria) this;
        }

        public Criteria andReverseVideoIsNotNull() {
            addCriterion("reverse_video is not null");
            return (Criteria) this;
        }

        public Criteria andReverseVideoEqualTo(String value) {
            addCriterion("reverse_video =", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoNotEqualTo(String value) {
            addCriterion("reverse_video <>", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoGreaterThan(String value) {
            addCriterion("reverse_video >", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoGreaterThanOrEqualTo(String value) {
            addCriterion("reverse_video >=", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoLessThan(String value) {
            addCriterion("reverse_video <", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoLessThanOrEqualTo(String value) {
            addCriterion("reverse_video <=", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoLike(String value) {
            addCriterion("reverse_video like", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoNotLike(String value) {
            addCriterion("reverse_video not like", value, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoIn(List<String> values) {
            addCriterion("reverse_video in", values, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoNotIn(List<String> values) {
            addCriterion("reverse_video not in", values, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoBetween(String value1, String value2) {
            addCriterion("reverse_video between", value1, value2, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andReverseVideoNotBetween(String value1, String value2) {
            addCriterion("reverse_video not between", value1, value2, "reverseVideo");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatIsNull() {
            addCriterion("leather_seat is null");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatIsNotNull() {
            addCriterion("leather_seat is not null");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatEqualTo(String value) {
            addCriterion("leather_seat =", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatNotEqualTo(String value) {
            addCriterion("leather_seat <>", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatGreaterThan(String value) {
            addCriterion("leather_seat >", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatGreaterThanOrEqualTo(String value) {
            addCriterion("leather_seat >=", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatLessThan(String value) {
            addCriterion("leather_seat <", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatLessThanOrEqualTo(String value) {
            addCriterion("leather_seat <=", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatLike(String value) {
            addCriterion("leather_seat like", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatNotLike(String value) {
            addCriterion("leather_seat not like", value, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatIn(List<String> values) {
            addCriterion("leather_seat in", values, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatNotIn(List<String> values) {
            addCriterion("leather_seat not in", values, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatBetween(String value1, String value2) {
            addCriterion("leather_seat between", value1, value2, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andLeatherSeatNotBetween(String value1, String value2) {
            addCriterion("leather_seat not between", value1, value2, "leatherSeat");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingIsNull() {
            addCriterion("seat_heating is null");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingIsNotNull() {
            addCriterion("seat_heating is not null");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingEqualTo(String value) {
            addCriterion("seat_heating =", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingNotEqualTo(String value) {
            addCriterion("seat_heating <>", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingGreaterThan(String value) {
            addCriterion("seat_heating >", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingGreaterThanOrEqualTo(String value) {
            addCriterion("seat_heating >=", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingLessThan(String value) {
            addCriterion("seat_heating <", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingLessThanOrEqualTo(String value) {
            addCriterion("seat_heating <=", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingLike(String value) {
            addCriterion("seat_heating like", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingNotLike(String value) {
            addCriterion("seat_heating not like", value, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingIn(List<String> values) {
            addCriterion("seat_heating in", values, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingNotIn(List<String> values) {
            addCriterion("seat_heating not in", values, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingBetween(String value1, String value2) {
            addCriterion("seat_heating between", value1, value2, "seatHeating");
            return (Criteria) this;
        }

        public Criteria andSeatHeatingNotBetween(String value1, String value2) {
            addCriterion("seat_heating not between", value1, value2, "seatHeating");
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