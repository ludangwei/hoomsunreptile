package com.hoomsun.reptile.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by bigyoung on 2017/12/1
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.hoomsun.reptile")
@MapperScan(basePackages = "com.hoomsun.reptile.dao")
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
