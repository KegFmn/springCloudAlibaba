package com.likc.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.likc.springcloud.myhandler.CustomerBlockHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likc
 * @date 2022/3/26
 * @description
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "---------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "---------testB";
    }

    /**
     *  单独在下面写个兜底方法
     * @param p1
     * @param p2
     * @return
     */
    @GetMapping("/testC")
    @SentinelResource(value = "testC", blockHandler = "deal_testC")
    public String testC(@RequestParam(value = "p1", required = false) String p1,
                        @RequestParam(value = "p1", required = false) String p2){
        return "---------testB";
    }
    public String deal_testC(String p1, String p2, BlockException exception){
        return "---------deal_testC";
    }

    /**
     *  统一在CustomerBlockHandler类中作兜底
     * @return
     */
    @GetMapping("/testD")
    @SentinelResource(value = "testD", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException1")
    public String testD(){
        return "---------testB";
    }
}
