package org.lc.dao;

import org.lc.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {

    int save(Teacher teacher);

    int count();

    int updateNameById(int id, String name);

    Teacher getById(int id);
}
