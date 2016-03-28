package com.allcheer.refmobile.dal.dao;

public class MPMPARAMDO extends MPMPARAMDOKey {
    private String paramStat;

    private String paramValue;

    private String recCretDttm;

    private String lstUpdDttm;

    public String getParamStat() {
        return paramStat;
    }

    public void setParamStat(String paramStat) {
        this.paramStat = paramStat == null ? null : paramStat.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
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