package com.sentinel.iot.api.model;

import java.util.Date;
import java.util.Map;

/**
 * @Copyright Sentinel NV
 * @Author: Yang Zhen
 * @Date: 2020/11/18
 * @Description:
 */
public class CommandValidPeriod {

    /**
     * This parameter can be empty, when it is empty, take the current time
     */
    private Date validStartTime;

    private Date validEndTime;

    public Date getValidStartTime() {
        return validStartTime;
    }

    public CommandValidPeriod setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
        return this;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public CommandValidPeriod setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
        return this;
    }

    public void buildParameter(Map<String, Object> parameterMap) {
        if (validStartTime != null) {
            parameterMap.put("validStartTime", validStartTime);
        }
        if (validEndTime != null) {
            parameterMap.put("validEndTime", validEndTime);
        }
    }

    @Override
    public String toString() {
        return "CommandValidPeriod{" +
                "validStartTime=" + validStartTime +
                ", validEndTime=" + validEndTime +
                '}';
    }
}
