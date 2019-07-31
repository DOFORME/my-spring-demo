package org.lc.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lc.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@Slf4j
public class SpringRedisTest extends BaseTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void operate() {
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set("test key", "test value");
    }
}
