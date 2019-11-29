package com.li.controller;

import com.li.api.TestClient2Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者: LCG
 * 日期: 2019/11/29 16:37
 * 描述:
 */

@RestController
public class TestClient1Contrioller {

    @Autowired
    private TestClient2Api testClient2Api;

    @RequestMapping("test01")
    public String test1(){
        String test01 = testClient2Api.test01();

        return test01;
    }

}
