package com.test4fclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 作者: LCG
 * 日期: 2019/11/29 16:33
 * 描述:
 */
@SpringBootApplication
@EnableEurekaClient
public class TestClient2Application {
    public static void main(String[] args) {
        SpringApplication.run(TestClient2Application.class);
    }
}
