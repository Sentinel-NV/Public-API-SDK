package com.sentinel.iot.api.model.message;
import java.util.List;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class LockUnboundMessage {

    List<String> lockIds;

    public List<String> getLockIds() {
        return lockIds;
    }

    public void setLockIds(List<String> lockIds) {
        this.lockIds = lockIds;
    }

    @Override
    public String toString() {
        return "LockUnboundMessage{" +
                "lockIds=" + lockIds +
                '}';
    }
}
