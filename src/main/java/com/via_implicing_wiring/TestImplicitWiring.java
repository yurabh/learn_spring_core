package com.via_implicing_wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestImplicitWiring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        Man man = context.getBean(Man.class);

        man.getActionable().action();

        man.getPhone().action();

        man.getReader().readFile();
    }
}
