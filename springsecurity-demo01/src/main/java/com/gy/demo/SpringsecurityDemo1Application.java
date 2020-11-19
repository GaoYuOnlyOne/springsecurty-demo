package com.gy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gy.demo")
public class SpringsecurityDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityDemo1Application.class, args);
    }

}
