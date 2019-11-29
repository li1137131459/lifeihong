package com.test4fclient2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者: LCG
 * 日期: 2019/11/29 16:30
 * 描述:
 */

@RestController
public class TestClient2Controller {

    @RequestMapping("test2")
    public String testClient2(){
        return "testClient2";
    }

}
