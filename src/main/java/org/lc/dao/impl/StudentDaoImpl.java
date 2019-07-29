package org.lc.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.lc.dao.StudentDao;
import org.lc.entity.Student;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class StudentDaoImpl implements StudentDao {


    @Override
    public void save(Student student) {
      log.info("student dao save method");
    }
}
