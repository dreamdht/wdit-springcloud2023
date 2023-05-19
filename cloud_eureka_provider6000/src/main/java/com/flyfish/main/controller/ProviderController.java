package com.flyfish.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @autohr flyfish
 * @date: 2023/5/14 15:36
 * @description:
 */
@RequestMapping("/provider")
@RestController
public class ProviderController {

    @GetMapping("/info/{msg}")
    public String getMsg(@PathVariable String msg){
        String result = UUID.randomUUID().toString()+"收到消息:"+msg;
        return msg;
    }
}
