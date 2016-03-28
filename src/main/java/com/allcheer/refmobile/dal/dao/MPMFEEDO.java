package com.allcheer.refmobile.dal.dao;

public class MPMFEEDO extends MPMFEEDOKey {
    private String feeStat;

    private String feeFormula;

    private String memberType;

    public String getFeeStat() {
        return feeStat;
    }

    public void setFeeStat(String feeStat) {
        this.feeStat = feeStat == null ? null : feeStat.trim();
    }

    public String getFeeFormula() {
        return feeFormula;
    }

    public void setFeeFormula(String feeFormula) {
        this.feeFormula = feeFormula == null ? null : feeFormula.trim();
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }
}