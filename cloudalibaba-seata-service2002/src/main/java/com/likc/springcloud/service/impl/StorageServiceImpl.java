package com.likc.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.likc.springcloud.entity.Storage;
import com.likc.springcloud.mapper.StorageMapper;
import com.likc.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author likc
 * @since 2022-03-30
 */
@Service
@Slf4j
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {

        log.info("storage-service开始扣减库存");
        storageMapper.decrease(productId, count);
        log.info("storage-service扣减库存结束");

    }
}
