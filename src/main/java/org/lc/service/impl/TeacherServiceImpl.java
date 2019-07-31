package org.lc.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.lc.entity.Teacher;
import org.lc.service.TeacherService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {
    @Override
    public boolean save(Teacher teacher) {
        return false;
    }
}
