# Дипломный проект по профессии «Инженер по тестированию»

## Приложение «Мобильный хоспис»
Необходимо провести ручное функциональное тестирование и разработку автоматизированных тестов.

### Функционал приложения

страница авторизации;

новости и функционал для работы с новостями;

тематические цитаты.


### Результаты выполнения проекта:

Проведено ручное тестирование мобильного приложения «Мобильный хоспис»

Составлены чек-листы и тест кейсы для проверки приложения

Автоматизированы тестовые сценарии

## Запуск автотестов
Порядок запуска автотестов:

1. Склонировать [репозиторий](https://github.com/LSOrlova/diplom_vers_3) . Открыть склонированый проект в AndroidStudio

2. Установить приложение "Мобильный хоспис" на мобильное устройство / эмулятор. Запустить эмулятор Pixel 6 API 29 или подключить устройство для тестирования.

3. Запустить тесты командой ./gradlew connectedAndroidTest

### Oтчет

1. В папке эмулятора data/data/ru.iteco.fmhandroid/files скопировать папку allure-results в проект
2. Для генерации отчёта и просмотра необходимо в директории с папкой allure-results выполнить команду в командной строке allure serve


## Отчетная документация
* [План тестирования](https://github.com/LSOrlova/diplom_vers_3/blob/master/Plan.md)
* [Чек-лист](https://github.com/LSOrlova/diplom_vers_3/blob/master/check_list_hospis.xlsx)
* [Тест-кейсы](https://github.com/LSOrlova/diplom_vers_3/blob/master/test_cases_in_hospis.xlsx)
* [Результаты](https://github.com/LSOrlova/diplom_vers_3/blob/master/Result.md)
