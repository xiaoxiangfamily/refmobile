package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;

public class MPMERAPPLYDO extends MPMERAPPLYDOKey {
    private String applyStat;

    private String approveStat;

    private String applyDate;

    private String applyTime;

    private String archFlph01;

    private String archFlph02;

    private String archFlph03;

    private String archFlph04;

    private BigDecimal nextApplyhtrSeq;

    private String recCretDttm;

    private String lstUpdDttm;

    private String usrLstUpdDttm;

    private String mngLstUpdDttm;

    public String getApplyStat() {
        return applyStat;
    }

    public void setApplyStat(String applyStat) {
        this.applyStat = applyStat == null ? null : applyStat.trim();
    }

    public String getApproveStat() {
        return approveStat;
    }

    public void setApproveStat(String approveStat) {
        this.approveStat = approveStat == null ? null : approveStat.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public String getArchFlph01() {
        return archFlph01;
    }

    public void setArchFlph01(String archFlph01) {
        this.archFlph01 = archFlph01 == null ? null : archFlph01.trim();
    }

    public String getArchFlph02() {
        return archFlph02;
    }

    public void setArchFlph02(String archFlph02) {
        this.archFlph02 = archFlph02 == null ? null : archFlph02.trim();
    }

    public String getArchFlph03() {
        return archFlph03;
    }

    public void setArchFlph03(String archFlph03) {
        this.archFlph03 = archFlph03 == null ? null : archFlph03.trim();
    }

    public String getArchFlph04() {
        return archFlph04;
    }

    public void setArchFlph04(String archFlph04) {
        this.archFlph04 = archFlph04 == null ? null : archFlph04.trim();
    }

    public BigDecimal getNextApplyhtrSeq() {
        return nextApplyhtrSeq;
    }

    public void setNextApplyhtrSeq(BigDecimal nextApplyhtrSeq) {
        this.nextApplyhtrSeq = nextApplyhtrSeq;
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

    public String getUsrLstUpdDttm() {
        return usrLstUpdDttm;
    }

    public void setUsrLstUpdDttm(String usrLstUpdDttm) {
        this.usrLstUpdDttm = usrLstUpdDttm == null ? null : usrLstUpdDttm.trim();
    }

    public String getMngLstUpdDttm() {
        return mngLstUpdDttm;
    }

    public void setMngLstUpdDttm(String mngLstUpdDttm) {
        this.mngLstUpdDttm = mngLstUpdDttm == null ? null : mngLstUpdDttm.trim();
    }
}