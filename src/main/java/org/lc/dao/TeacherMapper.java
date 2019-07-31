package org.lc.dao;

import org.lc.entity.Teacher;

public interface TeacherMapper {

    int save(Teacher teacher);

    int count();
}
