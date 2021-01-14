package com.kebo.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-12 19:27
 **/
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://consul-provider-payment";
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
        return result;
    }
}

