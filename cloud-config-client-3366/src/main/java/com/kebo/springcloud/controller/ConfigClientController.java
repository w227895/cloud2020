package com.kebo.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-19 21:59
 **/
@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${server.name}")
    private String serverPort;

    @GetMapping("/serverPort")
    public String getConfigInfo()
    {
        System.out.println("hello");
        return serverPort;
    }
}

