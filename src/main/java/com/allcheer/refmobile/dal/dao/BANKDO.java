package com.allcheer.refmobile.dal.dao;

public class BANKDO {
    private String bankId;

    private String bankStat;

    private String bankName;

    private String bankShortName;

    private String isVerifyId;

    private String isWithhold;

    private String isCash;

    private String isCredit;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getBankStat() {
        return bankStat;
    }

    public void setBankStat(String bankStat) {
        this.bankStat = bankStat == null ? null : bankStat.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankShortName() {
        return bankShortName;
    }

    public void setBankShortName(String bankShortName) {
        this.bankShortName = bankShortName == null ? null : bankShortName.trim();
    }

    public String getIsVerifyId() {
        return isVerifyId;
    }

    public void setIsVerifyId(String isVerifyId) {
        this.isVerifyId = isVerifyId == null ? null : isVerifyId.trim();
    }

    public String getIsWithhold() {
        return isWithhold;
    }

    public void setIsWithhold(String isWithhold) {
        this.isWithhold = isWithhold == null ? null : isWithhold.trim();
    }

    public String getIsCash() {
        return isCash;
    }

    public void setIsCash(String isCash) {
        this.isCash = isCash == null ? null : isCash.trim();
    }

    public String getIsCredit() {
        return isCredit;
    }

    public void setIsCredit(String isCredit) {
        this.isCredit = isCredit == null ? null : isCredit.trim();
    }
}