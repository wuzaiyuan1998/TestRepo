package com.icis;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启dubbo
@EnableDubbo
@SpringBootApplication
public class ApplicationConsumber8082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumber8082.class,args);
    }
}
