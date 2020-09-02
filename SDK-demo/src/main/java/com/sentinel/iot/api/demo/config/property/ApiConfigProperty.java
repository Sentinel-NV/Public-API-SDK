package com.sentinel.iot.api.demo.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Copyright Sentinel NV
 * @Author: Bob.Jiang
 * @Date: 2020/9/2 10:57
 * @Description:
 */
@Component
@Data
@ConfigurationProperties(prefix = "sentinel")
public class ApiConfigProperty {
    private String baseUrl;
    private String clientId;
    private String secretKey;
}
