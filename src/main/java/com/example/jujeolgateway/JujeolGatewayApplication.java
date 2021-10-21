package com.example.jujeolgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JujeolGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JujeolGatewayApplication.class, args);
    }

}
