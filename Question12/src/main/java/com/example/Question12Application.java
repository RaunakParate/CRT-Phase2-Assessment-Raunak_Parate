package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Question12Application {

    public static void main(String[] args) {

        SpringApplication.run(
                Question12Application.class,
                args
        );
    }
}