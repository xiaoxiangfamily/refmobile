package com.allcheer.refmobile.dal.dao;

import java.math.BigDecimal;

public class MPBANKDOKey {
    private String memberId;

    private BigDecimal seqNo;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public BigDecimal getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }
}