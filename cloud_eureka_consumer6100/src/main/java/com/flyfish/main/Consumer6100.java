package com.flyfish.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/5/14 15:40
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Consumer6100 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer6100.class,args);
    }
}
