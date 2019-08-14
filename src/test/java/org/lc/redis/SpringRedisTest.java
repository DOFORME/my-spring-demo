package org.lc.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lc.BaseTest;
import org.lc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class SpringRedisTest extends BaseTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate<String, HashMap<String, String>> hashMapRedisTemplate;

    @Autowired
    private StudentRedisTemplate studentRedisTemplate;

    @Test
    void equals() {
        hashMapRedisTemplate.setKeySerializer(new StringRedisSerializer());

        System.out.println(redisTemplate == hashMapRedisTemplate);
        System.out.println(redisTemplate == stringRedisTemplate);

        System.out.println(redisTemplate.getKeySerializer() instanceof StringRedisSerializer);
        System.out.println(hashMapRedisTemplate.getKeySerializer() instanceof  StringRedisSerializer);
    }

    @Test
    void operate() {
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set("test key", "test value");
    }

    @Test
    void operateValue() {

    }

    @Test
    void operateHash() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        redisTemplate.opsForHash().putAll("map", map);
    }

    @Test
    void operateHash2() {
        Map<String, String> map = redisTemplate.opsForHash().entries("map");
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    @Test
    void operateHash3() {
        // 设置序列化方案，防止乱码
        RedisSerializer<String> stringRedisSerializer = new StringRedisSerializer();
        hashMapRedisTemplate.setHashKeySerializer(stringRedisSerializer);
        hashMapRedisTemplate.setKeySerializer(stringRedisSerializer);
        hashMapRedisTemplate.setHashValueSerializer(stringRedisSerializer);

        HashOperations<String, String, String> hashOperations = hashMapRedisTemplate.opsForHash();
        hashOperations.put("test", "k", "v");
    }

    @Test
    void operateStudent1() {
        RedisSerializer<String> stringRedisSerializer = new StringRedisSerializer();
        studentRedisTemplate.setKeySerializer(stringRedisSerializer);

        Student student = new Student();
        student.setName("test");
        student.setAge(10);
        studentRedisTemplate.opsForValue().set("abc", student);

        Student s = studentRedisTemplate.opsForValue().get("abc");
        if (s != null) {
            System.out.println("student msg: " + s.getName());
        }
    }

    @Test
    void operateStudent2() {
    }
}
