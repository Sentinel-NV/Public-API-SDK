package com.sentinel.iot.api.model.message;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class LockOpenedMessage {

    private String lockId;

    /**
     * 0 RFID 1 network
     */
    private Integer openLockVia;

    private String tagNumber;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public Integer getOpenLockVia() {
        return openLockVia;
    }

    public void setOpenLockVia(Integer openLockVia) {
        this.openLockVia = openLockVia;
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    @Override
    public String toString() {
        return "LockOpenedMessage{" +
                "lockId='" + lockId + '\'' +
                ", openLockVia=" + openLockVia +
                ", tagNumber='" + tagNumber + '\'' +
                '}';
    }
}
