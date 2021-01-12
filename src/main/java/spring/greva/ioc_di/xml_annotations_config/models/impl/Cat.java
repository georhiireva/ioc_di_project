package spring.greva.ioc_di.xml_annotations_config.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractCat;
import spring.greva.ioc_di.models.AbstractDog;

// Аннотация @Component помечает класс, как бин. Бины - это все объекты, которые управляются спрингом и живут
// в контексте.
// Если не указать айди бина в скобках, то по умолчанию будет имя класса с маленькой буквы: "cat"
// Но есть исключение - если хотя бы две первые буквы заглавные - имя не меняется.
// Cat -> cat
// FavouriteSong -> favouriteSong
// SQLTest -> SQLTest
@Component("catBean")
@Scope("prototype")
public class Cat extends AbstractCat {
    /**
     * @Autowired: конструктор, сеттер, поле
     * @param name
     */

    /**
     * @Value - это аналог инъекции значения (как сделано в чистой xml конфигурации)
     * Происходит автоматическое внедрение при старте приложения (дополнительно писать Autowired не нужно)
     * @see applicationContextXmlConfig.xml
     * @param name
     */
    @Override
    //@Value("#{application.properties['xml.config.cat.name']}") - Проперти доступно для перехода, но не подтягивается
    @Value("${xml.config.cat.name}") // Рабочий вариант
    public void setName( String name) {
        super.setName(name);
    }
}
