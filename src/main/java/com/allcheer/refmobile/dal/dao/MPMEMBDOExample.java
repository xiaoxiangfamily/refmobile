package com.allcheer.refmobile.dal.dao;

import java.util.ArrayList;
import java.util.List;

public class MPMEMBDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPMEMBDOExample() {
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

        public Criteria andMemberStatIsNull() {
            addCriterion("MEMBER_STAT is null");
            return (Criteria) this;
        }

        public Criteria andMemberStatIsNotNull() {
            addCriterion("MEMBER_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStatEqualTo(String value) {
            addCriterion("MEMBER_STAT =", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatNotEqualTo(String value) {
            addCriterion("MEMBER_STAT <>", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatGreaterThan(String value) {
            addCriterion("MEMBER_STAT >", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STAT >=", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatLessThan(String value) {
            addCriterion("MEMBER_STAT <", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STAT <=", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatLike(String value) {
            addCriterion("MEMBER_STAT like", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatNotLike(String value) {
            addCriterion("MEMBER_STAT not like", value, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatIn(List<String> values) {
            addCriterion("MEMBER_STAT in", values, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatNotIn(List<String> values) {
            addCriterion("MEMBER_STAT not in", values, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatBetween(String value1, String value2) {
            addCriterion("MEMBER_STAT between", value1, value2, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberStatNotBetween(String value1, String value2) {
            addCriterion("MEMBER_STAT not between", value1, value2, "memberStat");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("MEMBER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("MEMBER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("MEMBER_TYPE =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("MEMBER_TYPE <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("MEMBER_TYPE >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("MEMBER_TYPE <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("MEMBER_TYPE like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("MEMBER_TYPE not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("MEMBER_TYPE in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("MEMBER_TYPE not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNull() {
            addCriterion("IS_SELF is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNotNull() {
            addCriterion("IS_SELF is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfEqualTo(String value) {
            addCriterion("IS_SELF =", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotEqualTo(String value) {
            addCriterion("IS_SELF <>", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThan(String value) {
            addCriterion("IS_SELF >", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SELF >=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThan(String value) {
            addCriterion("IS_SELF <", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThanOrEqualTo(String value) {
            addCriterion("IS_SELF <=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLike(String value) {
            addCriterion("IS_SELF like", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotLike(String value) {
            addCriterion("IS_SELF not like", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfIn(List<String> values) {
            addCriterion("IS_SELF in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotIn(List<String> values) {
            addCriterion("IS_SELF not in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfBetween(String value1, String value2) {
            addCriterion("IS_SELF between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotBetween(String value1, String value2) {
            addCriterion("IS_SELF not between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNull() {
            addCriterion("IS_VIRTUAL is null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNotNull() {
            addCriterion("IS_VIRTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualEqualTo(String value) {
            addCriterion("IS_VIRTUAL =", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotEqualTo(String value) {
            addCriterion("IS_VIRTUAL <>", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThan(String value) {
            addCriterion("IS_VIRTUAL >", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VIRTUAL >=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThan(String value) {
            addCriterion("IS_VIRTUAL <", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThanOrEqualTo(String value) {
            addCriterion("IS_VIRTUAL <=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLike(String value) {
            addCriterion("IS_VIRTUAL like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotLike(String value) {
            addCriterion("IS_VIRTUAL not like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIn(List<String> values) {
            addCriterion("IS_VIRTUAL in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotIn(List<String> values) {
            addCriterion("IS_VIRTUAL not in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualBetween(String value1, String value2) {
            addCriterion("IS_VIRTUAL between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotBetween(String value1, String value2) {
            addCriterion("IS_VIRTUAL not between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("IS_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("IS_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(String value) {
            addCriterion("IS_ACTIVE =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(String value) {
            addCriterion("IS_ACTIVE <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(String value) {
            addCriterion("IS_ACTIVE >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVE >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(String value) {
            addCriterion("IS_ACTIVE <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVE <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLike(String value) {
            addCriterion("IS_ACTIVE like", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotLike(String value) {
            addCriterion("IS_ACTIVE not like", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<String> values) {
            addCriterion("IS_ACTIVE in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<String> values) {
            addCriterion("IS_ACTIVE not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(String value1, String value2) {
            addCriterion("IS_ACTIVE between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(String value1, String value2) {
            addCriterion("IS_ACTIVE not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("OPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("OPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(String value) {
            addCriterion("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(String value) {
            addCriterion("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(String value) {
            addCriterion("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(String value) {
            addCriterion("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(String value) {
            addCriterion("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(String value) {
            addCriterion("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLike(String value) {
            addCriterion("OPDATE like", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotLike(String value) {
            addCriterion("OPDATE not like", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<String> values) {
            addCriterion("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<String> values) {
            addCriterion("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(String value1, String value2) {
            addCriterion("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(String value1, String value2) {
            addCriterion("OPDATE not between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andClsdateIsNull() {
            addCriterion("CLSDATE is null");
            return (Criteria) this;
        }

        public Criteria andClsdateIsNotNull() {
            addCriterion("CLSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andClsdateEqualTo(String value) {
            addCriterion("CLSDATE =", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateNotEqualTo(String value) {
            addCriterion("CLSDATE <>", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateGreaterThan(String value) {
            addCriterion("CLSDATE >", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateGreaterThanOrEqualTo(String value) {
            addCriterion("CLSDATE >=", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateLessThan(String value) {
            addCriterion("CLSDATE <", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateLessThanOrEqualTo(String value) {
            addCriterion("CLSDATE <=", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateLike(String value) {
            addCriterion("CLSDATE like", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateNotLike(String value) {
            addCriterion("CLSDATE not like", value, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateIn(List<String> values) {
            addCriterion("CLSDATE in", values, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateNotIn(List<String> values) {
            addCriterion("CLSDATE not in", values, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateBetween(String value1, String value2) {
            addCriterion("CLSDATE between", value1, value2, "clsdate");
            return (Criteria) this;
        }

        public Criteria andClsdateNotBetween(String value1, String value2) {
            addCriterion("CLSDATE not between", value1, value2, "clsdate");
            return (Criteria) this;
        }

        public Criteria andAcctNoIsNull() {
            addCriterion("ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAcctNoIsNotNull() {
            addCriterion("ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNoEqualTo(String value) {
            addCriterion("ACCT_NO =", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotEqualTo(String value) {
            addCriterion("ACCT_NO <>", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThan(String value) {
            addCriterion("ACCT_NO >", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_NO >=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThan(String value) {
            addCriterion("ACCT_NO <", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThanOrEqualTo(String value) {
            addCriterion("ACCT_NO <=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLike(String value) {
            addCriterion("ACCT_NO like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotLike(String value) {
            addCriterion("ACCT_NO not like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoIn(List<String> values) {
            addCriterion("ACCT_NO in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotIn(List<String> values) {
            addCriterion("ACCT_NO not in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoBetween(String value1, String value2) {
            addCriterion("ACCT_NO between", value1, value2, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotBetween(String value1, String value2) {
            addCriterion("ACCT_NO not between", value1, value2, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNull() {
            addCriterion("ACCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNotNull() {
            addCriterion("ACCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeEqualTo(String value) {
            addCriterion("ACCT_TYPE =", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotEqualTo(String value) {
            addCriterion("ACCT_TYPE <>", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThan(String value) {
            addCriterion("ACCT_TYPE >", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_TYPE >=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThan(String value) {
            addCriterion("ACCT_TYPE <", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCT_TYPE <=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLike(String value) {
            addCriterion("ACCT_TYPE like", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotLike(String value) {
            addCriterion("ACCT_TYPE not like", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIn(List<String> values) {
            addCriterion("ACCT_TYPE in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotIn(List<String> values) {
            addCriterion("ACCT_TYPE not in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeBetween(String value1, String value2) {
            addCriterion("ACCT_TYPE between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotBetween(String value1, String value2) {
            addCriterion("ACCT_TYPE not between", value1, value2, "acctType");
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

        public Criteria andNextBankSeqEqualTo(Short value) {
            addCriterion("NEXT_BANK_SEQ =", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqNotEqualTo(Short value) {
            addCriterion("NEXT_BANK_SEQ <>", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqGreaterThan(Short value) {
            addCriterion("NEXT_BANK_SEQ >", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("NEXT_BANK_SEQ >=", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqLessThan(Short value) {
            addCriterion("NEXT_BANK_SEQ <", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqLessThanOrEqualTo(Short value) {
            addCriterion("NEXT_BANK_SEQ <=", value, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqIn(List<Short> values) {
            addCriterion("NEXT_BANK_SEQ in", values, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqNotIn(List<Short> values) {
            addCriterion("NEXT_BANK_SEQ not in", values, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqBetween(Short value1, Short value2) {
            addCriterion("NEXT_BANK_SEQ between", value1, value2, "nextBankSeq");
            return (Criteria) this;
        }

        public Criteria andNextBankSeqNotBetween(Short value1, Short value2) {
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

        public Criteria andNextApplySeqEqualTo(Short value) {
            addCriterion("NEXT_APPLY_SEQ =", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqNotEqualTo(Short value) {
            addCriterion("NEXT_APPLY_SEQ <>", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqGreaterThan(Short value) {
            addCriterion("NEXT_APPLY_SEQ >", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqGreaterThanOrEqualTo(Short value) {
            addCriterion("NEXT_APPLY_SEQ >=", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqLessThan(Short value) {
            addCriterion("NEXT_APPLY_SEQ <", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqLessThanOrEqualTo(Short value) {
            addCriterion("NEXT_APPLY_SEQ <=", value, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqIn(List<Short> values) {
            addCriterion("NEXT_APPLY_SEQ in", values, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqNotIn(List<Short> values) {
            addCriterion("NEXT_APPLY_SEQ not in", values, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqBetween(Short value1, Short value2) {
            addCriterion("NEXT_APPLY_SEQ between", value1, value2, "nextApplySeq");
            return (Criteria) this;
        }

        public Criteria andNextApplySeqNotBetween(Short value1, Short value2) {
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

        public Criteria andNextTermSeqEqualTo(Short value) {
            addCriterion("NEXT_TERM_SEQ =", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqNotEqualTo(Short value) {
            addCriterion("NEXT_TERM_SEQ <>", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqGreaterThan(Short value) {
            addCriterion("NEXT_TERM_SEQ >", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("NEXT_TERM_SEQ >=", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqLessThan(Short value) {
            addCriterion("NEXT_TERM_SEQ <", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqLessThanOrEqualTo(Short value) {
            addCriterion("NEXT_TERM_SEQ <=", value, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqIn(List<Short> values) {
            addCriterion("NEXT_TERM_SEQ in", values, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqNotIn(List<Short> values) {
            addCriterion("NEXT_TERM_SEQ not in", values, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqBetween(Short value1, Short value2) {
            addCriterion("NEXT_TERM_SEQ between", value1, value2, "nextTermSeq");
            return (Criteria) this;
        }

        public Criteria andNextTermSeqNotBetween(Short value1, Short value2) {
            addCriterion("NEXT_TERM_SEQ not between", value1, value2, "nextTermSeq");
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