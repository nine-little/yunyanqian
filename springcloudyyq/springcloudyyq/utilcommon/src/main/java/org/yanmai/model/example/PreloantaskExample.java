package org.yanmai.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PreloantaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreloantaskExample() {
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

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridIsNull() {
            addCriterion("company_userid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridIsNotNull() {
            addCriterion("company_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridEqualTo(String value) {
            addCriterion("company_userid =", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridNotEqualTo(String value) {
            addCriterion("company_userid <>", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridGreaterThan(String value) {
            addCriterion("company_userid >", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridGreaterThanOrEqualTo(String value) {
            addCriterion("company_userid >=", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridLessThan(String value) {
            addCriterion("company_userid <", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridLessThanOrEqualTo(String value) {
            addCriterion("company_userid <=", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridLike(String value) {
            addCriterion("company_userid like", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridNotLike(String value) {
            addCriterion("company_userid not like", value, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridIn(List<String> values) {
            addCriterion("company_userid in", values, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridNotIn(List<String> values) {
            addCriterion("company_userid not in", values, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridBetween(String value1, String value2) {
            addCriterion("company_userid between", value1, value2, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyUseridNotBetween(String value1, String value2) {
            addCriterion("company_userid not between", value1, value2, "companyUserid");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskAddressIsNull() {
            addCriterion("task_address is null");
            return (Criteria) this;
        }

        public Criteria andTaskAddressIsNotNull() {
            addCriterion("task_address is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAddressEqualTo(String value) {
            addCriterion("task_address =", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressNotEqualTo(String value) {
            addCriterion("task_address <>", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressGreaterThan(String value) {
            addCriterion("task_address >", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressGreaterThanOrEqualTo(String value) {
            addCriterion("task_address >=", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressLessThan(String value) {
            addCriterion("task_address <", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressLessThanOrEqualTo(String value) {
            addCriterion("task_address <=", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressLike(String value) {
            addCriterion("task_address like", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressNotLike(String value) {
            addCriterion("task_address not like", value, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressIn(List<String> values) {
            addCriterion("task_address in", values, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressNotIn(List<String> values) {
            addCriterion("task_address not in", values, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressBetween(String value1, String value2) {
            addCriterion("task_address between", value1, value2, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andTaskAddressNotBetween(String value1, String value2) {
            addCriterion("task_address not between", value1, value2, "taskAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("business_id like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("business_id not like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlIsNull() {
            addCriterion("concatfileurl is null");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlIsNotNull() {
            addCriterion("concatfileurl is not null");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlEqualTo(String value) {
            addCriterion("concatfileurl =", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlNotEqualTo(String value) {
            addCriterion("concatfileurl <>", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlGreaterThan(String value) {
            addCriterion("concatfileurl >", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlGreaterThanOrEqualTo(String value) {
            addCriterion("concatfileurl >=", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlLessThan(String value) {
            addCriterion("concatfileurl <", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlLessThanOrEqualTo(String value) {
            addCriterion("concatfileurl <=", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlLike(String value) {
            addCriterion("concatfileurl like", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlNotLike(String value) {
            addCriterion("concatfileurl not like", value, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlIn(List<String> values) {
            addCriterion("concatfileurl in", values, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlNotIn(List<String> values) {
            addCriterion("concatfileurl not in", values, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlBetween(String value1, String value2) {
            addCriterion("concatfileurl between", value1, value2, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andConcatfileurlNotBetween(String value1, String value2) {
            addCriterion("concatfileurl not between", value1, value2, "concatfileurl");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuIsNull() {
            addCriterion("accept_statu is null");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuIsNotNull() {
            addCriterion("accept_statu is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuEqualTo(String value) {
            addCriterion("accept_statu =", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuNotEqualTo(String value) {
            addCriterion("accept_statu <>", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuGreaterThan(String value) {
            addCriterion("accept_statu >", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuGreaterThanOrEqualTo(String value) {
            addCriterion("accept_statu >=", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuLessThan(String value) {
            addCriterion("accept_statu <", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuLessThanOrEqualTo(String value) {
            addCriterion("accept_statu <=", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuLike(String value) {
            addCriterion("accept_statu like", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuNotLike(String value) {
            addCriterion("accept_statu not like", value, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuIn(List<String> values) {
            addCriterion("accept_statu in", values, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuNotIn(List<String> values) {
            addCriterion("accept_statu not in", values, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuBetween(String value1, String value2) {
            addCriterion("accept_statu between", value1, value2, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andAcceptStatuNotBetween(String value1, String value2) {
            addCriterion("accept_statu not between", value1, value2, "acceptStatu");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeIsNull() {
            addCriterion("createtasktime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeIsNotNull() {
            addCriterion("createtasktime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeEqualTo(Date value) {
            addCriterion("createtasktime =", value, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeNotEqualTo(Date value) {
            addCriterion("createtasktime <>", value, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeGreaterThan(Date value) {
            addCriterion("createtasktime >", value, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtasktime >=", value, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeLessThan(Date value) {
            addCriterion("createtasktime <", value, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeLessThanOrEqualTo(Date value) {
            addCriterion("createtasktime <=", value, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeIn(List<Date> values) {
            addCriterion("createtasktime in", values, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeNotIn(List<Date> values) {
            addCriterion("createtasktime not in", values, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeBetween(Date value1, Date value2) {
            addCriterion("createtasktime between", value1, value2, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andCreatetasktimeNotBetween(Date value1, Date value2) {
            addCriterion("createtasktime not between", value1, value2, "createtasktime");
            return (Criteria) this;
        }

        public Criteria andTaskStatuIsNull() {
            addCriterion("task_statu is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatuIsNotNull() {
            addCriterion("task_statu is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatuEqualTo(String value) {
            addCriterion("task_statu =", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuNotEqualTo(String value) {
            addCriterion("task_statu <>", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuGreaterThan(String value) {
            addCriterion("task_statu >", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuGreaterThanOrEqualTo(String value) {
            addCriterion("task_statu >=", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuLessThan(String value) {
            addCriterion("task_statu <", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuLessThanOrEqualTo(String value) {
            addCriterion("task_statu <=", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuLike(String value) {
            addCriterion("task_statu like", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuNotLike(String value) {
            addCriterion("task_statu not like", value, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuIn(List<String> values) {
            addCriterion("task_statu in", values, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuNotIn(List<String> values) {
            addCriterion("task_statu not in", values, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuBetween(String value1, String value2) {
            addCriterion("task_statu between", value1, value2, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andTaskStatuNotBetween(String value1, String value2) {
            addCriterion("task_statu not between", value1, value2, "taskStatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuIsNull() {
            addCriterion("reviewstatu is null");
            return (Criteria) this;
        }

        public Criteria andReviewstatuIsNotNull() {
            addCriterion("reviewstatu is not null");
            return (Criteria) this;
        }

        public Criteria andReviewstatuEqualTo(Integer value) {
            addCriterion("reviewstatu =", value, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuNotEqualTo(Integer value) {
            addCriterion("reviewstatu <>", value, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuGreaterThan(Integer value) {
            addCriterion("reviewstatu >", value, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewstatu >=", value, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuLessThan(Integer value) {
            addCriterion("reviewstatu <", value, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuLessThanOrEqualTo(Integer value) {
            addCriterion("reviewstatu <=", value, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuIn(List<Integer> values) {
            addCriterion("reviewstatu in", values, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuNotIn(List<Integer> values) {
            addCriterion("reviewstatu not in", values, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuBetween(Integer value1, Integer value2) {
            addCriterion("reviewstatu between", value1, value2, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReviewstatuNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewstatu not between", value1, value2, "reviewstatu");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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