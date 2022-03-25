package com.likc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likc
 * @date 2022/3/26
 * @description
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public String getPayment(@PathVariable("id") Integer id){
        return "nacos, serverPort: "+ serverPort +"\t id" + id;
    }

}
