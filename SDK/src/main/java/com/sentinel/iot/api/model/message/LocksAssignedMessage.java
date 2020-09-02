package com.sentinel.iot.api.model.message;

import com.sentinel.iot.api.model.Device;

import java.util.List;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class LocksAssignedMessage {
    List<Device> locks;

    public List<Device> getLocks() {
        return locks;
    }

    public void setLocks(List<Device> locks) {
        this.locks = locks;
    }

    @Override
    public String toString() {
        return "LocksAssignedMessage{" +
                "locks=" + locks +
                '}';
    }
}
