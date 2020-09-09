package com.via_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class TestViaJava {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ConfigApp.class);

        Tree tree = context.getBean("tree1", Tree.class);

        System.out.println(tree.getName());


        Leaf leaf = context.getBean("gun", Leaf.class);

        leaf.getAddress().action();

        System.out.println(leaf.getTree().getName());


        leaf.getBallable().call();

        tree.setName("yura");

        System.out.println(tree.getName());


        Leaf leafNew = context.getBean("fir", Leaf.class);

        System.out.println(leafNew.getTree().getName());


        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();

        applicationContext.refresh();

        Resource resource = applicationContext.getResource(
                "https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#spring-core");

        System.out.println("resource: " + resource);


        Resource resourceNew = applicationContext.getResource("config.xml");

        System.out.println("config is file: " + resourceNew.isFile());

        System.out.println("is open: " + resourceNew.isOpen());

        String description = resourceNew.getDescription();

        System.out.println("description: " + description);
    }
}
