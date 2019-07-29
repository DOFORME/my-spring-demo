package org.lc.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.lc.entity.Student;
import org.lc.service.StudentService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {


    @Override
    public void save(Student student) {
        log.info("save test");
    }

    @Override
    public void delete(int id) {
        log.info("delete test, id: {}", id);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student select(int id) {
        return null;
    }

    @Override
    public void test() {
        log.info("test");
    }
}
