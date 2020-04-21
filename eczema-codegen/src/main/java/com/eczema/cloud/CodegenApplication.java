package com.eczema.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CodegenApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodegenApplication.class, args);
    }

}
