package org.lc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lc
 */

@Slf4j
@RestController
@RequestMapping("data")
public class DataBinderController {

    @RequestMapping("test1")
    public void test1(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
        log.info(date.toString());
    }

    @RequestMapping("test2")
    public void test2(@NumberFormat(pattern = "#,###.##") Long  l) {
        log.info("number: {}", l);
    }
}
