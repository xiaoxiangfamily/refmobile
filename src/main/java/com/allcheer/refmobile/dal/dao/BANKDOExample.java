package com.allcheer.refmobile.dal.dao;

import java.util.ArrayList;
import java.util.List;

public class BANKDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BANKDOExample() {
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

        public Criteria andBankStatIsNull() {
            addCriterion("BANK_STAT is null");
            return (Criteria) this;
        }

        public Criteria andBankStatIsNotNull() {
            addCriterion("BANK_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andBankStatEqualTo(String value) {
            addCriterion("BANK_STAT =", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatNotEqualTo(String value) {
            addCriterion("BANK_STAT <>", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatGreaterThan(String value) {
            addCriterion("BANK_STAT >", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_STAT >=", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatLessThan(String value) {
            addCriterion("BANK_STAT <", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatLessThanOrEqualTo(String value) {
            addCriterion("BANK_STAT <=", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatLike(String value) {
            addCriterion("BANK_STAT like", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatNotLike(String value) {
            addCriterion("BANK_STAT not like", value, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatIn(List<String> values) {
            addCriterion("BANK_STAT in", values, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatNotIn(List<String> values) {
            addCriterion("BANK_STAT not in", values, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatBetween(String value1, String value2) {
            addCriterion("BANK_STAT between", value1, value2, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankStatNotBetween(String value1, String value2) {
            addCriterion("BANK_STAT not between", value1, value2, "bankStat");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameIsNull() {
            addCriterion("BANK_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankShortNameIsNotNull() {
            addCriterion("BANK_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankShortNameEqualTo(String value) {
            addCriterion("BANK_SHORT_NAME =", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameNotEqualTo(String value) {
            addCriterion("BANK_SHORT_NAME <>", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameGreaterThan(String value) {
            addCriterion("BANK_SHORT_NAME >", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_SHORT_NAME >=", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameLessThan(String value) {
            addCriterion("BANK_SHORT_NAME <", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_SHORT_NAME <=", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameLike(String value) {
            addCriterion("BANK_SHORT_NAME like", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameNotLike(String value) {
            addCriterion("BANK_SHORT_NAME not like", value, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameIn(List<String> values) {
            addCriterion("BANK_SHORT_NAME in", values, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameNotIn(List<String> values) {
            addCriterion("BANK_SHORT_NAME not in", values, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameBetween(String value1, String value2) {
            addCriterion("BANK_SHORT_NAME between", value1, value2, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andBankShortNameNotBetween(String value1, String value2) {
            addCriterion("BANK_SHORT_NAME not between", value1, value2, "bankShortName");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdIsNull() {
            addCriterion("IS_VERIFY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdIsNotNull() {
            addCriterion("IS_VERIFY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdEqualTo(String value) {
            addCriterion("IS_VERIFY_ID =", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdNotEqualTo(String value) {
            addCriterion("IS_VERIFY_ID <>", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdGreaterThan(String value) {
            addCriterion("IS_VERIFY_ID >", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VERIFY_ID >=", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdLessThan(String value) {
            addCriterion("IS_VERIFY_ID <", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdLessThanOrEqualTo(String value) {
            addCriterion("IS_VERIFY_ID <=", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdLike(String value) {
            addCriterion("IS_VERIFY_ID like", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdNotLike(String value) {
            addCriterion("IS_VERIFY_ID not like", value, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdIn(List<String> values) {
            addCriterion("IS_VERIFY_ID in", values, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdNotIn(List<String> values) {
            addCriterion("IS_VERIFY_ID not in", values, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdBetween(String value1, String value2) {
            addCriterion("IS_VERIFY_ID between", value1, value2, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIdNotBetween(String value1, String value2) {
            addCriterion("IS_VERIFY_ID not between", value1, value2, "isVerifyId");
            return (Criteria) this;
        }

        public Criteria andIsWithholdIsNull() {
            addCriterion("IS_WITHHOLD is null");
            return (Criteria) this;
        }

        public Criteria andIsWithholdIsNotNull() {
            addCriterion("IS_WITHHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andIsWithholdEqualTo(String value) {
            addCriterion("IS_WITHHOLD =", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdNotEqualTo(String value) {
            addCriterion("IS_WITHHOLD <>", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdGreaterThan(String value) {
            addCriterion("IS_WITHHOLD >", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdGreaterThanOrEqualTo(String value) {
            addCriterion("IS_WITHHOLD >=", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdLessThan(String value) {
            addCriterion("IS_WITHHOLD <", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdLessThanOrEqualTo(String value) {
            addCriterion("IS_WITHHOLD <=", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdLike(String value) {
            addCriterion("IS_WITHHOLD like", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdNotLike(String value) {
            addCriterion("IS_WITHHOLD not like", value, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdIn(List<String> values) {
            addCriterion("IS_WITHHOLD in", values, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdNotIn(List<String> values) {
            addCriterion("IS_WITHHOLD not in", values, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdBetween(String value1, String value2) {
            addCriterion("IS_WITHHOLD between", value1, value2, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsWithholdNotBetween(String value1, String value2) {
            addCriterion("IS_WITHHOLD not between", value1, value2, "isWithhold");
            return (Criteria) this;
        }

        public Criteria andIsCashIsNull() {
            addCriterion("IS_CASH is null");
            return (Criteria) this;
        }

        public Criteria andIsCashIsNotNull() {
            addCriterion("IS_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andIsCashEqualTo(String value) {
            addCriterion("IS_CASH =", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashNotEqualTo(String value) {
            addCriterion("IS_CASH <>", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashGreaterThan(String value) {
            addCriterion("IS_CASH >", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CASH >=", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashLessThan(String value) {
            addCriterion("IS_CASH <", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashLessThanOrEqualTo(String value) {
            addCriterion("IS_CASH <=", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashLike(String value) {
            addCriterion("IS_CASH like", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashNotLike(String value) {
            addCriterion("IS_CASH not like", value, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashIn(List<String> values) {
            addCriterion("IS_CASH in", values, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashNotIn(List<String> values) {
            addCriterion("IS_CASH not in", values, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashBetween(String value1, String value2) {
            addCriterion("IS_CASH between", value1, value2, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCashNotBetween(String value1, String value2) {
            addCriterion("IS_CASH not between", value1, value2, "isCash");
            return (Criteria) this;
        }

        public Criteria andIsCreditIsNull() {
            addCriterion("IS_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andIsCreditIsNotNull() {
            addCriterion("IS_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsCreditEqualTo(String value) {
            addCriterion("IS_CREDIT =", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditNotEqualTo(String value) {
            addCriterion("IS_CREDIT <>", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditGreaterThan(String value) {
            addCriterion("IS_CREDIT >", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CREDIT >=", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditLessThan(String value) {
            addCriterion("IS_CREDIT <", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditLessThanOrEqualTo(String value) {
            addCriterion("IS_CREDIT <=", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditLike(String value) {
            addCriterion("IS_CREDIT like", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditNotLike(String value) {
            addCriterion("IS_CREDIT not like", value, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditIn(List<String> values) {
            addCriterion("IS_CREDIT in", values, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditNotIn(List<String> values) {
            addCriterion("IS_CREDIT not in", values, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditBetween(String value1, String value2) {
            addCriterion("IS_CREDIT between", value1, value2, "isCredit");
            return (Criteria) this;
        }

        public Criteria andIsCreditNotBetween(String value1, String value2) {
            addCriterion("IS_CREDIT not between", value1, value2, "isCredit");
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