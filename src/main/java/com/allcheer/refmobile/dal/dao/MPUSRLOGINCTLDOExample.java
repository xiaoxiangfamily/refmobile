package com.allcheer.refmobile.dal.dao;

import java.util.ArrayList;
import java.util.List;

public class MPUSRLOGINCTLDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPUSRLOGINCTLDOExample() {
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

        public Criteria andLoginIdIsNull() {
            addCriterion("LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("LOGIN_ID =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("LOGIN_ID <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("LOGIN_ID >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("LOGIN_ID <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("LOGIN_ID like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("LOGIN_ID not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("LOGIN_ID in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("LOGIN_ID not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("LOGIN_ID between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("LOGIN_ID not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatIsNull() {
            addCriterion("LOGIN_ID_STAT is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatIsNotNull() {
            addCriterion("LOGIN_ID_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatEqualTo(String value) {
            addCriterion("LOGIN_ID_STAT =", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatNotEqualTo(String value) {
            addCriterion("LOGIN_ID_STAT <>", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatGreaterThan(String value) {
            addCriterion("LOGIN_ID_STAT >", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID_STAT >=", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatLessThan(String value) {
            addCriterion("LOGIN_ID_STAT <", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID_STAT <=", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatLike(String value) {
            addCriterion("LOGIN_ID_STAT like", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatNotLike(String value) {
            addCriterion("LOGIN_ID_STAT not like", value, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatIn(List<String> values) {
            addCriterion("LOGIN_ID_STAT in", values, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatNotIn(List<String> values) {
            addCriterion("LOGIN_ID_STAT not in", values, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatBetween(String value1, String value2) {
            addCriterion("LOGIN_ID_STAT between", value1, value2, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdStatNotBetween(String value1, String value2) {
            addCriterion("LOGIN_ID_STAT not between", value1, value2, "loginIdStat");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeIsNull() {
            addCriterion("LOGIN_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeIsNotNull() {
            addCriterion("LOGIN_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeEqualTo(String value) {
            addCriterion("LOGIN_ID_TYPE =", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeNotEqualTo(String value) {
            addCriterion("LOGIN_ID_TYPE <>", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeGreaterThan(String value) {
            addCriterion("LOGIN_ID_TYPE >", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID_TYPE >=", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeLessThan(String value) {
            addCriterion("LOGIN_ID_TYPE <", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID_TYPE <=", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeLike(String value) {
            addCriterion("LOGIN_ID_TYPE like", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeNotLike(String value) {
            addCriterion("LOGIN_ID_TYPE not like", value, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeIn(List<String> values) {
            addCriterion("LOGIN_ID_TYPE in", values, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeNotIn(List<String> values) {
            addCriterion("LOGIN_ID_TYPE not in", values, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeBetween(String value1, String value2) {
            addCriterion("LOGIN_ID_TYPE between", value1, value2, "loginIdType");
            return (Criteria) this;
        }

        public Criteria andLoginIdTypeNotBetween(String value1, String value2) {
            addCriterion("LOGIN_ID_TYPE not between", value1, value2, "loginIdType");
            return (Criteria) this;
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