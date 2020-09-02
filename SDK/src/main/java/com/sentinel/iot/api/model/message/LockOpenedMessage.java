package com.sentinel.iot.api.model.message;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class LockOpenedMessage {
    private String lockId;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    @Override
    public String toString() {
        return "LockOpenedMessage{" +
                "lockId='" + lockId + '\'' +
                '}';
    }
}
