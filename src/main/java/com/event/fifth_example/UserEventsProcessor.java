package com.event.fifth_example;

import org.springframework.context.ApplicationListener;

public class UserEventsProcessor
        implements ApplicationListener<EmployeeEvent> {

    public void onApplicationEvent(EmployeeEvent event) {
        System.out.println("Employee: " + event.getEventType()
                + "with details: " + event.getEmployee());
    }
}
