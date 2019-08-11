package org.lc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author lc
 */
@Slf4j
@RestController
@RequestMapping("rest")
public class MappingController {

    @GetMapping("test")
    public void test1() {
        log.info("this is get request handler");
    }

    @PostMapping("test")
    public void test2() {
        log.info("this is post request handler");
    }

    @GetMapping(value = "test2", headers = "version=1.0")
    public void test3() {
        log.info("this is version 1.0");
    }

    @GetMapping(value = "test2", headers = "version=2.0")
    public void test4() {
        log.info("this is version 2.0");
    }

    @GetMapping(value = "test3", params = "id=1")
    public void test5() {
        log.info("this is id = 1");
    }

    @GetMapping(value = "test3", params = "id=2")
    public void test6() {
        log.info("this is id = 2");
    }
}
