package spring.greva.ioc_di.xml_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.greva.ioc_di.xml_config.models.Pet;

// Общий смысл такой:
// В конфиг файле прописываются все бины
// Спринг резолвит этот конфиг файл и регистрирует бины и помещает их в контекст
// Из контекста можно взять бин
public class TestXmlConfiguration {
    public static void main(String[] args) {
        // Создается контекст, которому в параметры передается конфигурационный файл, в котором описаны бины
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextXmlConfig.xml");

        // Получить бин можно, указав айди и класс, либо просто класс, если бин такого класса в конфиге только один
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        // Всегда надо закрывать контекст
        context.close();
    }
}
