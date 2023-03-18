# О программе
Программа создана для Керженского заповедника для сбора данных метеостанции Davis (Черноречье) и рабочего места лаборанта Galina в Yandex облаке

## Профили 
### H2 
devmem - Разработка, H2 в памяти
devfs - Разработка, H2 в /data/meteo

Для devfs доступна консоль:
Поле в диалоге    |  Значение
------------------|----------------------------------------------
Доступна консоль: | http://localhost:<порт приложения>/h2-console
Saved Settings:   | Generic H2 (Embedded)
Driver Class:     | org.h2.Driver
Setting Name:     | Generic H2 (Embedded)
JDBC URL:         | jdbc:h2:/data/meteo/galina
User Name:        | sa
Password:         | password



### PostgreSQL
prod - Прод
Устанавливаются в davis/src/main/resources/application.properties

## Формат времени
'2011-12-03', если дата не передается, то устанавливается текущее время
'10:15:30', если время не передается, то устанавливется '00:00:00'

## Davis 
### Настройка Davis 
Порт можно сменить в файле конфигурации davis/src/main/resources/application.properties
```
server.port=8082
```
### Запуск Davis 
```
cd davis/
mvn clean spring-boot:run
```
### Проверка Davis 
http://localhost:8082/davis

## Galina
### Настройка Galina 
Порт можно сменить в файле конфигурации galina/src/main/resources/application.properties
```
server.port=8081
```
## Запуск Galina
```
cd galina/
mvn clean spring-boot:run 
```
## Проверка Galina
http://localhost:8081/observ
