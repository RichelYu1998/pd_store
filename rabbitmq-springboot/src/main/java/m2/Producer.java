package m2;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Producer {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        while (true) {
            System.out.print("输入消息：");
            String msg = new Scanner(System.in).nextLine();
            amqpTemplate.convertAndSend("task_queue", msg);

            // MessagePostProcessor 在消息被发送前先执行
            // 在预处理器中，可以先对消息做一些设置，设置后消息才会被发送
            // amqpTemplate.convertAndSend("task_queue", (Object) msg, new MessagePostProcessor() {
            //     @Override
            //     public Message postProcessMessage(Message message) throws AmqpException {
            //         MessageProperties p = message.getMessageProperties();
            //         p.setDeliveryMode(MessageDeliveryMode.NON_PERSISTENT);
            //         return message;
            //     }
            // });
        }
    }
}
