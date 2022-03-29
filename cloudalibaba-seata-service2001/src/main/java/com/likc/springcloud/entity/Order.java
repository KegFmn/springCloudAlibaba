package com.likc.springcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author likc
 * @since 2022-03-29
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    @TableField("user_id")
    private Long userId;


    @TableField("product_id")
    private Long productId;


    @TableField("count")
    private Integer count;


    @TableField("money")
    private BigDecimal money;


    @TableField("status")
    private Integer status;


}
