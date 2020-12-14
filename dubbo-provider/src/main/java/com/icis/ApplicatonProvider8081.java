package com.icis;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//服务提供者启动类
@SpringBootApplication
//开启Dubbo
@EnableDubbo
public class ApplicatonProvider8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicatonProvider8081.class,args);
    }
}
