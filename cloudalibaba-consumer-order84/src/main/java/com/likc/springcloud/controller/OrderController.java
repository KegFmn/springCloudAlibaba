package com.likc.springcloud.controller;

import com.likc.springcloud.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author likc
 * @date 2022/3/26
 * @description
 */
@RestController
public class OrderController {

    @Resource
    private ProviderService providerService;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){
        return providerService.getPayment(id);
    }

}
