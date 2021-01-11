package com.kebo.springcloud.dao;

import com.kebo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-11 21:07
 **/
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

