package spring.greva.ioc_di.xml_config.models.impl;

import org.springframework.stereotype.Component;
import spring.greva.ioc_di.models.AbstractCat;

// Аннотация @Component помечает класс, как бин. Бины - это все объекты, которые управляются спрингом и живут
// в контексте.
// Если не указать айди бина в скобках, то по умолчанию будет имя класса с маленькой буквы: "cat"
// Но есть исключение - если хотя бы две первые буквы заглавные - имя не меняется.
// Cat -> cat
// FavouriteSong -> favouriteSong
// SQLTest -> SQLTest
@Component("catBean")
public class Cat extends AbstractCat {
}
