package org.lc.service;

import org.lc.entity.Student;

public interface StudentService {

    void save(Student student);

    void delete(int id);

    void update(Student student);

    Student select(int id);

    void test();
}
