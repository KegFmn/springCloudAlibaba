package com.likc.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

/**
 * @author likc
 * @date 2022/3/31
 * @description
 */
@Component
@Slf4j
public class GateWayFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("------come in GateWayFilter:"+ LocalDateTime.now());
        //String userName = exchange.getRequest().getQueryParams().getFirst("userName");
        //if (userName == null){
        //    log.info("------用户名为空，非法请求o(╥﹏╥)o");
        //    exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
        //    return exchange.getResponse().setComplete();
        //}
        return null;
    }

    @Override
    public int getOrder() {
        return 0;
    }

}
