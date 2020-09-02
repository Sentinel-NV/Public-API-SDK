package com.sentinel.iot.api.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright Sentinel NV
 * @Author: Zhen.Yang
 * @Date: 2020/8/24
 * @Description:
 */
public class BuzzerAndLedRequest {

    private String lockId;

    private Sound sound;

    private Light light;

    public static class Sound {
        /**
         * Number of executions
         */
        private Integer times;

        /**
         * Time per execution
         */
        private Integer duration;

        /**
         * The interval between each execution
         */
        private Integer interval;

        public Integer getTimes() {
            return times;
        }

        public Sound setTimes(Integer times) {
            this.times = times;
            return this;
        }

        public Integer getDuration() {
            return duration;
        }

        public Sound setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public Integer getInterval() {
            return interval;
        }

        public Sound setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
    }

    public static class Light {
        private String color;

        /**
         * Number of executions
         */
        private Integer times;

        /**
         * Time per execution
         */
        private Integer duration;

        /**
         * The interval between each execution
         */
        private Integer interval;

        public String getColor() {
            return color;
        }

        public Light setColor(String color) {
            this.color = color;
            return this;
        }

        public Integer getTimes() {
            return times;
        }

        public Light setTimes(Integer times) {
            this.times = times;
            return this;
        }

        public Integer getDuration() {
            return duration;
        }

        public Light setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public Integer getInterval() {
            return interval;
        }

        public Light setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
    }

    public String getLockId() {
        return lockId;
    }

    public BuzzerAndLedRequest setLockId(String lockId) {
        this.lockId = lockId;
        return this;
    }

    public Sound getSound() {
        return sound;
    }

    public BuzzerAndLedRequest setSound(Sound sound) {
        this.sound = sound;
        return this;
    }

    public Light getLight() {
        return light;
    }

    public BuzzerAndLedRequest setLight(Light light) {
        this.light = light;
        return this;
    }

    public Map<String, Object> buildParameter() {
        Map<String, Object> parameterMap = new HashMap<>(8);
        parameterMap.put("lockId", lockId);
        parameterMap.put("soundTimes", sound.times);
        parameterMap.put("soundDuration", sound.duration);
        parameterMap.put("soundInterval", sound.interval);
        parameterMap.put("lightColor", light.color);
        parameterMap.put("lightTimes", light.times);
        parameterMap.put("lightDuration", light.duration);
        parameterMap.put("lightInterval", light.interval);
        return parameterMap;
    }

    @Override
    public String toString() {
        return "BuzzerAndLedRequest{" +
                "lockId='" + lockId + '\'' +
                ", sound=" + sound +
                ", light=" + light +
                '}';
    }
}



