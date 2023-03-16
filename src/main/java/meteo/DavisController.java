package ru.kerzhenskiy.meteo;

    
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DavisController {

  private final DavisRepository repository;

  public DavisController(DavisRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/test")
  public String test() {
    return "test ok";
  }

  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/davis")
  public List<Davis> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/davis")
  public Davis newEmployee(@RequestBody Davis data) {
    return repository.save(data);
  }

  // Single item
  
  @GetMapping("/davis/{id}")
  public Davis one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new DavisNotFoundException(id));
  }

  @PutMapping("/davis/{id}")
  public Davis replaceEmployee(@RequestBody Davis newData, @PathVariable Long id) {
    
    return repository.findById(id)
      .map(data -> {
        data.setMeteoDate(newData.getMeteoDate());
        data.setMeteoTime(newData.getMeteoTime());        
        data.setTempOut(newData.getTempOut());
        data.setHiTemp(newData.getHiTemp());
        data.setLowTemp(newData.getLowTemp());
        data.setOutHum(newData.getOutHum());        
        data.setDewPt(newData.getDewPt());
        data.setWindSpeed(newData.getWindSpeed());
        data.setWindDir(newData.getWindDir());
        data.setWindRun(newData.getWindRun());
        data.setHiSpeed(newData.getHiSpeed());
        data.setHiDir(newData.getHiDir());
        data.setWindChill(newData.getWindChill());
        data.setHeatIndex(newData.getHeatIndex());
        data.setTHWIndex(newData.getTHWIndex());
        data.setTHSWIndex(newData.getTHSWIndex());
        data.setBar(newData.getBar());
        data.setRain(newData.getRain());
        data.setRainRate(newData.getRainRate());
        data.setSolarRad(newData.getSolarRad());
        data.setSolarEnergy(newData.getSolarEnergy());
        data.setHiSolarRad(newData.getHiSolarRad());
        data.setUVIndex(newData.getUVIndex());
        data.setUVDose(newData.getUVDose());
        data.setHiUV(newData.getHiUV());
        data.setHeatDD(newData.getHeatDD());
        data.setCoolDD(newData.getCoolDD());
        data.setInTemp(newData.getInTemp());
        data.setInHum(newData.getInHum());
        data.setInDew(newData.getInDew());
        data.setInHeat(newData.getInHeat());
        data.setInEMC(newData.getInEMC());
        data.setInAirDensity(newData.getInAirDensity());        
        data.setET(newData.getET());
        data.setSoil1Moist(newData.getSoil1Moist());
        data.setSoil2Moist(newData.getSoil2Moist());
        data.setSoil3Moist(newData.getSoil3Moist());
        data.setSoil4Moist(newData.getSoil4Moist());
        data.setSoilTemp1(newData.getSoilTemp1());
        data.setSoilTemp2(newData.getSoilTemp2());
        data.setSoilTemp3(newData.getSoilTemp3());
        data.setSoilTemp4(newData.getSoilTemp4());
        data.setWindSamp(newData.getWindSamp());
        data.setWindTx(newData.getWindTx());
        data.setISSRecept(newData.getISSRecept());
        data.setArcInt(newData.getArcInt());
        
        return repository.save(data);
      })
      .orElseGet(() -> {
        newData.setId(id);
        return repository.save(newData);
      });
  }

  @DeleteMapping("/davis/{id}")
  public void deleteEmployee(@PathVariable Long id) {
    repository.deleteById(id);
  }
}

