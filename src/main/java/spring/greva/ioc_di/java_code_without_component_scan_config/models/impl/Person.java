package spring.greva.ioc_di.java_code_without_component_scan_config.models.impl;

import org.springframework.beans.factory.annotation.Value;
import spring.greva.ioc_di.models.AbstractPerson;
import spring.greva.ioc_di.models.IPet;

public class Person extends AbstractPerson {
    @Value("${xml.config.person.name}")
    private String _surname;

    public Person(IPet pet) {
        super();
        super.setPet(pet);
    }

    public String getSurname() {
        return _surname;
    }
}
