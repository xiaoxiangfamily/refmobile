package com.allcheer.refmobile.dal.dao;

public class MPUSRLOGINCTLDOKey {
    private String orgId;

    private String loginId;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }
}