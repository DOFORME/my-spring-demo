package org.lc.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

@Slf4j
public class RedisTest {


    @Test
    void connect() {
        Jedis jedis = new Jedis();
        log.info(jedis.ping());
        jedis.close();
    }
}
