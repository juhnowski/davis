package galina;
    
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObservController {

  private final ObservRepository repository;

  public ObservController(ObservRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/observ")
  public String all() {
    List<Observ> list = repository.findAll();
    StringBuffer sb = new StringBuffer();

    sb.append("[");
    int s = list.size()-1;
    int i = 0;
    for (Observ o:list){
      sb.append(o.toJSON());
      if (i++ < s) {
        sb.append(",");
      }
    }
    sb.append("]");
    
    return sb.toString();
  }

  @PostMapping("/observ")
  public String newObserv(@RequestBody String strObserv) {
        try {
            ObservMapper mapper = new ObservMapper();
            Observ observ = mapper.parse(strObserv);

            observ.createId();
            Observ o = repository.save(observ);
            return o.toJSON();
        } catch (Exception e){
            return null;
        }
  }
 
  @GetMapping("/observ/{id}")
  public String one(@PathVariable Long id) {
    
    Observ o = repository.findById(id)
      .orElseThrow(() -> new ObservNotFoundException(id));

    return o.toJSON();
  }

  @PutMapping("/observ")
  public String replaceData(@RequestBody String strNewObserv) {
    ObservMapper mapper = new ObservMapper();
    try{
      Observ newObserv = mapper.parse(strNewObserv);

    
    long id = newObserv.getId();
    return repository.findById(id)
      .map(observ -> {
        observ.setMeteoDate(newObserv.getMeteoDate());
        observ.setMeteoTime(newObserv.getMeteoTime());  

        observ.setWindDir(newObserv.getWindDir());
        observ.setWindSpeed(newObserv.getWindSpeed());
        observ.setPressure(newObserv.getPressure());
        observ.setTempMin(newObserv.getTempMin());
        observ.setTempMax(newObserv.getTempMax());
        observ.setPrecipitation(newObserv.getPrecipitation());
        observ.setSunshineDuration(newObserv.getSunshineDuration());
        observ.setDewPoint(newObserv.getDewPoint());
        observ.setSnowLevelWeatherSite(newObserv.getSnowLevelWeatherSite());
        observ.setSnowCoverage(newObserv.getSnowCoverage());
        observ.setSnowLevelForest(newObserv.getSnowLevelForest());
        observ.setAverageSnowDensity(newObserv.getAverageSnowDensity());
        observ.setMoistureWaterInSnow(newObserv.getMoistureWaterInSnow());
        observ.setSnowCover(newObserv.getSnowCover());
        observ.setSnowState(newObserv.getSnowState());
        observ.setNRustayskoyeWaterLevel(newObserv.getNRustayskoyeWaterLevel());
        observ.setNRustayskoyeTemp(newObserv.getNRustayskoyeTemp());
        observ.setNRustayskoyepH(newObserv.getNRustayskoyepH());
        observ.setNRustayskoyeElConduct(newObserv.getNRustayskoyeElConduct());
        observ.setNRustayskoyeWaterColor(newObserv.getNRustayskoyeWaterColor());
        observ.setNRustayskoyeOxygen(newObserv.getNRustayskoyeOxygen());
        observ.setNRustayskoyeBPK5(newObserv.getNRustayskoyeBPK5());
        observ.setKrugloeWaterLevel(newObserv.getKrugloeWaterLevel());
        observ.setKrugloeTemp(newObserv.getKrugloeTemp());
        observ.setKrugloepH(newObserv.getKrugloepH());
        observ.setKrugloeElConduct(newObserv.getKrugloeElConduct());
        observ.setKrugloeWaterColor(newObserv.getKrugloeWaterColor());
        observ.setKrugloeOxygen(newObserv.getKrugloeOxygen());
        observ.setKrugloeBPK5(newObserv.getKrugloeBPK5());
        observ.setKalachikWaterLevel(newObserv.getKalachikWaterLevel());
        observ.setKalachikTemp(newObserv.getKalachikTemp());
        observ.setKalachikpH(newObserv.getKalachikpH());
        observ.setKalachikElConduct(newObserv.getKalachikElConduct());
        observ.setKalachikWaterColor(newObserv.getKalachikWaterColor());
        observ.setKalachikOxygen(newObserv.getKalachikOxygen());
        observ.setKalachikBPK5(newObserv.getKalachikBPK5());
        observ.setMakhovskoeWaterLevel(newObserv.getMakhovskoeWaterLevel());
        observ.setMakhovskoeTemp(newObserv.getMakhovskoeTemp());
        observ.setMakhovskoepH(newObserv.getMakhovskoepH());
        observ.setMakhovskoeElConduct(newObserv.getMakhovskoeElConduct());
        observ.setMakhovskoeWaterColor(newObserv.getMakhovskoeWaterColor());
        observ.setMakhovskoeOxygen(newObserv.getMakhovskoeOxygen());
        observ.setMakhovskoeBPK5(newObserv.getMakhovskoeBPK5());
        observ.setKerzhenetsWaterLevel(newObserv.getKerzhenetsWaterLevel());
        observ.setKerzhenetsTemp(newObserv.getKerzhenetsTemp());
        observ.setKerzhenetspH(newObserv.getKerzhenetspH());
        observ.setKerzhenetsElConduct(newObserv.getKerzhenetsElConduct());
        observ.setKerzhenetsWaterColor(newObserv.getKerzhenetsWaterColor());
        observ.setKerzhenetsOxygen(newObserv.getKerzhenetsOxygen());
        observ.setKerzhenetsBPK5(newObserv.getKerzhenetsBPK5());
        observ.setVishnyaWaterLevel(newObserv.getVishnyaWaterLevel());
        observ.setVishnyaTemp(newObserv.getVishnyaTemp());
        observ.setVishnyapH(newObserv.getVishnyapH());
        observ.setVishnyaElConduct(newObserv.getVishnyaElConduct());
        observ.setVishnyaWaterColor(newObserv.getVishnyaWaterColor());
        observ.setVishnyaOxygen(newObserv.getVishnyaOxygen());
        observ.setVishnyaBPK5(newObserv.getVishnyaBPK5());
        observ.setWellWaterLevel(newObserv.getWellWaterLevel());
        observ.setWellTemp(newObserv.getWellTemp());
        observ.setWellpH(newObserv.getWellpH());
        observ.setWellElConduct(newObserv.getWellElConduct());
        observ.setWellWaterColor(newObserv.getWellWaterColor());
        observ.setWellOxygen(newObserv.getWellOxygen());
        observ.setWellBPK5(newObserv.getWellBPK5());
        observ.setVishenskoeWaterLevel(newObserv.getVishenskoeWaterLevel());
        observ.setVishenskoeTemp(newObserv.getVishenskoeTemp());
        observ.setVishenskoepH(newObserv.getVishenskoepH());
        observ.setVishenskoeElConduct(newObserv.getVishenskoeElConduct());
        observ.setVishenskoeWaterColor(newObserv.getVishenskoeWaterColor());
        observ.setVishenskoeOxygen(newObserv.getVishenskoeOxygen());
        observ.setVishenskoeBPK5(newObserv.getVishenskoeBPK5());
        
        return repository.save(observ).toJSON();
      })
      .orElseGet(() -> {
        newObserv.setId(id);
        return repository.save(newObserv).toJSON();
      });

    } catch (Exception e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }

  @DeleteMapping("/observ/{id}")
  public void deleteObserv(@PathVariable Long id) {
    repository.deleteById(id);
  }
}


