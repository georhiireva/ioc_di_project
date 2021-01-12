package spring.greva.ioc_di.xml_annotations_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.greva.ioc_di.models.IPerson;
import spring.greva.ioc_di.models.IPet;
import spring.greva.ioc_di.xml_annotations_config.models.impl.PersonConstructorInjection;
import spring.greva.ioc_di.xml_annotations_config.models.impl.PersonFieldInjection;

// Общий смысл такой:
// В конфиг файле описывается только ComponentScan - директория, которую спринг сканирует, чтобы найти
// классы, помеченные аннотацией @Component - это и есть будущие бины.
// Спринг находит их, регистрирует и помещает в контекст, из которого потом можно забрать бин
public class TestXmlAnnotationsConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextXmlAnnotationConfig.xml");

        if (false) {
            testBeanCreation(context);
        }

        if (false) {
            testAutowiredWithConstructor(context);
        }

        if (false) {
            testAutowiredWithSetter(context);
        }

        if (false) {
            testFieldInjection(context);
        }

        if (true) {
            testQualifier(context);
        }

        context.close();
    }

    private static void testBeanCreation(ClassPathXmlApplicationContext context) {
        IPet pet = context.getBean("catBean", IPet.class);
        pet.say();
    }

    private static void testAutowiredWithConstructor(ClassPathXmlApplicationContext context) {
        IPerson person = context.getBean("personConstructorInjectionBean", IPerson.class);
        person.setName("Oleg");
        person.callPet();
    }

    private static void testAutowiredWithSetter(ClassPathXmlApplicationContext context) {
        IPerson person = context.getBean("personSetterInjectionBean", IPerson.class);
        person.setName("Oleg");
        person.callPet();
    }

    private static void testFieldInjection(ClassPathXmlApplicationContext context) {
        PersonFieldInjection person = context.getBean("personFieldInjectionBean", PersonFieldInjection.class);
        System.out.println(person.getSurName());
        System.out.println(person.getAnotherPet().getName());
    }

    private static void testQualifier(ClassPathXmlApplicationContext context) {
        PersonConstructorInjection person = context.getBean(PersonConstructorInjection.class);
        person.callPet();
    }
}
