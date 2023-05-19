package com.flyfish.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autohr flyfish
 * @date: 2023/5/19 20:07
 * @description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer5001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer5001Application.class,args);
    }
}
