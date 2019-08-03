package org.lc.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyTimeTaskDemo {

    @Scheduled(cron = "0 0 * * * ?")
    public void timePrint() {
        log.info("定时任务");
    }
}
