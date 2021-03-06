package com.song.p7.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description TODO
 * @Date 2020/5/10 12:40
 * @Created by Jeremy
 */
@SpringBootApplication
@MapperScan(basePackages = "com.song")
@EnableTransactionManagement
@EnableSwagger2
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
