package com.allcheer.refmobile.dal.dao;

public class MPMEMBDO {
    private String memberId;

    private String memberStat;

    private String memberType;

    private String isSelf;

    private String isVirtual;

    private String isActive;

    private String orgId;

    private String opdate;

    private String clsdate;

    private String acctNo;

    private String acctType;

    private Short nextBankSeq;

    private Short nextApplySeq;

    private Short nextTermSeq;

    private String recCretDttm;

    private String lstUpdDttm;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberStat() {
        return memberStat;
    }

    public void setMemberStat(String memberStat) {
        this.memberStat = memberStat == null ? null : memberStat.trim();
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public String getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(String isSelf) {
        this.isSelf = isSelf == null ? null : isSelf.trim();
    }

    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual == null ? null : isVirtual.trim();
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOpdate() {
        return opdate;
    }

    public void setOpdate(String opdate) {
        this.opdate = opdate == null ? null : opdate.trim();
    }

    public String getClsdate() {
        return clsdate;
    }

    public void setClsdate(String clsdate) {
        this.clsdate = clsdate == null ? null : clsdate.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public Short getNextBankSeq() {
        return nextBankSeq;
    }

    public void setNextBankSeq(Short nextBankSeq) {
        this.nextBankSeq = nextBankSeq;
    }

    public Short getNextApplySeq() {
        return nextApplySeq;
    }

    public void setNextApplySeq(Short nextApplySeq) {
        this.nextApplySeq = nextApplySeq;
    }

    public Short getNextTermSeq() {
        return nextTermSeq;
    }

    public void setNextTermSeq(Short nextTermSeq) {
        this.nextTermSeq = nextTermSeq;
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