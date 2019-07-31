package org.lc.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lc.BaseTest;
import org.lc.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TeacherMapperTest extends BaseTest {

    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    void count() {
        int count = teacherMapper.count();
        log.info("{}",count);
    }
}
