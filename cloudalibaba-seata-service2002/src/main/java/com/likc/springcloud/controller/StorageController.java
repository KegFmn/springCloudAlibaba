package com.likc.springcloud.controller;


import com.likc.springcloud.entity.Resullt;
import com.likc.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author likc
 * @since 2022-03-30
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping(value = "/storage/decrease")
    public Resullt<Void> decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return new Resullt<>(200,"扣减库存成功");
    }
}
