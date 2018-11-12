package com.example.rabbitmq.demo.config;
import com.example.rabbitmq.demo.bean.MailDTO;
import com.example.rabbitmq.demo.bean.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String message = "hello ";
        System.out.println("Sender : " + message+i);
        rabbitTemplate.convertAndSend("hello", message+i);
    }

    public void send(User i) {
        System.out.println("发送者"+i.toString()); //发送的对象必须序列化
        rabbitTemplate.convertAndSend("User",i);
    }
    public void send(MailDTO i) {
        System.out.println("发送者"+i.toString()); //发送的对象必须序列化
        rabbitTemplate.convertAndSend("MailDTO",i);
    }
}
