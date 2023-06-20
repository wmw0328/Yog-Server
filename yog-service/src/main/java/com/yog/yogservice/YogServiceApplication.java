package com.yog.yogservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class YogServiceApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(YogServiceApplication.class, args);
        }catch (Throwable e){
            e.printStackTrace();
        }
    }

}
