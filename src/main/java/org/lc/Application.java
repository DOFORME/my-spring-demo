package org.lc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Slf4j
public class Application {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        log.info(Arrays.toString(args));
    }
}
