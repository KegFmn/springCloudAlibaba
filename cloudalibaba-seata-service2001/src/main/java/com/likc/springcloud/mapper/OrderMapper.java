package com.likc.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.likc.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author likc
 * @since 2022-03-29
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    void create(Order order);

    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
