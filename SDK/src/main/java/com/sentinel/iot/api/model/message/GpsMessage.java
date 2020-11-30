package com.sentinel.iot.api.model.message;

import java.util.Date;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class GpsMessage {
    private String lockId;
    private Double longitude;
    private Double latitude;
    private Date reportTime;
    private String tripUUID;
    private Integer lockStatus;


    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getTripUUID() {
        return tripUUID;
    }

    public void setTripUUID(String tripUUID) {
        this.tripUUID = tripUUID;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Override
    public String toString() {
        return "GpsMessage{" +
                "lockId='" + lockId + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", reportTime=" + reportTime +
                ", tripUUID='" + tripUUID + '\'' +
                ", lockStatus=" + lockStatus +
                '}';
    }
}
