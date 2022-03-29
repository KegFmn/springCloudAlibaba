package com.likc.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author likc
 * @date 2022/3/29
 * @description 降级兜底类
 */
@Component // 一定要添加
public class FallbackService implements ProviderService {

    @Override
    public String getPayment(Integer id) {
        return "服务故障，降级兜底";
    }

}
