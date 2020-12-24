package spring.greva.ioc_di.java_code_without_component_scan_config.models.impl;

import org.springframework.stereotype.Component;
import spring.greva.ioc_di.java_code_without_component_scan_config.models.Pet;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
