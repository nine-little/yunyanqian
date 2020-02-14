package org.yanmai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyLoginidIsNull() {
            addCriterion("company_loginid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidIsNotNull() {
            addCriterion("company_loginid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidEqualTo(String value) {
            addCriterion("company_loginid =", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidNotEqualTo(String value) {
            addCriterion("company_loginid <>", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidGreaterThan(String value) {
            addCriterion("company_loginid >", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("company_loginid >=", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidLessThan(String value) {
            addCriterion("company_loginid <", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidLessThanOrEqualTo(String value) {
            addCriterion("company_loginid <=", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidLike(String value) {
            addCriterion("company_loginid like", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidNotLike(String value) {
            addCriterion("company_loginid not like", value, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidIn(List<String> values) {
            addCriterion("company_loginid in", values, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidNotIn(List<String> values) {
            addCriterion("company_loginid not in", values, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidBetween(String value1, String value2) {
            addCriterion("company_loginid between", value1, value2, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andCompanyLoginidNotBetween(String value1, String value2) {
            addCriterion("company_loginid not between", value1, value2, "companyLoginid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("shortname is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("shortname is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("shortname =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("shortname <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("shortname >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shortname >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("shortname <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("shortname <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("shortname like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("shortname not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("shortname in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("shortname not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("shortname between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("shortname not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNull() {
            addCriterion("companycode is null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNotNull() {
            addCriterion("companycode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeEqualTo(String value) {
            addCriterion("companycode =", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotEqualTo(String value) {
            addCriterion("companycode <>", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThan(String value) {
            addCriterion("companycode >", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
            addCriterion("companycode >=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThan(String value) {
            addCriterion("companycode <", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThanOrEqualTo(String value) {
            addCriterion("companycode <=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLike(String value) {
            addCriterion("companycode like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotLike(String value) {
            addCriterion("companycode not like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIn(List<String> values) {
            addCriterion("companycode in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotIn(List<String> values) {
            addCriterion("companycode not in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeBetween(String value1, String value2) {
            addCriterion("companycode between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotBetween(String value1, String value2) {
            addCriterion("companycode not between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("contact_number =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("contact_number <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("contact_number >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_number >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("contact_number <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_number <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("contact_number like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("contact_number not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("contact_number in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("contact_number not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("contact_number between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("contact_number not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNull() {
            addCriterion("companyType is null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNotNull() {
            addCriterion("companyType is not null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeEqualTo(String value) {
            addCriterion("companyType =", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotEqualTo(String value) {
            addCriterion("companyType <>", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThan(String value) {
            addCriterion("companyType >", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThanOrEqualTo(String value) {
            addCriterion("companyType >=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThan(String value) {
            addCriterion("companyType <", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThanOrEqualTo(String value) {
            addCriterion("companyType <=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLike(String value) {
            addCriterion("companyType like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotLike(String value) {
            addCriterion("companyType not like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIn(List<String> values) {
            addCriterion("companyType in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotIn(List<String> values) {
            addCriterion("companyType not in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeBetween(String value1, String value2) {
            addCriterion("companyType between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotBetween(String value1, String value2) {
            addCriterion("companyType not between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeIsNull() {
            addCriterion("registeredcode is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeIsNotNull() {
            addCriterion("registeredcode is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeEqualTo(String value) {
            addCriterion("registeredcode =", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeNotEqualTo(String value) {
            addCriterion("registeredcode <>", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeGreaterThan(String value) {
            addCriterion("registeredcode >", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeGreaterThanOrEqualTo(String value) {
            addCriterion("registeredcode >=", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeLessThan(String value) {
            addCriterion("registeredcode <", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeLessThanOrEqualTo(String value) {
            addCriterion("registeredcode <=", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeLike(String value) {
            addCriterion("registeredcode like", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeNotLike(String value) {
            addCriterion("registeredcode not like", value, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeIn(List<String> values) {
            addCriterion("registeredcode in", values, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeNotIn(List<String> values) {
            addCriterion("registeredcode not in", values, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeBetween(String value1, String value2) {
            addCriterion("registeredcode between", value1, value2, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredcodeNotBetween(String value1, String value2) {
            addCriterion("registeredcode not between", value1, value2, "registeredcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlIsNull() {
            addCriterion("registeredurl is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlIsNotNull() {
            addCriterion("registeredurl is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlEqualTo(String value) {
            addCriterion("registeredurl =", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlNotEqualTo(String value) {
            addCriterion("registeredurl <>", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlGreaterThan(String value) {
            addCriterion("registeredurl >", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlGreaterThanOrEqualTo(String value) {
            addCriterion("registeredurl >=", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlLessThan(String value) {
            addCriterion("registeredurl <", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlLessThanOrEqualTo(String value) {
            addCriterion("registeredurl <=", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlLike(String value) {
            addCriterion("registeredurl like", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlNotLike(String value) {
            addCriterion("registeredurl not like", value, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlIn(List<String> values) {
            addCriterion("registeredurl in", values, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlNotIn(List<String> values) {
            addCriterion("registeredurl not in", values, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlBetween(String value1, String value2) {
            addCriterion("registeredurl between", value1, value2, "registeredurl");
            return (Criteria) this;
        }

        public Criteria andRegisteredurlNotBetween(String value1, String value2) {
            addCriterion("registeredurl not between", value1, value2, "registeredurl");
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

        public Criteria andCitycodeIsNull() {
            addCriterion("citycode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("citycode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("citycode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("citycode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("citycode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("citycode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("citycode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("citycode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("citycode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("citycode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("citycode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("citycode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("citycode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("citycode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusIsNull() {
            addCriterion("certifiedstatus is null");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusIsNotNull() {
            addCriterion("certifiedstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusEqualTo(Integer value) {
            addCriterion("certifiedstatus =", value, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusNotEqualTo(Integer value) {
            addCriterion("certifiedstatus <>", value, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusGreaterThan(Integer value) {
            addCriterion("certifiedstatus >", value, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("certifiedstatus >=", value, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusLessThan(Integer value) {
            addCriterion("certifiedstatus <", value, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusLessThanOrEqualTo(Integer value) {
            addCriterion("certifiedstatus <=", value, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusIn(List<Integer> values) {
            addCriterion("certifiedstatus in", values, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusNotIn(List<Integer> values) {
            addCriterion("certifiedstatus not in", values, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusBetween(Integer value1, Integer value2) {
            addCriterion("certifiedstatus between", value1, value2, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("certifiedstatus not between", value1, value2, "certifiedstatus");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonIsNull() {
            addCriterion("certifiedReason is null");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonIsNotNull() {
            addCriterion("certifiedReason is not null");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonEqualTo(String value) {
            addCriterion("certifiedReason =", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonNotEqualTo(String value) {
            addCriterion("certifiedReason <>", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonGreaterThan(String value) {
            addCriterion("certifiedReason >", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonGreaterThanOrEqualTo(String value) {
            addCriterion("certifiedReason >=", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonLessThan(String value) {
            addCriterion("certifiedReason <", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonLessThanOrEqualTo(String value) {
            addCriterion("certifiedReason <=", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonLike(String value) {
            addCriterion("certifiedReason like", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonNotLike(String value) {
            addCriterion("certifiedReason not like", value, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonIn(List<String> values) {
            addCriterion("certifiedReason in", values, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonNotIn(List<String> values) {
            addCriterion("certifiedReason not in", values, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonBetween(String value1, String value2) {
            addCriterion("certifiedReason between", value1, value2, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifiedreasonNotBetween(String value1, String value2) {
            addCriterion("certifiedReason not between", value1, value2, "certifiedreason");
            return (Criteria) this;
        }

        public Criteria andCertifytimeIsNull() {
            addCriterion("certifyTime is null");
            return (Criteria) this;
        }

        public Criteria andCertifytimeIsNotNull() {
            addCriterion("certifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andCertifytimeEqualTo(Date value) {
            addCriterion("certifyTime =", value, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeNotEqualTo(Date value) {
            addCriterion("certifyTime <>", value, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeGreaterThan(Date value) {
            addCriterion("certifyTime >", value, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("certifyTime >=", value, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeLessThan(Date value) {
            addCriterion("certifyTime <", value, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeLessThanOrEqualTo(Date value) {
            addCriterion("certifyTime <=", value, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeIn(List<Date> values) {
            addCriterion("certifyTime in", values, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeNotIn(List<Date> values) {
            addCriterion("certifyTime not in", values, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeBetween(Date value1, Date value2) {
            addCriterion("certifyTime between", value1, value2, "certifytime");
            return (Criteria) this;
        }

        public Criteria andCertifytimeNotBetween(Date value1, Date value2) {
            addCriterion("certifyTime not between", value1, value2, "certifytime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNull() {
            addCriterion("temp1 is null");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNotNull() {
            addCriterion("temp1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp1EqualTo(String value) {
            addCriterion("temp1 =", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotEqualTo(String value) {
            addCriterion("temp1 <>", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThan(String value) {
            addCriterion("temp1 >", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThanOrEqualTo(String value) {
            addCriterion("temp1 >=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThan(String value) {
            addCriterion("temp1 <", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThanOrEqualTo(String value) {
            addCriterion("temp1 <=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Like(String value) {
            addCriterion("temp1 like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotLike(String value) {
            addCriterion("temp1 not like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1In(List<String> values) {
            addCriterion("temp1 in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotIn(List<String> values) {
            addCriterion("temp1 not in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Between(String value1, String value2) {
            addCriterion("temp1 between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotBetween(String value1, String value2) {
            addCriterion("temp1 not between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNull() {
            addCriterion("temp2 is null");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNotNull() {
            addCriterion("temp2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp2EqualTo(String value) {
            addCriterion("temp2 =", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotEqualTo(String value) {
            addCriterion("temp2 <>", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThan(String value) {
            addCriterion("temp2 >", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThanOrEqualTo(String value) {
            addCriterion("temp2 >=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThan(String value) {
            addCriterion("temp2 <", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThanOrEqualTo(String value) {
            addCriterion("temp2 <=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Like(String value) {
            addCriterion("temp2 like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotLike(String value) {
            addCriterion("temp2 not like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2In(List<String> values) {
            addCriterion("temp2 in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotIn(List<String> values) {
            addCriterion("temp2 not in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Between(String value1, String value2) {
            addCriterion("temp2 between", value1, value2, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotBetween(String value1, String value2) {
            addCriterion("temp2 not between", value1, value2, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp3IsNull() {
            addCriterion("temp3 is null");
            return (Criteria) this;
        }

        public Criteria andTemp3IsNotNull() {
            addCriterion("temp3 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp3EqualTo(String value) {
            addCriterion("temp3 =", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotEqualTo(String value) {
            addCriterion("temp3 <>", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3GreaterThan(String value) {
            addCriterion("temp3 >", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3GreaterThanOrEqualTo(String value) {
            addCriterion("temp3 >=", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3LessThan(String value) {
            addCriterion("temp3 <", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3LessThanOrEqualTo(String value) {
            addCriterion("temp3 <=", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3Like(String value) {
            addCriterion("temp3 like", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotLike(String value) {
            addCriterion("temp3 not like", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3In(List<String> values) {
            addCriterion("temp3 in", values, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotIn(List<String> values) {
            addCriterion("temp3 not in", values, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3Between(String value1, String value2) {
            addCriterion("temp3 between", value1, value2, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotBetween(String value1, String value2) {
            addCriterion("temp3 not between", value1, value2, "temp3");
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