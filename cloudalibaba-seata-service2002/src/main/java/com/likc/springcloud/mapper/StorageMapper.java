package com.likc.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.likc.springcloud.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author likc
 * @since 2022-03-30
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
