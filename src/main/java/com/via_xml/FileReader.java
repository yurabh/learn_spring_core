package com.via_xml;

public class FileReader {

    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public void readFile() {
        System.out.println("Read from file " + fileName);
    }
}
