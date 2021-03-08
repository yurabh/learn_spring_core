package com.event.fifth_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        EmployeeManagerImpl controller = context.getBean(EmployeeManagerImpl.class);

        EmployeeDAOImpl employeeDao = context.getBean(EmployeeDAOImpl.class);

        employeeDao.initBean();

        controller.createNewEmployee();

        employeeDao.destroyBean();
    }
}
