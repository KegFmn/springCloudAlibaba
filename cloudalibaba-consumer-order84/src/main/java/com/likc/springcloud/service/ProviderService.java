package com.likc.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author likc
 * @date 2022/3/26
 * @description openfeign接口
 */
@FeignClient(value = "nacos-payment-provider", fallback = FallbackService.class) // 生产者服务名，fallbock降级兜底类
public interface ProviderService {

    /**
     *  生产者的控制器直接复制过来
     * @param id
     * @return
     */
    @GetMapping("/payment/nacos/{id}")
    String getPayment(@PathVariable("id") Integer id);
}
