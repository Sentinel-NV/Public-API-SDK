package com.sentinel.iot.api.demo.config;

import com.sentinel.iot.api.core.DefaultSentinelClient;
import com.sentinel.iot.api.demo.config.property.ApiConfigProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Copyright Sentinel NV
 * @Author: Bob.Jiang
 * @Date: 2020/8/31 09:43
 * @Description:
 */
@Configuration
public class InitializePublicApiClient {
    @Autowired
    ApiConfigProperty apiConfigProperty;

    @Bean
    public DefaultSentinelClient publicApiInstance() {
        DefaultSentinelClient defaultSentinelClient = DefaultSentinelClient.getInstance(apiConfigProperty.getBaseUrl(), apiConfigProperty.getClientId(), apiConfigProperty.getSecretKey());
        return defaultSentinelClient;
    }
}
