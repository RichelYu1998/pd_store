package m5;

import org.springframework.amqp.core.AmqpTemplate;
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
            System.out.print("输入路由键：");
            String key = new Scanner(System.in).nextLine();
            amqpTemplate.convertAndSend("topic_logs", key, msg);
        }
    }
}
