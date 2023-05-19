package com.flyfish.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/5/14 15:35
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderServer6000 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderServer6000.class,args);
    }
}
