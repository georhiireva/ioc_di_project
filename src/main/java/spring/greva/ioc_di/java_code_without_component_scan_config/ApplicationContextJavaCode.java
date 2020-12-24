package spring.greva.ioc_di.java_code_without_component_scan_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.greva.ioc_di.java_code_without_component_scan_config.models.Pet;
import spring.greva.ioc_di.java_code_without_component_scan_config.models.impl.Cat;
import spring.greva.ioc_di.java_code_without_component_scan_config.models.impl.Dog;

// Аннотация @Configuration говорит, что этот класс является конфигурацией. Больше никаких xml конфиг файлов нет.
// В этом классе описываются все бины, зависимости, инъекции и тд. Имя метода - это то имя, по которому можно
// получить бин из контекста.
// Аннотация @Bean говорит о том, что это бин.
@Configuration
public class ApplicationContextJavaCode {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Pet dogBean() {
        return new Dog();
    }
}
