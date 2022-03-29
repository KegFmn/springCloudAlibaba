package com.likc.springcloud.service;

import com.likc.springcloud.entity.Resullt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author likc
 * @date 2022/3/29
 * @description
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    Resullt decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
