package org.lc.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lc.dao.TeacherMapper;
import org.lc.entity.Teacher;
import org.lc.service.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class TeacherServiceImpl implements TeacherService {

    private TeacherMapper teacherMapper;

    @Override
    public boolean save(Teacher teacher) {
        log.info("come in teacher service save()");
        int result = teacherMapper.save(teacher);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result > 0;
    }

    @Override
    public int count() {
        log.info("come in count()");
        long start = System.currentTimeMillis();
        int count = teacherMapper.count();
        long end = System.currentTimeMillis();
        log.info("take {} ms", end - start);
        return count;
    }

    @Override
    public boolean updateNameById(int id, String name) {
        teacherMapper.updateNameById(id, name);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Teacher getById(int id) {
        log.info("come in getById()");
        long start = System.currentTimeMillis();
        teacherMapper.getById(id);
        long end = System.currentTimeMillis();
        log.info("take {} ms", end - start);
        return null;
    }

}
