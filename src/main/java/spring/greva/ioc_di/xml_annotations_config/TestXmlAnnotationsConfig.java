package spring.greva.ioc_di.xml_annotations_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.greva.ioc_di.models.IPet;

// Общий смысл такой:
// В конфиг файле описывается только ComponentScan - директория, которую спринг сканирует, чтобы найти
// классы, помеченные аннотацией @Component - это и есть будущие бины.
// Спринг находит их, регистрирует и помещает в контекст, из которого потом можно забрать бин
public class TestXmlAnnotationsConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextXmlAnnotationConfig.xml");

        IPet pet = context.getBean("catBean", IPet.class);
        pet.say();

        context.close();
    }
}
