package com.flyfish.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Date;

/**
 * @autohr flyfish
 * @date: 2023/5/14 11:52
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer5000{
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer5000.class,args);
    }
}

