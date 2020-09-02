package com.sentinel.iot.api.demo.controller;

import com.sentinel.iot.api.core.DefaultSentinelClient;
import com.sentinel.iot.api.demo.common.ResponseCode;
import com.sentinel.iot.api.model.BuzzerAndLedRequest;
import com.sentinel.iot.api.model.Device;
import com.sentinel.iot.api.model.SentinelResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Copyright Sentinel NV
 * @Author: Bob.Jiang
 * @Date: 2020/9/2 11:05
 * @Description:
 */
@RestController
@RequestMapping("/device")
@Slf4j
public class DeviceController {




    @Autowired
    DefaultSentinelClient sentinelClient;


    @GetMapping("/query")
    public String query(String lockId) {
        log.debug("Query lock information from API with lock ID {} ", lockId);
        Device device = sentinelClient.executeQuery(lockId);
        log.debug("The detailed information of the Sentinel lock corresponding to the lock ID is {} ", device);
        return ResponseCode.SUCCESS;
    }

    @GetMapping("/open")
    public String open(String lockId) {
        log.debug("Send an unlock request to the Sentinel lock with ID {} ", lockId);
        SentinelResponse response = sentinelClient.open(lockId);
        log.debug("Send the unlock request result to the Sentinel lock with ID {} ", response);
        return ResponseCode.SUCCESS;
    }

    @GetMapping("/gepLocation")
    public String gepLocation(String lockId) {
        log.debug("Send the report GPS data request to the Sentinel lock with ID {} ", lockId);
        SentinelResponse response = sentinelClient.gpsLocation(lockId);
        log.debug("Send the report GPS data request result to the Sentinel lock with ID {} ", response);
        return ResponseCode.SUCCESS;
    }

    @GetMapping("/beep")
    public String beep(String lockId) {
        log.debug("Send an beep request to the Sentinel lock with ID {} ", lockId);
        SentinelResponse response = sentinelClient.beep(lockId);
        log.debug("Send the beep request result to the Sentinel lock with ID {} ", response);
        return ResponseCode.SUCCESS;
    }

    @GetMapping("/reset")
    public String reset(String lockId) {
        log.debug("Send a reset request to the Sentinel lock with ID {} ", lockId);
        SentinelResponse response = sentinelClient.reset(lockId);
        log.debug("Send the reset request result to the Sentinel lock with ID {} ", response);
        return ResponseCode.SUCCESS;
    }

    @GetMapping("/resetMotor")
    public String resetMotor(String lockId) {
        log.debug("Send a reset motor request to the Sentinel lock with ID {} ", lockId);
        SentinelResponse response = sentinelClient.resetMotor(lockId);
        log.debug("Send the reset motor request result to the Sentinel lock with ID {} ", response);
        return ResponseCode.SUCCESS;
    }

    @PostMapping("/buzzerAndLed")
    public String buzzerAndLed(@RequestBody BuzzerAndLedRequest buzzerAndLedRequest) {
        log.debug("Send a buzzer and LED light reminder request to the Sentinel lock with ID {} ", buzzerAndLedRequest);
        SentinelResponse response = sentinelClient.buzzerAndLed(buzzerAndLedRequest);
        log.debug("Send the buzzer and LED light reminder request result to the Sentinel lock with ID {} ", response);
        return ResponseCode.SUCCESS;
    }
}
