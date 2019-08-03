package org.lc.event;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class MyEventPublisher {

    private ApplicationEventPublisher applicationEventPublisher;

    public void publish() {
        EventDemo eventDemo = new EventDemo(this, "test");
        applicationEventPublisher.publishEvent(eventDemo);
        log.info("my event has published");
    }
}
