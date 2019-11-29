package com.li;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 作者: LCG
 * 日期: 2019/11/29 16:19
 * 描述:
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class TestClient1Application {
    public static void main(String[] args) {
        SpringApplication.run(TestClient1Application.class);
    }
}
