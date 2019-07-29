package org.lc.service;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-context.xml")
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;


    @Test
    public void test() {
        studentService.test();
    }

    @Test
    public void test2() {
        assertNotNull(studentService);
    }
}
