package com.likc.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author likc
 * @date 2022/3/29
 * @description
 */
public class CustomerBlockHandler {

    public static String handlerException1(BlockException exception){
        return "1";
    }

    public static String handlerException2(BlockException exception){
        return "2";
    }
}
