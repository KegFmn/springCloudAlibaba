package com.likc.springcloud.service.impl;

import com.likc.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

/**
 * @author likc
 * @date 2022/3/31
 * @description
 */
@Service
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    @Autowired
    private StreamBridge streamBridge;

    @Override
    public void sendMessage(String message) {
        // 需要与yml配置的消息生成者一致
        String SMS_OUTPUT = "sms-out-0";
        streamBridge.send(SMS_OUTPUT, message);
    }

}
