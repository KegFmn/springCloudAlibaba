package com.likc.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likc.springcloud.entity.Account;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author likc
 * @since 2022-03-30
 */
public interface AccountService extends IService<Account> {

    void decrease( Long userId, BigDecimal money);

}
