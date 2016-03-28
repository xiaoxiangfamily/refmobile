package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MPMERAPLHTRDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPMERAPLHTRDOExample() {
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

        public Criteria andApplayNoIsNull() {
            addCriterion("APPLAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplayNoIsNotNull() {
            addCriterion("APPLAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplayNoEqualTo(BigDecimal value) {
            addCriterion("APPLAY_NO =", value, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoNotEqualTo(BigDecimal value) {
            addCriterion("APPLAY_NO <>", value, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoGreaterThan(BigDecimal value) {
            addCriterion("APPLAY_NO >", value, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLAY_NO >=", value, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoLessThan(BigDecimal value) {
            addCriterion("APPLAY_NO <", value, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLAY_NO <=", value, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoIn(List<BigDecimal> values) {
            addCriterion("APPLAY_NO in", values, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoNotIn(List<BigDecimal> values) {
            addCriterion("APPLAY_NO not in", values, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLAY_NO between", value1, value2, "applayNo");
            return (Criteria) this;
        }

        public Criteria andApplayNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLAY_NO not between", value1, value2, "applayNo");
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

        public Criteria andProcDateIsNull() {
            addCriterion("PROC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProcDateIsNotNull() {
            addCriterion("PROC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcDateEqualTo(String value) {
            addCriterion("PROC_DATE =", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateNotEqualTo(String value) {
            addCriterion("PROC_DATE <>", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateGreaterThan(String value) {
            addCriterion("PROC_DATE >", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_DATE >=", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateLessThan(String value) {
            addCriterion("PROC_DATE <", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateLessThanOrEqualTo(String value) {
            addCriterion("PROC_DATE <=", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateLike(String value) {
            addCriterion("PROC_DATE like", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateNotLike(String value) {
            addCriterion("PROC_DATE not like", value, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateIn(List<String> values) {
            addCriterion("PROC_DATE in", values, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateNotIn(List<String> values) {
            addCriterion("PROC_DATE not in", values, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateBetween(String value1, String value2) {
            addCriterion("PROC_DATE between", value1, value2, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcDateNotBetween(String value1, String value2) {
            addCriterion("PROC_DATE not between", value1, value2, "procDate");
            return (Criteria) this;
        }

        public Criteria andProcTimeIsNull() {
            addCriterion("PROC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProcTimeIsNotNull() {
            addCriterion("PROC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProcTimeEqualTo(String value) {
            addCriterion("PROC_TIME =", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeNotEqualTo(String value) {
            addCriterion("PROC_TIME <>", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeGreaterThan(String value) {
            addCriterion("PROC_TIME >", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_TIME >=", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeLessThan(String value) {
            addCriterion("PROC_TIME <", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeLessThanOrEqualTo(String value) {
            addCriterion("PROC_TIME <=", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeLike(String value) {
            addCriterion("PROC_TIME like", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeNotLike(String value) {
            addCriterion("PROC_TIME not like", value, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeIn(List<String> values) {
            addCriterion("PROC_TIME in", values, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeNotIn(List<String> values) {
            addCriterion("PROC_TIME not in", values, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeBetween(String value1, String value2) {
            addCriterion("PROC_TIME between", value1, value2, "procTime");
            return (Criteria) this;
        }

        public Criteria andProcTimeNotBetween(String value1, String value2) {
            addCriterion("PROC_TIME not between", value1, value2, "procTime");
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

        public Criteria andProcDescIsNull() {
            addCriterion("PROC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProcDescIsNotNull() {
            addCriterion("PROC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProcDescEqualTo(String value) {
            addCriterion("PROC_DESC =", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotEqualTo(String value) {
            addCriterion("PROC_DESC <>", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescGreaterThan(String value) {
            addCriterion("PROC_DESC >", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_DESC >=", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescLessThan(String value) {
            addCriterion("PROC_DESC <", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescLessThanOrEqualTo(String value) {
            addCriterion("PROC_DESC <=", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescLike(String value) {
            addCriterion("PROC_DESC like", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotLike(String value) {
            addCriterion("PROC_DESC not like", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescIn(List<String> values) {
            addCriterion("PROC_DESC in", values, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotIn(List<String> values) {
            addCriterion("PROC_DESC not in", values, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescBetween(String value1, String value2) {
            addCriterion("PROC_DESC between", value1, value2, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotBetween(String value1, String value2) {
            addCriterion("PROC_DESC not between", value1, value2, "procDesc");
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