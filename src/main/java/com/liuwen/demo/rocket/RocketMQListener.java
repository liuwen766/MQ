package com.liuwen.demo.rocket;
 
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
 
import java.util.List;

/**
 * Created by LiuWen on 2021/07/10.
 */
public class RocketMQListener  implements MessageListenerConcurrently {
 
 
    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
//        System.out.println("get data from rocketMQ:" + msgs);
        for (MessageExt message : msgs) {
 
            String msg = new String(message.getBody());
            System.out.println("msg data from rocketMQ:" + msg);
        }
 
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}