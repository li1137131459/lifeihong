package com.li;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 作者: LCG
 * 日期: 2019/11/29 15:42
 * 描述:
 */
@SpringBootApplication
@EnableEurekaServer
public class TestServer1 {

    public static void main(String[] args) {
        SpringApplication.run(TestServer1.class);
    }

}
