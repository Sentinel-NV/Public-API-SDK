package com.sentinel.iot.api.core;

import com.alibaba.fastjson.JSON;
import com.sentinel.iot.api.model.SentinelResponse;
import com.sentinel.iot.api.common.ResultCode;
import com.sentinel.iot.api.common.HttpUtils;
import com.sentinel.iot.api.model.TokenResponse;
import com.sentinel.iot.api.model.Device;
import com.sentinel.iot.api.model.BuzzerAndLedRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/24
 * @Description:
 */
public class DefaultSentinelClient {
    private Logger log = Logger.getLogger(this.getClass().getName());

    private String DOMAIN = "http://8.209.81.130:10111/api/v1";

    private final String ACCESS_TOKEN_URL = "/auth/token";

    private final String EXIT_URL = "/exit";

    private final String QUERY_URL = "/lock/query";

    private final String OPEN_URL = "/lock/control/open";

    private final String GPS_URL = "/lock/control/requestGps";

    private final String BEEP_URL = "/lock/control/beep";

    private final String RESET_URL = "/lock/control/reset";

    private final String RESET_MOTOR_URL = "/lock/control/resetMotor";

    private final String SOUND_LIGHT_REMINDER_URL = "/lock/control/soundLightReminder";

    private final Integer SAFE_RETENTION_SECOND = 30;

    private static DefaultSentinelClient instance;

    private String clientId;

    private String secretKey;

    private String accessToken;

    private Long requestTime;

    private Long expiration;

    private DefaultSentinelClient() {
    }

    public static DefaultSentinelClient getInstance(String domain, String clientId, String secretKey) {
        if (instance == null) {
            synchronized (DefaultSentinelClient.class) {
                if (instance == null) {
                    instance = new DefaultSentinelClient();
                    instance.clientId = clientId;
                    instance.secretKey = secretKey;
                    if (domain != null && domain.length() > 0) {
                        instance.DOMAIN = domain;
                    }
                }
            }
        }
        return instance;
    }

    public static DefaultSentinelClient getInstance(String clientId, String secretKey) {
        return getInstance(null, clientId, secretKey);
    }

    private void requestAccessToken() {
        Map<String, Object> parameterMap = new HashMap<>(2);
        parameterMap.put("clientId", clientId);
        parameterMap.put("secretKey", secretKey);
        SentinelResponse sentinelResponse = defaultRequest(DOMAIN + ACCESS_TOKEN_URL, parameterMap);
        if (!ResultCode.SUCCESS.equals(sentinelResponse.getCode())) {
            log.fine("Get access token fail, " + sentinelResponse);
            return;
        }
        TokenResponse tokenResponse = JSON.parseObject(sentinelResponse.getBody(), TokenResponse.class);
        requestTime = System.currentTimeMillis();
        accessToken = tokenResponse.getAccessToken();
        expiration = tokenResponse.getExpiresIn() - SAFE_RETENTION_SECOND;
    }

    private String getAccessToken() {
        if (accessToken == null ||
                System.currentTimeMillis() - requestTime > TimeUnit.MILLISECONDS.convert(expiration, TimeUnit.SECONDS)) {
            requestAccessToken();
        }
        return accessToken;
    }

    private Map<String, Object> getParameterMap(String lockId) {
        Map<String, Object> parameterMap = new HashMap<>(1);
        parameterMap.put("lockId", lockId);
        return parameterMap;
    }

    private SentinelResponse defaultRequest(String url, Map<String, Object> parameterMap, String accessToken) {
        String result = HttpUtils.doPostForm(url, parameterMap, accessToken);
        SentinelResponse sentinelResponse = JSON.parseObject(result, SentinelResponse.class);
        return sentinelResponse;
    }

    private SentinelResponse defaultRequest(String url, Map<String, Object> parameterMap) {
        return defaultRequest(url, parameterMap, null);
    }

    public SentinelResponse invalidateToken(String lockId) {
        return defaultRequest(DOMAIN + EXIT_URL, getParameterMap(lockId), getAccessToken());
    }

    public Device executeQuery(String lockId) {
        SentinelResponse sentinelResponse = defaultRequest(DOMAIN + QUERY_URL, getParameterMap(lockId), getAccessToken());
        if (!ResultCode.SUCCESS.equals(sentinelResponse.getCode())) {
            log.fine("Query lock fail, " + sentinelResponse);
            return null;
        }
        return JSON.parseObject(sentinelResponse.getBody(), Device.class);
    }

    public SentinelResponse open(String lockId) {
        return defaultRequest(DOMAIN + OPEN_URL, getParameterMap(lockId), getAccessToken());
    }

    public SentinelResponse gpsLocation(String lockId) {
        return defaultRequest(DOMAIN + GPS_URL, getParameterMap(lockId), getAccessToken());
    }

    public SentinelResponse beep(String lockId) {
        return defaultRequest(DOMAIN + BEEP_URL, getParameterMap(lockId), getAccessToken());
    }

    public SentinelResponse reset(String lockId) {
        return defaultRequest(DOMAIN + RESET_URL, getParameterMap(lockId), getAccessToken());
    }

    public SentinelResponse resetMotor(String lockId) {
        return defaultRequest(DOMAIN + RESET_MOTOR_URL, getParameterMap(lockId), getAccessToken());
    }

    public SentinelResponse buzzerAndLed(BuzzerAndLedRequest buzzerAndLedRequest) {
        return defaultRequest(DOMAIN + SOUND_LIGHT_REMINDER_URL, buzzerAndLedRequest.buildParameter(), getAccessToken());
    }
}