package org.lc.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.lc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-context.xml")
public class AnnotationTest {

    @Autowired
    private Student student;

    @Test
    void printStudent() {
        log.info(student.toString());
    }
}
