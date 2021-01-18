package com.kebo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-18 20:45
 **/
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication9527.class,args);
    }
}

