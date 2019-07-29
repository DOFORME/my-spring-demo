package org.lc;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * ExtendWith junit5和spring整合时使用
 * SpringExtension.class spring提供给junit5测试使用
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-context.xml")
public class BaseTest {
}
