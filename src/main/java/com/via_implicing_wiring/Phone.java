package com.via_implicing_wiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Qualifier("phone")
public class Phone implements Actionable {

    private String number = "067";

    public void action() {
        System.out.println("Phone: " + number);
    }
}
