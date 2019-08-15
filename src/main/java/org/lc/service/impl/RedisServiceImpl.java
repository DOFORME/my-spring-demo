package org.lc.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lc.entity.Student;
import org.lc.service.RedisService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class RedisServiceImpl implements RedisService {

    private StringRedisTemplate stringRedisTemplate;

    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void equals() {
        log.info("equals ? {}", stringRedisTemplate.equals(redisTemplate));
    }

    @Override
    public void opsString1() {
        stringRedisTemplate.opsForValue().set("test", "server test");
    }

    @Override
    public void opsString2() {
        redisTemplate.opsForValue().set("test2", "server test2");
    }

    @Override
    public void opsString3() {

    }

    @Override
    public void opsString4() {

    }

    @Override
    @Cacheable(value = "common", key = "#id")
    public Student testCache(int id) {
        log.info("方法体执行");
        Student student = new Student();
        student.setName("test").setAge(20);
        return student;
    }
}
