package galina;
    
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
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
    ObjectMapper objectMapper = new ObjectMapper();
  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/observ")
  public List<Observ> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

    @PostMapping("/observ")
  public Observ newObserv(@RequestBody String strObserv) throws JsonProcessingException {

      Observ observ = objectMapper.readValue(strObserv, Observ.class);
      observ.createId();
      return repository.save(observ);
  }

  // Single item
  
  @GetMapping("/observ/{id}")
  public Observ one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new ObservNotFoundException(id));
  }

  

  @PutMapping("/observ/{id}")
  public Observ replaceData(@RequestBody String strNewObserv, @PathVariable Long id) throws JsonProcessingException {
      Observ newObserv = objectMapper.readValue(strNewObserv, Observ.class);
      System.out.println(strNewObserv);
      System.out.println(objectMapper.writeValueAsString(newObserv));
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
        
        return repository.save(observ);
      })
      .orElseGet(() -> {
        newObserv.setId(id);
        return repository.save(newObserv);
      });
  }

  @DeleteMapping("/observ/{id}")
  public void deleteObserv(@PathVariable Long id) {
    repository.deleteById(id);
  }
}


