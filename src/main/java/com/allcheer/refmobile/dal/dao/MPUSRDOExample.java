package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MPUSRDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPUSRDOExample() {
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

        public Criteria andUsrStatIsNull() {
            addCriterion("USR_STAT is null");
            return (Criteria) this;
        }

        public Criteria andUsrStatIsNotNull() {
            addCriterion("USR_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andUsrStatEqualTo(String value) {
            addCriterion("USR_STAT =", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotEqualTo(String value) {
            addCriterion("USR_STAT <>", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatGreaterThan(String value) {
            addCriterion("USR_STAT >", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatGreaterThanOrEqualTo(String value) {
            addCriterion("USR_STAT >=", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatLessThan(String value) {
            addCriterion("USR_STAT <", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatLessThanOrEqualTo(String value) {
            addCriterion("USR_STAT <=", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatLike(String value) {
            addCriterion("USR_STAT like", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotLike(String value) {
            addCriterion("USR_STAT not like", value, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatIn(List<String> values) {
            addCriterion("USR_STAT in", values, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotIn(List<String> values) {
            addCriterion("USR_STAT not in", values, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatBetween(String value1, String value2) {
            addCriterion("USR_STAT between", value1, value2, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrStatNotBetween(String value1, String value2) {
            addCriterion("USR_STAT not between", value1, value2, "usrStat");
            return (Criteria) this;
        }

        public Criteria andUsrPassIsNull() {
            addCriterion("USR_PASS is null");
            return (Criteria) this;
        }

        public Criteria andUsrPassIsNotNull() {
            addCriterion("USR_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPassEqualTo(String value) {
            addCriterion("USR_PASS =", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassNotEqualTo(String value) {
            addCriterion("USR_PASS <>", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassGreaterThan(String value) {
            addCriterion("USR_PASS >", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassGreaterThanOrEqualTo(String value) {
            addCriterion("USR_PASS >=", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassLessThan(String value) {
            addCriterion("USR_PASS <", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassLessThanOrEqualTo(String value) {
            addCriterion("USR_PASS <=", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassLike(String value) {
            addCriterion("USR_PASS like", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassNotLike(String value) {
            addCriterion("USR_PASS not like", value, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassIn(List<String> values) {
            addCriterion("USR_PASS in", values, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassNotIn(List<String> values) {
            addCriterion("USR_PASS not in", values, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassBetween(String value1, String value2) {
            addCriterion("USR_PASS between", value1, value2, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrPassNotBetween(String value1, String value2) {
            addCriterion("USR_PASS not between", value1, value2, "usrPass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassIsNull() {
            addCriterion("USR_TXPASS is null");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassIsNotNull() {
            addCriterion("USR_TXPASS is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassEqualTo(String value) {
            addCriterion("USR_TXPASS =", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassNotEqualTo(String value) {
            addCriterion("USR_TXPASS <>", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassGreaterThan(String value) {
            addCriterion("USR_TXPASS >", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassGreaterThanOrEqualTo(String value) {
            addCriterion("USR_TXPASS >=", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassLessThan(String value) {
            addCriterion("USR_TXPASS <", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassLessThanOrEqualTo(String value) {
            addCriterion("USR_TXPASS <=", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassLike(String value) {
            addCriterion("USR_TXPASS like", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassNotLike(String value) {
            addCriterion("USR_TXPASS not like", value, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassIn(List<String> values) {
            addCriterion("USR_TXPASS in", values, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassNotIn(List<String> values) {
            addCriterion("USR_TXPASS not in", values, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassBetween(String value1, String value2) {
            addCriterion("USR_TXPASS between", value1, value2, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andUsrTxpassNotBetween(String value1, String value2) {
            addCriterion("USR_TXPASS not between", value1, value2, "usrTxpass");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmIsNull() {
            addCriterion("LST_SCUU_LOGIN_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmIsNotNull() {
            addCriterion("LST_SCUU_LOGIN_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmEqualTo(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM =", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmNotEqualTo(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM <>", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmGreaterThan(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM >", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmGreaterThanOrEqualTo(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM >=", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmLessThan(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM <", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmLessThanOrEqualTo(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM <=", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmLike(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM like", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmNotLike(String value) {
            addCriterion("LST_SCUU_LOGIN_DTTM not like", value, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmIn(List<String> values) {
            addCriterion("LST_SCUU_LOGIN_DTTM in", values, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmNotIn(List<String> values) {
            addCriterion("LST_SCUU_LOGIN_DTTM not in", values, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmBetween(String value1, String value2) {
            addCriterion("LST_SCUU_LOGIN_DTTM between", value1, value2, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstScuuLoginDttmNotBetween(String value1, String value2) {
            addCriterion("LST_SCUU_LOGIN_DTTM not between", value1, value2, "lstScuuLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmIsNull() {
            addCriterion("LST_FAIL_LOGIN_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmIsNotNull() {
            addCriterion("LST_FAIL_LOGIN_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmEqualTo(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM =", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmNotEqualTo(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM <>", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmGreaterThan(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM >", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmGreaterThanOrEqualTo(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM >=", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmLessThan(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM <", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmLessThanOrEqualTo(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM <=", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmLike(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM like", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmNotLike(String value) {
            addCriterion("LST_FAIL_LOGIN_DTTM not like", value, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmIn(List<String> values) {
            addCriterion("LST_FAIL_LOGIN_DTTM in", values, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmNotIn(List<String> values) {
            addCriterion("LST_FAIL_LOGIN_DTTM not in", values, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmBetween(String value1, String value2) {
            addCriterion("LST_FAIL_LOGIN_DTTM between", value1, value2, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andLstFailLoginDttmNotBetween(String value1, String value2) {
            addCriterion("LST_FAIL_LOGIN_DTTM not between", value1, value2, "lstFailLoginDttm");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntIsNull() {
            addCriterion("FAIL_LOGIN_CNT is null");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntIsNotNull() {
            addCriterion("FAIL_LOGIN_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntEqualTo(BigDecimal value) {
            addCriterion("FAIL_LOGIN_CNT =", value, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntNotEqualTo(BigDecimal value) {
            addCriterion("FAIL_LOGIN_CNT <>", value, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntGreaterThan(BigDecimal value) {
            addCriterion("FAIL_LOGIN_CNT >", value, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_LOGIN_CNT >=", value, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntLessThan(BigDecimal value) {
            addCriterion("FAIL_LOGIN_CNT <", value, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_LOGIN_CNT <=", value, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntIn(List<BigDecimal> values) {
            addCriterion("FAIL_LOGIN_CNT in", values, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntNotIn(List<BigDecimal> values) {
            addCriterion("FAIL_LOGIN_CNT not in", values, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_LOGIN_CNT between", value1, value2, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andFailLoginCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_LOGIN_CNT not between", value1, value2, "failLoginCnt");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmIsNull() {
            addCriterion("LST_UPD_PWD_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmIsNotNull() {
            addCriterion("LST_UPD_PWD_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmEqualTo(String value) {
            addCriterion("LST_UPD_PWD_DTTM =", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmNotEqualTo(String value) {
            addCriterion("LST_UPD_PWD_DTTM <>", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmGreaterThan(String value) {
            addCriterion("LST_UPD_PWD_DTTM >", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmGreaterThanOrEqualTo(String value) {
            addCriterion("LST_UPD_PWD_DTTM >=", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmLessThan(String value) {
            addCriterion("LST_UPD_PWD_DTTM <", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmLessThanOrEqualTo(String value) {
            addCriterion("LST_UPD_PWD_DTTM <=", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmLike(String value) {
            addCriterion("LST_UPD_PWD_DTTM like", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmNotLike(String value) {
            addCriterion("LST_UPD_PWD_DTTM not like", value, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmIn(List<String> values) {
            addCriterion("LST_UPD_PWD_DTTM in", values, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmNotIn(List<String> values) {
            addCriterion("LST_UPD_PWD_DTTM not in", values, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmBetween(String value1, String value2) {
            addCriterion("LST_UPD_PWD_DTTM between", value1, value2, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdPwdDttmNotBetween(String value1, String value2) {
            addCriterion("LST_UPD_PWD_DTTM not between", value1, value2, "lstUpdPwdDttm");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassIsNull() {
            addCriterion("IS_FORCE_UPD_PASS is null");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassIsNotNull() {
            addCriterion("IS_FORCE_UPD_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassEqualTo(String value) {
            addCriterion("IS_FORCE_UPD_PASS =", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassNotEqualTo(String value) {
            addCriterion("IS_FORCE_UPD_PASS <>", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassGreaterThan(String value) {
            addCriterion("IS_FORCE_UPD_PASS >", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FORCE_UPD_PASS >=", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassLessThan(String value) {
            addCriterion("IS_FORCE_UPD_PASS <", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassLessThanOrEqualTo(String value) {
            addCriterion("IS_FORCE_UPD_PASS <=", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassLike(String value) {
            addCriterion("IS_FORCE_UPD_PASS like", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassNotLike(String value) {
            addCriterion("IS_FORCE_UPD_PASS not like", value, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassIn(List<String> values) {
            addCriterion("IS_FORCE_UPD_PASS in", values, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassNotIn(List<String> values) {
            addCriterion("IS_FORCE_UPD_PASS not in", values, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassBetween(String value1, String value2) {
            addCriterion("IS_FORCE_UPD_PASS between", value1, value2, "isForceUpdPass");
            return (Criteria) this;
        }

        public Criteria andIsForceUpdPassNotBetween(String value1, String value2) {
            addCriterion("IS_FORCE_UPD_PASS not between", value1, value2, "isForceUpdPass");
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

        public Criteria andIsBindCardIsNull() {
            addCriterion("IS_BIND_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIsBindCardIsNotNull() {
            addCriterion("IS_BIND_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindCardEqualTo(String value) {
            addCriterion("IS_BIND_CARD =", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardNotEqualTo(String value) {
            addCriterion("IS_BIND_CARD <>", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardGreaterThan(String value) {
            addCriterion("IS_BIND_CARD >", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BIND_CARD >=", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardLessThan(String value) {
            addCriterion("IS_BIND_CARD <", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardLessThanOrEqualTo(String value) {
            addCriterion("IS_BIND_CARD <=", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardLike(String value) {
            addCriterion("IS_BIND_CARD like", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardNotLike(String value) {
            addCriterion("IS_BIND_CARD not like", value, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardIn(List<String> values) {
            addCriterion("IS_BIND_CARD in", values, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardNotIn(List<String> values) {
            addCriterion("IS_BIND_CARD not in", values, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardBetween(String value1, String value2) {
            addCriterion("IS_BIND_CARD between", value1, value2, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andIsBindCardNotBetween(String value1, String value2) {
            addCriterion("IS_BIND_CARD not between", value1, value2, "isBindCard");
            return (Criteria) this;
        }

        public Criteria andUsrMobileIsNull() {
            addCriterion("USR_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUsrMobileIsNotNull() {
            addCriterion("USR_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrMobileEqualTo(String value) {
            addCriterion("USR_MOBILE =", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileNotEqualTo(String value) {
            addCriterion("USR_MOBILE <>", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileGreaterThan(String value) {
            addCriterion("USR_MOBILE >", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileGreaterThanOrEqualTo(String value) {
            addCriterion("USR_MOBILE >=", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileLessThan(String value) {
            addCriterion("USR_MOBILE <", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileLessThanOrEqualTo(String value) {
            addCriterion("USR_MOBILE <=", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileLike(String value) {
            addCriterion("USR_MOBILE like", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileNotLike(String value) {
            addCriterion("USR_MOBILE not like", value, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileIn(List<String> values) {
            addCriterion("USR_MOBILE in", values, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileNotIn(List<String> values) {
            addCriterion("USR_MOBILE not in", values, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileBetween(String value1, String value2) {
            addCriterion("USR_MOBILE between", value1, value2, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andUsrMobileNotBetween(String value1, String value2) {
            addCriterion("USR_MOBILE not between", value1, value2, "usrMobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphIsNull() {
            addCriterion("USR_HEAD_FLPH is null");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphIsNotNull() {
            addCriterion("USR_HEAD_FLPH is not null");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphEqualTo(String value) {
            addCriterion("USR_HEAD_FLPH =", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphNotEqualTo(String value) {
            addCriterion("USR_HEAD_FLPH <>", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphGreaterThan(String value) {
            addCriterion("USR_HEAD_FLPH >", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphGreaterThanOrEqualTo(String value) {
            addCriterion("USR_HEAD_FLPH >=", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphLessThan(String value) {
            addCriterion("USR_HEAD_FLPH <", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphLessThanOrEqualTo(String value) {
            addCriterion("USR_HEAD_FLPH <=", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphLike(String value) {
            addCriterion("USR_HEAD_FLPH like", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphNotLike(String value) {
            addCriterion("USR_HEAD_FLPH not like", value, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphIn(List<String> values) {
            addCriterion("USR_HEAD_FLPH in", values, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphNotIn(List<String> values) {
            addCriterion("USR_HEAD_FLPH not in", values, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphBetween(String value1, String value2) {
            addCriterion("USR_HEAD_FLPH between", value1, value2, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andUsrHeadFlphNotBetween(String value1, String value2) {
            addCriterion("USR_HEAD_FLPH not between", value1, value2, "usrHeadFlph");
            return (Criteria) this;
        }

        public Criteria andTxpassStatIsNull() {
            addCriterion("TXPASS_STAT is null");
            return (Criteria) this;
        }

        public Criteria andTxpassStatIsNotNull() {
            addCriterion("TXPASS_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andTxpassStatEqualTo(String value) {
            addCriterion("TXPASS_STAT =", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatNotEqualTo(String value) {
            addCriterion("TXPASS_STAT <>", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatGreaterThan(String value) {
            addCriterion("TXPASS_STAT >", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatGreaterThanOrEqualTo(String value) {
            addCriterion("TXPASS_STAT >=", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatLessThan(String value) {
            addCriterion("TXPASS_STAT <", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatLessThanOrEqualTo(String value) {
            addCriterion("TXPASS_STAT <=", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatLike(String value) {
            addCriterion("TXPASS_STAT like", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatNotLike(String value) {
            addCriterion("TXPASS_STAT not like", value, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatIn(List<String> values) {
            addCriterion("TXPASS_STAT in", values, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatNotIn(List<String> values) {
            addCriterion("TXPASS_STAT not in", values, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatBetween(String value1, String value2) {
            addCriterion("TXPASS_STAT between", value1, value2, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andTxpassStatNotBetween(String value1, String value2) {
            addCriterion("TXPASS_STAT not between", value1, value2, "txpassStat");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntIsNull() {
            addCriterion("FAILS_TXPASS_CNT is null");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntIsNotNull() {
            addCriterion("FAILS_TXPASS_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntEqualTo(BigDecimal value) {
            addCriterion("FAILS_TXPASS_CNT =", value, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntNotEqualTo(BigDecimal value) {
            addCriterion("FAILS_TXPASS_CNT <>", value, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntGreaterThan(BigDecimal value) {
            addCriterion("FAILS_TXPASS_CNT >", value, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILS_TXPASS_CNT >=", value, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntLessThan(BigDecimal value) {
            addCriterion("FAILS_TXPASS_CNT <", value, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILS_TXPASS_CNT <=", value, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntIn(List<BigDecimal> values) {
            addCriterion("FAILS_TXPASS_CNT in", values, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntNotIn(List<BigDecimal> values) {
            addCriterion("FAILS_TXPASS_CNT not in", values, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILS_TXPASS_CNT between", value1, value2, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andFailsTxpassCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILS_TXPASS_CNT not between", value1, value2, "failsTxpassCnt");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmIsNull() {
            addCriterion("LST_UPD_TXPWD_DTTM is null");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmIsNotNull() {
            addCriterion("LST_UPD_TXPWD_DTTM is not null");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmEqualTo(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM =", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmNotEqualTo(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM <>", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmGreaterThan(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM >", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmGreaterThanOrEqualTo(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM >=", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmLessThan(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM <", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmLessThanOrEqualTo(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM <=", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmLike(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM like", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmNotLike(String value) {
            addCriterion("LST_UPD_TXPWD_DTTM not like", value, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmIn(List<String> values) {
            addCriterion("LST_UPD_TXPWD_DTTM in", values, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmNotIn(List<String> values) {
            addCriterion("LST_UPD_TXPWD_DTTM not in", values, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmBetween(String value1, String value2) {
            addCriterion("LST_UPD_TXPWD_DTTM between", value1, value2, "lstUpdTxpwdDttm");
            return (Criteria) this;
        }

        public Criteria andLstUpdTxpwdDttmNotBetween(String value1, String value2) {
            addCriterion("LST_UPD_TXPWD_DTTM not between", value1, value2, "lstUpdTxpwdDttm");
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