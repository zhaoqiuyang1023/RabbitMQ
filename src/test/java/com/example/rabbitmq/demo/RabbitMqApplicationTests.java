package com.example.rabbitmq.demo;

import com.example.rabbitmq.demo.bean.ImageRes;
import com.example.rabbitmq.demo.bean.MailDTO;
import com.example.rabbitmq.demo.bean.Role;
import com.example.rabbitmq.demo.bean.User;
import com.example.rabbitmq.demo.config.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
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
            ArrayList<Role> roles = new ArrayList<>();
            roles.add(new Role(i + "小明"));
            User user = new User(i, "用户", UUID.randomUUID().toString().replace("--", ""));
            user.setRoles(roles);
            System.out.println("此时" + user);
            helloSender.send(user);
        }
    }

    @Test
    public void Send_Mail() throws Exception {
        MailDTO mailDTO = new MailDTO();
        ArrayList<ImageRes> roles = new ArrayList<ImageRes>();
        roles.add(new ImageRes("小明", new ClassPathResource("logo.png")));
        roles.add(new ImageRes("小明", new ClassPathResource("logo.png")));
        mailDTO.setInlines(roles);
        System.out.println("此时" + mailDTO);
        helloSender.send(mailDTO);

    }


}
