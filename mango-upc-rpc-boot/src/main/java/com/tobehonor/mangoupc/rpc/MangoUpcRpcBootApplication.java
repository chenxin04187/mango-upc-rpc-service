package com.tobehonor.mangoupc.rpc;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class MangoUpcRpcBootApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MangoUpcRpcBootApplication.class);
    }
}
