package spring.greva.ioc_di.xml_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.greva.ioc_di.models.IPerson;
import spring.greva.ioc_di.models.IPet;

// Общий смысл такой:
// В конфиг файле прописываются все бины
// Спринг резолвит этот конфиг файл и регистрирует бины и помещает их в контекст
// Из контекста можно взять бин
public class TestXmlConfiguration {
    public static void main(String[] args) {
        // Создается контекст, которому в параметры передается конфигурационный файл, в котором описаны бины
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextXmlConfig.xml");

        if (false) {
            testIOC(context);
        }

        if (true) {
            testDIWithConstructor(context);
        }


        // Всегда надо закрывать контекст
        context.close();
    }

    // Получить бин можно, указав айди и класс, либо просто класс, если бин такого класса в конфиге только один
    private static void testIOC(ClassPathXmlApplicationContext context) {
        IPet pet = context.getBean("dogBean", IPet.class);
        pet.say();
    }

    private static void testDIWithConstructor(ClassPathXmlApplicationContext context) {
        IPerson person = context.getBean("personBean", IPerson.class);
        person.callPet();
        person.getFriend().callPet();
        person.getFriend().setFriend(person);
    }
}
