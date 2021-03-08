package com.event.fifth_example;

import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String eventType;
    private transient EmployeeDTO employee;

    public EmployeeEvent(Object source, String eventType, EmployeeDTO employee) {
        super(source);
        this.eventType = eventType;
        this.employee = employee;
    }

    public String getEventType() {
        return eventType;
    }

    public EmployeeDTO getEmployee() {
        return employee;
    }
}
