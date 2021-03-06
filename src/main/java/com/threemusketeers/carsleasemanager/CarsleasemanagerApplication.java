package com.threemusketeers.carsleasemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.threemusketeers.carsleasemanager.mapper")
public class CarsleasemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsleasemanagerApplication.class, args);
    }

}
