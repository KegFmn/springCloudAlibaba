package com.likc.springcloud.controller;


import com.likc.springcloud.entity.Order;
import com.likc.springcloud.entity.Resullt;
import com.likc.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author likc
 * @since 2022-03-29
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public Resullt<Void> create(Order order){
        orderService.create(order);
        return new Resullt<>(200, "订单创建成功");
    }
}
