package com.via_implicing_wiring;

import com.via_xml.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("man")
public class Man {

    @Autowired
    @Qualifier("address")
    private Actionable actionable;

    @Autowired
    private Phone phone;

    @Autowired
    private FileReader reader;

    public Actionable getActionable() {
        return actionable;
    }

    public Phone getPhone() {
        return phone;
    }

    public FileReader getReader() {
        return reader;
    }
}
