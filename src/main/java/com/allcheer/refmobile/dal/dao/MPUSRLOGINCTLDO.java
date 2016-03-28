package com.allcheer.refmobile.dal.dao;

public class MPUSRLOGINCTLDO extends MPUSRLOGINCTLDOKey {
    private String loginIdStat;

    private String loginIdType;

    private String memberId;

    private String recCretDttm;

    private String lstUpdDttm;

    public String getLoginIdStat() {
        return loginIdStat;
    }

    public void setLoginIdStat(String loginIdStat) {
        this.loginIdStat = loginIdStat == null ? null : loginIdStat.trim();
    }

    public String getLoginIdType() {
        return loginIdType;
    }

    public void setLoginIdType(String loginIdType) {
        this.loginIdType = loginIdType == null ? null : loginIdType.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
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