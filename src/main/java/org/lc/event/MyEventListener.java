package org.lc.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyEventListener implements ApplicationListener<EventDemo> {

    @Async
    @Override
    public void onApplicationEvent(EventDemo event) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("msg listener: {}", event.getMessage());
    }
}
