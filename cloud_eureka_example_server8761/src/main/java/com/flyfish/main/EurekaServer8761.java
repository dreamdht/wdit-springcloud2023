package com.flyfish.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autohr flyfish
 * @date: 2023/5/14 17:24
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8761 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8761.class,args);
    }
}
