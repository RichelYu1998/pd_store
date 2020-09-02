package m1;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Producer {
    @Resource
    private AmqpTemplate amqpTemplate;

    public void send() {
        amqpTemplate.convertAndSend("helloworld", "Hello world!");
        System.out.println("消息已发送");
    }
}
