package com.sentinel.iot.api.model.message;

import java.util.List;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class ReadCardMessage {
    private String lockId;

    /**
     * Type A or Type B
     */
    private String cardType;

    private List<String> tagNumberList;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public List<String> getTagNumberList() {
        return tagNumberList;
    }

    public void setTagNumberList(List<String> tagNumberList) {
        this.tagNumberList = tagNumberList;
    }

    @Override
    public String toString() {
        return "ReadCardMessage{" +
                "lockId='" + lockId + '\'' +
                ", cardType='" + cardType + '\'' +
                ", tagNumberList=" + tagNumberList +
                '}';
    }
}
