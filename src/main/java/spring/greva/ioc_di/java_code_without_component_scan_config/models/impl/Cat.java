package spring.greva.ioc_di.java_code_without_component_scan_config.models.impl;

import org.springframework.beans.factory.annotation.Value;
import spring.greva.ioc_di.models.AbstractCat;

public class Cat extends AbstractCat {
    @Value("${xml.config.cat.name}")
    public void setName(String name) {
        super.setName(name);
    }
}
