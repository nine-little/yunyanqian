package org.yanmai.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerTaskExample() {
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskid like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskid not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerid like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerid not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
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

        public Criteria andAtStepIsNull() {
            addCriterion("at_step is null");
            return (Criteria) this;
        }

        public Criteria andAtStepIsNotNull() {
            addCriterion("at_step is not null");
            return (Criteria) this;
        }

        public Criteria andAtStepEqualTo(Integer value) {
            addCriterion("at_step =", value, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepNotEqualTo(Integer value) {
            addCriterion("at_step <>", value, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepGreaterThan(Integer value) {
            addCriterion("at_step >", value, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("at_step >=", value, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepLessThan(Integer value) {
            addCriterion("at_step <", value, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepLessThanOrEqualTo(Integer value) {
            addCriterion("at_step <=", value, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepIn(List<Integer> values) {
            addCriterion("at_step in", values, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepNotIn(List<Integer> values) {
            addCriterion("at_step not in", values, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepBetween(Integer value1, Integer value2) {
            addCriterion("at_step between", value1, value2, "atStep");
            return (Criteria) this;
        }

        public Criteria andAtStepNotBetween(Integer value1, Integer value2) {
            addCriterion("at_step not between", value1, value2, "atStep");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeIsNull() {
            addCriterion("customerdoccode is null");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeIsNotNull() {
            addCriterion("customerdoccode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeEqualTo(String value) {
            addCriterion("customerdoccode =", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeNotEqualTo(String value) {
            addCriterion("customerdoccode <>", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeGreaterThan(String value) {
            addCriterion("customerdoccode >", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeGreaterThanOrEqualTo(String value) {
            addCriterion("customerdoccode >=", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeLessThan(String value) {
            addCriterion("customerdoccode <", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeLessThanOrEqualTo(String value) {
            addCriterion("customerdoccode <=", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeLike(String value) {
            addCriterion("customerdoccode like", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeNotLike(String value) {
            addCriterion("customerdoccode not like", value, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeIn(List<String> values) {
            addCriterion("customerdoccode in", values, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeNotIn(List<String> values) {
            addCriterion("customerdoccode not in", values, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeBetween(String value1, String value2) {
            addCriterion("customerdoccode between", value1, value2, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomerdoccodeNotBetween(String value1, String value2) {
            addCriterion("customerdoccode not between", value1, value2, "customerdoccode");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNull() {
            addCriterion("customersex is null");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNotNull() {
            addCriterion("customersex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersexEqualTo(String value) {
            addCriterion("customersex =", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotEqualTo(String value) {
            addCriterion("customersex <>", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThan(String value) {
            addCriterion("customersex >", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThanOrEqualTo(String value) {
            addCriterion("customersex >=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThan(String value) {
            addCriterion("customersex <", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThanOrEqualTo(String value) {
            addCriterion("customersex <=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLike(String value) {
            addCriterion("customersex like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotLike(String value) {
            addCriterion("customersex not like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexIn(List<String> values) {
            addCriterion("customersex in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotIn(List<String> values) {
            addCriterion("customersex not in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexBetween(String value1, String value2) {
            addCriterion("customersex between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotBetween(String value1, String value2) {
            addCriterion("customersex not between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomernationIsNull() {
            addCriterion("customernation is null");
            return (Criteria) this;
        }

        public Criteria andCustomernationIsNotNull() {
            addCriterion("customernation is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernationEqualTo(String value) {
            addCriterion("customernation =", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationNotEqualTo(String value) {
            addCriterion("customernation <>", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationGreaterThan(String value) {
            addCriterion("customernation >", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationGreaterThanOrEqualTo(String value) {
            addCriterion("customernation >=", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationLessThan(String value) {
            addCriterion("customernation <", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationLessThanOrEqualTo(String value) {
            addCriterion("customernation <=", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationLike(String value) {
            addCriterion("customernation like", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationNotLike(String value) {
            addCriterion("customernation not like", value, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationIn(List<String> values) {
            addCriterion("customernation in", values, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationNotIn(List<String> values) {
            addCriterion("customernation not in", values, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationBetween(String value1, String value2) {
            addCriterion("customernation between", value1, value2, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomernationNotBetween(String value1, String value2) {
            addCriterion("customernation not between", value1, value2, "customernation");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIsNull() {
            addCriterion("customerbirthday is null");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIsNotNull() {
            addCriterion("customerbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayEqualTo(String value) {
            addCriterion("customerbirthday =", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotEqualTo(String value) {
            addCriterion("customerbirthday <>", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayGreaterThan(String value) {
            addCriterion("customerbirthday >", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("customerbirthday >=", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayLessThan(String value) {
            addCriterion("customerbirthday <", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayLessThanOrEqualTo(String value) {
            addCriterion("customerbirthday <=", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayLike(String value) {
            addCriterion("customerbirthday like", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotLike(String value) {
            addCriterion("customerbirthday not like", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIn(List<String> values) {
            addCriterion("customerbirthday in", values, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotIn(List<String> values) {
            addCriterion("customerbirthday not in", values, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayBetween(String value1, String value2) {
            addCriterion("customerbirthday between", value1, value2, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotBetween(String value1, String value2) {
            addCriterion("customerbirthday not between", value1, value2, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityIsNull() {
            addCriterion("customerauthority is null");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityIsNotNull() {
            addCriterion("customerauthority is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityEqualTo(String value) {
            addCriterion("customerauthority =", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityNotEqualTo(String value) {
            addCriterion("customerauthority <>", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityGreaterThan(String value) {
            addCriterion("customerauthority >", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("customerauthority >=", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityLessThan(String value) {
            addCriterion("customerauthority <", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityLessThanOrEqualTo(String value) {
            addCriterion("customerauthority <=", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityLike(String value) {
            addCriterion("customerauthority like", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityNotLike(String value) {
            addCriterion("customerauthority not like", value, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityIn(List<String> values) {
            addCriterion("customerauthority in", values, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityNotIn(List<String> values) {
            addCriterion("customerauthority not in", values, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityBetween(String value1, String value2) {
            addCriterion("customerauthority between", value1, value2, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerauthorityNotBetween(String value1, String value2) {
            addCriterion("customerauthority not between", value1, value2, "customerauthority");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateIsNull() {
            addCriterion("customerexpdate is null");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateIsNotNull() {
            addCriterion("customerexpdate is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateEqualTo(String value) {
            addCriterion("customerexpdate =", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateNotEqualTo(String value) {
            addCriterion("customerexpdate <>", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateGreaterThan(String value) {
            addCriterion("customerexpdate >", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateGreaterThanOrEqualTo(String value) {
            addCriterion("customerexpdate >=", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateLessThan(String value) {
            addCriterion("customerexpdate <", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateLessThanOrEqualTo(String value) {
            addCriterion("customerexpdate <=", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateLike(String value) {
            addCriterion("customerexpdate like", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateNotLike(String value) {
            addCriterion("customerexpdate not like", value, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateIn(List<String> values) {
            addCriterion("customerexpdate in", values, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateNotIn(List<String> values) {
            addCriterion("customerexpdate not in", values, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateBetween(String value1, String value2) {
            addCriterion("customerexpdate between", value1, value2, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomerexpdateNotBetween(String value1, String value2) {
            addCriterion("customerexpdate not between", value1, value2, "customerexpdate");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlIsNull() {
            addCriterion("customeridheadurl is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlIsNotNull() {
            addCriterion("customeridheadurl is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlEqualTo(String value) {
            addCriterion("customeridheadurl =", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlNotEqualTo(String value) {
            addCriterion("customeridheadurl <>", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlGreaterThan(String value) {
            addCriterion("customeridheadurl >", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlGreaterThanOrEqualTo(String value) {
            addCriterion("customeridheadurl >=", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlLessThan(String value) {
            addCriterion("customeridheadurl <", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlLessThanOrEqualTo(String value) {
            addCriterion("customeridheadurl <=", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlLike(String value) {
            addCriterion("customeridheadurl like", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlNotLike(String value) {
            addCriterion("customeridheadurl not like", value, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlIn(List<String> values) {
            addCriterion("customeridheadurl in", values, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlNotIn(List<String> values) {
            addCriterion("customeridheadurl not in", values, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlBetween(String value1, String value2) {
            addCriterion("customeridheadurl between", value1, value2, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeridheadurlNotBetween(String value1, String value2) {
            addCriterion("customeridheadurl not between", value1, value2, "customeridheadurl");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIsNull() {
            addCriterion("customeraddress is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIsNotNull() {
            addCriterion("customeraddress is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressEqualTo(String value) {
            addCriterion("customeraddress =", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotEqualTo(String value) {
            addCriterion("customeraddress <>", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressGreaterThan(String value) {
            addCriterion("customeraddress >", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("customeraddress >=", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLessThan(String value) {
            addCriterion("customeraddress <", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLessThanOrEqualTo(String value) {
            addCriterion("customeraddress <=", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLike(String value) {
            addCriterion("customeraddress like", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotLike(String value) {
            addCriterion("customeraddress not like", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIn(List<String> values) {
            addCriterion("customeraddress in", values, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotIn(List<String> values) {
            addCriterion("customeraddress not in", values, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressBetween(String value1, String value2) {
            addCriterion("customeraddress between", value1, value2, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotBetween(String value1, String value2) {
            addCriterion("customeraddress not between", value1, value2, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlIsNull() {
            addCriterion("identityFacadefileurl is null");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlIsNotNull() {
            addCriterion("identityFacadefileurl is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlEqualTo(String value) {
            addCriterion("identityFacadefileurl =", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlNotEqualTo(String value) {
            addCriterion("identityFacadefileurl <>", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlGreaterThan(String value) {
            addCriterion("identityFacadefileurl >", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlGreaterThanOrEqualTo(String value) {
            addCriterion("identityFacadefileurl >=", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlLessThan(String value) {
            addCriterion("identityFacadefileurl <", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlLessThanOrEqualTo(String value) {
            addCriterion("identityFacadefileurl <=", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlLike(String value) {
            addCriterion("identityFacadefileurl like", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlNotLike(String value) {
            addCriterion("identityFacadefileurl not like", value, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlIn(List<String> values) {
            addCriterion("identityFacadefileurl in", values, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlNotIn(List<String> values) {
            addCriterion("identityFacadefileurl not in", values, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlBetween(String value1, String value2) {
            addCriterion("identityFacadefileurl between", value1, value2, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentityfacadefileurlNotBetween(String value1, String value2) {
            addCriterion("identityFacadefileurl not between", value1, value2, "identityfacadefileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlIsNull() {
            addCriterion("identityBackfileurl is null");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlIsNotNull() {
            addCriterion("identityBackfileurl is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlEqualTo(String value) {
            addCriterion("identityBackfileurl =", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlNotEqualTo(String value) {
            addCriterion("identityBackfileurl <>", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlGreaterThan(String value) {
            addCriterion("identityBackfileurl >", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlGreaterThanOrEqualTo(String value) {
            addCriterion("identityBackfileurl >=", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlLessThan(String value) {
            addCriterion("identityBackfileurl <", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlLessThanOrEqualTo(String value) {
            addCriterion("identityBackfileurl <=", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlLike(String value) {
            addCriterion("identityBackfileurl like", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlNotLike(String value) {
            addCriterion("identityBackfileurl not like", value, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlIn(List<String> values) {
            addCriterion("identityBackfileurl in", values, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlNotIn(List<String> values) {
            addCriterion("identityBackfileurl not in", values, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlBetween(String value1, String value2) {
            addCriterion("identityBackfileurl between", value1, value2, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andIdentitybackfileurlNotBetween(String value1, String value2) {
            addCriterion("identityBackfileurl not between", value1, value2, "identitybackfileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlIsNull() {
            addCriterion("scenephotofileurl is null");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlIsNotNull() {
            addCriterion("scenephotofileurl is not null");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlEqualTo(String value) {
            addCriterion("scenephotofileurl =", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlNotEqualTo(String value) {
            addCriterion("scenephotofileurl <>", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlGreaterThan(String value) {
            addCriterion("scenephotofileurl >", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlGreaterThanOrEqualTo(String value) {
            addCriterion("scenephotofileurl >=", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlLessThan(String value) {
            addCriterion("scenephotofileurl <", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlLessThanOrEqualTo(String value) {
            addCriterion("scenephotofileurl <=", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlLike(String value) {
            addCriterion("scenephotofileurl like", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlNotLike(String value) {
            addCriterion("scenephotofileurl not like", value, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlIn(List<String> values) {
            addCriterion("scenephotofileurl in", values, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlNotIn(List<String> values) {
            addCriterion("scenephotofileurl not in", values, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlBetween(String value1, String value2) {
            addCriterion("scenephotofileurl between", value1, value2, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andScenephotofileurlNotBetween(String value1, String value2) {
            addCriterion("scenephotofileurl not between", value1, value2, "scenephotofileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlIsNull() {
            addCriterion("signaturefileurl is null");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlIsNotNull() {
            addCriterion("signaturefileurl is not null");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlEqualTo(String value) {
            addCriterion("signaturefileurl =", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlNotEqualTo(String value) {
            addCriterion("signaturefileurl <>", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlGreaterThan(String value) {
            addCriterion("signaturefileurl >", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlGreaterThanOrEqualTo(String value) {
            addCriterion("signaturefileurl >=", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlLessThan(String value) {
            addCriterion("signaturefileurl <", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlLessThanOrEqualTo(String value) {
            addCriterion("signaturefileurl <=", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlLike(String value) {
            addCriterion("signaturefileurl like", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlNotLike(String value) {
            addCriterion("signaturefileurl not like", value, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlIn(List<String> values) {
            addCriterion("signaturefileurl in", values, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlNotIn(List<String> values) {
            addCriterion("signaturefileurl not in", values, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlBetween(String value1, String value2) {
            addCriterion("signaturefileurl between", value1, value2, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andSignaturefileurlNotBetween(String value1, String value2) {
            addCriterion("signaturefileurl not between", value1, value2, "signaturefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlIsNull() {
            addCriterion("tapefileurl is null");
            return (Criteria) this;
        }

        public Criteria andTapefileurlIsNotNull() {
            addCriterion("tapefileurl is not null");
            return (Criteria) this;
        }

        public Criteria andTapefileurlEqualTo(String value) {
            addCriterion("tapefileurl =", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlNotEqualTo(String value) {
            addCriterion("tapefileurl <>", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlGreaterThan(String value) {
            addCriterion("tapefileurl >", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlGreaterThanOrEqualTo(String value) {
            addCriterion("tapefileurl >=", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlLessThan(String value) {
            addCriterion("tapefileurl <", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlLessThanOrEqualTo(String value) {
            addCriterion("tapefileurl <=", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlLike(String value) {
            addCriterion("tapefileurl like", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlNotLike(String value) {
            addCriterion("tapefileurl not like", value, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlIn(List<String> values) {
            addCriterion("tapefileurl in", values, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlNotIn(List<String> values) {
            addCriterion("tapefileurl not in", values, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlBetween(String value1, String value2) {
            addCriterion("tapefileurl between", value1, value2, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andTapefileurlNotBetween(String value1, String value2) {
            addCriterion("tapefileurl not between", value1, value2, "tapefileurl");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareIsNull() {
            addCriterion("isfacecompare is null");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareIsNotNull() {
            addCriterion("isfacecompare is not null");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareEqualTo(Integer value) {
            addCriterion("isfacecompare =", value, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareNotEqualTo(Integer value) {
            addCriterion("isfacecompare <>", value, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareGreaterThan(Integer value) {
            addCriterion("isfacecompare >", value, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareGreaterThanOrEqualTo(Integer value) {
            addCriterion("isfacecompare >=", value, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareLessThan(Integer value) {
            addCriterion("isfacecompare <", value, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareLessThanOrEqualTo(Integer value) {
            addCriterion("isfacecompare <=", value, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareIn(List<Integer> values) {
            addCriterion("isfacecompare in", values, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareNotIn(List<Integer> values) {
            addCriterion("isfacecompare not in", values, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareBetween(Integer value1, Integer value2) {
            addCriterion("isfacecompare between", value1, value2, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andIsfacecompareNotBetween(Integer value1, Integer value2) {
            addCriterion("isfacecompare not between", value1, value2, "isfacecompare");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceIsNull() {
            addCriterion("gridphotosource is null");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceIsNotNull() {
            addCriterion("gridphotosource is not null");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceEqualTo(Integer value) {
            addCriterion("gridphotosource =", value, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceNotEqualTo(Integer value) {
            addCriterion("gridphotosource <>", value, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceGreaterThan(Integer value) {
            addCriterion("gridphotosource >", value, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("gridphotosource >=", value, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceLessThan(Integer value) {
            addCriterion("gridphotosource <", value, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceLessThanOrEqualTo(Integer value) {
            addCriterion("gridphotosource <=", value, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceIn(List<Integer> values) {
            addCriterion("gridphotosource in", values, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceNotIn(List<Integer> values) {
            addCriterion("gridphotosource not in", values, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceBetween(Integer value1, Integer value2) {
            addCriterion("gridphotosource between", value1, value2, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andGridphotosourceNotBetween(Integer value1, Integer value2) {
            addCriterion("gridphotosource not between", value1, value2, "gridphotosource");
            return (Criteria) this;
        }

        public Criteria andCallStatusIsNull() {
            addCriterion("call_status is null");
            return (Criteria) this;
        }

        public Criteria andCallStatusIsNotNull() {
            addCriterion("call_status is not null");
            return (Criteria) this;
        }

        public Criteria andCallStatusEqualTo(Integer value) {
            addCriterion("call_status =", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusNotEqualTo(Integer value) {
            addCriterion("call_status <>", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusGreaterThan(Integer value) {
            addCriterion("call_status >", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_status >=", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusLessThan(Integer value) {
            addCriterion("call_status <", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusLessThanOrEqualTo(Integer value) {
            addCriterion("call_status <=", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusIn(List<Integer> values) {
            addCriterion("call_status in", values, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusNotIn(List<Integer> values) {
            addCriterion("call_status not in", values, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusBetween(Integer value1, Integer value2) {
            addCriterion("call_status between", value1, value2, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("call_status not between", value1, value2, "callStatus");
            return (Criteria) this;
        }

        public Criteria andFaceMemoIsNull() {
            addCriterion("face_memo is null");
            return (Criteria) this;
        }

        public Criteria andFaceMemoIsNotNull() {
            addCriterion("face_memo is not null");
            return (Criteria) this;
        }

        public Criteria andFaceMemoEqualTo(String value) {
            addCriterion("face_memo =", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoNotEqualTo(String value) {
            addCriterion("face_memo <>", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoGreaterThan(String value) {
            addCriterion("face_memo >", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoGreaterThanOrEqualTo(String value) {
            addCriterion("face_memo >=", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoLessThan(String value) {
            addCriterion("face_memo <", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoLessThanOrEqualTo(String value) {
            addCriterion("face_memo <=", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoLike(String value) {
            addCriterion("face_memo like", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoNotLike(String value) {
            addCriterion("face_memo not like", value, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoIn(List<String> values) {
            addCriterion("face_memo in", values, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoNotIn(List<String> values) {
            addCriterion("face_memo not in", values, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoBetween(String value1, String value2) {
            addCriterion("face_memo between", value1, value2, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceMemoNotBetween(String value1, String value2) {
            addCriterion("face_memo not between", value1, value2, "faceMemo");
            return (Criteria) this;
        }

        public Criteria andFaceTimeIsNull() {
            addCriterion("face_time is null");
            return (Criteria) this;
        }

        public Criteria andFaceTimeIsNotNull() {
            addCriterion("face_time is not null");
            return (Criteria) this;
        }

        public Criteria andFaceTimeEqualTo(Date value) {
            addCriterion("face_time =", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeNotEqualTo(Date value) {
            addCriterion("face_time <>", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeGreaterThan(Date value) {
            addCriterion("face_time >", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("face_time >=", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeLessThan(Date value) {
            addCriterion("face_time <", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeLessThanOrEqualTo(Date value) {
            addCriterion("face_time <=", value, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeIn(List<Date> values) {
            addCriterion("face_time in", values, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeNotIn(List<Date> values) {
            addCriterion("face_time not in", values, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeBetween(Date value1, Date value2) {
            addCriterion("face_time between", value1, value2, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceTimeNotBetween(Date value1, Date value2) {
            addCriterion("face_time not between", value1, value2, "faceTime");
            return (Criteria) this;
        }

        public Criteria andFaceStatuIsNull() {
            addCriterion("face_statu is null");
            return (Criteria) this;
        }

        public Criteria andFaceStatuIsNotNull() {
            addCriterion("face_statu is not null");
            return (Criteria) this;
        }

        public Criteria andFaceStatuEqualTo(String value) {
            addCriterion("face_statu =", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuNotEqualTo(String value) {
            addCriterion("face_statu <>", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuGreaterThan(String value) {
            addCriterion("face_statu >", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuGreaterThanOrEqualTo(String value) {
            addCriterion("face_statu >=", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuLessThan(String value) {
            addCriterion("face_statu <", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuLessThanOrEqualTo(String value) {
            addCriterion("face_statu <=", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuLike(String value) {
            addCriterion("face_statu like", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuNotLike(String value) {
            addCriterion("face_statu not like", value, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuIn(List<String> values) {
            addCriterion("face_statu in", values, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuNotIn(List<String> values) {
            addCriterion("face_statu not in", values, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuBetween(String value1, String value2) {
            addCriterion("face_statu between", value1, value2, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andFaceStatuNotBetween(String value1, String value2) {
            addCriterion("face_statu not between", value1, value2, "faceStatu");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNull() {
            addCriterion("ismain is null");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNotNull() {
            addCriterion("ismain is not null");
            return (Criteria) this;
        }

        public Criteria andIsmainEqualTo(Integer value) {
            addCriterion("ismain =", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotEqualTo(Integer value) {
            addCriterion("ismain <>", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThan(Integer value) {
            addCriterion("ismain >", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismain >=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThan(Integer value) {
            addCriterion("ismain <", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThanOrEqualTo(Integer value) {
            addCriterion("ismain <=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainIn(List<Integer> values) {
            addCriterion("ismain in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotIn(List<Integer> values) {
            addCriterion("ismain not in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainBetween(Integer value1, Integer value2) {
            addCriterion("ismain between", value1, value2, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotBetween(Integer value1, Integer value2) {
            addCriterion("ismain not between", value1, value2, "ismain");
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