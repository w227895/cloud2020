package com.kebo.springcloud.service.impl;

import com.kebo.springcloud.dao.PaymentDao;
import com.kebo.springcloud.entities.Payment;
import com.kebo.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-11 21:29
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private  PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

