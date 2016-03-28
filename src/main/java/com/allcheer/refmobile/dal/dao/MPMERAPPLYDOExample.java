package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MPMERAPPLYDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPMERAPPLYDOExample() {
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

        public Criteria andApplyNoIsNull() {
            addCriterion("APPLY_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("APPLY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(BigDecimal value) {
            addCriterion("APPLY_NO =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_NO <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(BigDecimal value) {
            addCriterion("APPLY_NO >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_NO >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(BigDecimal value) {
            addCriterion("APPLY_NO <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_NO <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<BigDecimal> values) {
            addCriterion("APPLY_NO in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_NO not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_NO between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_NO not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyStatIsNull() {
            addCriterion("APPLY_STAT is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatIsNotNull() {
            addCriterion("APPLY_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatEqualTo(String value) {
            addCriterion("APPLY_STAT =", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatNotEqualTo(String value) {
            addCriterion("APPLY_STAT <>", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatGreaterThan(String value) {
            addCriterion("APPLY_STAT >", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_STAT >=", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatLessThan(String value) {
            addCriterion("APPLY_STAT <", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatLessThanOrEqualTo(String value) {
            addCriterion("APPLY_STAT <=", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatLike(String value) {
            addCriterion("APPLY_STAT like", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatNotLike(String value) {
            addCriterion("APPLY_STAT not like", value, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatIn(List<String> values) {
            addCriterion("APPLY_STAT in", values, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatNotIn(List<String> values) {
            addCriterion("APPLY_STAT not in", values, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatBetween(String value1, String value2) {
            addCriterion("APPLY_STAT between", value1, value2, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApplyStatNotBetween(String value1, String value2) {
            addCriterion("APPLY_STAT not between", value1, value2, "applyStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatIsNull() {
            addCriterion("APPROVE_STAT is null");
            return (Criteria) this;
        }

        public Criteria andApproveStatIsNotNull() {
            addCriterion("APPROVE_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStatEqualTo(String value) {
            addCriterion("APPROVE_STAT =", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatNotEqualTo(String value) {
            addCriterion("APPROVE_STAT <>", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatGreaterThan(String value) {
            addCriterion("APPROVE_STAT >", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_STAT >=", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatLessThan(String value) {
            addCriterion("APPROVE_STAT <", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_STAT <=", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatLike(String value) {
            addCriterion("APPROVE_STAT like", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatNotLike(String value) {
            addCriterion("APPROVE_STAT not like", value, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatIn(List<String> values) {
            addCriterion("APPROVE_STAT in", values, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatNotIn(List<String> values) {
            addCriterion("APPROVE_STAT not in", values, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatBetween(String value1, String value2) {
            addCriterion("APPROVE_STAT between", value1, value2, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApproveStatNotBetween(String value1, String value2) {
            addCriterion("APPROVE_STAT not between", value1, value2, "approveStat");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(String value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(String value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(String value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(String value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLike(String value) {
            addCriterion("APPLY_DATE like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotLike(String value) {
            addCriterion("APPLY_DATE not like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<String> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<String> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(String value1, String value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(String value1, String value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(String value) {
            addCriterion("APPLY_TIME =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(String value) {
            addCriterion("APPLY_TIME <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(String value) {
            addCriterion("APPLY_TIME >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(String value) {
            addCriterion("APPLY_TIME <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLike(String value) {
            addCriterion("APPLY_TIME like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotLike(String value) {
            addCriterion("APPLY_TIME not like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<String> values) {
            addCriterion("APPLY_TIME in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<String> values) {
            addCriterion("APPLY_TIME not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(String value1, String value2) {
            addCriterion("APPLY_TIME between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TIME not between", value1, value2, "applyTime");
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

        public Criteria andNextApplyhtrSeqIsNull() {
            addCriterion("NEXT_APPLYHTR_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqIsNotNull() {
            addCriterion("NEXT_APPLYHTR_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLYHTR_SEQ =", value, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqNotEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLYHTR_SEQ <>", value, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqGreaterThan(BigDecimal value) {
            addCriterion("NEXT_APPLYHTR_SEQ >", value, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLYHTR_SEQ >=", value, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqLessThan(BigDecimal value) {
            addCriterion("NEXT_APPLYHTR_SEQ <", value, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEXT_APPLYHTR_SEQ <=", value, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqIn(List<BigDecimal> values) {
            addCriterion("NEXT_APPLYHTR_SEQ in", values, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqNotIn(List<BigDecimal> values) {
            addCriterion("NEXT_APPLYHTR_SEQ not in", values, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_APPLYHTR_SEQ between", value1, value2, "nextApplyhtrSeq");
            return (Criteria) this;
        }

        public Criteria andNextApplyhtrSeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEXT_APPLYHTR_SEQ not between", value1, value2, "nextApplyhtrSeq");
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

        public Criteria andUsrLstUpdDttmIsNull() {
            addCriterion("USR_LST_UPD_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmIsNotNull() {
            addCriterion("USR_LST_UPD_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmEqualTo(String value) {
            addCriterion("USR_LST_UPD_DTTM =", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmNotEqualTo(String value) {
            addCriterion("USR_LST_UPD_DTTM <>", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmGreaterThan(String value) {
            addCriterion("USR_LST_UPD_DTTM >", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmGreaterThanOrEqualTo(String value) {
            addCriterion("USR_LST_UPD_DTTM >=", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmLessThan(String value) {
            addCriterion("USR_LST_UPD_DTTM <", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmLessThanOrEqualTo(String value) {
            addCriterion("USR_LST_UPD_DTTM <=", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmLike(String value) {
            addCriterion("USR_LST_UPD_DTTM like", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmNotLike(String value) {
            addCriterion("USR_LST_UPD_DTTM not like", value, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmIn(List<String> values) {
            addCriterion("USR_LST_UPD_DTTM in", values, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmNotIn(List<String> values) {
            addCriterion("USR_LST_UPD_DTTM not in", values, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmBetween(String value1, String value2) {
            addCriterion("USR_LST_UPD_DTTM between", value1, value2, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andUsrLstUpdDttmNotBetween(String value1, String value2) {
            addCriterion("USR_LST_UPD_DTTM not between", value1, value2, "usrLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmIsNull() {
            addCriterion("MNG_LST_UPD_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmIsNotNull() {
            addCriterion("MNG_LST_UPD_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmEqualTo(String value) {
            addCriterion("MNG_LST_UPD_DTTM =", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmNotEqualTo(String value) {
            addCriterion("MNG_LST_UPD_DTTM <>", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmGreaterThan(String value) {
            addCriterion("MNG_LST_UPD_DTTM >", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmGreaterThanOrEqualTo(String value) {
            addCriterion("MNG_LST_UPD_DTTM >=", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmLessThan(String value) {
            addCriterion("MNG_LST_UPD_DTTM <", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmLessThanOrEqualTo(String value) {
            addCriterion("MNG_LST_UPD_DTTM <=", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmLike(String value) {
            addCriterion("MNG_LST_UPD_DTTM like", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmNotLike(String value) {
            addCriterion("MNG_LST_UPD_DTTM not like", value, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmIn(List<String> values) {
            addCriterion("MNG_LST_UPD_DTTM in", values, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmNotIn(List<String> values) {
            addCriterion("MNG_LST_UPD_DTTM not in", values, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmBetween(String value1, String value2) {
            addCriterion("MNG_LST_UPD_DTTM between", value1, value2, "mngLstUpdDttm");
            return (Criteria) this;
        }

        public Criteria andMngLstUpdDttmNotBetween(String value1, String value2) {
            addCriterion("MNG_LST_UPD_DTTM not between", value1, value2, "mngLstUpdDttm");
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