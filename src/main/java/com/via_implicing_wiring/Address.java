package com.via_implicing_wiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("address")
//@Primary
public class Address implements Actionable {

    private String city = "Lviv";

    public void action() {
        System.out.println("Address: " + city);
    }
}
