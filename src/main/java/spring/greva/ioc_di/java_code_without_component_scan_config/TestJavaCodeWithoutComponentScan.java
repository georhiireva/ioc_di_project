package spring.greva.ioc_di.java_code_without_component_scan_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.greva.ioc_di.models.IPet;

// Общий смысл такой: это вторая разновидность конфигурации через Java код. Разница в том, что
// классы (бины) не помечаются аннотацией @Component, а вся информация о бинах, зависимостях и тд
// указывается в конфигурационном Java классе.
public class TestJavaCodeWithoutComponentScan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationContextJavaCode.class);

        IPet pet = context.getBean("catBean", IPet.class);
        pet.say();

        context.close();
    }
}
