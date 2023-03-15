# Davis
Метео станция Davis собирает метеоданные в текстовом формате.
Сервис предназначен для приема данных в формате REST и сохранения в БД

## Запуск
```
mvn spring-boot:run
mvn -Dmaven.test.skip package
mvn clean spring-boot:run
```
## Тест
IP адрес меняется, сервер перегружается раз в день
```
curl -d "MeteoDate=02.06.22&MeteoTime=12:40&TempOut=22.2&HiTemp=22.2&LowTemp=21.9&OutHum=62&DewPt=14.5&WindSpeed=0.0&WindDir=---&WindRun=0.00&HiSpeed=0.0&HiDir=---&WindChill=22.2&HeatIndex=22.2&THWIndex=22.2&THSWIndex=25.2&Bar=1026.1&Rain=0.00&RainRate=0.0&SolarRad=299&SolarEnergy=4.29&HiSolarRad=315&UVIndex=2.5&UVDose=0.18&HiUV=2.6&HeatDD=0.000&CoolDD=0.027&InTemp=25.1&InHum=46&InDew=12.7&InHeat=24.8&InEMC=8.51&InAirDensity=1.1820&ET=0.00&Soil1Moist=7&Soil2Moist=4&Soil3Moist=3&Soil4Moist=4&SoilTemp1=17.8&SoilTemp2=13.3&SoilTemp3=12.2&SoilTemp4=11.7&WindSamp=0&WindTx=4&ISSRecept=0.0&ArcInt=10" -X POST http://158.160.49.51:8081/davis




      this.ET = ;
      this.Soil1Moist = ;
      this.Soil2Moist = ;
      this.Soil3Moist = ;
      this.Soil4Moist = ;
      this.SoilTemp1 = ;
      this.SoilTemp2 = ;
      this.SoilTemp3 = ;
      this.SoilTemp4 = ;
      this.WindSamp = ;
      this.WindTx = ;
      this.ISSRecept = ;
      this.ArcInt = ;
```