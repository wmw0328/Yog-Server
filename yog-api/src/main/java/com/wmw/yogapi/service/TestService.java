package com.wmw.yogapi.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public interface TestService {

    String TestServiceDemo();
}
