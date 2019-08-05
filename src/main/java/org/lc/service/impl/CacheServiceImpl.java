package org.lc.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.lc.service.CacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CacheServiceImpl implements CacheService {

    @Override
    @Cacheable("cacheNums")
    public Integer test(String num) {
        log.info("come in test method");
        return 123;
    }
}
