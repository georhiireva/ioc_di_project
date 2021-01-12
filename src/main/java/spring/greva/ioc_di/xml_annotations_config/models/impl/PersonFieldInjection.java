package spring.greva.ioc_di.xml_annotations_config.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractPerson;
import spring.greva.ioc_di.models.IPet;

@Component("personFieldInjectionBean")
public class PersonFieldInjection extends AbstractPerson {
    @Value("${xml.config.person.surname}")
    private String _surName;
    @Autowired
    @Qualifier("catBean")
    private IPet _anotherPet;

    public String getSurName() {
        return _surName;
    }

    public IPet getAnotherPet() {
        return _anotherPet;
    }
}
