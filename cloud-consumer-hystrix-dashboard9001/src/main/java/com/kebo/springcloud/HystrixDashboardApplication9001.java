package com.kebo.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import static org.springframework.boot.SpringApplication.run;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-18 19:57
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication9001 {
    public static void main(String[] args) {
        run(HystrixDashboardApplication9001.class,args);
    }


}

