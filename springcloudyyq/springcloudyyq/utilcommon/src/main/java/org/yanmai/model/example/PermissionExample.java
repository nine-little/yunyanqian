package org.yanmai.model.example;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPerIdIsNull() {
            addCriterion("per_id is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("per_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(Integer value) {
            addCriterion("per_id =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(Integer value) {
            addCriterion("per_id <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(Integer value) {
            addCriterion("per_id >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_id >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(Integer value) {
            addCriterion("per_id <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(Integer value) {
            addCriterion("per_id <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<Integer> values) {
            addCriterion("per_id in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<Integer> values) {
            addCriterion("per_id not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(Integer value1, Integer value2) {
            addCriterion("per_id between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("per_id not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdIsNull() {
            addCriterion("oprt_type_id is null");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdIsNotNull() {
            addCriterion("oprt_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdEqualTo(Short value) {
            addCriterion("oprt_type_id =", value, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdNotEqualTo(Short value) {
            addCriterion("oprt_type_id <>", value, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdGreaterThan(Short value) {
            addCriterion("oprt_type_id >", value, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdGreaterThanOrEqualTo(Short value) {
            addCriterion("oprt_type_id >=", value, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdLessThan(Short value) {
            addCriterion("oprt_type_id <", value, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdLessThanOrEqualTo(Short value) {
            addCriterion("oprt_type_id <=", value, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdIn(List<Short> values) {
            addCriterion("oprt_type_id in", values, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdNotIn(List<Short> values) {
            addCriterion("oprt_type_id not in", values, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdBetween(Short value1, Short value2) {
            addCriterion("oprt_type_id between", value1, value2, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andOprtTypeIdNotBetween(Short value1, Short value2) {
            addCriterion("oprt_type_id not between", value1, value2, "oprtTypeId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdIsNull() {
            addCriterion("sup_per_id is null");
            return (Criteria) this;
        }

        public Criteria andSupPerIdIsNotNull() {
            addCriterion("sup_per_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupPerIdEqualTo(Integer value) {
            addCriterion("sup_per_id =", value, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdNotEqualTo(Integer value) {
            addCriterion("sup_per_id <>", value, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdGreaterThan(Integer value) {
            addCriterion("sup_per_id >", value, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_per_id >=", value, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdLessThan(Integer value) {
            addCriterion("sup_per_id <", value, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdLessThanOrEqualTo(Integer value) {
            addCriterion("sup_per_id <=", value, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdIn(List<Integer> values) {
            addCriterion("sup_per_id in", values, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdNotIn(List<Integer> values) {
            addCriterion("sup_per_id not in", values, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdBetween(Integer value1, Integer value2) {
            addCriterion("sup_per_id between", value1, value2, "supPerId");
            return (Criteria) this;
        }

        public Criteria andSupPerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_per_id not between", value1, value2, "supPerId");
            return (Criteria) this;
        }

        public Criteria andPerLevelIsNull() {
            addCriterion("per_level is null");
            return (Criteria) this;
        }

        public Criteria andPerLevelIsNotNull() {
            addCriterion("per_level is not null");
            return (Criteria) this;
        }

        public Criteria andPerLevelEqualTo(Short value) {
            addCriterion("per_level =", value, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelNotEqualTo(Short value) {
            addCriterion("per_level <>", value, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelGreaterThan(Short value) {
            addCriterion("per_level >", value, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("per_level >=", value, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelLessThan(Short value) {
            addCriterion("per_level <", value, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelLessThanOrEqualTo(Short value) {
            addCriterion("per_level <=", value, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelIn(List<Short> values) {
            addCriterion("per_level in", values, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelNotIn(List<Short> values) {
            addCriterion("per_level not in", values, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelBetween(Short value1, Short value2) {
            addCriterion("per_level between", value1, value2, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerLevelNotBetween(Short value1, Short value2) {
            addCriterion("per_level not between", value1, value2, "perLevel");
            return (Criteria) this;
        }

        public Criteria andPerCodeIsNull() {
            addCriterion("per_code is null");
            return (Criteria) this;
        }

        public Criteria andPerCodeIsNotNull() {
            addCriterion("per_code is not null");
            return (Criteria) this;
        }

        public Criteria andPerCodeEqualTo(String value) {
            addCriterion("per_code =", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeNotEqualTo(String value) {
            addCriterion("per_code <>", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeGreaterThan(String value) {
            addCriterion("per_code >", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("per_code >=", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeLessThan(String value) {
            addCriterion("per_code <", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeLessThanOrEqualTo(String value) {
            addCriterion("per_code <=", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeLike(String value) {
            addCriterion("per_code like", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeNotLike(String value) {
            addCriterion("per_code not like", value, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeIn(List<String> values) {
            addCriterion("per_code in", values, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeNotIn(List<String> values) {
            addCriterion("per_code not in", values, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeBetween(String value1, String value2) {
            addCriterion("per_code between", value1, value2, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerCodeNotBetween(String value1, String value2) {
            addCriterion("per_code not between", value1, value2, "perCode");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNull() {
            addCriterion("per_name is null");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNotNull() {
            addCriterion("per_name is not null");
            return (Criteria) this;
        }

        public Criteria andPerNameEqualTo(String value) {
            addCriterion("per_name =", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotEqualTo(String value) {
            addCriterion("per_name <>", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThan(String value) {
            addCriterion("per_name >", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThanOrEqualTo(String value) {
            addCriterion("per_name >=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThan(String value) {
            addCriterion("per_name <", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThanOrEqualTo(String value) {
            addCriterion("per_name <=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLike(String value) {
            addCriterion("per_name like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotLike(String value) {
            addCriterion("per_name not like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameIn(List<String> values) {
            addCriterion("per_name in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotIn(List<String> values) {
            addCriterion("per_name not in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameBetween(String value1, String value2) {
            addCriterion("per_name between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotBetween(String value1, String value2) {
            addCriterion("per_name not between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNull() {
            addCriterion("per_desc is null");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNotNull() {
            addCriterion("per_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPerDescEqualTo(String value) {
            addCriterion("per_desc =", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotEqualTo(String value) {
            addCriterion("per_desc <>", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThan(String value) {
            addCriterion("per_desc >", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThanOrEqualTo(String value) {
            addCriterion("per_desc >=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThan(String value) {
            addCriterion("per_desc <", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThanOrEqualTo(String value) {
            addCriterion("per_desc <=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLike(String value) {
            addCriterion("per_desc like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotLike(String value) {
            addCriterion("per_desc not like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescIn(List<String> values) {
            addCriterion("per_desc in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotIn(List<String> values) {
            addCriterion("per_desc not in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescBetween(String value1, String value2) {
            addCriterion("per_desc between", value1, value2, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotBetween(String value1, String value2) {
            addCriterion("per_desc not between", value1, value2, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerOrderIsNull() {
            addCriterion("per_order is null");
            return (Criteria) this;
        }

        public Criteria andPerOrderIsNotNull() {
            addCriterion("per_order is not null");
            return (Criteria) this;
        }

        public Criteria andPerOrderEqualTo(Integer value) {
            addCriterion("per_order =", value, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderNotEqualTo(Integer value) {
            addCriterion("per_order <>", value, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderGreaterThan(Integer value) {
            addCriterion("per_order >", value, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_order >=", value, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderLessThan(Integer value) {
            addCriterion("per_order <", value, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderLessThanOrEqualTo(Integer value) {
            addCriterion("per_order <=", value, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderIn(List<Integer> values) {
            addCriterion("per_order in", values, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderNotIn(List<Integer> values) {
            addCriterion("per_order not in", values, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderBetween(Integer value1, Integer value2) {
            addCriterion("per_order between", value1, value2, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("per_order not between", value1, value2, "perOrder");
            return (Criteria) this;
        }

        public Criteria andPerUrlIsNull() {
            addCriterion("per_url is null");
            return (Criteria) this;
        }

        public Criteria andPerUrlIsNotNull() {
            addCriterion("per_url is not null");
            return (Criteria) this;
        }

        public Criteria andPerUrlEqualTo(String value) {
            addCriterion("per_url =", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotEqualTo(String value) {
            addCriterion("per_url <>", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlGreaterThan(String value) {
            addCriterion("per_url >", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("per_url >=", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLessThan(String value) {
            addCriterion("per_url <", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLessThanOrEqualTo(String value) {
            addCriterion("per_url <=", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLike(String value) {
            addCriterion("per_url like", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotLike(String value) {
            addCriterion("per_url not like", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlIn(List<String> values) {
            addCriterion("per_url in", values, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotIn(List<String> values) {
            addCriterion("per_url not in", values, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlBetween(String value1, String value2) {
            addCriterion("per_url between", value1, value2, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotBetween(String value1, String value2) {
            addCriterion("per_url not between", value1, value2, "perUrl");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNull() {
            addCriterion("data_state is null");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNotNull() {
            addCriterion("data_state is not null");
            return (Criteria) this;
        }

        public Criteria andDataStateEqualTo(Short value) {
            addCriterion("data_state =", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotEqualTo(Short value) {
            addCriterion("data_state <>", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThan(Short value) {
            addCriterion("data_state >", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThanOrEqualTo(Short value) {
            addCriterion("data_state >=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThan(Short value) {
            addCriterion("data_state <", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThanOrEqualTo(Short value) {
            addCriterion("data_state <=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateIn(List<Short> values) {
            addCriterion("data_state in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotIn(List<Short> values) {
            addCriterion("data_state not in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateBetween(Short value1, Short value2) {
            addCriterion("data_state between", value1, value2, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotBetween(Short value1, Short value2) {
            addCriterion("data_state not between", value1, value2, "dataState");
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