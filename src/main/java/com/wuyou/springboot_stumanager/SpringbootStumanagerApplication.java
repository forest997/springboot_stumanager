package com.wuyou.springboot_stumanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wuyou")
@MapperScan("com.wuyou.dao")
public class SpringbootStumanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStumanagerApplication.class, args);
    }

}
