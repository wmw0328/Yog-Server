package com.yog.yogservice.service;

import com.wmw.yogapi.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class TestServiceImpl implements TestService {

    @Override
    public void TestServiceDemo() {
        System.out.println("Test 阿三的混矿");
    }
}
