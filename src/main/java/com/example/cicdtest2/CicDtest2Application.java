package com.example.cicdtest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CicDtest2Application {

    public static void main(String[] args) {
        SpringApplication.run(CicDtest2Application.class, args);
    }

}
