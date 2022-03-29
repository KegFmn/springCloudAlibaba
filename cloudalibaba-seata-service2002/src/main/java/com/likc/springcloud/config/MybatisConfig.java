package com.likc.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author likc
 * @date 2022/3/29
 * @description
 */
@Configuration
@MapperScan("com.likc.springcloud.mapper")
public class MybatisConfig {


}
