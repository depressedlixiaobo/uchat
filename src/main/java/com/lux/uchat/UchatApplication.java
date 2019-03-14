package com.lux.uchat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan("com.lux.uchat.dao")
public class UchatApplication {

    public static void main(String[] args) {
        SpringApplication.run(UchatApplication.class, args);
    }

}
