package org.lc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lc.entity.Teacher;
import org.lc.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("transaction")
public class TransactionController {

    private TeacherService teacherService;

    @RequestMapping("test1")
    public void test1() {
        teacherService.save(new Teacher().setName("abc"));
    }

    @RequestMapping("test2")
    public void test2() {
        teacherService.updateNameById(6, "xx");
    }

    @RequestMapping("test3")
    public void test3() {
        teacherService.getById(6);
    }
}
