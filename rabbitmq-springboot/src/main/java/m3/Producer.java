package m3;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Scanner;

@Component
public class Producer {
    @Resource
    private AmqpTemplate amqpTemplate;

    public void send() {
        while (true) {
            System.out.print("输入消息：");
            String msg = new Scanner(System.in).nextLine();
            amqpTemplate.convertAndSend("logs", "", msg);
        }
    }
}
