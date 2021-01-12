package spring.greva.ioc_di.java_code_config.models.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractDog;

@Component("dogBean")
@Scope("prototype")
public class Dog extends AbstractDog {
}
