В данном проекте рассматриваются 4 варианта конфигурации Spring приложения:
1. Xml конфигурация
2. Xml + Annotation конфигурация
3. JavaCode конфигурация (когда бины - классы, помеченные аннотацией @Component)
4. JavaCode конфигурация (когда все бины регистрируются в классе-конфигурации)

Детальные комментарии даны в xml файлах, Java классах.
Список рассматриваемых фич:
1. Регистрация бинов
2. Внедрение зависимостей через (бинов и констант)
2.1 Конструктор
2.2 Сеттер
2.3 Поле
3. Использование .properties файла

Все примеры предельно простые и призваны познакомить пользователя с основами таких иснтрументов, как Инверсия контроля и Внедрения зависимостей, а также продемоснтрировать рахличные варианты конфигурирования Spring приложения.
