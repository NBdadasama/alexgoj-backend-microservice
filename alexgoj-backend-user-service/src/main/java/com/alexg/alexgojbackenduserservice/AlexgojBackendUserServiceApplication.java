package com.alexg.alexgojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.alexg.alexgojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.alexg")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.alexg.alexgojbackendserviceclient.service"})
public class AlexgojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexgojBackendUserServiceApplication.class, args);
    }

}
