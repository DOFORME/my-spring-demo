package org.lc.controller;

import lombok.extern.slf4j.Slf4j;
import org.lc.entity.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @author lc
 */
@Slf4j
@RestController
@RequestMapping("resolve")
public class ResolveRequestMethodController {

    /**
     * eg: http://localhost:8080/resolve/test/bob;age=20
     */
    @RequestMapping("test/{name}")
    public void test1(@PathVariable String name, @MatrixVariable int age) {
        log.info("name: {}, age: {}", name, age);
    }

    /**
     * 矩阵变量
     * eg: http://localhost:8080/resolve/test/bob;a=20/or/lili;a=18
     */
    @RequestMapping("test/{name1}/or/{name2}")
    public void test2(@PathVariable String name1, @PathVariable String name2,
                     @MatrixVariable(name = "a", pathVar = "name1") int age1,
                     @MatrixVariable(name = "a", pathVar = "name2") int age2) {
        log.info("name1:{}, name2:{}, age1:{}, age2:{}", name1, name2, age1, age2);
    }

    @RequestMapping("test")
    public void test3(@RequestBody Student student) {
        log.info("student: {}", student);
    }

}
