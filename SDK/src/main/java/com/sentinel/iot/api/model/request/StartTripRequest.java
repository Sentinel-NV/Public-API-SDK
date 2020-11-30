package com.sentinel.iot.api.model.request;

import com.sentinel.iot.api.model.CommandValidPeriod;

import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright Sentinel NV
 * @Author: Bob Jiang
 * @Date: 2020/9/27 14:01
 * @Description:
 */
public class StartTripRequest extends CommandValidPeriod {

    private String lockId;

    private String tripUUID;

    private String rfidCardId;

    private Integer reportGpsCycle;

    public StartTripRequest() {
    }

    public StartTripRequest(String lockId, String tripUUID, String rfidCardId, Integer reportGpsCycle) {
        this.lockId = lockId;
        this.tripUUID = tripUUID;
        this.rfidCardId = rfidCardId;
        this.reportGpsCycle = reportGpsCycle;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getTripUUID() {
        return tripUUID;
    }

    public void setTripUUID(String tripUUID) {
        this.tripUUID = tripUUID;
    }

    public String getRfidCardId() {
        return rfidCardId;
    }

    public void setRfidCardId(String rfidCardId) {
        this.rfidCardId = rfidCardId;
    }

    public Integer getReportGpsCycle() {
        return reportGpsCycle;
    }

    public void setReportGpsCycle(Integer reportGpsCycle) {
        this.reportGpsCycle = reportGpsCycle;
    }

    public Map<String, Object> buildParameter() {
        Map<String, Object> parameterMap = new HashMap<>(6);
        parameterMap.put("lockId", lockId);
        parameterMap.put("tripUUID", getTripUUID());
        parameterMap.put("rfidCardId", getRfidCardId());
        parameterMap.put("reportGpsCycle", getReportGpsCycle());
        super.buildParameter(parameterMap);
        return parameterMap;
    }

    @Override
    public String toString() {
        return "StartTripRequest{" +
                "lockId='" + lockId + '\'' +
                ", tripUUID='" + tripUUID + '\'' +
                ", rfidCardId='" + rfidCardId + '\'' +
                ", reportGpsCycle=" + reportGpsCycle +
                "} " + super.toString();
    }
}
