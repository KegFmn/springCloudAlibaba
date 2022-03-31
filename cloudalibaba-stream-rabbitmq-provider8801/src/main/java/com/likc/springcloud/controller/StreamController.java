package com.likc.springcloud.controller;

import com.likc.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likc
 * @date 2022/3/31
 * @description
 */
@RestController
public class StreamController {

    @Autowired
    private IMessageProvider iMessageProvider;

    @GetMapping("/provider/hello")
    public String hello(){
        iMessageProvider.sendMessage("hello");
        return "ok";
    }
}
