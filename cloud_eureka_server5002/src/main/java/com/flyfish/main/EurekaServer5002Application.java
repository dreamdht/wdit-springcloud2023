package com.flyfish.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autohr flyfish
 * @date: 2023/5/19 20:07
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer5002Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer5002Application.class,args);
    }
}
