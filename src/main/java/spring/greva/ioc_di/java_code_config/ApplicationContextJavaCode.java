package spring.greva.ioc_di.java_code_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Аннотация @Configuration говорит, что этот класс является конфигурацией. Больше никаких xml конфиг файлов нет.
// Аннотация @ComponentScan указывает на директорию, в которой спринг ищет классы, помеченные аннотацией @Component
@Configuration
@ComponentScan("spring.greva.ioc_di.java_code_config.models")
@PropertySource(value = "classpath:application.properties")
public class ApplicationContextJavaCode {
}
