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
### Запросить все записи
http://localhost:8081/observ

###
```
 curl -X POST localhost:8081/observ -H 'Content-type:application/json' -d '{"MeteoDate":"18.03.23","MeteoTime":"13:14:31","WindDir":"Юг","WindSpeed":"1.1","Pressure":"750","TempMin":"19.1","TempMax":"30.3","Precipitation":"10.0","SunshineDuration":"12.35","DewPoint":"89.3","SnowLevelWeatherSite":"210","SnowCoverage":"100","SnowLevelForest":"190","AverageSnowDensity":"500.23","MoistureWaterInSnow":"10","SnowCover":"полностью","SnowState":"талый","NRustayskoyeWaterLevel":"15","NRustayskoyeTemp":"20.1","NRustayskoyepH":"5.5","NRustayskoyeElConduct":"237","NRustayskoyeWaterColor":"10","NRustayskoyeOxygen":"80.3","NRustayskoyeBPK5":"12.12","KrugloeWaterLevel":"10","KrugloeTemp":"20.2","KrugloepH":"5.5","KrugloeElConduct":"123","KrugloeWaterColor":"10","KrugloeOxygen":"81.1","KrugloeBPK5":"12.12","KalachikWaterLevel":"220","KalachikTemp":"15.9","KalachikpH":"5.5","KalachikElConduct":"123","KalachikWaterColor":"9","KalachikOxygen":"20.2","KalachikBPK5":"123.321","MakhovskoeWaterLevel":"120","MakhovskoeTemp":"17.1","MakhovskoepH":"5.6","MakhovskoeElConduct":"300","MakhovskoeWaterColor":"10","MakhovskoeOxygen":"70.2","MakhovskoeBPK5":"123.987","KerzhenetsWaterLevel":"253","KerzhenetsTemp":"20.1","KerzhenetspH":"6.6","KerzhenetsElConduct":"125","KerzhenetsWaterColor":"9","KerzhenetsOxygen":"81.2","KerzhenetsBPK5":"123.453","VishnyaWaterLevel":"245","VishnyaTemp":"21.1","VishnyapH":"4.5","VishnyaElConduct":"345","VishnyaWaterColor":"8","VishnyaOxygen":"87.3","VishnyaBPK5":"123.123","WellWaterLevel":"231","WellTemp":"18.1","WellpH":"5.6","WellElConduct":"123","WellWaterColor":"9","WellOxygen":"80.3","WellBPK5":"123.321","VishenskoeWaterLevel":"120","VishenskoeTemp":"20.1","VishenskoepH":"5.5","VishenskoeElConduct":"789","VishenskoeWaterColor":"11","VishenskoeOxygen":"90.1","VishenskoeBPK5":"123.32"}'
 ```