package org.lc.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lc.dao.ClazzMapper;
import org.lc.entity.Clazz;
import org.lc.service.ClazzService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor
public class ClazzServiceImpl implements ClazzService {

    private ClazzMapper clazzMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean save(Clazz clazz) {
        int result = clazzMapper.save(clazz);
        double num = Math.random();
        if (num < 1) {
            throw new RuntimeException("随机产生异常");
        }
        return result > 0;
    }
}
