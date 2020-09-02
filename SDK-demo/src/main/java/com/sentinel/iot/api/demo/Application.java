package com.sentinel.iot.api.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Copyright Sentinel NV
 * @Author: Bob.Jiang
 * @Date: 2020/9/2 11:03
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.sentinel")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * @param applicationContext
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        return args -> {
        };
    }
}
