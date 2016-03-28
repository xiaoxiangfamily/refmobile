package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;

public class MPUSRDO {
    private String memberId;

    private String usrStat;

    private String usrPass;

    private String usrTxpass;

    private String lstScuuLoginDttm;

    private String lstFailLoginDttm;

    private BigDecimal failLoginCnt;

    private String lstUpdPwdDttm;

    private String isForceUpdPass;

    private String isVerifyId;

    private String isBindCard;

    private String usrMobile;

    private String email;

    private String usrHeadFlph;

    private String txpassStat;

    private BigDecimal failsTxpassCnt;

    private String lstUpdTxpwdDttm;

    private String recCretDttm;

    private String lstUpdDttm;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getUsrStat() {
        return usrStat;
    }

    public void setUsrStat(String usrStat) {
        this.usrStat = usrStat == null ? null : usrStat.trim();
    }

    public String getUsrPass() {
        return usrPass;
    }

    public void setUsrPass(String usrPass) {
        this.usrPass = usrPass == null ? null : usrPass.trim();
    }

    public String getUsrTxpass() {
        return usrTxpass;
    }

    public void setUsrTxpass(String usrTxpass) {
        this.usrTxpass = usrTxpass == null ? null : usrTxpass.trim();
    }

    public String getLstScuuLoginDttm() {
        return lstScuuLoginDttm;
    }

    public void setLstScuuLoginDttm(String lstScuuLoginDttm) {
        this.lstScuuLoginDttm = lstScuuLoginDttm == null ? null : lstScuuLoginDttm.trim();
    }

    public String getLstFailLoginDttm() {
        return lstFailLoginDttm;
    }

    public void setLstFailLoginDttm(String lstFailLoginDttm) {
        this.lstFailLoginDttm = lstFailLoginDttm == null ? null : lstFailLoginDttm.trim();
    }

    public BigDecimal getFailLoginCnt() {
        return failLoginCnt;
    }

    public void setFailLoginCnt(BigDecimal failLoginCnt) {
        this.failLoginCnt = failLoginCnt;
    }

    public String getLstUpdPwdDttm() {
        return lstUpdPwdDttm;
    }

    public void setLstUpdPwdDttm(String lstUpdPwdDttm) {
        this.lstUpdPwdDttm = lstUpdPwdDttm == null ? null : lstUpdPwdDttm.trim();
    }

    public String getIsForceUpdPass() {
        return isForceUpdPass;
    }

    public void setIsForceUpdPass(String isForceUpdPass) {
        this.isForceUpdPass = isForceUpdPass == null ? null : isForceUpdPass.trim();
    }

    public String getIsVerifyId() {
        return isVerifyId;
    }

    public void setIsVerifyId(String isVerifyId) {
        this.isVerifyId = isVerifyId == null ? null : isVerifyId.trim();
    }

    public String getIsBindCard() {
        return isBindCard;
    }

    public void setIsBindCard(String isBindCard) {
        this.isBindCard = isBindCard == null ? null : isBindCard.trim();
    }

    public String getUsrMobile() {
        return usrMobile;
    }

    public void setUsrMobile(String usrMobile) {
        this.usrMobile = usrMobile == null ? null : usrMobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsrHeadFlph() {
        return usrHeadFlph;
    }

    public void setUsrHeadFlph(String usrHeadFlph) {
        this.usrHeadFlph = usrHeadFlph == null ? null : usrHeadFlph.trim();
    }

    public String getTxpassStat() {
        return txpassStat;
    }

    public void setTxpassStat(String txpassStat) {
        this.txpassStat = txpassStat == null ? null : txpassStat.trim();
    }

    public BigDecimal getFailsTxpassCnt() {
        return failsTxpassCnt;
    }

    public void setFailsTxpassCnt(BigDecimal failsTxpassCnt) {
        this.failsTxpassCnt = failsTxpassCnt;
    }

    public String getLstUpdTxpwdDttm() {
        return lstUpdTxpwdDttm;
    }

    public void setLstUpdTxpwdDttm(String lstUpdTxpwdDttm) {
        this.lstUpdTxpwdDttm = lstUpdTxpwdDttm == null ? null : lstUpdTxpwdDttm.trim();
    }

    public String getRecCretDttm() {
        return recCretDttm;
    }

    public void setRecCretDttm(String recCretDttm) {
        this.recCretDttm = recCretDttm == null ? null : recCretDttm.trim();
    }

    public String getLstUpdDttm() {
        return lstUpdDttm;
    }

    public void setLstUpdDttm(String lstUpdDttm) {
        this.lstUpdDttm = lstUpdDttm == null ? null : lstUpdDttm.trim();
    }
}