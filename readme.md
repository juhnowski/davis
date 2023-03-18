# О программе
Программа создана для Керженского заповедника для сбора данных метеостанции Davis (Черноречье) и рабочего места лаборанта Galina в Yandex облаке

## Профили 
devmem - Разработка, H2 в памяти
devfs - Разработка, H2 в /data/meteo
prod - Прод
Устанавливаются в davis/src/main/resources/application.properties


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
