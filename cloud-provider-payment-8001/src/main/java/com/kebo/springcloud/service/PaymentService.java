package com.kebo.springcloud.service;

import com.kebo.springcloud.entities.Payment;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-11 21:28
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}

