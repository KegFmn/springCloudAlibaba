package com.likc.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.likc.springcloud.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author likc
 * @since 2022-03-30
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
