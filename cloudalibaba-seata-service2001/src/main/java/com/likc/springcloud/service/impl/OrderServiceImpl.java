package com.likc.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.likc.springcloud.entity.Order;
import com.likc.springcloud.mapper.OrderMapper;
import com.likc.springcloud.service.AccountService;
import com.likc.springcloud.service.OrderService;
import com.likc.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
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

    /**
     *  服务调用步骤：2001服务order先初始化订单（状态为0：未完成）——2002服务storage扣减库存——2003服务扣减余额——回到2001服务修改订单状态
     *  开启全局事务将整个微服务调用链当成一个事务处理，使其具备原子性
     * @param order
     */
    @Override
    @GlobalTransactional(name = "order-storage-account", rollbackFor = Exception.class) // name唯一就行，rollbackfor抛出的异常不要捕捉
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
