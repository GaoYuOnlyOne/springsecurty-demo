package com.gy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.gy.demo.mapper")
public class SpringsecurityDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityDemo3Application.class, args);
    }

}
