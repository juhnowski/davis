package davis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Data {
	private @Id Long id;
    private String MeteoDate;
    private String MeteoTime;
    private Double TempOut;
    private Double HiTemp;
    private Double LowTemp;
    private Integer OutHum;
    private Double DewPt;
    private Double WindSpeed;
    private String WindDir;
    private Double WindRun;
    private Double HiSpeed;
    private String HiDir;
    private Double WindChill;
    private Double HeatIndex;
    private Double THWIndex;
    private Double THSWIndex;
    private Double Bar;
    private Double Rain;
    private Double RainRate;
    private Double SolarRad;
    private Double SolarEnergy;
    private Double HiSolarRad;
    private Double UVIndex;
    private Double UVDose;
    private Double HiUV;
    private Double HeatDD;
    private Double CoolDD;
    private Double InTemp;
    private Double InHum;
    private Double InDew;
    private Double InHeat;
    private Double InEMC;
    private Double InAirDensity;
    private Double ET;
    private Integer Soil1Moist;
    private Integer Soil2Moist;
    private Integer Soil3Moist;
    private Integer Soil4Moist;
    private Double SoilTemp1;
    private Double SoilTemp2;
    private Double SoilTemp3;
    private Double SoilTemp4;
    private Integer WindSamp;
    private Integer WindTx;
    private Double ISSRecept;
    private Integer ArcInt;

    @Transient
    private LocalDate parsedDate;
    @Transient
    private LocalTime parsedTime;    
    
    public Data(){
        setId(System.currentTimeMillis());
    }

    public Data(String MeteoDate, 
    String MeteoTime,
    Double TempOut,
    Double HiTemp,
    Double LowTemp,
    Integer OutHum,
    Double DewPt,
    Double WindSpeed,
    String WindDir,
    Double WindRun,
    Double HiSpeed,
    String HiDir,
    Double WindChill,
    Double HeatIndex,
    Double THWIndex,
    Double THSWIndex,
    Double Bar,
    Double Rain,
    Double RainRate,
    Double SolarRad,
    Double SolarEnergy,
    Double HiSolarRad,
    Double UVIndex,
    Double UVDose,
    Double HiUV,
    Double HeatDD,
    Double CoolDD,
    Double InTemp,
    Double InHum,
    Double InDew,
    Double InHeat,
    Double InEMC,
    Double InAirDensity,
    Double ET,
    Integer Soil1Moist,
    Integer Soil2Moist,
    Integer Soil3Moist,
    Integer Soil4Moist,
    Double SoilTemp1,
    Double SoilTemp2,
    Double SoilTemp3,
    Double SoilTemp4,
    Integer WindSamp,
    Integer WindTx,
    Double ISSRecept,
    Integer ArcInt) {
        setMeteoDate(MeteoDate);
        setMeteoTime(MeteoTime);
      this.TempOut = TempOut;
      this.HiTemp = HiTemp;
      this.LowTemp = LowTemp;
      this.OutHum = OutHum;
      this.DewPt = DewPt;
      this.WindSpeed = WindSpeed;
      this.WindDir = WindDir;
      this.WindRun = WindRun;
      this.HiSpeed = HiSpeed;
      this.HiDir = HiDir;
      this.WindChill = WindChill;
      this.HeatIndex = HeatIndex;
      this.THWIndex = THWIndex;
      this.THSWIndex = THSWIndex;
      this.Bar = Bar;
      this.Rain = Rain;
      this.RainRate = RainRate;
      this.SolarRad = SolarRad;
      this.SolarEnergy = SolarEnergy;
      this.HiSolarRad = HiSolarRad;
      this.UVIndex = UVIndex;
      this.UVDose = UVDose;
      this.HiUV = HiUV;
      this.HeatDD = HeatDD;
      this.CoolDD = CoolDD;
      this.InTemp = InTemp;
      this.InHum = InHum;
      this.InDew = InDew;
      this.InHeat = InHeat;
      this.InEMC = InEMC;
      this.InAirDensity = InAirDensity; 
      this.ET = ET;
      this.Soil1Moist = Soil1Moist;
      this.Soil2Moist = Soil2Moist;
      this.Soil3Moist = Soil3Moist;
      this.Soil4Moist = Soil4Moist;
      this.SoilTemp1 = SoilTemp1;
      this.SoilTemp2 = SoilTemp2;
      this.SoilTemp3 = SoilTemp3;
      this.SoilTemp4 = SoilTemp4;
      this.WindSamp = WindSamp;
      this.WindTx = WindTx;
      this.ISSRecept = ISSRecept;
      this.ArcInt = ArcInt;
    }

    public Data(String row) {
        String[] values = row.split("\t");
        try {
            setMeteoDate(values[0]);
            setMeteoTime(values[1]);
            this.TempOut = DataUtil.parseDouble(values[2]);
            this.HiTemp = DataUtil.parseDouble(values[3]);
            this.LowTemp = DataUtil.parseDouble(values[4]);
            this.OutHum = DataUtil.parseInt(values[5]);
            this.DewPt = DataUtil.parseDouble(values[6]);
            this.WindSpeed = DataUtil.parseDouble(values[7]);
            this.WindDir = values[8];
            this.WindRun = DataUtil.parseDouble(values[9]);
            this.HiSpeed = DataUtil.parseDouble(values[10]);
            this.HiDir = values[11];
            this.WindChill = DataUtil.parseDouble(values[12]);
            this.HeatIndex = DataUtil.parseDouble(values[13]);
            this.THWIndex = DataUtil.parseDouble(values[14]);
            this.THSWIndex = DataUtil.parseDouble(values[15]);
            this.Bar = DataUtil.parseDouble(values[16]);
            this.Rain = DataUtil.parseDouble(values[17]);
            this.RainRate = DataUtil.parseDouble(values[18]);
            this.SolarRad = DataUtil.parseDouble(values[19]);
            this.SolarEnergy = DataUtil.parseDouble(values[20]);
            this.HiSolarRad = DataUtil.parseDouble(values[21]);
            this.UVIndex = DataUtil.parseDouble(values[22]);
            this.UVDose = DataUtil.parseDouble(values[23]);
            this.HiUV = DataUtil.parseDouble(values[24]);
            this.HeatDD = DataUtil.parseDouble(values[25]);
            this.CoolDD = DataUtil.parseDouble(values[26]);
            this.InTemp = DataUtil.parseDouble(values[27]);
            this.InHum = DataUtil.parseDouble(values[28]);
            this.InDew = DataUtil.parseDouble(values[29]);
            this.InHeat = DataUtil.parseDouble(values[30]);
            this.InEMC = DataUtil.parseDouble(values[31]);
            this.InAirDensity = DataUtil.parseDouble(values[32]);
            this.ET = DataUtil.parseDouble(values[33]);
            this.Soil1Moist = DataUtil.parseInt(values[34]);
            this.Soil2Moist = DataUtil.parseInt(values[35]);
            this.Soil3Moist = DataUtil.parseInt(values[36]);
            this.Soil4Moist = DataUtil.parseInt(values[37]);
            this.SoilTemp1 = DataUtil.parseDouble(values[38]);
            this.SoilTemp2 = DataUtil.parseDouble(values[39]);
            this.SoilTemp3 = DataUtil.parseDouble(values[40]);
            this.SoilTemp4 = DataUtil.parseDouble(values[41]);
            this.WindSamp = DataUtil.parseInt(values[42]);
            this.WindTx = DataUtil.parseInt(values[43]);
            this.ISSRecept = DataUtil.parseDouble(values[44]);
            this.ArcInt = DataUtil.parseInt(values[45]);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Long getId() {
        return this.id;
      }
    
    public String getMeteoDate() {
        return this.MeteoDate;
    }
    
    public String getMeteoTime() {
        return this.MeteoTime;
    }
       
    public Double getTempOut() {
        return this.TempOut;
    }

    public Double getHiTemp() {
        return this.HiTemp;
    }

    public Double getLowTemp() {
        return this.LowTemp;
    }

    public Integer getOutHum() {
        return this.OutHum;
    }

    public Double getDewPt() {
        return this.DewPt;
    }

    public Double getWindSpeed() {
        return this.WindSpeed;
    }

    public String getWindDir() {
        return this.WindDir;
    }

    public Double getWindRun() {
        return this.WindRun;
    }
    
    public Double getHiSpeed() {
        return this.HiSpeed;
    }

    public String getHiDir() {
        return this.HiDir;
    }

    public Double getWindChill() {
        return this.WindChill;
    }
    
    public Double getHeatIndex() {
        return this.HeatIndex;
    }

    public Double getTHWIndex() {
        return this.THWIndex;
    }

    public Double getTHSWIndex() {
        return this.THSWIndex;
    }

    public Double getBar() {
        return this.Bar;
    }

    public Double getRain() {
        return this.Rain;
    }
    
    public Double getRainRate() {
        return this.RainRate;
    }

    public Double getSolarRad() {
        return this.SolarRad;
    }
    
    public Double getSolarEnergy() {
        return this.SolarEnergy;
    }

    public Double getHiSolarRad() {
        return this.HiSolarRad;
    }

    public Double getUVIndex() {
        return this.UVIndex;
    }

    public Double getUVDose() {
        return this.UVDose;
    }

    public Double getHiUV() {
        return this.HiUV;
    }

    public Double getHeatDD() {
        return this.HeatDD;
    }

    public Double getCoolDD() {
        return this.CoolDD;
    }

    public Double getInTemp() {
        return this.InTemp;
    }

    public Double getInHum() {
        return this.InHum;
    }

    public Double getInDew() {
        return this.InDew;
    }

    public Double getInHeat() {
        return this.InHeat;
    }

    public Double getInEMC() {
        return this.InEMC;
    }

    public Double getInAirDensity() {
        return this.InAirDensity;
    }

    public Double getET() {
        return this.ET;
    }

    public Integer getSoil1Moist() {
        return this.Soil1Moist;
    }

    public Integer getSoil2Moist() {
        return this.Soil2Moist;
    }

    public Integer getSoil3Moist() {
        return this.Soil3Moist;
    }

    public Integer getSoil4Moist() {
        return this.Soil4Moist;
    }

    public Double getSoilTemp1() {
        return this.SoilTemp1;
    }

    public Double getSoilTemp2() {
        return this.SoilTemp2;
    }

    public Double getSoilTemp3() {
        return this.SoilTemp3;
    }

    public Double getSoilTemp4() {
        return this.SoilTemp4;
    }

    public Integer getWindSamp() {
        return this.WindSamp;
    }

    public Integer getWindTx() {
        return this.WindTx;
    }

    public Double getISSRecept() {
        return this.ISSRecept;
    }

    public Integer getArcInt() {
        return this.ArcInt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMeteoDate(String MeteoDate) {
        if (MeteoDate.isEmpty()) {
            parsedDate = LocalDate.now();
            this.MeteoDate = parsedDate.format(DateTimeFormatter.ofPattern("dd.MM.yy"));
        } else{
            this.MeteoDate = MeteoDate;
            parsedDate = LocalDate.parse(MeteoDate, DateTimeFormatter.ofPattern("dd.MM.yy"));
        }
        
        if (parsedTime !=null){
            this.id = LocalDateTime.of(parsedDate, parsedTime)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli(); 
        } else {
            this.id = parsedDate.toEpochDay();
        }  
    }
    
    public void setMeteoTime(String MeteoTime) {
        if (MeteoTime.isEmpty()){
            parsedTime = LocalTime.now();
            this.MeteoTime = parsedTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)); 
        } else {
            this.MeteoTime = MeteoTime;
            parsedTime = LocalTime.parse(MeteoTime, DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        }
        
        if (parsedDate !=null){
            this.id = LocalDateTime.of(parsedDate, parsedTime)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli(); 
        } else {
            this.id = parsedTime.toNanoOfDay();
        }
    }
       
    public void setTempOut(Double TempOut) {
        this.TempOut = TempOut;
    }

    public void setHiTemp(Double HiTemp) {
        this.HiTemp = HiTemp;
    }

    public void setLowTemp(Double LowTemp) {
        this.LowTemp = LowTemp;
    }

    public void setOutHum(Integer OutHum) {
        this.OutHum = OutHum;
    }

    public void setDewPt(Double DewPt) {
        this.DewPt = DewPt;
    }

    public void setWindSpeed(Double WindSpeed) {
        this.WindSpeed = WindSpeed;
    }

    public void setWindDir(String WindDir) {
        this.WindDir=WindDir;
    }

    public void setWindRun(Double WindRun) {
        this.WindRun = WindRun;
    }
    
    public void setHiSpeed(Double HiSpeed) {
        this.HiSpeed=HiSpeed;
    }

    public void setHiDir(String HiDir) {
        this.HiDir=HiDir;
    }

    public void setWindChill(Double WindChill) {
        this.WindChill=WindChill;
    }
    
    public void setHeatIndex(Double HeatIndex) {
        this.HeatIndex=HeatIndex;
    }

    public void setTHWIndex(Double THWIndex) {
        this.THWIndex = THWIndex;
    }

    public void setTHSWIndex(Double THSWIndex) {
        this.THSWIndex=THSWIndex;
    }

    public void setBar(Double Bar) {
        this.Bar=Bar;
    }

    public void setRain(Double Rain) {
        this.Rain=Rain;
    }
    
    public void setRainRate(Double RainRate) {
        this.RainRate = RainRate;
    }

    public void setSolarRad(Double SolarRad) {
        this.SolarRad=SolarRad;
    }
    
    public void setSolarEnergy(Double SolarEnergy) {
        this.SolarEnergy=SolarEnergy;
    }

    public void setHiSolarRad(Double HiSolarRad) {
        this.HiSolarRad=HiSolarRad;
    }

    public void setUVIndex(Double UVIndex) {
        this.UVIndex=UVIndex;
    }

    public void setUVDose(Double UVDose) {
        this.UVDose=UVDose;
    }

    public void setHiUV(Double HiUV) {
        this.HiUV = HiUV;
    }

    public void setHeatDD(Double HeatDD) {
        this.HeatDD=HeatDD;
    }

    public void setCoolDD(Double CoolDD) {
        this.CoolDD=CoolDD;
    }

    public void setInTemp(Double InTemp) {
        this.InTemp=InTemp;
    }

    public void setInHum(Double InHum) {
        this.InHum=InHum;
    }

    public void setInDew(Double InDew) {
        this.InDew=InDew;
    }

    public void setInHeat(Double InHeat) {
        this.InHeat=InHeat;
    }

    public void setInEMC(Double InEMC) {
        this.InEMC=InEMC;
    }

    public void setInAirDensity(Double InAirDensity) {
        this.InAirDensity=InAirDensity;
    }

    public void setET(Double ET) {
        this.ET=ET;
    }

    public void setSoil1Moist(Integer Soil1Moist) {
        this.Soil1Moist=Soil1Moist;
    }

    public void setSoil2Moist(Integer Soil2Moist) {
        this.Soil2Moist=Soil2Moist;
    }

    public void setSoil3Moist(Integer Soil3Moist) {
        this.Soil3Moist=Soil3Moist;
    }

    public void setSoil4Moist(Integer Soil4Moist) {
        this.Soil4Moist=Soil4Moist;
    }

    public void setSoilTemp1(Double SoilTemp1) {
        this.SoilTemp1=SoilTemp1;
    }

    public void setSoilTemp2(Double SoilTemp2) {
        this.SoilTemp2=SoilTemp2;
    }

    public void setSoilTemp3(Double SoilTemp3) {
        this.SoilTemp3=SoilTemp3;
    }

    public void setSoilTemp4(Double SoilTemp4) {
        this.SoilTemp4=SoilTemp4;
    }

    public void setWindSamp(Integer WindSamp) {
        this.WindSamp=WindSamp;
    }

    public void setWindTx(Integer WindTx) {
        this.WindTx=WindTx;
    }

    public void setISSRecept(Double ISSRecept) {
        this.ISSRecept=ISSRecept;
    }

    public void setArcInt(Integer ArcInt) {
        this.ArcInt=ArcInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;

        if (!(o instanceof Data))
        return false;

        Data observ = (Data) o;
        return Objects.equals(this.id, observ.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
      
    @Override
    public String toString() {
      return "Davis{" + "id=" + this.id + ", date='" + this.MeteoDate + '\'' + ", time='" + this.MeteoTime + '\'' + '}';
    }
}
