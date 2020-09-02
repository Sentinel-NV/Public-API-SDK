package com.sentinel.iot.api.model.message;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class RegistrationMessage {
    private String lockId;

    private Double voltage;

    private Integer voltagePercentage;

    private String hardwareVersion;

    private String firmwareVersion;

    private String networkMode;

    private String timezone;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
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

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "RegistrationMessage{" +
                "lockId='" + lockId + '\'' +
                ", voltage=" + voltage +
                ", voltagePercentage=" + voltagePercentage +
                ", hardwareVersion='" + hardwareVersion + '\'' +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                ", networkMode='" + networkMode + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}
