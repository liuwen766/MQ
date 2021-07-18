package com.liuwen.demo;
 
import com.alibaba.rocketmq.common.message.Message;
import com.liuwen.demo.rocket.RocketMQProducer;

/**
 * Created by LiuWen on 2021/07/10.
 */
public class RocketMQProducerTest {
 
    public static void main(String[] args) {
 
        String mqNameServer = "192.168.168.101:9876";
        String mqTopics = "MQ-MSG-TOPICS-TEST";
 
        String producerMqGroupName = "PRODUCER-MQ-GROUP";
        RocketMQProducer mqProducer = new RocketMQProducer(mqNameServer, producerMqGroupName, mqTopics);
        mqProducer.init();
 
 
        for (int i = 0; i < 5; i++) {
 
            Message message = new Message();
            message.setBody(("I send message to RocketMQ " + i).getBytes());
            mqProducer.send(message);
        }

    }
 
}