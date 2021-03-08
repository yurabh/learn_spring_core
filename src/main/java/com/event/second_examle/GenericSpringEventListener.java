package com.event.second_examle;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventListener {
    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent<String> event) {
        System.out.println("Handling generic event (conditional)." + event.getWhat()
                + event.isSuccess());
    }
}
