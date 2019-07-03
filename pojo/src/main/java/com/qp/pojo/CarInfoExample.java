package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarInfoExample() {
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

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNull() {
            addCriterion("car_name is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("car_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("car_name =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("car_name <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("car_name >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_name >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("car_name <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("car_name <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("car_name like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("car_name not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("car_name in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("car_name not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("car_name between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("car_name not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andConfNameIsNull() {
            addCriterion("conf_name is null");
            return (Criteria) this;
        }

        public Criteria andConfNameIsNotNull() {
            addCriterion("conf_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfNameEqualTo(String value) {
            addCriterion("conf_name =", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotEqualTo(String value) {
            addCriterion("conf_name <>", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameGreaterThan(String value) {
            addCriterion("conf_name >", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameGreaterThanOrEqualTo(String value) {
            addCriterion("conf_name >=", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameLessThan(String value) {
            addCriterion("conf_name <", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameLessThanOrEqualTo(String value) {
            addCriterion("conf_name <=", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameLike(String value) {
            addCriterion("conf_name like", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotLike(String value) {
            addCriterion("conf_name not like", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameIn(List<String> values) {
            addCriterion("conf_name in", values, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotIn(List<String> values) {
            addCriterion("conf_name not in", values, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameBetween(String value1, String value2) {
            addCriterion("conf_name between", value1, value2, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotBetween(String value1, String value2) {
            addCriterion("conf_name not between", value1, value2, "confName");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("`level` like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("`level` not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("`level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andEngineIsNull() {
            addCriterion("engine is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("engine is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("engine =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("engine <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("engine >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("engine >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("engine <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("engine <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("engine like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("engine not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("engine in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("engine not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("engine between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("engine not between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andGearboxIsNull() {
            addCriterion("gearbox is null");
            return (Criteria) this;
        }

        public Criteria andGearboxIsNotNull() {
            addCriterion("gearbox is not null");
            return (Criteria) this;
        }

        public Criteria andGearboxEqualTo(String value) {
            addCriterion("gearbox =", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotEqualTo(String value) {
            addCriterion("gearbox <>", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxGreaterThan(String value) {
            addCriterion("gearbox >", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxGreaterThanOrEqualTo(String value) {
            addCriterion("gearbox >=", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxLessThan(String value) {
            addCriterion("gearbox <", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxLessThanOrEqualTo(String value) {
            addCriterion("gearbox <=", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxLike(String value) {
            addCriterion("gearbox like", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotLike(String value) {
            addCriterion("gearbox not like", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxIn(List<String> values) {
            addCriterion("gearbox in", values, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotIn(List<String> values) {
            addCriterion("gearbox not in", values, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxBetween(String value1, String value2) {
            addCriterion("gearbox between", value1, value2, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotBetween(String value1, String value2) {
            addCriterion("gearbox not between", value1, value2, "gearbox");
            return (Criteria) this;
        }

        public Criteria andBodyStructureIsNull() {
            addCriterion("body_structure is null");
            return (Criteria) this;
        }

        public Criteria andBodyStructureIsNotNull() {
            addCriterion("body_structure is not null");
            return (Criteria) this;
        }

        public Criteria andBodyStructureEqualTo(String value) {
            addCriterion("body_structure =", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureNotEqualTo(String value) {
            addCriterion("body_structure <>", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureGreaterThan(String value) {
            addCriterion("body_structure >", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureGreaterThanOrEqualTo(String value) {
            addCriterion("body_structure >=", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureLessThan(String value) {
            addCriterion("body_structure <", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureLessThanOrEqualTo(String value) {
            addCriterion("body_structure <=", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureLike(String value) {
            addCriterion("body_structure like", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureNotLike(String value) {
            addCriterion("body_structure not like", value, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureIn(List<String> values) {
            addCriterion("body_structure in", values, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureNotIn(List<String> values) {
            addCriterion("body_structure not in", values, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureBetween(String value1, String value2) {
            addCriterion("body_structure between", value1, value2, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andBodyStructureNotBetween(String value1, String value2) {
            addCriterion("body_structure not between", value1, value2, "bodyStructure");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("`size` is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("`size` is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("`size` =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("`size` <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("`size` >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("`size` >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("`size` <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("`size` <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("`size` like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("`size` not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("`size` in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("`size` not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("`size` between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("`size` not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedIsNull() {
            addCriterion("maximumspeed is null");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedIsNotNull() {
            addCriterion("maximumspeed is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedEqualTo(String value) {
            addCriterion("maximumspeed =", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedNotEqualTo(String value) {
            addCriterion("maximumspeed <>", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedGreaterThan(String value) {
            addCriterion("maximumspeed >", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedGreaterThanOrEqualTo(String value) {
            addCriterion("maximumspeed >=", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedLessThan(String value) {
            addCriterion("maximumspeed <", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedLessThanOrEqualTo(String value) {
            addCriterion("maximumspeed <=", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedLike(String value) {
            addCriterion("maximumspeed like", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedNotLike(String value) {
            addCriterion("maximumspeed not like", value, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedIn(List<String> values) {
            addCriterion("maximumspeed in", values, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedNotIn(List<String> values) {
            addCriterion("maximumspeed not in", values, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedBetween(String value1, String value2) {
            addCriterion("maximumspeed between", value1, value2, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andMaximumspeedNotBetween(String value1, String value2) {
            addCriterion("maximumspeed not between", value1, value2, "maximumspeed");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeIsNull() {
            addCriterion("cargo_volume is null");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeIsNotNull() {
            addCriterion("cargo_volume is not null");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeEqualTo(String value) {
            addCriterion("cargo_volume =", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeNotEqualTo(String value) {
            addCriterion("cargo_volume <>", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeGreaterThan(String value) {
            addCriterion("cargo_volume >", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("cargo_volume >=", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeLessThan(String value) {
            addCriterion("cargo_volume <", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeLessThanOrEqualTo(String value) {
            addCriterion("cargo_volume <=", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeLike(String value) {
            addCriterion("cargo_volume like", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeNotLike(String value) {
            addCriterion("cargo_volume not like", value, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeIn(List<String> values) {
            addCriterion("cargo_volume in", values, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeNotIn(List<String> values) {
            addCriterion("cargo_volume not in", values, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeBetween(String value1, String value2) {
            addCriterion("cargo_volume between", value1, value2, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCargoVolumeNotBetween(String value1, String value2) {
            addCriterion("cargo_volume not between", value1, value2, "cargoVolume");
            return (Criteria) this;
        }

        public Criteria andCarAgeIsNull() {
            addCriterion("car_age is null");
            return (Criteria) this;
        }

        public Criteria andCarAgeIsNotNull() {
            addCriterion("car_age is not null");
            return (Criteria) this;
        }

        public Criteria andCarAgeEqualTo(Double value) {
            addCriterion("car_age =", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotEqualTo(Double value) {
            addCriterion("car_age <>", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeGreaterThan(Double value) {
            addCriterion("car_age >", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeGreaterThanOrEqualTo(Double value) {
            addCriterion("car_age >=", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeLessThan(Double value) {
            addCriterion("car_age <", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeLessThanOrEqualTo(Double value) {
            addCriterion("car_age <=", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeIn(List<Double> values) {
            addCriterion("car_age in", values, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotIn(List<Double> values) {
            addCriterion("car_age not in", values, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeBetween(Double value1, Double value2) {
            addCriterion("car_age between", value1, value2, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotBetween(Double value1, Double value2) {
            addCriterion("car_age not between", value1, value2, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarMileageIsNull() {
            addCriterion("car_mileage is null");
            return (Criteria) this;
        }

        public Criteria andCarMileageIsNotNull() {
            addCriterion("car_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andCarMileageEqualTo(Double value) {
            addCriterion("car_mileage =", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageNotEqualTo(Double value) {
            addCriterion("car_mileage <>", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageGreaterThan(Double value) {
            addCriterion("car_mileage >", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageGreaterThanOrEqualTo(Double value) {
            addCriterion("car_mileage >=", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageLessThan(Double value) {
            addCriterion("car_mileage <", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageLessThanOrEqualTo(Double value) {
            addCriterion("car_mileage <=", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageIn(List<Double> values) {
            addCriterion("car_mileage in", values, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageNotIn(List<Double> values) {
            addCriterion("car_mileage not in", values, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageBetween(Double value1, Double value2) {
            addCriterion("car_mileage between", value1, value2, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageNotBetween(Double value1, Double value2) {
            addCriterion("car_mileage not between", value1, value2, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarDamageIsNull() {
            addCriterion("car_damage is null");
            return (Criteria) this;
        }

        public Criteria andCarDamageIsNotNull() {
            addCriterion("car_damage is not null");
            return (Criteria) this;
        }

        public Criteria andCarDamageEqualTo(String value) {
            addCriterion("car_damage =", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageNotEqualTo(String value) {
            addCriterion("car_damage <>", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageGreaterThan(String value) {
            addCriterion("car_damage >", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageGreaterThanOrEqualTo(String value) {
            addCriterion("car_damage >=", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageLessThan(String value) {
            addCriterion("car_damage <", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageLessThanOrEqualTo(String value) {
            addCriterion("car_damage <=", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageLike(String value) {
            addCriterion("car_damage like", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageNotLike(String value) {
            addCriterion("car_damage not like", value, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageIn(List<String> values) {
            addCriterion("car_damage in", values, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageNotIn(List<String> values) {
            addCriterion("car_damage not in", values, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageBetween(String value1, String value2) {
            addCriterion("car_damage between", value1, value2, "carDamage");
            return (Criteria) this;
        }

        public Criteria andCarDamageNotBetween(String value1, String value2) {
            addCriterion("car_damage not between", value1, value2, "carDamage");
            return (Criteria) this;
        }

        public Criteria andIseagerIsNull() {
            addCriterion("iseager is null");
            return (Criteria) this;
        }

        public Criteria andIseagerIsNotNull() {
            addCriterion("iseager is not null");
            return (Criteria) this;
        }

        public Criteria andIseagerEqualTo(String value) {
            addCriterion("iseager =", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerNotEqualTo(String value) {
            addCriterion("iseager <>", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerGreaterThan(String value) {
            addCriterion("iseager >", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerGreaterThanOrEqualTo(String value) {
            addCriterion("iseager >=", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerLessThan(String value) {
            addCriterion("iseager <", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerLessThanOrEqualTo(String value) {
            addCriterion("iseager <=", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerLike(String value) {
            addCriterion("iseager like", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerNotLike(String value) {
            addCriterion("iseager not like", value, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerIn(List<String> values) {
            addCriterion("iseager in", values, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerNotIn(List<String> values) {
            addCriterion("iseager not in", values, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerBetween(String value1, String value2) {
            addCriterion("iseager between", value1, value2, "iseager");
            return (Criteria) this;
        }

        public Criteria andIseagerNotBetween(String value1, String value2) {
            addCriterion("iseager not between", value1, value2, "iseager");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressIsNull() {
            addCriterion("license_address is null");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressIsNotNull() {
            addCriterion("license_address is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressEqualTo(String value) {
            addCriterion("license_address =", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotEqualTo(String value) {
            addCriterion("license_address <>", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressGreaterThan(String value) {
            addCriterion("license_address >", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("license_address >=", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressLessThan(String value) {
            addCriterion("license_address <", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressLessThanOrEqualTo(String value) {
            addCriterion("license_address <=", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressLike(String value) {
            addCriterion("license_address like", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotLike(String value) {
            addCriterion("license_address not like", value, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressIn(List<String> values) {
            addCriterion("license_address in", values, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotIn(List<String> values) {
            addCriterion("license_address not in", values, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressBetween(String value1, String value2) {
            addCriterion("license_address between", value1, value2, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andLicenseAddressNotBetween(String value1, String value2) {
            addCriterion("license_address not between", value1, value2, "licenseAddress");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNull() {
            addCriterion("islocked is null");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNotNull() {
            addCriterion("islocked is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedEqualTo(String value) {
            addCriterion("islocked =", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotEqualTo(String value) {
            addCriterion("islocked <>", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThan(String value) {
            addCriterion("islocked >", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThanOrEqualTo(String value) {
            addCriterion("islocked >=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThan(String value) {
            addCriterion("islocked <", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThanOrEqualTo(String value) {
            addCriterion("islocked <=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLike(String value) {
            addCriterion("islocked like", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotLike(String value) {
            addCriterion("islocked not like", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedIn(List<String> values) {
            addCriterion("islocked in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotIn(List<String> values) {
            addCriterion("islocked not in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedBetween(String value1, String value2) {
            addCriterion("islocked between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotBetween(String value1, String value2) {
            addCriterion("islocked not between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("`uid` like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("`uid` not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
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