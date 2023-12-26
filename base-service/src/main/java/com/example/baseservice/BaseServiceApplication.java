package com.example.baseservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RefreshScope
public class BaseServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(BaseServiceApplication.class, args);
    }

}
