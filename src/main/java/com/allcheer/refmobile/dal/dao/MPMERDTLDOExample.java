package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MPMERDTLDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPMERDTLDOExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMerchNameIsNull() {
            addCriterion("MERCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchNameIsNotNull() {
            addCriterion("MERCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchNameEqualTo(String value) {
            addCriterion("MERCH_NAME =", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotEqualTo(String value) {
            addCriterion("MERCH_NAME <>", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameGreaterThan(String value) {
            addCriterion("MERCH_NAME >", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCH_NAME >=", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameLessThan(String value) {
            addCriterion("MERCH_NAME <", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameLessThanOrEqualTo(String value) {
            addCriterion("MERCH_NAME <=", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameLike(String value) {
            addCriterion("MERCH_NAME like", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotLike(String value) {
            addCriterion("MERCH_NAME not like", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameIn(List<String> values) {
            addCriterion("MERCH_NAME in", values, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotIn(List<String> values) {
            addCriterion("MERCH_NAME not in", values, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameBetween(String value1, String value2) {
            addCriterion("MERCH_NAME between", value1, value2, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotBetween(String value1, String value2) {
            addCriterion("MERCH_NAME not between", value1, value2, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameIsNull() {
            addCriterion("MERCH_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameIsNotNull() {
            addCriterion("MERCH_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameEqualTo(String value) {
            addCriterion("MERCH_SHORT_NAME =", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameNotEqualTo(String value) {
            addCriterion("MERCH_SHORT_NAME <>", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameGreaterThan(String value) {
            addCriterion("MERCH_SHORT_NAME >", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCH_SHORT_NAME >=", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameLessThan(String value) {
            addCriterion("MERCH_SHORT_NAME <", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameLessThanOrEqualTo(String value) {
            addCriterion("MERCH_SHORT_NAME <=", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameLike(String value) {
            addCriterion("MERCH_SHORT_NAME like", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameNotLike(String value) {
            addCriterion("MERCH_SHORT_NAME not like", value, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameIn(List<String> values) {
            addCriterion("MERCH_SHORT_NAME in", values, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameNotIn(List<String> values) {
            addCriterion("MERCH_SHORT_NAME not in", values, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameBetween(String value1, String value2) {
            addCriterion("MERCH_SHORT_NAME between", value1, value2, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andMerchShortNameNotBetween(String value1, String value2) {
            addCriterion("MERCH_SHORT_NAME not between", value1, value2, "merchShortName");
            return (Criteria) this;
        }

        public Criteria andOemIdIsNull() {
            addCriterion("OEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOemIdIsNotNull() {
            addCriterion("OEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOemIdEqualTo(String value) {
            addCriterion("OEM_ID =", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdNotEqualTo(String value) {
            addCriterion("OEM_ID <>", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdGreaterThan(String value) {
            addCriterion("OEM_ID >", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdGreaterThanOrEqualTo(String value) {
            addCriterion("OEM_ID >=", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdLessThan(String value) {
            addCriterion("OEM_ID <", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdLessThanOrEqualTo(String value) {
            addCriterion("OEM_ID <=", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdLike(String value) {
            addCriterion("OEM_ID like", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdNotLike(String value) {
            addCriterion("OEM_ID not like", value, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdIn(List<String> values) {
            addCriterion("OEM_ID in", values, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdNotIn(List<String> values) {
            addCriterion("OEM_ID not in", values, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdBetween(String value1, String value2) {
            addCriterion("OEM_ID between", value1, value2, "oemId");
            return (Criteria) this;
        }

        public Criteria andOemIdNotBetween(String value1, String value2) {
            addCriterion("OEM_ID not between", value1, value2, "oemId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("AGENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("AGENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("AGENT_ID =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("AGENT_ID <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("AGENT_ID >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_ID >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("AGENT_ID <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("AGENT_ID <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("AGENT_ID like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("AGENT_ID not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("AGENT_ID in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("AGENT_ID not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("AGENT_ID between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("AGENT_ID not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("LEGAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("LEGAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("LEGAL_NAME =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("LEGAL_NAME <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("LEGAL_NAME >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_NAME >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("LEGAL_NAME <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_NAME <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("LEGAL_NAME like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("LEGAL_NAME not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("LEGAL_NAME in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("LEGAL_NAME not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("LEGAL_NAME between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("LEGAL_NAME not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(String value) {
            addCriterion("SIGN_DATE =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(String value) {
            addCriterion("SIGN_DATE <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(String value) {
            addCriterion("SIGN_DATE >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_DATE >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(String value) {
            addCriterion("SIGN_DATE <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(String value) {
            addCriterion("SIGN_DATE <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLike(String value) {
            addCriterion("SIGN_DATE like", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotLike(String value) {
            addCriterion("SIGN_DATE not like", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<String> values) {
            addCriterion("SIGN_DATE in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<String> values) {
            addCriterion("SIGN_DATE not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(String value1, String value2) {
            addCriterion("SIGN_DATE between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(String value1, String value2) {
            addCriterion("SIGN_DATE not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andApproveFlagIsNull() {
            addCriterion("APPROVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andApproveFlagIsNotNull() {
            addCriterion("APPROVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andApproveFlagEqualTo(String value) {
            addCriterion("APPROVE_FLAG =", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotEqualTo(String value) {
            addCriterion("APPROVE_FLAG <>", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagGreaterThan(String value) {
            addCriterion("APPROVE_FLAG >", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_FLAG >=", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagLessThan(String value) {
            addCriterion("APPROVE_FLAG <", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_FLAG <=", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagLike(String value) {
            addCriterion("APPROVE_FLAG like", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotLike(String value) {
            addCriterion("APPROVE_FLAG not like", value, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagIn(List<String> values) {
            addCriterion("APPROVE_FLAG in", values, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotIn(List<String> values) {
            addCriterion("APPROVE_FLAG not in", values, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagBetween(String value1, String value2) {
            addCriterion("APPROVE_FLAG between", value1, value2, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andApproveFlagNotBetween(String value1, String value2) {
            addCriterion("APPROVE_FLAG not between", value1, value2, "approveFlag");
            return (Criteria) this;
        }

        public Criteria andArchFlph01IsNull() {
            addCriterion("ARCH_FLPH_01 is null");
            return (Criteria) this;
        }

        public Criteria andArchFlph01IsNotNull() {
            addCriterion("ARCH_FLPH_01 is not null");
            return (Criteria) this;
        }

        public Criteria andArchFlph01EqualTo(String value) {
            addCriterion("ARCH_FLPH_01 =", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01NotEqualTo(String value) {
            addCriterion("ARCH_FLPH_01 <>", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01GreaterThan(String value) {
            addCriterion("ARCH_FLPH_01 >", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01GreaterThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_01 >=", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01LessThan(String value) {
            addCriterion("ARCH_FLPH_01 <", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01LessThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_01 <=", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01Like(String value) {
            addCriterion("ARCH_FLPH_01 like", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01NotLike(String value) {
            addCriterion("ARCH_FLPH_01 not like", value, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01In(List<String> values) {
            addCriterion("ARCH_FLPH_01 in", values, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01NotIn(List<String> values) {
            addCriterion("ARCH_FLPH_01 not in", values, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01Between(String value1, String value2) {
            addCriterion("ARCH_FLPH_01 between", value1, value2, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph01NotBetween(String value1, String value2) {
            addCriterion("ARCH_FLPH_01 not between", value1, value2, "archFlph01");
            return (Criteria) this;
        }

        public Criteria andArchFlph02IsNull() {
            addCriterion("ARCH_FLPH_02 is null");
            return (Criteria) this;
        }

        public Criteria andArchFlph02IsNotNull() {
            addCriterion("ARCH_FLPH_02 is not null");
            return (Criteria) this;
        }

        public Criteria andArchFlph02EqualTo(String value) {
            addCriterion("ARCH_FLPH_02 =", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02NotEqualTo(String value) {
            addCriterion("ARCH_FLPH_02 <>", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02GreaterThan(String value) {
            addCriterion("ARCH_FLPH_02 >", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02GreaterThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_02 >=", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02LessThan(String value) {
            addCriterion("ARCH_FLPH_02 <", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02LessThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_02 <=", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02Like(String value) {
            addCriterion("ARCH_FLPH_02 like", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02NotLike(String value) {
            addCriterion("ARCH_FLPH_02 not like", value, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02In(List<String> values) {
            addCriterion("ARCH_FLPH_02 in", values, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02NotIn(List<String> values) {
            addCriterion("ARCH_FLPH_02 not in", values, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02Between(String value1, String value2) {
            addCriterion("ARCH_FLPH_02 between", value1, value2, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph02NotBetween(String value1, String value2) {
            addCriterion("ARCH_FLPH_02 not between", value1, value2, "archFlph02");
            return (Criteria) this;
        }

        public Criteria andArchFlph03IsNull() {
            addCriterion("ARCH_FLPH_03 is null");
            return (Criteria) this;
        }

        public Criteria andArchFlph03IsNotNull() {
            addCriterion("ARCH_FLPH_03 is not null");
            return (Criteria) this;
        }

        public Criteria andArchFlph03EqualTo(String value) {
            addCriterion("ARCH_FLPH_03 =", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03NotEqualTo(String value) {
            addCriterion("ARCH_FLPH_03 <>", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03GreaterThan(String value) {
            addCriterion("ARCH_FLPH_03 >", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03GreaterThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_03 >=", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03LessThan(String value) {
            addCriterion("ARCH_FLPH_03 <", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03LessThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_03 <=", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03Like(String value) {
            addCriterion("ARCH_FLPH_03 like", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03NotLike(String value) {
            addCriterion("ARCH_FLPH_03 not like", value, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03In(List<String> values) {
            addCriterion("ARCH_FLPH_03 in", values, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03NotIn(List<String> values) {
            addCriterion("ARCH_FLPH_03 not in", values, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03Between(String value1, String value2) {
            addCriterion("ARCH_FLPH_03 between", value1, value2, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph03NotBetween(String value1, String value2) {
            addCriterion("ARCH_FLPH_03 not between", value1, value2, "archFlph03");
            return (Criteria) this;
        }

        public Criteria andArchFlph04IsNull() {
            addCriterion("ARCH_FLPH_04 is null");
            return (Criteria) this;
        }

        public Criteria andArchFlph04IsNotNull() {
            addCriterion("ARCH_FLPH_04 is not null");
            return (Criteria) this;
        }

        public Criteria andArchFlph04EqualTo(String value) {
            addCriterion("ARCH_FLPH_04 =", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04NotEqualTo(String value) {
            addCriterion("ARCH_FLPH_04 <>", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04GreaterThan(String value) {
            addCriterion("ARCH_FLPH_04 >", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04GreaterThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_04 >=", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04LessThan(String value) {
            addCriterion("ARCH_FLPH_04 <", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04LessThanOrEqualTo(String value) {
            addCriterion("ARCH_FLPH_04 <=", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04Like(String value) {
            addCriterion("ARCH_FLPH_04 like", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04NotLike(String value) {
            addCriterion("ARCH_FLPH_04 not like", value, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04In(List<String> values) {
            addCriterion("ARCH_FLPH_04 in", values, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04NotIn(List<String> values) {
            addCriterion("ARCH_FLPH_04 not in", values, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04Between(String value1, String value2) {
            addCriterion("ARCH_FLPH_04 between", value1, value2, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andArchFlph04NotBetween(String value1, String value2) {
            addCriterion("ARCH_FLPH_04 not between", value1, value2, "archFlph04");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqIsNull() {
            addCriterion("NEXT_BANK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqIsNotNull() {
            addCriterion("NEXT_BANK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqEqualTo(BigDecimal value) {
            addCriterion("NEXT_BANK_SEQ =", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqNotEqualTo(BigDecimal value) {
            addCriterion("NEXT_BANK_SEQ <>", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqGreaterThan(BigDecimal value) {
            addCriterion("NEXT_BANK_SEQ >", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_BANK_SEQ >=", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqLessThan(BigDecimal value) {
            addCriterion("NEXT_BANK_SEQ <", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_BANK_SEQ <=", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqIn(List<BigDecimal> values) {
            addCriterion("NEXT_BANK_SEQ in", values, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqNotIn(List<BigDecimal> values) {
            addCriterion("NEXT_BANK_SEQ not in", values, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_BANK_SEQ between", value1, value2, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_BANK_SEQ not between", value1, value2, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqIsNull() {
            addCriterion("NEXT_APPLY_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqIsNotNull() {
            addCriterion("NEXT_APPLY_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLY_SEQ =", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqNotEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLY_SEQ <>", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqGreaterThan(BigDecimal value) {
            addCriterion("NEXT_APPLY_SEQ >", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLY_SEQ >=", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqLessThan(BigDecimal value) {
            addCriterion("NEXT_APPLY_SEQ <", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLY_SEQ <=", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqIn(List<BigDecimal> values) {
            addCriterion("NEXT_APPLY_SEQ in", values, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqNotIn(List<BigDecimal> values) {
            addCriterion("NEXT_APPLY_SEQ not in", values, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_APPLY_SEQ between", value1, value2, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_APPLY_SEQ not between", value1, value2, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqIsNull() {
            addCriterion("NEXT_TERM_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqIsNotNull() {
            addCriterion("NEXT_TERM_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqEqualTo(BigDecimal value) {
            addCriterion("NEXT_TERM_SEQ =", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqNotEqualTo(BigDecimal value) {
            addCriterion("NEXT_TERM_SEQ <>", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqGreaterThan(BigDecimal value) {
            addCriterion("NEXT_TERM_SEQ >", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_TERM_SEQ >=", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqLessThan(BigDecimal value) {
            addCriterion("NEXT_TERM_SEQ <", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_TERM_SEQ <=", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqIn(List<BigDecimal> values) {
            addCriterion("NEXT_TERM_SEQ in", values, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqNotIn(List<BigDecimal> values) {
            addCriterion("NEXT_TERM_SEQ not in", values, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_TERM_SEQ between", value1, value2, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_TERM_SEQ not between", value1, value2, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andTellerIdIsNull() {
            addCriterion("TELLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTellerIdIsNotNull() {
            addCriterion("TELLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTellerIdEqualTo(String value) {
            addCriterion("TELLER_ID =", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotEqualTo(String value) {
            addCriterion("TELLER_ID <>", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdGreaterThan(String value) {
            addCriterion("TELLER_ID >", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("TELLER_ID >=", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdLessThan(String value) {
            addCriterion("TELLER_ID <", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdLessThanOrEqualTo(String value) {
            addCriterion("TELLER_ID <=", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdLike(String value) {
            addCriterion("TELLER_ID like", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotLike(String value) {
            addCriterion("TELLER_ID not like", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdIn(List<String> values) {
            addCriterion("TELLER_ID in", values, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotIn(List<String> values) {
            addCriterion("TELLER_ID not in", values, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdBetween(String value1, String value2) {
            addCriterion("TELLER_ID between", value1, value2, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotBetween(String value1, String value2) {
            addCriterion("TELLER_ID not between", value1, value2, "tellerId");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmIsNull() {
            addCriterion("REC_CRET_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmIsNotNull() {
            addCriterion("REC_CRET_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmEqualTo(String value) {
            addCriterion("REC_CRET_DTTM =", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmNotEqualTo(String value) {
            addCriterion("REC_CRET_DTTM <>", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmGreaterThan(String value) {
            addCriterion("REC_CRET_DTTM >", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmGreaterThanOrEqualTo(String value) {
            addCriterion("REC_CRET_DTTM >=", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmLessThan(String value) {
            addCriterion("REC_CRET_DTTM <", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmLessThanOrEqualTo(String value) {
            addCriterion("REC_CRET_DTTM <=", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmLike(String value) {
            addCriterion("REC_CRET_DTTM like", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmNotLike(String value) {
            addCriterion("REC_CRET_DTTM not like", value, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmIn(List<String> values) {
            addCriterion("REC_CRET_DTTM in", values, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmNotIn(List<String> values) {
            addCriterion("REC_CRET_DTTM not in", values, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmBetween(String value1, String value2) {
            addCriterion("REC_CRET_DTTM between", value1, value2, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andRecCretDttmNotBetween(String value1, String value2) {
            addCriterion("REC_CRET_DTTM not between", value1, value2, "recCretDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmIsNull() {
            addCriterion("LST_UPD_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmIsNotNull() {
            addCriterion("LST_UPD_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmEqualTo(String value) {
            addCriterion("LST_UPD_DTTM =", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmNotEqualTo(String value) {
            addCriterion("LST_UPD_DTTM <>", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmGreaterThan(String value) {
            addCriterion("LST_UPD_DTTM >", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmGreaterThanOrEqualTo(String value) {
            addCriterion("LST_UPD_DTTM >=", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmLessThan(String value) {
            addCriterion("LST_UPD_DTTM <", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmLessThanOrEqualTo(String value) {
            addCriterion("LST_UPD_DTTM <=", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmLike(String value) {
            addCriterion("LST_UPD_DTTM like", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmNotLike(String value) {
            addCriterion("LST_UPD_DTTM not like", value, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmIn(List<String> values) {
            addCriterion("LST_UPD_DTTM in", values, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmNotIn(List<String> values) {
            addCriterion("LST_UPD_DTTM not in", values, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmBetween(String value1, String value2) {
            addCriterion("LST_UPD_DTTM between", value1, value2, "lstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdDttmNotBetween(String value1, String value2) {
            addCriterion("LST_UPD_DTTM not between", value1, value2, "lstUpdDttm");
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