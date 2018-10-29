package com.example.rabbitmq.demo.config;

import com.example.rabbitmq.demo.bean.User;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import sun.plugin.javascript.JSObject;

@Component
public class HelloReceiver {

    @RabbitListener(queues = "hello")
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }

    @RabbitListener(queues = "User")
    @RabbitHandler
    public void process(User user) {
        System.out.println("接收者 : " + user);
    }
}
