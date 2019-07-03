package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarExternalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExternalInfoExample() {
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

        public Criteria andElectronicSunroofIsNull() {
            addCriterion("electronic_sunroof is null");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofIsNotNull() {
            addCriterion("electronic_sunroof is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofEqualTo(String value) {
            addCriterion("electronic_sunroof =", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofNotEqualTo(String value) {
            addCriterion("electronic_sunroof <>", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofGreaterThan(String value) {
            addCriterion("electronic_sunroof >", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofGreaterThanOrEqualTo(String value) {
            addCriterion("electronic_sunroof >=", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofLessThan(String value) {
            addCriterion("electronic_sunroof <", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofLessThanOrEqualTo(String value) {
            addCriterion("electronic_sunroof <=", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofLike(String value) {
            addCriterion("electronic_sunroof like", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofNotLike(String value) {
            addCriterion("electronic_sunroof not like", value, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofIn(List<String> values) {
            addCriterion("electronic_sunroof in", values, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofNotIn(List<String> values) {
            addCriterion("electronic_sunroof not in", values, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofBetween(String value1, String value2) {
            addCriterion("electronic_sunroof between", value1, value2, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicSunroofNotBetween(String value1, String value2) {
            addCriterion("electronic_sunroof not between", value1, value2, "electronicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofIsNull() {
            addCriterion("panoramic_sunroof is null");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofIsNotNull() {
            addCriterion("panoramic_sunroof is not null");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofEqualTo(String value) {
            addCriterion("panoramic_sunroof =", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofNotEqualTo(String value) {
            addCriterion("panoramic_sunroof <>", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofGreaterThan(String value) {
            addCriterion("panoramic_sunroof >", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofGreaterThanOrEqualTo(String value) {
            addCriterion("panoramic_sunroof >=", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofLessThan(String value) {
            addCriterion("panoramic_sunroof <", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofLessThanOrEqualTo(String value) {
            addCriterion("panoramic_sunroof <=", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofLike(String value) {
            addCriterion("panoramic_sunroof like", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofNotLike(String value) {
            addCriterion("panoramic_sunroof not like", value, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofIn(List<String> values) {
            addCriterion("panoramic_sunroof in", values, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofNotIn(List<String> values) {
            addCriterion("panoramic_sunroof not in", values, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofBetween(String value1, String value2) {
            addCriterion("panoramic_sunroof between", value1, value2, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andPanoramicSunroofNotBetween(String value1, String value2) {
            addCriterion("panoramic_sunroof not between", value1, value2, "panoramicSunroof");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullIsNull() {
            addCriterion("electronic_door_pull is null");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullIsNotNull() {
            addCriterion("electronic_door_pull is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullEqualTo(String value) {
            addCriterion("electronic_door_pull =", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullNotEqualTo(String value) {
            addCriterion("electronic_door_pull <>", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullGreaterThan(String value) {
            addCriterion("electronic_door_pull >", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullGreaterThanOrEqualTo(String value) {
            addCriterion("electronic_door_pull >=", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullLessThan(String value) {
            addCriterion("electronic_door_pull <", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullLessThanOrEqualTo(String value) {
            addCriterion("electronic_door_pull <=", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullLike(String value) {
            addCriterion("electronic_door_pull like", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullNotLike(String value) {
            addCriterion("electronic_door_pull not like", value, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullIn(List<String> values) {
            addCriterion("electronic_door_pull in", values, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullNotIn(List<String> values) {
            addCriterion("electronic_door_pull not in", values, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullBetween(String value1, String value2) {
            addCriterion("electronic_door_pull between", value1, value2, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicDoorPullNotBetween(String value1, String value2) {
            addCriterion("electronic_door_pull not between", value1, value2, "electronicDoorPull");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkIsNull() {
            addCriterion("electronic_trunk is null");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkIsNotNull() {
            addCriterion("electronic_trunk is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkEqualTo(String value) {
            addCriterion("electronic_trunk =", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkNotEqualTo(String value) {
            addCriterion("electronic_trunk <>", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkGreaterThan(String value) {
            addCriterion("electronic_trunk >", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkGreaterThanOrEqualTo(String value) {
            addCriterion("electronic_trunk >=", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkLessThan(String value) {
            addCriterion("electronic_trunk <", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkLessThanOrEqualTo(String value) {
            addCriterion("electronic_trunk <=", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkLike(String value) {
            addCriterion("electronic_trunk like", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkNotLike(String value) {
            addCriterion("electronic_trunk not like", value, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkIn(List<String> values) {
            addCriterion("electronic_trunk in", values, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkNotIn(List<String> values) {
            addCriterion("electronic_trunk not in", values, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkBetween(String value1, String value2) {
            addCriterion("electronic_trunk between", value1, value2, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andElectronicTrunkNotBetween(String value1, String value2) {
            addCriterion("electronic_trunk not between", value1, value2, "electronicTrunk");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersIsNull() {
            addCriterion("rain_sensing_wipers is null");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersIsNotNull() {
            addCriterion("rain_sensing_wipers is not null");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersEqualTo(String value) {
            addCriterion("rain_sensing_wipers =", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersNotEqualTo(String value) {
            addCriterion("rain_sensing_wipers <>", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersGreaterThan(String value) {
            addCriterion("rain_sensing_wipers >", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersGreaterThanOrEqualTo(String value) {
            addCriterion("rain_sensing_wipers >=", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersLessThan(String value) {
            addCriterion("rain_sensing_wipers <", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersLessThanOrEqualTo(String value) {
            addCriterion("rain_sensing_wipers <=", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersLike(String value) {
            addCriterion("rain_sensing_wipers like", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersNotLike(String value) {
            addCriterion("rain_sensing_wipers not like", value, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersIn(List<String> values) {
            addCriterion("rain_sensing_wipers in", values, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersNotIn(List<String> values) {
            addCriterion("rain_sensing_wipers not in", values, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersBetween(String value1, String value2) {
            addCriterion("rain_sensing_wipers between", value1, value2, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRainSensingWipersNotBetween(String value1, String value2) {
            addCriterion("rain_sensing_wipers not between", value1, value2, "rainSensingWipers");
            return (Criteria) this;
        }

        public Criteria andRearWiperIsNull() {
            addCriterion("rear_wiper is null");
            return (Criteria) this;
        }

        public Criteria andRearWiperIsNotNull() {
            addCriterion("rear_wiper is not null");
            return (Criteria) this;
        }

        public Criteria andRearWiperEqualTo(String value) {
            addCriterion("rear_wiper =", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperNotEqualTo(String value) {
            addCriterion("rear_wiper <>", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperGreaterThan(String value) {
            addCriterion("rear_wiper >", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperGreaterThanOrEqualTo(String value) {
            addCriterion("rear_wiper >=", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperLessThan(String value) {
            addCriterion("rear_wiper <", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperLessThanOrEqualTo(String value) {
            addCriterion("rear_wiper <=", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperLike(String value) {
            addCriterion("rear_wiper like", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperNotLike(String value) {
            addCriterion("rear_wiper not like", value, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperIn(List<String> values) {
            addCriterion("rear_wiper in", values, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperNotIn(List<String> values) {
            addCriterion("rear_wiper not in", values, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperBetween(String value1, String value2) {
            addCriterion("rear_wiper between", value1, value2, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andRearWiperNotBetween(String value1, String value2) {
            addCriterion("rear_wiper not between", value1, value2, "rearWiper");
            return (Criteria) this;
        }

        public Criteria andPowerWindowIsNull() {
            addCriterion("power_window is null");
            return (Criteria) this;
        }

        public Criteria andPowerWindowIsNotNull() {
            addCriterion("power_window is not null");
            return (Criteria) this;
        }

        public Criteria andPowerWindowEqualTo(String value) {
            addCriterion("power_window =", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowNotEqualTo(String value) {
            addCriterion("power_window <>", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowGreaterThan(String value) {
            addCriterion("power_window >", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowGreaterThanOrEqualTo(String value) {
            addCriterion("power_window >=", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowLessThan(String value) {
            addCriterion("power_window <", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowLessThanOrEqualTo(String value) {
            addCriterion("power_window <=", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowLike(String value) {
            addCriterion("power_window like", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowNotLike(String value) {
            addCriterion("power_window not like", value, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowIn(List<String> values) {
            addCriterion("power_window in", values, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowNotIn(List<String> values) {
            addCriterion("power_window not in", values, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowBetween(String value1, String value2) {
            addCriterion("power_window between", value1, value2, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andPowerWindowNotBetween(String value1, String value2) {
            addCriterion("power_window not between", value1, value2, "powerWindow");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorIsNull() {
            addCriterion("electronic_rearview_mirror is null");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorIsNotNull() {
            addCriterion("electronic_rearview_mirror is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorEqualTo(String value) {
            addCriterion("electronic_rearview_mirror =", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorNotEqualTo(String value) {
            addCriterion("electronic_rearview_mirror <>", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorGreaterThan(String value) {
            addCriterion("electronic_rearview_mirror >", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorGreaterThanOrEqualTo(String value) {
            addCriterion("electronic_rearview_mirror >=", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorLessThan(String value) {
            addCriterion("electronic_rearview_mirror <", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorLessThanOrEqualTo(String value) {
            addCriterion("electronic_rearview_mirror <=", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorLike(String value) {
            addCriterion("electronic_rearview_mirror like", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorNotLike(String value) {
            addCriterion("electronic_rearview_mirror not like", value, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorIn(List<String> values) {
            addCriterion("electronic_rearview_mirror in", values, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorNotIn(List<String> values) {
            addCriterion("electronic_rearview_mirror not in", values, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorBetween(String value1, String value2) {
            addCriterion("electronic_rearview_mirror between", value1, value2, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andElectronicRearviewMirrorNotBetween(String value1, String value2) {
            addCriterion("electronic_rearview_mirror not between", value1, value2, "electronicRearviewMirror");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingIsNull() {
            addCriterion("rearview_mirror_heating is null");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingIsNotNull() {
            addCriterion("rearview_mirror_heating is not null");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingEqualTo(String value) {
            addCriterion("rearview_mirror_heating =", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingNotEqualTo(String value) {
            addCriterion("rearview_mirror_heating <>", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingGreaterThan(String value) {
            addCriterion("rearview_mirror_heating >", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingGreaterThanOrEqualTo(String value) {
            addCriterion("rearview_mirror_heating >=", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingLessThan(String value) {
            addCriterion("rearview_mirror_heating <", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingLessThanOrEqualTo(String value) {
            addCriterion("rearview_mirror_heating <=", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingLike(String value) {
            addCriterion("rearview_mirror_heating like", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingNotLike(String value) {
            addCriterion("rearview_mirror_heating not like", value, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingIn(List<String> values) {
            addCriterion("rearview_mirror_heating in", values, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingNotIn(List<String> values) {
            addCriterion("rearview_mirror_heating not in", values, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingBetween(String value1, String value2) {
            addCriterion("rearview_mirror_heating between", value1, value2, "rearviewMirrorHeating");
            return (Criteria) this;
        }

        public Criteria andRearviewMirrorHeatingNotBetween(String value1, String value2) {
            addCriterion("rearview_mirror_heating not between", value1, value2, "rearviewMirrorHeating");
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