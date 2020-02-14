package org.yanmai.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BussinessTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BussinessTypeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andIdinformationIsNull() {
            addCriterion("Idinformation is null");
            return (Criteria) this;
        }

        public Criteria andIdinformationIsNotNull() {
            addCriterion("Idinformation is not null");
            return (Criteria) this;
        }

        public Criteria andIdinformationEqualTo(String value) {
            addCriterion("Idinformation =", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationNotEqualTo(String value) {
            addCriterion("Idinformation <>", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationGreaterThan(String value) {
            addCriterion("Idinformation >", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationGreaterThanOrEqualTo(String value) {
            addCriterion("Idinformation >=", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationLessThan(String value) {
            addCriterion("Idinformation <", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationLessThanOrEqualTo(String value) {
            addCriterion("Idinformation <=", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationLike(String value) {
            addCriterion("Idinformation like", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationNotLike(String value) {
            addCriterion("Idinformation not like", value, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationIn(List<String> values) {
            addCriterion("Idinformation in", values, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationNotIn(List<String> values) {
            addCriterion("Idinformation not in", values, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationBetween(String value1, String value2) {
            addCriterion("Idinformation between", value1, value2, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIdinformationNotBetween(String value1, String value2) {
            addCriterion("Idinformation not between", value1, value2, "idinformation");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileIsNull() {
            addCriterion("isuploadfile is null");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileIsNotNull() {
            addCriterion("isuploadfile is not null");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileEqualTo(String value) {
            addCriterion("isuploadfile =", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileNotEqualTo(String value) {
            addCriterion("isuploadfile <>", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileGreaterThan(String value) {
            addCriterion("isuploadfile >", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileGreaterThanOrEqualTo(String value) {
            addCriterion("isuploadfile >=", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileLessThan(String value) {
            addCriterion("isuploadfile <", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileLessThanOrEqualTo(String value) {
            addCriterion("isuploadfile <=", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileLike(String value) {
            addCriterion("isuploadfile like", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileNotLike(String value) {
            addCriterion("isuploadfile not like", value, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileIn(List<String> values) {
            addCriterion("isuploadfile in", values, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileNotIn(List<String> values) {
            addCriterion("isuploadfile not in", values, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileBetween(String value1, String value2) {
            addCriterion("isuploadfile between", value1, value2, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsuploadfileNotBetween(String value1, String value2) {
            addCriterion("isuploadfile not between", value1, value2, "isuploadfile");
            return (Criteria) this;
        }

        public Criteria andIsfaceIsNull() {
            addCriterion("isface is null");
            return (Criteria) this;
        }

        public Criteria andIsfaceIsNotNull() {
            addCriterion("isface is not null");
            return (Criteria) this;
        }

        public Criteria andIsfaceEqualTo(String value) {
            addCriterion("isface =", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceNotEqualTo(String value) {
            addCriterion("isface <>", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceGreaterThan(String value) {
            addCriterion("isface >", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceGreaterThanOrEqualTo(String value) {
            addCriterion("isface >=", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceLessThan(String value) {
            addCriterion("isface <", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceLessThanOrEqualTo(String value) {
            addCriterion("isface <=", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceLike(String value) {
            addCriterion("isface like", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceNotLike(String value) {
            addCriterion("isface not like", value, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceIn(List<String> values) {
            addCriterion("isface in", values, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceNotIn(List<String> values) {
            addCriterion("isface not in", values, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceBetween(String value1, String value2) {
            addCriterion("isface between", value1, value2, "isface");
            return (Criteria) this;
        }

        public Criteria andIsfaceNotBetween(String value1, String value2) {
            addCriterion("isface not between", value1, value2, "isface");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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