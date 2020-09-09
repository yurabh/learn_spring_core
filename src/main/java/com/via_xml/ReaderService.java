package com.via_xml;

public class ReaderService {

    private FileReader fileReader;

    public ReaderService(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void action() {
        fileReader.readFile();
    }
}
