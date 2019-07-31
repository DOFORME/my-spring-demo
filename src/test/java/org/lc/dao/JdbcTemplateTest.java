package org.lc.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lc.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
public class JdbcTemplateTest extends BaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String countSql = "select count(*) from student";

    @Test
    void select() {
        Integer count = jdbcTemplate.queryForObject(countSql, Integer.class);
        log.info("{}", count);
        jdbcTemplate.queryForObject(countSql, Integer.class);
    }
}
