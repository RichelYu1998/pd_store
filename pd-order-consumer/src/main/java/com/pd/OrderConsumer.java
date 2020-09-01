package com.pd;

import com.pd.pojo.PdOrder;
import com.pd.service.OrderService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@RabbitListener(queues = "orderQueue") //接收消息
public class OrderConsumer {
    @Resource
    private OrderService orderService;

    @RabbitHandler //指定处理消息的方法
    public void saveOrder(PdOrder pdOrder) throws Exception {
        orderService.saveOrder(pdOrder);
    }
}
