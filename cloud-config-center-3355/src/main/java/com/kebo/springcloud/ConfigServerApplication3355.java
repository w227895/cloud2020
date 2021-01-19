package com.kebo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-19 21:33
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigServerApplication3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication3355.class,args);
    }
}

