package com.flyfish.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @autohr flyfish
 * @date: 2023/5/14 15:42
 * @description:
 */
@RequestMapping("/consumer")
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    private static String URL = "http://PROVIDER-SERVER6000/";

    @GetMapping("/info/{msg}")
    public String getInfo(@PathVariable String msg){
        String result = restTemplate.getForObject(URL + "provider/info/{msg}", String.class, msg);
        return result;
    }
}
