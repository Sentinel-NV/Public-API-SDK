package com.sentinel.iot.api.core;

import com.alibaba.fastjson.JSON;
import com.sentinel.iot.api.common.NotificationType;
import com.sentinel.iot.api.model.message.*;

import java.io.Serializable;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/24
 * @Description:
 */
public class Notification implements Serializable {
    /**
     * @see NotificationType
     */
    private String notificationType;

    private Long timestamp;

    private Object message;

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public BackCodeMessage buildBackCodeMessage() {
        return NotificationType.BACK_CODE_MODIFIED.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), BackCodeMessage.class) : null;
    }

    public ExtensionCodeMessage buildExtensionCodeMessage() {
        return NotificationType.EXTENSION_CODE_MODIFIED.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), ExtensionCodeMessage.class) : null;
    }

    public GpsMessage buildGpsMessage() {
        return NotificationType.GPS_REPORTED.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), GpsMessage.class) : null;
    }

    public HeartBeatMessage buildHeartBeatMessage() {
        return NotificationType.HEARTBEAT.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), HeartBeatMessage.class) : null;
    }

    public LockOpenedMessage buildLockOpenedMessage() {
        return NotificationType.LOCK_OPENED.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), LockOpenedMessage.class) : null;
    }

    public LockClosedMessage buildLockClosedMessage() {
        return NotificationType.LOCK_CLOSED.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), LockClosedMessage.class) : null;
    }

    public LocksAssignedMessage buildLocksAssignedMessage() {
        return NotificationType.LOCKS_ASSIGNED.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), LocksAssignedMessage.class) : null;
    }

    public LockUnboundMessage buildLockUnboundMessage() {
        return NotificationType.LOCK_UNBOUND.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), LockUnboundMessage.class) : null;
    }

    public ReadCardMessage buildReadCardMessage() {
        return NotificationType.READ_CARD.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), ReadCardMessage.class) : null;
    }

    public RegistrationMessage buildRegistrationMessage() {
        return NotificationType.REGISTERED.equals(notificationType) ?
                JSON.parseObject(JSON.toJSONString(message), RegistrationMessage.class) : null;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationType='" + notificationType + '\'' +
                ", timestamp=" + timestamp +
                ", message=" + message +
                '}';
    }
}
