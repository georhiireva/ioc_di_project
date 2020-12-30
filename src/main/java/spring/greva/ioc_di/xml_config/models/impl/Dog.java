package spring.greva.ioc_di.xml_config.models.impl;

import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractDog;

@Component("dogBean")
public class Dog extends AbstractDog {
    // Можно выбрать любое имя
    // Модификатор доступа может быть любым
    // Возвращаемое значение может быть любым
    // Не должно быть параметров
    // Если scope == prototype, то init метод будет вызван для каждого созданного бина,
    // а вот destroy метод вызываться для таких бинов не будет.
    public void init() {
        System.out.println("Класс Dog, сработал init метод");
    }

    private String destroy() {
        System.out.println("Класс Dog, сработал destroy метод");
        return "Класс Dog, сработал destroy метод";
    }
}
