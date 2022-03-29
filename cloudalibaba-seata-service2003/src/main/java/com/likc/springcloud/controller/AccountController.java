package com.likc.springcloud.controller;


import com.likc.springcloud.entity.Resullt;
import com.likc.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author likc
 * @since 2022-03-30
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/account/decrease")
    public Resullt<Void> decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId, money);
        return new Resullt<>(200, "扣减账户余额成功");
    }

}
