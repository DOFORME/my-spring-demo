package org.lc.service;

import org.lc.entity.Teacher;

public interface TeacherService {

    boolean save(Teacher teacher);

    int count();

    boolean updateNameById(int id, String name);

    Teacher getById(int id);
}
