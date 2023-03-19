package galina;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import static org.springframework.util.StringUtils.capitalize;

public class ObservMapper {
    public Observ parse( String strObserv) throws Exception {
        strObserv = strObserv.substring(1,strObserv.length()-2);

        Observ o = new Observ();
        List<String[]> values = Arrays.stream(strObserv.split(",")).map(s -> s.split(":")).map(arr->{
            arr[0] = arr[0].replaceAll("\"","").toLowerCase().trim();
            arr[1] = arr[1].replaceAll("\"","").trim();
            return arr;
        }).toList();

        for (String[] pair:values) {
            switch (pair[0]){
                case "id": o.setId(Long.parseLong(pair[1])); break;
                case "meteodate": o.setMeteoDate(pair[1]); break;
                case "meteotime": o.setMeteoTime(pair[1]+":"+pair[2].replaceAll("\"","").trim()); break;
                case "winddir": o.setWindDir(pair[1]); break;
                case "windspeed": o.setWindSpeed(Double.parseDouble(pair[1])); break;
                case "pressure": o.setPressure(Integer.parseInt(pair[1])); break;
                case "tempmin":  o.setTempMin(Double.parseDouble(pair[1])); break;
                case "tempmax": o.setTempMax(Double.parseDouble(pair[1])); break;
                case "precipitation": o.setPrecipitation(Double.parseDouble(pair[1])); break;
                case "sunshineduration": o.setSunshineDuration(Double.parseDouble(pair[1])); break;
                case "dewpoint": o.setDewPoint(Double.parseDouble(pair[1])); break;
                case "snowlevelweathersite": o.setSnowLevelWeatherSite(Integer.parseInt(pair[1])); break;
                case "snowcoverage": o.setSnowCoverage(pair[1]); break;
                case "snowlevelforest": o.setSnowLevelForest(Integer.parseInt(pair[1])); break;
                case "averagesnowdensity": o.setAverageSnowDensity(Double.parseDouble(pair[1])); break;
                case "moisturewaterinsnow": o.setMoistureWaterInSnow(Integer.parseInt(pair[1])); break;
                case "snowcover": o.setSnowCover(pair[1]); break;
                case "snowstate": o.setSnowState(pair[1]); break;
                case "nrustayskoyewaterlevel": o.setNRustayskoyeWaterLevel(Integer.parseInt(pair[1])); break;
                case "nrustayskoyetemp": o.setNRustayskoyeTemp(Double.parseDouble(pair[1])); break;
                case "nrustayskoyeph": o.setNRustayskoyepH(Double.parseDouble(pair[1])); break;
                case "nrustayskoyeelconduct": o.setNRustayskoyeElConduct(Integer.parseInt(pair[1])); break;
                case "nrustayskoyewatercolor": o.setNRustayskoyeWaterColor(Integer.parseInt(pair[1])); break;
                case "nrustayskoyeoxygen": o.setNRustayskoyeOxygen(Double.parseDouble(pair[1])); break;
                case "nrustayskoyebpk5": o.setNRustayskoyeBPK5(Double.parseDouble(pair[1])); break;
                case "krugloewaterlevel": o.setKrugloeWaterLevel(Integer.parseInt(pair[1])); break;
                case "krugloetemp": o.setKrugloeTemp(Double.parseDouble(pair[1])); break;
                case "krugloeph": o.setKrugloepH(Double.parseDouble(pair[1])); break;
                case "krugloeelconduct": o.setKrugloeElConduct(Integer.parseInt(pair[1])); break;
                case "krugloewatercolor": o.setKrugloeWaterColor(Integer.parseInt(pair[1])); break;
                case "krugloeoxygen": o.setKrugloeOxygen(Double.parseDouble(pair[1])); break;
                case "krugloebpk5": o.setKrugloeBPK5(Double.parseDouble(pair[1])); break;
                case "kalachikwaterlevel": o.setKalachikWaterLevel(Integer.parseInt(pair[1])); break;
                case "kalachiktemp": o.setKalachikTemp(Double.parseDouble(pair[1])); break;
                case "kalachikph": o.setKalachikpH(Double.parseDouble(pair[1])); break;
                case "kalachikelconduct": o.setKalachikElConduct(Integer.parseInt(pair[1])); break;
                case "kalachikwatercolor": o.setKalachikWaterColor(Integer.parseInt(pair[1])); break;
                case "kalachikoxygen": o.setKalachikOxygen(Double.parseDouble(pair[1])); break;
                case "kalachikbpk5": o.setKalachikBPK5(Double.parseDouble(pair[1])); break;
                case "makhovskoewaterlevel": o.setMakhovskoeWaterLevel(Integer.parseInt(pair[1])); break;
                case "makhovskoetemp": o.setMakhovskoeTemp(Double.parseDouble(pair[1])); break;
                case "makhovskoeph": o.setMakhovskoepH(Double.parseDouble(pair[1])); break;
                case "makhovskoeelconduct": o.setMakhovskoeElConduct(Integer.parseInt(pair[1])); break;
                case "makhovskoewatercolor": o.setMakhovskoeWaterColor(Integer.parseInt(pair[1])); break;
                case "makhovskoeoxygen": o.setMakhovskoeOxygen((Double.parseDouble(pair[1]))); break;
                case "makhovskoebpk5": o.setMakhovskoeBPK5(Double.parseDouble(pair[1])); break;
                case "kerzhenetswaterlevel": o.setKerzhenetsWaterLevel(Integer.parseInt(pair[1])); break;
                case "kerzhenetstemp": o.setKerzhenetsTemp(Double.parseDouble(pair[1])); break;
                case "kerzhenetsph": o.setKerzhenetspH(Double.parseDouble(pair[1])); break;
                case "kerzhenetselconduct": o.setKerzhenetsElConduct(Integer.parseInt(pair[1])); break;
                case "kerzhenetswatercolor": o.setKerzhenetsWaterColor(Integer.parseInt(pair[1])); break;
                case "kerzhenetsoxygen": o.setKerzhenetsOxygen(Double.parseDouble(pair[1])); break;
                case "kerzhenetsbpk5": o.setKerzhenetsBPK5(Double.parseDouble(pair[1])); break;
                case "vishnyawaterlevel": o.setVishnyaWaterLevel(Integer.parseInt(pair[1])); break;
                case "vishnyatemp": o.setVishnyaTemp(Double.parseDouble(pair[1])); break;
                case "vishnyaph": o.setVishnyapH(Double.parseDouble(pair[1])); break;
                case "vishnyaelconduct": o.setVishnyaElConduct(Integer.parseInt(pair[1])); break;
                case "vishnyawatercolor": o.setVishnyaWaterColor(Integer.parseInt(pair[1])); break;
                case "vishnyaoxygen": o.setVishnyaOxygen(Double.parseDouble(pair[1])); break;
                case "vishnyabpk5": o.setVishnyaBPK5(Double.parseDouble(pair[1])); break;
                case "wellwaterlevel": o.setWellWaterLevel(Integer.parseInt(pair[1])); break;
                case "welltemp": o.setWellTemp(Double.parseDouble(pair[1])); break;
                case "wellph": o.setWellpH(Double.parseDouble(pair[1])); break;
                case "wellelconduct": o.setWellElConduct(Integer.parseInt(pair[1])); break;
                case "wellwatercolor": o.setWellWaterColor(Integer.parseInt(pair[1])); break;
                case "welloxygen": o.setWellOxygen(Double.parseDouble(pair[1])); break;
                case "wellbpk5": o.setWellBPK5(Double.parseDouble(pair[1])); break;
                case "vishenskoewaterlevel": o.setVishenskoeWaterLevel(Integer.parseInt(pair[1])); break;
                case "vishenskoetemp": o.setVishenskoeTemp(Double.parseDouble(pair[1])); break;
                case "vishenskoeph": o.setVishenskoepH(Double.parseDouble(pair[1])); break;
                case "vishenskoeelconduct": o.setVishenskoeElConduct(Integer.parseInt(pair[1])); break;
                case "vishenskoewatercolor": o.setVishenskoeWaterColor(Integer.parseInt(pair[1])); break;
                case "vishenskoeoxygen": o.setVishenskoeOxygen(Double.parseDouble(pair[1])); break;
                case "vishenskoebpk5": o.setVishenskoeBPK5(Double.parseDouble(pair[1])); break;
            }

        }

        return  o;
    }
}
