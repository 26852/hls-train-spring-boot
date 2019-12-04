package com.hand.hls.springbootssmdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hand.hls.springbootssmdemo.mapper")
public class SpringbootssmdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootssmdemoApplication.class, args);
    }

}
