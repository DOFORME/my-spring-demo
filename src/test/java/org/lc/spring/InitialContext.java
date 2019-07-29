package org.lc.spring;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.lc.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class InitialContext {

    private static ClassPathXmlApplicationContext ctx;


    @BeforeAll
    static void init() {
        ctx = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @Test
    void runContainer() {
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
        log.info(student.toString());
    }

}
