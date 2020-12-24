package spring.greva.ioc_di.xml_config.models.impl;

import spring.greva.ioc_di.models.AbstractPerson;
import spring.greva.ioc_di.models.IPet;

public class Person extends AbstractPerson {
    public Person(IPet IPet) {
        super(IPet);
    }
}
