package org.lc.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

@Slf4j
public class LogAspect {

    public Object printLog(ProceedingJoinPoint call) throws Throwable {
        log.error("this is the aspect");
        return call.proceed();
    }
}
