package com.likc.springcloud.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * @author likc
 * @date 2022/3/31
 * @description
 */
@Component
@Slf4j
public class MyListener {

    /**
     * 旧版
     */
    //interface InputChannels {
    //    @Input("input")
    //    SubscribableChannel input();
    //}
    //
    //@EnableBinding(InputChannels.class)
    //public class PubSubDemo {
    //    @StreamListener("input")
    //    public void listen() {
    //        if (LOG.isInfoEnabled()) {
    //            LOG.info(context.toString());
    //        }
    //    }
    //}

    /**
     *  方法名必须与yml里的消费者前缀相同sms-in-0
     *  Consumer替代了@StreamListener和@Input
     * @return
     */
    @Bean
    public Consumer<String> sms(){
        return msg -> log.info("收到消息：{}", msg);
    }
}
