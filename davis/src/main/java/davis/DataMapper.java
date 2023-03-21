package davis;

import java.util.Arrays;
import java.util.List;
import static org.springframework.util.StringUtils.capitalize;

public class DataMapper {
    public Data parse( String strData) throws Exception {
        strData = strData.substring(1,strData.length()-2);
        Data o = new Data();
        List<String[]> values = Arrays.stream(strData.split(",")).map(s -> s.split(":")).map(arr->{
            arr[0] = arr[0].replaceAll("\"","").toLowerCase().trim();
            arr[1] = arr[1].replaceAll("\"","").trim();
            return arr;
        }).toList();

        for (String[] pair:values) {
            switch (pair[0]){
                case "id": o.setId(Long.parseLong(pair[1])); break;
                case "meteodate": o.setMeteoDate(pair[1]); break;
                case "meteotime": o.setMeteoTime(pair[1]+":"+pair[2].replaceAll("\"","").trim()); break;
                case "tempout": o.setTempOut(Double.parseDouble(pair[1])); break;
                case "hitemp": o.setHiTemp(Double.parseDouble(pair[1])); break;
                case "lowtemp": o.setLowTemp(Double.parseDouble(pair[1])); break;
                case "outhum": o.setOutHum(Integer.parseInt(pair[1])); break;
                case "dewpt": o.setDewPt(Double.parseDouble(pair[1])); break;
                case "windspeed": o.setWindSpeed(Double.parseDouble(pair[1])); break;
                case "winddir": o.setWindDir(pair[1]); break;
                case "windrun": o.setWindRun(Double.parseDouble(pair[1])); break;
                case "hispeed": o.setHiSpeed(Double.parseDouble(pair[1])); break;
                case "hidir": o.setHiDir(pair[1]); break;
                case "windchill": o.setWindChill(Double.parseDouble(pair[1])); break;
                case "heatindex": o.setHeatIndex(Double.parseDouble(pair[1])); break;
                case "thwindex": o.setTHWIndex(Double.parseDouble(pair[1])); break;
                case "bar": o.setBar(Double.parseDouble(pair[1])); break;
                case "rain": o.setRain(Double.parseDouble(pair[1])); break;
                case "rainrate": o.setRainRate(Double.parseDouble(pair[1])); break;
                case "solarrad": o.setSolarRad(Double.parseDouble(pair[1])); break;
                case "solarenergy": o.setSolarEnergy(Double.parseDouble(pair[1])); break;
                case "hisolarrad": o.setHiSolarRad(Double.parseDouble(pair[1])); break;
                case "uvindex": o.setUVIndex(Double.parseDouble(pair[1])); break;
                case "uvdose": o.setUVDose(Double.parseDouble(pair[1])); break;
                case "hiuv": o.setHiUV(Double.parseDouble(pair[1])); break;
                case "heatdd": o.setHeatDD(Double.parseDouble(pair[1])); break;
                case "cooldd": o.setCoolDD(Double.parseDouble(pair[1])); break;
                case "intemp": o.setInTemp(Double.parseDouble(pair[1])); break;
                case "inhum": o.setInHum(Double.parseDouble(pair[1])); break;
                case "indew": o.setInDew(Double.parseDouble(pair[1])); break;
                case "inheat": o.setInHeat(Double.parseDouble(pair[1])); break;
                case "inemc": o.setInEMC(Double.parseDouble(pair[1])); break;
                case "inairdensity": o.setInAirDensity(Double.parseDouble(pair[1])); break;
                case "et": o.setET(Double.parseDouble(pair[1])); break;
                case "soil1moist": o.setSoil1Moist(Integer.parseInt(pair[1])); break;
                case "soil2moist": o.setSoil2Moist(Integer.parseInt(pair[1])); break;
                case "soil3moist": o.setSoil3Moist(Integer.parseInt(pair[1])); break;
                case "soil4moist": o.setSoil4Moist(Integer.parseInt(pair[1])); break;
                case "soiltemp1": o.setSoilTemp1(Double.parseDouble(pair[1])); break;
                case "soiltemp2": o.setSoilTemp2(Double.parseDouble(pair[1])); break;
                case "soiltemp3": o.setSoilTemp3(Double.parseDouble(pair[1])); break;
                case "soiltemp4": o.setSoilTemp4(Double.parseDouble(pair[1])); break;
                case "windsamp": o.setWindSamp(Integer.parseInt(pair[1])); break;
                case "windtx": o.setWindTx(Integer.parseInt(pair[1])); break;
                case "issrecept": o.setISSRecept(Double.parseDouble(pair[1])); break;
                case "arcint": o.setArcInt(Integer.parseInt(pair[1].replaceAll("}",""))); break;
            }

        }

        return  o;
    }
}
