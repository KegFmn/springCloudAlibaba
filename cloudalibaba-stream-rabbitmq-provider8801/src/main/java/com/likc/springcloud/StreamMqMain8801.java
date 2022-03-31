package com.likc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author likc
 * @date 2022/3/26
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class StreamMqMain8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMqMain8801.class, args);
    }

}