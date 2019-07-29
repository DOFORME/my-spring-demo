package org.lc.xmlbean;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.lc.entity.Student;
import org.lc.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
public class BeanTest {

    private static ApplicationContext ctx;

    @BeforeAll
    static void init() {
        ctx = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @Test
    void getBean1() {
        Student student = ctx.getBean("student", Student.class);
        log.info(student.toString());
    }

    @Test
    void getBean2() {
        StudentServiceImpl studentService = ctx.getBean("studentService", StudentServiceImpl.class);
        assertNotNull(studentService);

        studentService.save(null);
    }
}
