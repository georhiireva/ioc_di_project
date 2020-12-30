package spring.greva.ioc_di.xml_config.models.impl;

import spring.greva.ioc_di.models.AbstractPerson;
import spring.greva.ioc_di.models.IPet;

import java.util.UUID;

public class Person extends AbstractPerson {
    public Person(IPet IPet, String name) {
        super(IPet, name);
    }
}
