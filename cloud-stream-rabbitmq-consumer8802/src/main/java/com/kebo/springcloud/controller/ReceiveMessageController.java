package com.kebo.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kb
 * @create: 2021-01-21 21:05
 **/
@RestController
@EnableBinding(Sink.class)
public class ReceiveMessageController {
    @Value("${server.port}")
    private String severPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者1号，----------->接收到的消息：" + message.getPayload() + "\t port" + severPort);
    }
}
