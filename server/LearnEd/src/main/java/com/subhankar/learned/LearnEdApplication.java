package com.subhankar.learned;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LearnEdApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnEdApplication.class, args);
    }

}
