package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MPBANKDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPBANKDOExample() {
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

        public Criteria andSeqNoIsNull() {
            addCriterion("SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNotNull() {
            addCriterion("SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNoEqualTo(BigDecimal value) {
            addCriterion("SEQ_NO =", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotEqualTo(BigDecimal value) {
            addCriterion("SEQ_NO <>", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThan(BigDecimal value) {
            addCriterion("SEQ_NO >", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ_NO >=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThan(BigDecimal value) {
            addCriterion("SEQ_NO <", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ_NO <=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoIn(List<BigDecimal> values) {
            addCriterion("SEQ_NO in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotIn(List<BigDecimal> values) {
            addCriterion("SEQ_NO not in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ_NO between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ_NO not between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("SIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("SIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(BigDecimal value) {
            addCriterion("SIGN_TYPE =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(BigDecimal value) {
            addCriterion("SIGN_TYPE <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(BigDecimal value) {
            addCriterion("SIGN_TYPE >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_TYPE >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(BigDecimal value) {
            addCriterion("SIGN_TYPE <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_TYPE <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<BigDecimal> values) {
            addCriterion("SIGN_TYPE in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<BigDecimal> values) {
            addCriterion("SIGN_TYPE not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_TYPE between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_TYPE not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignStatIsNull() {
            addCriterion("SIGN_STAT is null");
            return (Criteria) this;
        }

        public Criteria andSignStatIsNotNull() {
            addCriterion("SIGN_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andSignStatEqualTo(String value) {
            addCriterion("SIGN_STAT =", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatNotEqualTo(String value) {
            addCriterion("SIGN_STAT <>", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatGreaterThan(String value) {
            addCriterion("SIGN_STAT >", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_STAT >=", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatLessThan(String value) {
            addCriterion("SIGN_STAT <", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatLessThanOrEqualTo(String value) {
            addCriterion("SIGN_STAT <=", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatLike(String value) {
            addCriterion("SIGN_STAT like", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatNotLike(String value) {
            addCriterion("SIGN_STAT not like", value, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatIn(List<String> values) {
            addCriterion("SIGN_STAT in", values, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatNotIn(List<String> values) {
            addCriterion("SIGN_STAT not in", values, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatBetween(String value1, String value2) {
            addCriterion("SIGN_STAT between", value1, value2, "signStat");
            return (Criteria) this;
        }

        public Criteria andSignStatNotBetween(String value1, String value2) {
            addCriterion("SIGN_STAT not between", value1, value2, "signStat");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("IS_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("IS_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("IS_DEFAULT =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("IS_DEFAULT <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("IS_DEFAULT >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("IS_DEFAULT <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("IS_DEFAULT like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("IS_DEFAULT not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("IS_DEFAULT in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("IS_DEFAULT not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("BANK_ID like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("BANK_ID not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdIsNull() {
            addCriterion("PBANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andPbankIdIsNotNull() {
            addCriterion("PBANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPbankIdEqualTo(String value) {
            addCriterion("PBANK_ID =", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdNotEqualTo(String value) {
            addCriterion("PBANK_ID <>", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdGreaterThan(String value) {
            addCriterion("PBANK_ID >", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdGreaterThanOrEqualTo(String value) {
            addCriterion("PBANK_ID >=", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdLessThan(String value) {
            addCriterion("PBANK_ID <", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdLessThanOrEqualTo(String value) {
            addCriterion("PBANK_ID <=", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdLike(String value) {
            addCriterion("PBANK_ID like", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdNotLike(String value) {
            addCriterion("PBANK_ID not like", value, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdIn(List<String> values) {
            addCriterion("PBANK_ID in", values, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdNotIn(List<String> values) {
            addCriterion("PBANK_ID not in", values, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdBetween(String value1, String value2) {
            addCriterion("PBANK_ID between", value1, value2, "pbankId");
            return (Criteria) this;
        }

        public Criteria andPbankIdNotBetween(String value1, String value2) {
            addCriterion("PBANK_ID not between", value1, value2, "pbankId");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIsNull() {
            addCriterion("BANK_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIsNotNull() {
            addCriterion("BANK_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME =", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME <>", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameGreaterThan(String value) {
            addCriterion("BANK_BRANCH_NAME >", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME >=", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLessThan(String value) {
            addCriterion("BANK_BRANCH_NAME <", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME <=", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLike(String value) {
            addCriterion("BANK_BRANCH_NAME like", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotLike(String value) {
            addCriterion("BANK_BRANCH_NAME not like", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIn(List<String> values) {
            addCriterion("BANK_BRANCH_NAME in", values, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotIn(List<String> values) {
            addCriterion("BANK_BRANCH_NAME not in", values, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH_NAME between", value1, value2, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH_NAME not between", value1, value2, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameIsNull() {
            addCriterion("BANK_PROV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankProvNameIsNotNull() {
            addCriterion("BANK_PROV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvNameEqualTo(String value) {
            addCriterion("BANK_PROV_NAME =", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameNotEqualTo(String value) {
            addCriterion("BANK_PROV_NAME <>", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameGreaterThan(String value) {
            addCriterion("BANK_PROV_NAME >", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_PROV_NAME >=", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameLessThan(String value) {
            addCriterion("BANK_PROV_NAME <", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_PROV_NAME <=", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameLike(String value) {
            addCriterion("BANK_PROV_NAME like", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameNotLike(String value) {
            addCriterion("BANK_PROV_NAME not like", value, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameIn(List<String> values) {
            addCriterion("BANK_PROV_NAME in", values, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameNotIn(List<String> values) {
            addCriterion("BANK_PROV_NAME not in", values, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameBetween(String value1, String value2) {
            addCriterion("BANK_PROV_NAME between", value1, value2, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankProvNameNotBetween(String value1, String value2) {
            addCriterion("BANK_PROV_NAME not between", value1, value2, "bankProvName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameIsNull() {
            addCriterion("BANK_CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankCityNameIsNotNull() {
            addCriterion("BANK_CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityNameEqualTo(String value) {
            addCriterion("BANK_CITY_NAME =", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotEqualTo(String value) {
            addCriterion("BANK_CITY_NAME <>", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameGreaterThan(String value) {
            addCriterion("BANK_CITY_NAME >", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CITY_NAME >=", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameLessThan(String value) {
            addCriterion("BANK_CITY_NAME <", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_CITY_NAME <=", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameLike(String value) {
            addCriterion("BANK_CITY_NAME like", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotLike(String value) {
            addCriterion("BANK_CITY_NAME not like", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameIn(List<String> values) {
            addCriterion("BANK_CITY_NAME in", values, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotIn(List<String> values) {
            addCriterion("BANK_CITY_NAME not in", values, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameBetween(String value1, String value2) {
            addCriterion("BANK_CITY_NAME between", value1, value2, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotBetween(String value1, String value2) {
            addCriterion("BANK_CITY_NAME not between", value1, value2, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdIsNull() {
            addCriterion("BANK_ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdIsNotNull() {
            addCriterion("BANK_ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdEqualTo(String value) {
            addCriterion("BANK_ACCT_ID =", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotEqualTo(String value) {
            addCriterion("BANK_ACCT_ID <>", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdGreaterThan(String value) {
            addCriterion("BANK_ACCT_ID >", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCT_ID >=", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdLessThan(String value) {
            addCriterion("BANK_ACCT_ID <", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCT_ID <=", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdLike(String value) {
            addCriterion("BANK_ACCT_ID like", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotLike(String value) {
            addCriterion("BANK_ACCT_ID not like", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdIn(List<String> values) {
            addCriterion("BANK_ACCT_ID in", values, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotIn(List<String> values) {
            addCriterion("BANK_ACCT_ID not in", values, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdBetween(String value1, String value2) {
            addCriterion("BANK_ACCT_ID between", value1, value2, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCT_ID not between", value1, value2, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameIsNull() {
            addCriterion("BANK_ACCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameIsNotNull() {
            addCriterion("BANK_ACCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameEqualTo(String value) {
            addCriterion("BANK_ACCT_NAME =", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameNotEqualTo(String value) {
            addCriterion("BANK_ACCT_NAME <>", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameGreaterThan(String value) {
            addCriterion("BANK_ACCT_NAME >", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCT_NAME >=", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameLessThan(String value) {
            addCriterion("BANK_ACCT_NAME <", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCT_NAME <=", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameLike(String value) {
            addCriterion("BANK_ACCT_NAME like", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameNotLike(String value) {
            addCriterion("BANK_ACCT_NAME not like", value, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameIn(List<String> values) {
            addCriterion("BANK_ACCT_NAME in", values, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameNotIn(List<String> values) {
            addCriterion("BANK_ACCT_NAME not in", values, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameBetween(String value1, String value2) {
            addCriterion("BANK_ACCT_NAME between", value1, value2, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankAcctNameNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCT_NAME not between", value1, value2, "bankAcctName");
            return (Criteria) this;
        }

        public Criteria andBankMobileIsNull() {
            addCriterion("BANK_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andBankMobileIsNotNull() {
            addCriterion("BANK_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andBankMobileEqualTo(String value) {
            addCriterion("BANK_MOBILE =", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotEqualTo(String value) {
            addCriterion("BANK_MOBILE <>", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileGreaterThan(String value) {
            addCriterion("BANK_MOBILE >", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_MOBILE >=", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLessThan(String value) {
            addCriterion("BANK_MOBILE <", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLessThanOrEqualTo(String value) {
            addCriterion("BANK_MOBILE <=", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLike(String value) {
            addCriterion("BANK_MOBILE like", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotLike(String value) {
            addCriterion("BANK_MOBILE not like", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileIn(List<String> values) {
            addCriterion("BANK_MOBILE in", values, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotIn(List<String> values) {
            addCriterion("BANK_MOBILE not in", values, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileBetween(String value1, String value2) {
            addCriterion("BANK_MOBILE between", value1, value2, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotBetween(String value1, String value2) {
            addCriterion("BANK_MOBILE not between", value1, value2, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNull() {
            addCriterion("IS_PRIVATE is null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNotNull() {
            addCriterion("IS_PRIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateEqualTo(String value) {
            addCriterion("IS_PRIVATE =", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotEqualTo(String value) {
            addCriterion("IS_PRIVATE <>", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThan(String value) {
            addCriterion("IS_PRIVATE >", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PRIVATE >=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThan(String value) {
            addCriterion("IS_PRIVATE <", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThanOrEqualTo(String value) {
            addCriterion("IS_PRIVATE <=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLike(String value) {
            addCriterion("IS_PRIVATE like", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotLike(String value) {
            addCriterion("IS_PRIVATE not like", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIn(List<String> values) {
            addCriterion("IS_PRIVATE in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotIn(List<String> values) {
            addCriterion("IS_PRIVATE not in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateBetween(String value1, String value2) {
            addCriterion("IS_PRIVATE between", value1, value2, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotBetween(String value1, String value2) {
            addCriterion("IS_PRIVATE not between", value1, value2, "isPrivate");
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