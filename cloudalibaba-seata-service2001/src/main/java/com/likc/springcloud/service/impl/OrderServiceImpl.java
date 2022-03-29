package com.likc.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.likc.springcloud.entity.Order;
import com.likc.springcloud.mapper.OrderMapper;
import com.likc.springcloud.service.AccountService;
import com.likc.springcloud.service.OrderService;
import com.likc.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author likc
 * @since 2022-03-29
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    public void create(Order order) {
        log.info("---------------开始新建订单");
        orderMapper.create(order);

        log.info("--------------订单微服务开始调用库存，做扣减start");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("--------------订单微服务开始调用库存，做扣减end");

        log.info("--------------订单微服务开始调用账户，做扣减start");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("--------------订单微服务开始调用账户，做扣减end");

        log.info("--------------修改订单状态start");
        orderMapper.update(order.getUserId(), 0);
        log.info("--------------修改订单状态end");

        log.info("订单结束");

    }
}
