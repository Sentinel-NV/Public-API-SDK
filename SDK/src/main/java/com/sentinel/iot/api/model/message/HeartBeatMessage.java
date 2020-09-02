package com.sentinel.iot.api.model.message;
import com.sentinel.iot.api.common.StatusConstant;
/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class HeartBeatMessage {

    private String lockId;

    private Double voltage;

    private Integer voltagePercentage;

    /**
     * @see StatusConstant
     */
    private Integer lockStatus;

    private Integer signalStrength;

    private String networkMode;

    /**
     * @see StatusConstant
     */
    private Integer chargingState;

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

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(Integer signalStrength) {
        this.signalStrength = signalStrength;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public Integer getChargingState() {
        return chargingState;
    }

    public void setChargingState(Integer chargingState) {
        this.chargingState = chargingState;
    }

    @Override
    public String toString() {
        return "HeartBeatMessage{" +
                "lockId='" + lockId + '\'' +
                ", voltage=" + voltage +
                ", voltagePercentage=" + voltagePercentage +
                ", lockStatus=" + lockStatus +
                ", signalStrength=" + signalStrength +
                ", networkMode='" + networkMode + '\'' +
                ", chargingState=" + chargingState +
                '}';
    }
}
