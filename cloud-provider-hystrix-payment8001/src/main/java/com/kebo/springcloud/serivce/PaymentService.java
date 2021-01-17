package com.kebo.springcloud.serivce;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-17 16:01
 **/
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + " paymentInfo_OK,id: " + id;
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandle",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 2;
        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + " paymentInfo_OK,id: " + id + "   耗时" + timeNumber + "秒";
    }

    public String paymentInfo_TimeOutHandle(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + " paymentInfo_OK,id: " + id + " ≧ ﹏ ≦";
    }
}

