package org.lc.controller;

import lombok.AllArgsConstructor;
import org.lc.service.RedisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("redis")
public class RedisController {

    private RedisService redisService;

    @RequestMapping("test1")
    public void test1() {
        redisService.opsString1();
    }

    @RequestMapping("test2")
    public void test2() {
        redisService.opsString2();
    }

    @RequestMapping("test3")
    public void test3() {
        redisService.testCache(3);
    }
}
