package spring.greva.ioc_di.java_code_config.models.impl;

import org.springframework.stereotype.Component;
import spring.greva.ioc_di.java_code_config.models.Pet;

@Component("dogBean")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
