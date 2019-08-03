package org.lc.controller;

import lombok.AllArgsConstructor;
import org.lc.service.EventService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("event")
@RestController
public class EventController {

    private EventService eventService;

    @RequestMapping("test")
    public void publishTest() {
        eventService.publish();
    }
}
