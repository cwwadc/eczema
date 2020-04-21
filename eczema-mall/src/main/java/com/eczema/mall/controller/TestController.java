package com.eczema.mall.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mall")
public class TestController {

    @Value("${server.port}")
    private String serverPort;
    @Value("${config.version}")
    private String configVersion;

    @GetMapping("/hello")
    public String hello(){
        return serverPort;
    }

    @GetMapping("/version")
    public String getConfigVersion(){
        return configVersion;
    }
}
