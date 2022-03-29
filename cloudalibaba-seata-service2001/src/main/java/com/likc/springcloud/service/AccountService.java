package com.likc.springcloud.service;

import com.likc.springcloud.entity.Resullt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author likc
 * @date 2022/3/29
 * @description
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    Resullt decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
