package com.li.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者: LCG
 * 日期: 2019/11/29 16:35
 * 描述:
 */

@FeignClient(name = "CLIENT2")
public interface TestClient2Api {

    @RequestMapping("test2")
    public String test01();

}
