package com.example.rabbitmq.demo;

import com.example.rabbitmq.demo.bean.User;
import com.example.rabbitmq.demo.config.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqApplicationTests {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send(0);
    }

    @Test
    public void oneToMany() throws Exception {
        for (int i = 0; i < 100; i++) {
            helloSender.send(i);
        }
    }

    @Test
    public void Send_Object() throws Exception {
        for (int i = 0; i < 100; i++) {
            User user = new User(i, "用户", UUID.randomUUID().toString().replace("--", ""));
            helloSender.send_Object(user);
        }
    }


}
