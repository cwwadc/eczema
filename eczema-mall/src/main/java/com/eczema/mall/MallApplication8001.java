package com.eczema.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication8001.class,args);
    }
}
