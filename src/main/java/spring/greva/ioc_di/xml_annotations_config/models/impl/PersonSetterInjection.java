package spring.greva.ioc_di.xml_annotations_config.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractPerson;
import spring.greva.ioc_di.models.IPet;

@Component("personSetterInjectionBean")
@Scope("prototype")
public class PersonSetterInjection extends AbstractPerson {
    public PersonSetterInjection() {
        super();
        System.out.println("PersonSetterInjection -> constructor without params is called");
    }

    /**
     * Пример Autowired через сеттер
     * @param pet
     */
    @Override
    @Autowired
    @Qualifier("catBean")
    public void setPet(IPet pet) {
        System.out.println("Method setPet with autowired pet is called. Pet is " + pet.getClass().getSimpleName());
        super.setPet(pet);
    }
}
