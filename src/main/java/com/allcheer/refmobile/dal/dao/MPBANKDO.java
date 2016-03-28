package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;

public class MPBANKDO extends MPBANKDOKey {
    private BigDecimal signType;

    private String signStat;

    private String isDefault;

    private String bankId;

    private String pbankId;

    private String bankBranchName;

    private String bankProvName;

    private String bankCityName;

    private String bankAcctId;

    private String bankAcctName;

    private String bankMobile;

    private String isPrivate;

    private String recCretDttm;

    private String lstUpdDttm;

    public BigDecimal getSignType() {
        return signType;
    }

    public void setSignType(BigDecimal signType) {
        this.signType = signType;
    }

    public String getSignStat() {
        return signStat;
    }

    public void setSignStat(String signStat) {
        this.signStat = signStat == null ? null : signStat.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getPbankId() {
        return pbankId;
    }

    public void setPbankId(String pbankId) {
        this.pbankId = pbankId == null ? null : pbankId.trim();
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName == null ? null : bankBranchName.trim();
    }

    public String getBankProvName() {
        return bankProvName;
    }

    public void setBankProvName(String bankProvName) {
        this.bankProvName = bankProvName == null ? null : bankProvName.trim();
    }

    public String getBankCityName() {
        return bankCityName;
    }

    public void setBankCityName(String bankCityName) {
        this.bankCityName = bankCityName == null ? null : bankCityName.trim();
    }

    public String getBankAcctId() {
        return bankAcctId;
    }

    public void setBankAcctId(String bankAcctId) {
        this.bankAcctId = bankAcctId == null ? null : bankAcctId.trim();
    }

    public String getBankAcctName() {
        return bankAcctName;
    }

    public void setBankAcctName(String bankAcctName) {
        this.bankAcctName = bankAcctName == null ? null : bankAcctName.trim();
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile == null ? null : bankMobile.trim();
    }

    public String getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate == null ? null : isPrivate.trim();
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