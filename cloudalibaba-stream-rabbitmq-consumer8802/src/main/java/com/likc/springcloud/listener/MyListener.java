package com.likc.springcloud.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
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
     *  方法名必须与yml里的消费者前缀相同sms-in-0
     * @return
     */
    @Bean
    public Consumer<String> sms(){
        return msg -> log.info("收到消息：{}", msg);
    }
}
