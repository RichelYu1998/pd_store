package m2;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*
@RabbitListener 加到类上，需要@RabbitHandler配合指定处理消息的方法

@RabbitListener 直接加到方法上，就不需要@RabbitHandler
 */
@Component
public class Consumer {
    @RabbitListener(queues = "task_queue")
    public void receive1(String s) {
        System.out.println("消费者1收到： "+s);
    }

    @RabbitListener(queues = "task_queue")
    public void receive2(String s) {
        System.out.println("消费者2收到： "+s);
    }
}
