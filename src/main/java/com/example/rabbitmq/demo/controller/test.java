package com.example.rabbitmq.demo.controller;


import com.example.rabbitmq.demo.bean.User;
import com.example.rabbitmq.demo.config.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @Autowired
    private HelloSender helloSender;

    @RequestMapping("/text")
    public void sendMessage() {
        User user=new User();
        user.setId(1);
        user.setName("小明");
        user.setPassword("123");
        helloSender.send(user);
    }
}
