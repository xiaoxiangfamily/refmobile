package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;

public class MPMERAPPLYDOKey {
    private String memberId;

    private BigDecimal applyNo;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public BigDecimal getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(BigDecimal applyNo) {
        this.applyNo = applyNo;
    }
}