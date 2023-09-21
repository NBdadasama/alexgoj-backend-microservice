package com.alexg.alexgojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.alexg.alexgojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.alexg")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.alexg.alexgojbackendserviceclient.service"})
public class AlexgojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexgojBackendQuestionServiceApplication.class, args);
    }

}
