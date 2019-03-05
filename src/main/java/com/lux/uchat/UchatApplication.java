package com.lux.uchat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lux.uchat.Dao")
public class UchatApplication {

    public static void main(String[] args) {
        SpringApplication.run(UchatApplication.class, args);
    }

}
