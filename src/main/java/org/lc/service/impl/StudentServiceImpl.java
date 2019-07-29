package org.lc.service.impl;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.lc.dao.impl.StudentDaoImpl;
import org.lc.entity.Student;
import org.lc.service.StudentService;
import org.springframework.stereotype.Service;

@Setter
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private StudentDaoImpl studentDao;


    @Override
    public void save(Student student) {
        log.info("student service save method");

        studentDao.save(student);
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
