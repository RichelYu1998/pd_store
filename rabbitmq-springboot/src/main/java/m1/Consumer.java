package m1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*
@RabbitListener 加到类上，需要@RabbitHandler配合指定处理消息的方法

@RabbitListener 直接加到方法上，就不需要@RabbitHandler
 */
@Component
public class Consumer {
    @RabbitListener(queues = "helloworld")
    public void receive(String s) {
        System.out.println("收到： "+s);
    }
}
