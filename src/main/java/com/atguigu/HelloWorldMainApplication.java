package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinbang
 * @create 2019-02-26 15:56
 */

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot 应用
 */

@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        //String应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);

    }
}
