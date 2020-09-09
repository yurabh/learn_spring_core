package com.via_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlSpring {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        FileReader fileReader = context.getBean(FileReader.class);

        fileReader.readFile();

        ReaderService readerService = context.getBean(ReaderService.class);

        readerService.action();
    }
}
