package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;

public class MPMERAPLHTRDO {
    private String memberId;

    private BigDecimal applayNo;

    private BigDecimal seqNo;

    private String archFlph01;

    private String archFlph02;

    private String archFlph03;

    private String archFlph04;

    private String procDate;

    private String procTime;

    private String tellerId;

    private String approveStat;

    private String procDesc;

    private String recCretDttm;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public BigDecimal getApplayNo() {
        return applayNo;
    }

    public void setApplayNo(BigDecimal applayNo) {
        this.applayNo = applayNo;
    }

    public BigDecimal getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
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

    public String getProcDate() {
        return procDate;
    }

    public void setProcDate(String procDate) {
        this.procDate = procDate == null ? null : procDate.trim();
    }

    public String getProcTime() {
        return procTime;
    }

    public void setProcTime(String procTime) {
        this.procTime = procTime == null ? null : procTime.trim();
    }

    public String getTellerId() {
        return tellerId;
    }

    public void setTellerId(String tellerId) {
        this.tellerId = tellerId == null ? null : tellerId.trim();
    }

    public String getApproveStat() {
        return approveStat;
    }

    public void setApproveStat(String approveStat) {
        this.approveStat = approveStat == null ? null : approveStat.trim();
    }

    public String getProcDesc() {
        return procDesc;
    }

    public void setProcDesc(String procDesc) {
        this.procDesc = procDesc == null ? null : procDesc.trim();
    }

    public String getRecCretDttm() {
        return recCretDttm;
    }

    public void setRecCretDttm(String recCretDttm) {
        this.recCretDttm = recCretDttm == null ? null : recCretDttm.trim();
    }
}