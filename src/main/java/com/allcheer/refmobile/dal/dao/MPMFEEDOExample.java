package com.allcheer.refmobile.dal.dao;

import java.util.ArrayList;
import java.util.List;

public class MPMFEEDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPMFEEDOExample() {
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

        public Criteria andFeeCodeIsNull() {
            addCriterion("FEE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIsNotNull() {
            addCriterion("FEE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCodeEqualTo(String value) {
            addCriterion("FEE_CODE =", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotEqualTo(String value) {
            addCriterion("FEE_CODE <>", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeGreaterThan(String value) {
            addCriterion("FEE_CODE >", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_CODE >=", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLessThan(String value) {
            addCriterion("FEE_CODE <", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLessThanOrEqualTo(String value) {
            addCriterion("FEE_CODE <=", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLike(String value) {
            addCriterion("FEE_CODE like", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotLike(String value) {
            addCriterion("FEE_CODE not like", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIn(List<String> values) {
            addCriterion("FEE_CODE in", values, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotIn(List<String> values) {
            addCriterion("FEE_CODE not in", values, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeBetween(String value1, String value2) {
            addCriterion("FEE_CODE between", value1, value2, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotBetween(String value1, String value2) {
            addCriterion("FEE_CODE not between", value1, value2, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeStatIsNull() {
            addCriterion("FEE_STAT is null");
            return (Criteria) this;
        }

        public Criteria andFeeStatIsNotNull() {
            addCriterion("FEE_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStatEqualTo(String value) {
            addCriterion("FEE_STAT =", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatNotEqualTo(String value) {
            addCriterion("FEE_STAT <>", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatGreaterThan(String value) {
            addCriterion("FEE_STAT >", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_STAT >=", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatLessThan(String value) {
            addCriterion("FEE_STAT <", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatLessThanOrEqualTo(String value) {
            addCriterion("FEE_STAT <=", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatLike(String value) {
            addCriterion("FEE_STAT like", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatNotLike(String value) {
            addCriterion("FEE_STAT not like", value, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatIn(List<String> values) {
            addCriterion("FEE_STAT in", values, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatNotIn(List<String> values) {
            addCriterion("FEE_STAT not in", values, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatBetween(String value1, String value2) {
            addCriterion("FEE_STAT between", value1, value2, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeStatNotBetween(String value1, String value2) {
            addCriterion("FEE_STAT not between", value1, value2, "feeStat");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaIsNull() {
            addCriterion("FEE_FORMULA is null");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaIsNotNull() {
            addCriterion("FEE_FORMULA is not null");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaEqualTo(String value) {
            addCriterion("FEE_FORMULA =", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaNotEqualTo(String value) {
            addCriterion("FEE_FORMULA <>", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaGreaterThan(String value) {
            addCriterion("FEE_FORMULA >", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_FORMULA >=", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaLessThan(String value) {
            addCriterion("FEE_FORMULA <", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaLessThanOrEqualTo(String value) {
            addCriterion("FEE_FORMULA <=", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaLike(String value) {
            addCriterion("FEE_FORMULA like", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaNotLike(String value) {
            addCriterion("FEE_FORMULA not like", value, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaIn(List<String> values) {
            addCriterion("FEE_FORMULA in", values, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaNotIn(List<String> values) {
            addCriterion("FEE_FORMULA not in", values, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaBetween(String value1, String value2) {
            addCriterion("FEE_FORMULA between", value1, value2, "feeFormula");
            return (Criteria) this;
        }

        public Criteria andFeeFormulaNotBetween(String value1, String value2) {
            addCriterion("FEE_FORMULA not between", value1, value2, "feeFormula");
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