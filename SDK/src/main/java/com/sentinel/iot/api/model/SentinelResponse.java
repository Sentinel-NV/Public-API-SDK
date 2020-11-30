package com.sentinel.iot.api.model;

import com.sentinel.iot.api.common.ResultCode;

import java.io.Serializable;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/24
 * @Description:
 */
public class SentinelResponse implements Serializable {

    /**
     * @see ResultCode
     */
    private String code;

    private String msg;

    private String body;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "SentinelResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
