package com.sentinel.iot.api.model.message;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class BackCodeMessage {

    private String lockId;

    private String backCode;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getBackCode() {
        return backCode;
    }

    public void setBackCode(String backCode) {
        this.backCode = backCode;
    }

    @Override
    public String toString() {
        return "BackCodeMessage{" +
                "lockId='" + lockId + '\'' +
                ", backCode='" + backCode + '\'' +
                '}';
    }
}
