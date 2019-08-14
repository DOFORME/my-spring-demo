package org.lc.service.impl;

import org.junit.jupiter.api.Test;
import org.lc.BaseTest;
import org.lc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class RedisServiceImplTest extends BaseTest {

    @Autowired
    private RedisService redisService;

    @Test
    void equals1() {
        redisService.equals();
    }

    @Test
    void opsString1() {
        redisService.opsString1();
    }

    @Test
    void opsString2() {
    }

    @Test
    void opsString3() {
    }

    @Test
    void opsString4() {
    }
}