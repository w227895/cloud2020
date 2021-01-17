package com.kebo.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-17 20:30
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut,/(ㄒoㄒ)/~~";
    }
}

