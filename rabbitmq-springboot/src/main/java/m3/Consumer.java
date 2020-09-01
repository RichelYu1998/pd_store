package m3;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*
@RabbitListener 加到类上，需要@RabbitHandler配合指定处理消息的方法

@RabbitListener 直接加到方法上，就不需要@RabbitHandler
 */
@Component
public class Consumer {
    // 1.交换机 2.队列 3.绑定
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "logs", declare = "false"),
            value = @Queue //随机命名,非持久,独占,自动删除
    ))
    public void receive1(String s) {
        System.out.println("消费者1收到： "+s);
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "logs", declare = "false"),
            value = @Queue //随机命名,非持久,独占,自动删除
    ))
    public void receive2(String s) {
        System.out.println("消费者2收到： "+s);
    }
}
