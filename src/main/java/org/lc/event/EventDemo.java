package org.lc.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class EventDemo extends ApplicationEvent {

    private String message;


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public EventDemo(Object source, String msg) {
        super(source);
        this.message = msg;
    }
}
