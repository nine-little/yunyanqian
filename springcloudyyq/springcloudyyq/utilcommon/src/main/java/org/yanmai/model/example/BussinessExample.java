package org.yanmai.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BussinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BussinessExample() {
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

        public Criteria andBussinessidIsNull() {
            addCriterion("bussinessid is null");
            return (Criteria) this;
        }

        public Criteria andBussinessidIsNotNull() {
            addCriterion("bussinessid is not null");
            return (Criteria) this;
        }

        public Criteria andBussinessidEqualTo(String value) {
            addCriterion("bussinessid =", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotEqualTo(String value) {
            addCriterion("bussinessid <>", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidGreaterThan(String value) {
            addCriterion("bussinessid >", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidGreaterThanOrEqualTo(String value) {
            addCriterion("bussinessid >=", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidLessThan(String value) {
            addCriterion("bussinessid <", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidLessThanOrEqualTo(String value) {
            addCriterion("bussinessid <=", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidLike(String value) {
            addCriterion("bussinessid like", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotLike(String value) {
            addCriterion("bussinessid not like", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidIn(List<String> values) {
            addCriterion("bussinessid in", values, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotIn(List<String> values) {
            addCriterion("bussinessid not in", values, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidBetween(String value1, String value2) {
            addCriterion("bussinessid between", value1, value2, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotBetween(String value1, String value2) {
            addCriterion("bussinessid not between", value1, value2, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeid like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeid not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("companyid =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("companyid <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("companyid >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("companyid >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("companyid <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("companyid <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("companyid like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("companyid not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("companyid in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("companyid not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("companyid between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("companyid not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andAscompanyIsNull() {
            addCriterion("asCompany is null");
            return (Criteria) this;
        }

        public Criteria andAscompanyIsNotNull() {
            addCriterion("asCompany is not null");
            return (Criteria) this;
        }

        public Criteria andAscompanyEqualTo(String value) {
            addCriterion("asCompany =", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyNotEqualTo(String value) {
            addCriterion("asCompany <>", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyGreaterThan(String value) {
            addCriterion("asCompany >", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyGreaterThanOrEqualTo(String value) {
            addCriterion("asCompany >=", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyLessThan(String value) {
            addCriterion("asCompany <", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyLessThanOrEqualTo(String value) {
            addCriterion("asCompany <=", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyLike(String value) {
            addCriterion("asCompany like", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyNotLike(String value) {
            addCriterion("asCompany not like", value, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyIn(List<String> values) {
            addCriterion("asCompany in", values, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyNotIn(List<String> values) {
            addCriterion("asCompany not in", values, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyBetween(String value1, String value2) {
            addCriterion("asCompany between", value1, value2, "ascompany");
            return (Criteria) this;
        }

        public Criteria andAscompanyNotBetween(String value1, String value2) {
            addCriterion("asCompany not between", value1, value2, "ascompany");
            return (Criteria) this;
        }

        public Criteria andContracturlIsNull() {
            addCriterion("contracturl is null");
            return (Criteria) this;
        }

        public Criteria andContracturlIsNotNull() {
            addCriterion("contracturl is not null");
            return (Criteria) this;
        }

        public Criteria andContracturlEqualTo(String value) {
            addCriterion("contracturl =", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlNotEqualTo(String value) {
            addCriterion("contracturl <>", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlGreaterThan(String value) {
            addCriterion("contracturl >", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlGreaterThanOrEqualTo(String value) {
            addCriterion("contracturl >=", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlLessThan(String value) {
            addCriterion("contracturl <", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlLessThanOrEqualTo(String value) {
            addCriterion("contracturl <=", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlLike(String value) {
            addCriterion("contracturl like", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlNotLike(String value) {
            addCriterion("contracturl not like", value, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlIn(List<String> values) {
            addCriterion("contracturl in", values, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlNotIn(List<String> values) {
            addCriterion("contracturl not in", values, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlBetween(String value1, String value2) {
            addCriterion("contracturl between", value1, value2, "contracturl");
            return (Criteria) this;
        }

        public Criteria andContracturlNotBetween(String value1, String value2) {
            addCriterion("contracturl not between", value1, value2, "contracturl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlIsNull() {
            addCriterion("publicfileurl is null");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlIsNotNull() {
            addCriterion("publicfileurl is not null");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlEqualTo(String value) {
            addCriterion("publicfileurl =", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlNotEqualTo(String value) {
            addCriterion("publicfileurl <>", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlGreaterThan(String value) {
            addCriterion("publicfileurl >", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlGreaterThanOrEqualTo(String value) {
            addCriterion("publicfileurl >=", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlLessThan(String value) {
            addCriterion("publicfileurl <", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlLessThanOrEqualTo(String value) {
            addCriterion("publicfileurl <=", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlLike(String value) {
            addCriterion("publicfileurl like", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlNotLike(String value) {
            addCriterion("publicfileurl not like", value, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlIn(List<String> values) {
            addCriterion("publicfileurl in", values, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlNotIn(List<String> values) {
            addCriterion("publicfileurl not in", values, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlBetween(String value1, String value2) {
            addCriterion("publicfileurl between", value1, value2, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andPublicfileurlNotBetween(String value1, String value2) {
            addCriterion("publicfileurl not between", value1, value2, "publicfileurl");
            return (Criteria) this;
        }

        public Criteria andStatuIsNull() {
            addCriterion("statu is null");
            return (Criteria) this;
        }

        public Criteria andStatuIsNotNull() {
            addCriterion("statu is not null");
            return (Criteria) this;
        }

        public Criteria andStatuEqualTo(String value) {
            addCriterion("statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(String value) {
            addCriterion("statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(String value) {
            addCriterion("statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(String value) {
            addCriterion("statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(String value) {
            addCriterion("statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(String value) {
            addCriterion("statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLike(String value) {
            addCriterion("statu like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotLike(String value) {
            addCriterion("statu not like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<String> values) {
            addCriterion("statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<String> values) {
            addCriterion("statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(String value1, String value2) {
            addCriterion("statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(String value1, String value2) {
            addCriterion("statu not between", value1, value2, "statu");
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