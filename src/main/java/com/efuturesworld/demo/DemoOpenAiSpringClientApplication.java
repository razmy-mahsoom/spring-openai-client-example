package com.efuturesworld.demo;

import com.efuturesworld.library.EnableSpringOpenAIClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSpringOpenAIClient
@SpringBootApplication
public class DemoOpenAiSpringClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOpenAiSpringClientApplication.class, args);
    }

}
