package com.sentinel.iot.api.common;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/26
 * @Description:
 */
public abstract class NotificationType {

    public static final String LOCK_OPENED = "1001";

    public static final String LOCK_CLOSED = "1002";

    public static final String GPS_REPORTED = "1003";

    public static final String BACK_CODE_MODIFIED = "1004";

    public static final String EXTENSION_CODE_MODIFIED = "1005";

    public static final String HEARTBEAT = "1006";

    public static final String REGISTERED = "1007";

    public static final String READ_CARD = "1008";

    public static final String LOCK_UNBOUND = "1009";

    public static final String LOCKS_ASSIGNED = "1010";
}
