package com.example.rabbitmq.demo.controller;


import com.example.rabbitmq.demo.config.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @Autowired
    private HelloSender helloSender;

    @RequestMapping("/text")
    public void sendMessage(int i) {
        helloSender.send(i);
    }
}
