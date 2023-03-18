package galina;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadObservDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadObservDatabase.class);


    @Bean
    CommandLineRunner initDatabase(ObservRepository repository) {
      Observ o1 = new Observ();
      o1.setMeteoDate("02.06.22");
      o1.setMeteoTime("18:00");
      o1.setWindDir("Юг");
      o1.setWindSpeed(1.1);
      o1.setPressure(750);
      o1.setTempMin(19.1);
      o1.setTempMax(30.3);
      o1.setPrecipitation(10.0);
      o1.setSunshineDuration(12.35);
      o1.setDewPoint(89.3);
      o1.setSnowLevelWeatherSite(210);
      o1.setSnowCoverage("100");
      o1.setSnowLevelForest(190);
      o1.setAverageSnowDensity(500.23);
      o1.setMoistureWaterInSnow(10);
      o1.setSnowCover("полностью");
      o1.setSnowState("талый");
      o1.setNRustayskoyeWaterLevel(15);
      o1.setNRustayskoyeTemp(20.1);
      o1.setNRustayskoyepH(5.5);
      o1.setNRustayskoyeElConduct(237);
      o1.setNRustayskoyeWaterColor(10);
      o1.setNRustayskoyeOxygen(80.3);
      o1.setNRustayskoyeBPK5(12.12);
      o1.setKrugloeWaterLevel(10);
      o1.setKrugloeTemp(20.2);
      o1.setKrugloepH(5.5);
      o1.setKrugloeElConduct(123);
      o1.setKrugloeWaterColor(10);
      o1.setKrugloeOxygen(81.1);
      o1.setKrugloeBPK5(12.12);
      o1.setKalachikWaterLevel(220);
      o1.setKalachikTemp(15.9);
      o1.setKalachikpH(5.5);
      o1.setKalachikElConduct(123);
      o1.setKalachikWaterColor(9);
      o1.setKalachikOxygen(20.2);
      o1.setKalachikBPK5(123.321);
      o1.setMakhovskoeWaterLevel(120);
      o1.setMakhovskoeTemp(17.1);
      o1.setMakhovskoepH(5.6);
      o1.setMakhovskoeElConduct(300);
      o1.setMakhovskoeWaterColor(10);
      o1.setMakhovskoeOxygen(70.2);
      o1.setMakhovskoeBPK5(123.987);
      o1.setKerzhenetsWaterLevel(253);
      o1.setKerzhenetsTemp(20.1);
      o1.setKerzhenetspH(6.6);
      o1.setKerzhenetsElConduct(125);
      o1.setKerzhenetsWaterColor(9);
      o1.setKerzhenetsOxygen(81.2);
      o1.setKerzhenetsBPK5(123.453);
      o1.setVishnyaWaterLevel(245);
      o1.setVishnyaTemp(21.1);
      o1.setVishnyapH(4.5);
      o1.setVishnyaElConduct(345);
      o1.setVishnyaWaterColor(8);
      o1.setVishnyaOxygen(87.3);
      o1.setVishnyaBPK5(123.123);
      o1.setWellWaterLevel(231);
      o1.setWellTemp(18.1);
      o1.setWellpH(5.6);
      o1.setWellElConduct(123);
      o1.setWellWaterColor(9);
      o1.setWellOxygen(80.3);
      o1.setWellBPK5(123.321);
      o1.setVishenskoeWaterLevel(120);
      o1.setVishenskoeTemp(20.1);
      o1.setVishenskoepH(5.5);
      o1.setVishenskoeElConduct(789);
      o1.setVishenskoeWaterColor(11);
      o1.setVishenskoeOxygen(90.1);
      o1.setVishenskoeBPK5(123.32);
        
      Observ o2 = new Observ();
      o2.setMeteoDate("");
      o2.setMeteoTime("");
      o2.setWindDir("Юг");
      o2.setWindSpeed(1.1);
      o2.setPressure(750);
      o2.setTempMin(19.1);
      o2.setTempMax(30.3);
      o2.setPrecipitation(10.0);
      o2.setSunshineDuration(12.35);
      o2.setDewPoint(89.3);
      o2.setSnowLevelWeatherSite(210);
      o2.setSnowCoverage("100");
      o2.setSnowLevelForest(190);
      o2.setAverageSnowDensity(500.23);
      o2.setMoistureWaterInSnow(10);
      o2.setSnowCover("полностью");
      o2.setSnowState("талый");
      o2.setNRustayskoyeWaterLevel(15);
      o2.setNRustayskoyeTemp(20.1);
      o2.setNRustayskoyepH(5.5);
      o2.setNRustayskoyeElConduct(237);
      o2.setNRustayskoyeWaterColor(10);
      o2.setNRustayskoyeOxygen(80.3);
      o2.setNRustayskoyeBPK5(12.12);
      o2.setKrugloeWaterLevel(10);
      o2.setKrugloeTemp(20.2);
      o2.setKrugloepH(5.5);
      o2.setKrugloeElConduct(123);
      o2.setKrugloeWaterColor(10);
      o2.setKrugloeOxygen(81.1);
      o2.setKrugloeBPK5(12.12);
      o2.setKalachikWaterLevel(220);
      o2.setKalachikTemp(15.9);
      o2.setKalachikpH(5.5);
      o2.setKalachikElConduct(123);
      o2.setKalachikWaterColor(9);
      o2.setKalachikOxygen(20.2);
      o2.setKalachikBPK5(123.321);
      o2.setMakhovskoeWaterLevel(120);
      o2.setMakhovskoeTemp(17.1);
      o2.setMakhovskoepH(5.6);
      o2.setMakhovskoeElConduct(300);
      o2.setMakhovskoeWaterColor(10);
      o2.setMakhovskoeOxygen(70.2);
      o2.setMakhovskoeBPK5(123.987);
      o2.setKerzhenetsWaterLevel(253);
      o2.setKerzhenetsTemp(20.1);
      o2.setKerzhenetspH(6.6);
      o2.setKerzhenetsElConduct(125);
      o2.setKerzhenetsWaterColor(9);
      o2.setKerzhenetsOxygen(81.2);
      o2.setKerzhenetsBPK5(123.453);
      o2.setVishnyaWaterLevel(245);
      o2.setVishnyaTemp(21.1);
      o2.setVishnyapH(4.5);
      o2.setVishnyaElConduct(345);
      o2.setVishnyaWaterColor(8);
      o2.setVishnyaOxygen(87.3);
      o2.setVishnyaBPK5(123.123);
      o2.setWellWaterLevel(231);
      o2.setWellTemp(18.1);
      o2.setWellpH(5.6);
      o2.setWellElConduct(123);
      o2.setWellWaterColor(9);
      o2.setWellOxygen(80.3);
      o2.setWellBPK5(123.321);
      o2.setVishenskoeWaterLevel(120);
      o2.setVishenskoeTemp(20.1);
      o2.setVishenskoepH(5.5);
      o2.setVishenskoeElConduct(789);
      o2.setVishenskoeWaterColor(11);
      o2.setVishenskoeOxygen(90.1);
      o2.setVishenskoeBPK5(123.32);
      return args -> {
        log.info("Preloading " + repository.save(o1));
        log.info("Preloading " + repository.save(o2));
      };
    }
}
