package m1;

import cn.tedu.rabbitmqspringboot.RabbitmqSpringbootApplication;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    //org.springframework.amqp.core.Queue
    @Bean
    public Queue helloworldQueue() {
        //return new Queue("helloworld"); // true,false,false

        return new Queue("helloworld", false);
    }
}
