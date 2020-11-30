package com.sentinel.iot.api.model;


import java.util.Date;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/24
 * @Description:
 */
public class Device {

    private String lockId;

    /**
     * QR code printed on the lock shell
     */
    private String backCode;

    /**
     * 0 is unlock
     * 1 is locked
     */
    private Integer lockStatus;

    /**
     * network model
     */
    private String network;

    /**
     * The current voltage of the Sentinel lock built-in battery
     */
    private Double voltage;

    /**
     * Percentage of remaining battery power in Sentinel lock
     */
    private Integer voltagePercentage;

    /**
     * Customers can set 4 extension codes according to business needs, Sentinel will not maintain this data.
     */
    private String firstExtCode;

    private String secondExtCode;

    private String thirdExtCode;

    private String fourthExtCode;

    /**
     * The time when the Sentinel lock last reported data
     */
    private Date lastReceivedDataTime;

    /**
     * The last GPS location reported by the Sentinel lock
     */
    private GeoPoint geoPoint;

    /**
     * The time when the Sentinel lock was last charged
     */
    private Date lastChargingTime;

    private String hardwareVersion;

    private String firmwareVersion;

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

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public Integer getVoltagePercentage() {
        return voltagePercentage;
    }

    public void setVoltagePercentage(Integer voltagePercentage) {
        this.voltagePercentage = voltagePercentage;
    }

    public String getFirstExtCode() {
        return firstExtCode;
    }

    public void setFirstExtCode(String firstExtCode) {
        this.firstExtCode = firstExtCode;
    }

    public String getSecondExtCode() {
        return secondExtCode;
    }

    public void setSecondExtCode(String secondExtCode) {
        this.secondExtCode = secondExtCode;
    }

    public String getThirdExtCode() {
        return thirdExtCode;
    }

    public void setThirdExtCode(String thirdExtCode) {
        this.thirdExtCode = thirdExtCode;
    }

    public String getFourthExtCode() {
        return fourthExtCode;
    }

    public void setFourthExtCode(String fourthExtCode) {
        this.fourthExtCode = fourthExtCode;
    }

    public Date getLastReceivedDataTime() {
        return lastReceivedDataTime;
    }

    public void setLastReceivedDataTime(Date lastReceivedDataTime) {
        this.lastReceivedDataTime = lastReceivedDataTime;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public Date getLastChargingTime() {
        return lastChargingTime;
    }

    public void setLastChargingTime(Date lastChargingTime) {
        this.lastChargingTime = lastChargingTime;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    @Override
    public String toString() {
        return "Device{" +
                "lockId='" + lockId + '\'' +
                ", backCode='" + backCode + '\'' +
                ", lockStatus=" + lockStatus +
                ", network='" + network + '\'' +
                ", voltage=" + voltage +
                ", voltagePercentage=" + voltagePercentage +
                ", firstExtCode='" + firstExtCode + '\'' +
                ", secondExtCode='" + secondExtCode + '\'' +
                ", thirdExtCode='" + thirdExtCode + '\'' +
                ", fourthExtCode='" + fourthExtCode + '\'' +
                ", lastReceivedDataTime=" + lastReceivedDataTime +
                ", geoPoint=" + geoPoint +
                ", lastChargingTime=" + lastChargingTime +
                ", hardwareVersion='" + hardwareVersion + '\'' +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                '}';
    }
}
