package com.minelan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.minelan.mapper")
public class ShunxinConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShunxinConsoleApplication.class, args);
    }

}
