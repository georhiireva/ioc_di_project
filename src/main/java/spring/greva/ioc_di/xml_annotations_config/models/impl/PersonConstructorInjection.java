package spring.greva.ioc_di.xml_annotations_config.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractPerson;
import spring.greva.ioc_di.models.IPet;

@Component("personConstructorInjectionBean")
@Scope("prototype")
public class PersonConstructorInjection extends AbstractPerson {
    /**
     * Пример Autowired с конструктором. Если бина класса IPet не существует - ошибка, если существует больше
     * одного - ошибка.
     * @param pet
     */
    @Autowired
    public PersonConstructorInjection(@Qualifier("dogBean")IPet pet) {
        setPet(pet);
        System.out.println("PersonConstructorInjection (by Autowired contructor) is created!. Pet is: " + pet.getClass().getSimpleName());
    }
}
