package com.jiangnanyidianyu.config;

import com.jiangnanyidianyu.config.MyAckReceiver;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessageListenerConfig {

    @Autowired
    private CachingConnectionFactory connectionFactory;
    @Autowired
    private MyAckReceiver myAckReceiver;//消息接收处理类

    @Bean
    public SimpleMessageListenerContainer simpleMessageListenerContainer() {

        /*
        *   1.根据连接工厂创建简单消息监听容器
        *   2.并行消费者数量和最大并行消费者数量都为1
        *   3.设置消息确认模式:  AcknowledgeMode.MANUAL == > 手动确认  AcknowledgeMode.NONE == > 自动确认
        *   4.手动确认: 消费者收到消息后，手动调用basic.ack/basic.nack/basic.reject后，RabbitMQ收到这些消息后，才认为本次投递成功。
        *   5.basic.ack:肯定确认  basic.nack用于否定确认  basic.reject用于否定确认(只能拒绝单条消息)
        *   6.消费者端以上的3个方法都表示消息已经被正确投递
        *   7.但是basic.ack表示消息已经被正确处理; 而basic.nack,basic.reject表示没有被正确处理
        *   8.着重讲下reject，因为有时候一些场景是需要重新入列的。****
        *   9.容器中设置消息监听类
        * */


        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setConcurrentConsumers(1);
        container.setMaxConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL); // RabbitMQ默认是自动确认，这里改为手动确认消息
        //设置一个队列
        container.setQueueNames("TestDirectQueue");
        //如果同时设置多个如下： 前提是队列都是必须已经创建存在的
        //  container.setQueueNames("TestDirectQueue","TestDirectQueue2","TestDirectQueue3");


        //另一种设置队列的方法,如果使用这种情况,那么要设置多个,就使用addQueues
        //container.setQueues(new Queue("TestDirectQueue",true));
        //container.addQueues(new Queue("TestDirectQueue2",true));
        //container.addQueues(new Queue("TestDirectQueue3",true));
        container.setMessageListener(myAckReceiver);

        return container;
    }


}
