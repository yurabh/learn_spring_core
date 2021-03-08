package com.event.fifth_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager,
        ApplicationEventPublisherAware {

    @Autowired
    private EmployeeDAO dao;

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public EmployeeDTO createNewEmployee() {
        EmployeeDTO employee = dao.createNewEmployee();
        publisher.publishEvent(new EmployeeEvent(this, "addEmployee", employee));
        return employee;
    }
}
