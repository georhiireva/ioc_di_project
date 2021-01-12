package spring.greva.ioc_di.java_code_without_component_scan_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import spring.greva.ioc_di.java_code_without_component_scan_config.models.impl.Cat;
import spring.greva.ioc_di.java_code_without_component_scan_config.models.impl.Dog;
import spring.greva.ioc_di.java_code_without_component_scan_config.models.impl.Person;
import spring.greva.ioc_di.models.IPerson;
import spring.greva.ioc_di.models.IPet;

// Аннотация @Configuration говорит, что этот класс является конфигурацией. Больше никаких xml конфиг файлов нет.
// В этом классе описываются все бины, зависимости, инъекции и тд. Имя метода - это то имя, по которому можно
// получить бин из контекста.
// Аннотация @Bean говорит о том, что это бин.
@Configuration
@PropertySource(value = "classpath:application.properties")
public class ApplicationContextJavaCode {
    @Bean
    @Scope("prototype")
    public IPet catBean() {
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public IPet dogBean() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public IPerson personBean() {
        return new Person(catBean());
    }
}
