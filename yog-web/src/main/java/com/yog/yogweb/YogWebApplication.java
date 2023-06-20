package com.yog.yogweb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableDubbo
@EnableOpenApi
@SpringBootApplication
public class YogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(YogWebApplication.class, args);
    }

}
