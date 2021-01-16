package com.kebo.springcloud.controller;

import com.kebo.springcloud.entities.CommonResult;
import com.kebo.springcloud.entities.Payment;
import com.kebo.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-12 19:27
 **/
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private PaymentFeignService paymentFeignService;


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        return paymentFeignService.paymentFeignTimeout();
    }
}

