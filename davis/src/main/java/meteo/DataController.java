package davis;
    
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

  private final DataRepository repository;

  public DataController(DataRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/test")
  public String test() {
    return "test ok";
  }

  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/data")
  public List<Data> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/data")
  public Data newData(@RequestBody Data data) {
    return repository.save(data);
  }

  // Single item
  
  @GetMapping("/data/{id}")
  public Data one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new DataNotFoundException(id));
  }

  @PutMapping("/davis/{id}")
  public Data replaceData(@RequestBody Data newData, @PathVariable Long id) {
    
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

  @DeleteMapping("/data/{id}")
  public void deleteData(@PathVariable Long id) {
    repository.deleteById(id);
  }
}

