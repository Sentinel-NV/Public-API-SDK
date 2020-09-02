package com.sentinel.iot.api.model.message;
/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public class ExtensionCodeMessage {
    private String lockId;

    private String firstExtCode;

    private String secondExtCode;

    private String thirdExtCode;

    private String fourthExtCode;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
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

    @Override
    public String toString() {
        return "ExtensionCodeMessage{" +
                "lockId='" + lockId + '\'' +
                ", firstExtCode='" + firstExtCode + '\'' +
                ", secondExtCode='" + secondExtCode + '\'' +
                ", thirdExtCode='" + thirdExtCode + '\'' +
                ", fourthExtCode='" + fourthExtCode + '\'' +
                '}';
    }
}
