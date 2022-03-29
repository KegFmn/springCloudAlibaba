package com.likc.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likc.springcloud.entity.Storage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author likc
 * @since 2022-03-30
 */
public interface StorageService extends IService<Storage> {

    void decrease(Long productId, Integer count);

}
