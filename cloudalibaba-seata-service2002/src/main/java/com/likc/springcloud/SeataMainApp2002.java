package com.likc.springcloud;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author likc
 * @date 2022/3/26
 * @description
 */
@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
@SpringBootApplication
public class SeataMainApp2002 {

    public static void main(String[] args) {
        SpringApplication.run(SeataMainApp2002.class, args);
    }

}