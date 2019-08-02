package org.lc.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lc.event.MyEventPublisher;
import org.lc.service.EventService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {

    private MyEventPublisher myEventPublisher;

    @Override
    public void publish() {
        myEventPublisher.publish();
        log.info("事件已发布");
    }
}
