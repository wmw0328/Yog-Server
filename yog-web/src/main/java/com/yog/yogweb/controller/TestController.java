package com.yog.yogweb.controller;

import com.wmw.yogapi.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {

    @DubboReference(version = "1.0.0")
    private TestService testService;

    @RequestMapping("/test1")
    public String test1(){
        testService.TestServiceDemo();
        return "test1";
    }
}
