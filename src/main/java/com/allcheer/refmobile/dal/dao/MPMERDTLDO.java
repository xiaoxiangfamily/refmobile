package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;

public class MPMERDTLDO {
    private String memberId;

    private String merchName;

    private String merchShortName;

    private String oemId;

    private String agentId;

    private String legalName;

    private String idType;

    private String idNo;

    private String signDate;

    private String approveFlag;

    private String archFlph01;

    private String archFlph02;

    private String archFlph03;

    private String archFlph04;

    private BigDecimal nextBankSeq;

    private BigDecimal nextApplySeq;

    private BigDecimal nextTermSeq;

    private String tellerId;

    private String recCretDttm;

    private String lstUpdDttm;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMerchName() {
        return merchName;
    }

    public void setMerchName(String merchName) {
        this.merchName = merchName == null ? null : merchName.trim();
    }

    public String getMerchShortName() {
        return merchShortName;
    }

    public void setMerchShortName(String merchShortName) {
        this.merchShortName = merchShortName == null ? null : merchShortName.trim();
    }

    public String getOemId() {
        return oemId;
    }

    public void setOemId(String oemId) {
        this.oemId = oemId == null ? null : oemId.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate == null ? null : signDate.trim();
    }

    public String getApproveFlag() {
        return approveFlag;
    }

    public void setApproveFlag(String approveFlag) {
        this.approveFlag = approveFlag == null ? null : approveFlag.trim();
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

    public BigDecimal getNextBankSeq() {
        return nextBankSeq;
    }

    public void setNextBankSeq(BigDecimal nextBankSeq) {
        this.nextBankSeq = nextBankSeq;
    }

    public BigDecimal getNextApplySeq() {
        return nextApplySeq;
    }

    public void setNextApplySeq(BigDecimal nextApplySeq) {
        this.nextApplySeq = nextApplySeq;
    }

    public BigDecimal getNextTermSeq() {
        return nextTermSeq;
    }

    public void setNextTermSeq(BigDecimal nextTermSeq) {
        this.nextTermSeq = nextTermSeq;
    }

    public String getTellerId() {
        return tellerId;
    }

    public void setTellerId(String tellerId) {
        this.tellerId = tellerId == null ? null : tellerId.trim();
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