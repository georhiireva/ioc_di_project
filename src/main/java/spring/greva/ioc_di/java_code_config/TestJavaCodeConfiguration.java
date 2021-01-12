package spring.greva.ioc_di.java_code_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.greva.ioc_di.java_code_config.models.impl.Cat;
import spring.greva.ioc_di.models.IPet;

// Общий смысл такой же, как и в TestXmlAnnotationsConfig
// Разница в том, что вместо xml конфига с указанием Component-Scan используется Java класс
// с аннотацией @ComponentScan которая делает то же самое - указывает спрингу, где искать бины
public class TestJavaCodeConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationContextJavaCode.class);

        if (false) {
            testBeanCreation(context);
        }

        if (true) {
            testPropertiesConnection(context);
        }

        context.close();
    }

    private static void testBeanCreation(AnnotationConfigApplicationContext context) {
        IPet pet = context.getBean("dogBean", IPet.class);
        pet.say();
    }

    private static void testPropertiesConnection(AnnotationConfigApplicationContext context) {
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());
        cat.say();
    }
}
