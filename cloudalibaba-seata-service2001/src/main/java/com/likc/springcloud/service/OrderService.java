package com.likc.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likc.springcloud.entity.Order;
import org.aspectj.weaver.ast.Or;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author likc
 * @since 2022-03-29
 */
public interface OrderService extends IService<Order> {

    void create(Order order);

}
