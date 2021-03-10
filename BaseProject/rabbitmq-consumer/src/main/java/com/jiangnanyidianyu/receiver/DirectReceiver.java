package com.jiangnanyidianyu.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import java.util.Map;

/*
*   消息接收监听类
*   RabbitListener：根据队列名称监听对应队列
**
* */


@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("第一个----DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}
