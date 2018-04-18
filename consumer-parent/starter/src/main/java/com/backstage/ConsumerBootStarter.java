package com.backstage;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.backstage.dao")
@EnableScheduling
@ServletComponentScan
public class ConsumerBootStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerBootStarter.class, args);
    }
}
