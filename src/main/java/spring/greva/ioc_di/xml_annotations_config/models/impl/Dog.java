package spring.greva.ioc_di.xml_annotations_config.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractDog;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("singleton")
public class Dog extends AbstractDog {
    @Override
    @Value("${xml.config.dog.name}")
    public void setName(String name) {
        super.setName(name);
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog.class: Init method is working");
    }

    /**
     * Не выполнится для Scope(prototype)
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Dog.class: Destroy method is working");
    }
}
