package spring.greva.ioc_di.java_code_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.greva.ioc_di.java_code_config.models.Pet;

// Общий смысл такой же, как и в TestXmlAnnotationsConfig
// Разница в том, что вместо xml конфига с указанием Component-Scan используется Java класс
// с аннотацией @ComponentScan которая делает то же самое - указывает спрингу, где искать бины
public class TestJavaCodeConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationContextJavaCode.class);

        Pet pet = context.getBean("dogBean", Pet.class);
        pet.say();

        context.close();
    }
}
