package com.liuwen.demo;

import com.liuwen.demo.rocket.RocketMQConsumer;
import com.liuwen.demo.rocket.RocketMQListener;

/**
 * Created by LiuWen on 2021/07/10.
 */
public class RocketMQConsumerTest {


    public static void main(String[] args) {


        String mqNameServer = "192.168.168.101:9876";
        String mqTopics = "MQ-MSG-TOPICS-TEST";

        String consumerMqGroupName = "CONSUMER-MQ-GROUP";
        RocketMQListener mqListener = new RocketMQListener();
        RocketMQConsumer mqConsumer = new RocketMQConsumer(mqListener, mqNameServer, consumerMqGroupName, mqTopics);
        mqConsumer.init();


        try {
            Thread.sleep(1000 * 60L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}