package org.lc.tx;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lc.BaseTest;
import org.lc.entity.Clazz;
import org.lc.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Slf4j
public class SpringTxTest extends BaseTest {

    @Autowired
    private ClazzService clazzService;

    @Test
    void tx() {

//        Clazz clazz = new Clazz();
//        clazz.setCode(2).setName("native language").setCreateTime(LocalDateTime.now());
//        clazzMapper.save(clazz);
//        double num = Math.random();
//        if (num < 1) {
//            throw new RuntimeException("随机产生异常");
//        }
//        Teacher teacher = new Teacher();
//        teacher.setName("lily").setAge(40).setGender(1).setFlag(1).setCreateTime(LocalDateTime.now());
//        teacherMapper.save(teacher);
    }

    @Test
    @Transactional
    void tx2() {
        Clazz clazz = new Clazz();
        clazz.setCode(2).setName("native language").setCreateTime(LocalDateTime.now());
        clazzService.save(clazz);
    }
}
