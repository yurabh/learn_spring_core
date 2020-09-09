package com.open_closed_interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

interface Actionable {
    void action();
}


@Component
public class One {

    private String name = "Lviv";

    private Two two;

    @Autowired
    public One(@Qualifier("two") Two two) {
        this.two = two;
    }

    public void action() {
        System.out.println("One Action: " + name);
    }

    public void actionTwo() {
        two.action();
    }
}


@Component
class RefactorOne {

    private String name = "ok";

    private Actionable actionable;

    @Autowired
    public RefactorOne(@Qualifier("three") Actionable actionable) {
        this.actionable = actionable;
    }

    public void action() {
        System.out.println("RefactorOne:" + name);
        actionable.action();
    }
}


@Component
@Qualifier("two")
class Two implements Actionable {
    public void action() {
        System.out.println("Two Action");
    }
}


@Component
@Qualifier("three")
class Three implements Actionable {
    public void action() {
        System.out.println("Tree Action");
    }
}


class TestOpenClosed_Interface {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("config.xml");

        One one = context.getBean(One.class);

        one.action();

        one.actionTwo();

        RefactorOne refactorOne = context.getBean(RefactorOne.class);

        refactorOne.action();
    }
}
