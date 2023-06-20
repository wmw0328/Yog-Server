package com.yog.yogweb.controller;

import com.wmw.yogapi.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "测试模块",value = "测试")
@RestController
@RequestMapping("/Test")
public class TestController {

    @DubboReference(version = "1.0.0")
    private TestService testService;


    @ApiOperation("测试1")
    @GetMapping("/test1")
    public String test1(){
        testService.TestServiceDemo();
        return "test1";
    }
}
