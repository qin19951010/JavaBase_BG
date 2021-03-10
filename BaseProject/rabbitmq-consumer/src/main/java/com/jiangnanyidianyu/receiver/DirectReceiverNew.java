package com.jiangnanyidianyu.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import java.util.Map;

/*
 *   消息接收监听类
 *   RabbitListener：根据队列名称监听对应队列
 **   配置多台监听绑定到同一个直连交互的同一个队列 ==> 实现了轮询的方式对消息进行消费，而且不存在重复消费。
 *
 * */

@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiverNew {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("第二个----DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}
