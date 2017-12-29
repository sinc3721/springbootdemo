package com.zzx.demo.model;

import java.util.Date;

public class Account {
    private Integer accountId;

    private String name;

    private String password;

    private String secondNo;

    private Date createTime;

    public Integer getAccountId() {
        return accountId;
    }

    public Account setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSecondNo() {
        return secondNo;
    }

    public void setSecondNo(String secondNo) {
        this.secondNo = secondNo == null ? null : secondNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}