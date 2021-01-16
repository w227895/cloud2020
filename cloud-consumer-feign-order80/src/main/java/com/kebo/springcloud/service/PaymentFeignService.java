package com.kebo.springcloud.service;

import com.kebo.springcloud.entities.CommonResult;
import com.kebo.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-16 21:18
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    //这个路径要和服务端保持一致,也就是8001和8002,而不是这个80项目的控制层
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}

