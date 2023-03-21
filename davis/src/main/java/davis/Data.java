package davis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Data {
	private @Id Long id;
    private String MeteoDate;
    private String MeteoTime;
    private double TempOut;
    private double HiTemp;
    private double LowTemp;
    private int    OutHum;
    private double DewPt;
    private double WindSpeed;
    private String WindDir;
    private double WindRun;
    private double HiSpeed;
    private String HiDir;
    private double WindChill;
    private double HeatIndex;
    private double THWIndex;
    private double THSWIndex;
    private double Bar;
    private double Rain;
    private double RainRate;
    private double SolarRad;
    private double SolarEnergy;
    private double HiSolarRad;
    private double UVIndex;
    private double UVDose;
    private double HiUV;
    private double HeatDD;
    private double CoolDD;
    private double InTemp;
    private double InHum;
    private double InDew;
    private double InHeat;
    private double InEMC;
    private double InAirDensity;
    private double ET;
    private int Soil1Moist;
    private int Soil2Moist;
    private int Soil3Moist;
    private int Soil4Moist;
    private double SoilTemp1;
    private double SoilTemp2;
    private double SoilTemp3;
    private double SoilTemp4;
    private int WindSamp;
    private int WindTx;
    private double ISSRecept;
    private int ArcInt;

    @Transient
    private LocalDate parsedDate;
    @Transient
    private LocalTime parsedTime;    
    
    public Data(){
    }

    public Data(String MeteoDate, 
    String MeteoTime,
    double TempOut,
    double HiTemp,
    double LowTemp,
    int OutHum,
    double DewPt,
    double WindSpeed,
    String WindDir,
    double WindRun,
    double HiSpeed,
    String HiDir,
    double WindChill,
    double HeatIndex,
    double THWIndex,
    double THSWIndex,
    double Bar,
    double Rain,
    double RainRate,
    double SolarRad,
    double SolarEnergy,
    double HiSolarRad,
    double UVIndex,
    double UVDose,
    double HiUV,
    double HeatDD,
    double CoolDD,
    double InTemp,
    double InHum,
    double InDew,
    double InHeat,
    double InEMC,
    double InAirDensity,
    double ET,
    int Soil1Moist,
    int Soil2Moist,
    int Soil3Moist,
    int Soil4Moist,
    double SoilTemp1,
    double SoilTemp2,
    double SoilTemp3,
    double SoilTemp4,
    int WindSamp,
    int WindTx,
    double ISSRecept,
    int ArcInt) {
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
       
    public double getTempOut() {
        return this.TempOut;
    }

    public double getHiTemp() {
        return this.HiTemp;
    }

    public double getLowTemp() {
        return this.LowTemp;
    }

    public int getOutHum() {
        return this.OutHum;
    }

    public double getDewPt() {
        return this.DewPt;
    }

    public double getWindSpeed() {
        return this.WindSpeed;
    }

    public String getWindDir() {
        return this.WindDir;
    }

    public double getWindRun() {
        return this.WindRun;
    }
    
    public double getHiSpeed() {
        return this.HiSpeed;
    }

    public String getHiDir() {
        return this.HiDir;
    }

    public double getWindChill() {
        return this.WindChill;
    }
    
    public double getHeatIndex() {
        return this.HeatIndex;
    }

    public double getTHWIndex() {
        return this.THWIndex;
    }

    public double getTHSWIndex() {
        return this.THSWIndex;
    }

    public double getBar() {
        return this.Bar;
    }

    public double getRain() {
        return this.Rain;
    }
    
    public double getRainRate() {
        return this.RainRate;
    }

    public double getSolarRad() {
        return this.SolarRad;
    }
    
    public double getSolarEnergy() {
        return this.SolarEnergy;
    }

    public double getHiSolarRad() {
        return this.HiSolarRad;
    }

    public double getUVIndex() {
        return this.UVIndex;
    }

    public double getUVDose() {
        return this.UVDose;
    }

    public double getHiUV() {
        return this.HiUV;
    }

    public double getHeatDD() {
        return this.HeatDD;
    }

    public double getCoolDD() {
        return this.CoolDD;
    }

    public double getInTemp() {
        return this.InTemp;
    }

    public double getInHum() {
        return this.InHum;
    }

    public double getInDew() {
        return this.InDew;
    }

    public double getInHeat() {
        return this.InHeat;
    }

    public double getInEMC() {
        return this.InEMC;
    }

    public double getInAirDensity() {
        return this.InAirDensity;
    }

    public double getET() {
        return this.ET;
    }

    public int getSoil1Moist() {
        return this.Soil1Moist;
    }

    public int getSoil2Moist() {
        return this.Soil2Moist;
    }

    public int getSoil3Moist() {
        return this.Soil3Moist;
    }

    public int getSoil4Moist() {
        return this.Soil4Moist;
    }

    public double getSoilTemp1() {
        return this.SoilTemp1;
    }

    public double getSoilTemp2() {
        return this.SoilTemp2;
    }

    public double getSoilTemp3() {
        return this.SoilTemp3;
    }

    public double getSoilTemp4() {
        return this.SoilTemp4;
    }

    public int getWindSamp() {
        return this.WindSamp;
    }

    public int getWindTx() {
        return this.WindTx;
    }

    public double getISSRecept() {
        return this.ISSRecept;
    }

    public int getArcInt() {
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
       
        if (parsedTime == null){
            parsedTime = LocalTime.now();
        }

       updateId();
    }
    
    public void setMeteoTime(String MeteoTime) {
        if (MeteoTime.isEmpty()){
            parsedTime = LocalTime.now();
            this.MeteoTime = parsedTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        } else {
            this.MeteoTime = MeteoTime;
            parsedTime = LocalTime.parse(MeteoTime, DateTimeFormatter.ofPattern("HH:mm"));
        }
       
        if (parsedDate == null) {
            parsedDate = LocalDate.now();
        }

       updateId();
    }
       
    private void updateId(){
        this.id = LocalDateTime.of(parsedDate, parsedTime)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    public void createId(){
        this.setMeteoDate(this.getMeteoDate());
        this.setMeteoTime(this.getMeteoTime());
    }

    public void setTempOut(double TempOut) {
        this.TempOut = TempOut;
    }

    public void setHiTemp(double HiTemp) {
        this.HiTemp = HiTemp;
    }

    public void setLowTemp(double LowTemp) {
        this.LowTemp = LowTemp;
    }

    public void setOutHum(int OutHum) {
        this.OutHum = OutHum;
    }

    public void setDewPt(double DewPt) {
        this.DewPt = DewPt;
    }

    public void setWindSpeed(double WindSpeed) {
        this.WindSpeed = WindSpeed;
    }

    public void setWindDir(String WindDir) {
        this.WindDir=WindDir;
    }

    public void setWindRun(double WindRun) {
        this.WindRun = WindRun;
    }
    
    public void setHiSpeed(double HiSpeed) {
        this.HiSpeed=HiSpeed;
    }

    public void setHiDir(String HiDir) {
        this.HiDir=HiDir;
    }

    public void setWindChill(double WindChill) {
        this.WindChill=WindChill;
    }
    
    public void setHeatIndex(double HeatIndex) {
        this.HeatIndex=HeatIndex;
    }

    public void setTHWIndex(double THWIndex) {
        this.THWIndex = THWIndex;
    }

    public void setTHSWIndex(double THSWIndex) {
        this.THSWIndex=THSWIndex;
    }

    public void setBar(double Bar) {
        this.Bar=Bar;
    }

    public void setRain(double Rain) {
        this.Rain=Rain;
    }
    
    public void setRainRate(double RainRate) {
        this.RainRate = RainRate;
    }

    public void setSolarRad(double SolarRad) {
        this.SolarRad=SolarRad;
    }
    
    public void setSolarEnergy(double SolarEnergy) {
        this.SolarEnergy=SolarEnergy;
    }

    public void setHiSolarRad(double HiSolarRad) {
        this.HiSolarRad=HiSolarRad;
    }

    public void setUVIndex(double UVIndex) {
        this.UVIndex=UVIndex;
    }

    public void setUVDose(double UVDose) {
        this.UVDose=UVDose;
    }

    public void setHiUV(double HiUV) {
        this.HiUV = HiUV;
    }

    public void setHeatDD(double HeatDD) {
        this.HeatDD=HeatDD;
    }

    public void setCoolDD(double CoolDD) {
        this.CoolDD=CoolDD;
    }

    public void setInTemp(double InTemp) {
        this.InTemp=InTemp;
    }

    public void setInHum(double InHum) {
        this.InHum=InHum;
    }

    public void setInDew(double InDew) {
        this.InDew=InDew;
    }

    public void setInHeat(double InHeat) {
        this.InHeat=InHeat;
    }

    public void setInEMC(double InEMC) {
        this.InEMC=InEMC;
    }

    public void setInAirDensity(double InAirDensity) {
        this.InAirDensity=InAirDensity;
    }

    public void setET(double ET) {
        this.ET=ET;
    }

    public void setSoil1Moist(int Soil1Moist) {
        this.Soil1Moist=Soil1Moist;
    }

    public void setSoil2Moist(int Soil2Moist) {
        this.Soil2Moist=Soil2Moist;
    }

    public void setSoil3Moist(int Soil3Moist) {
        this.Soil3Moist=Soil3Moist;
    }

    public void setSoil4Moist(int Soil4Moist) {
        this.Soil4Moist=Soil4Moist;
    }

    public void setSoilTemp1(double SoilTemp1) {
        this.SoilTemp1=SoilTemp1;
    }

    public void setSoilTemp2(double SoilTemp2) {
        this.SoilTemp2=SoilTemp2;
    }

    public void setSoilTemp3(double SoilTemp3) {
        this.SoilTemp3=SoilTemp3;
    }

    public void setSoilTemp4(double SoilTemp4) {
        this.SoilTemp4=SoilTemp4;
    }

    public void setWindSamp(int WindSamp) {
        this.WindSamp=WindSamp;
    }

    public void setWindTx(int WindTx) {
        this.WindTx=WindTx;
    }

    public void setISSRecept(double ISSRecept) {
        this.ISSRecept=ISSRecept;
    }

    public void setArcInt(int ArcInt) {
        this.ArcInt=ArcInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;

        if (!(o instanceof Data))
        return false;

        Data d = (Data) o;
        return Objects.equals(this.id, d.id) &&
        Objects.equals(this.MeteoDate, d.MeteoDate) &&
        Objects.equals(this.MeteoTime,d.MeteoTime ) &&
        Objects.equals(this.TempOut,d.TempOut ) &&
        Objects.equals(this.HiTemp,d.HiTemp ) &&
        Objects.equals(this.LowTemp,d.LowTemp ) &&
        Objects.equals(this.OutHum,d.OutHum ) &&
        Objects.equals(this.DewPt,d.DewPt ) &&
        Objects.equals(this.WindSpeed,d.WindSpeed ) &&
        Objects.equals(this.WindDir,d.WindDir ) &&
        Objects.equals(this.WindRun,d.WindRun ) &&
        Objects.equals(this.HiSpeed,d.HiSpeed ) &&
        Objects.equals(this.HiDir,d.HiDir ) &&
        Objects.equals(this.WindChill,d.WindChill ) &&
        Objects.equals(this.HeatIndex,d.HeatIndex ) &&
        Objects.equals(this.THWIndex,d.THWIndex ) &&
        Objects.equals(this.THSWIndex,d.THSWIndex ) &&
        Objects.equals(this.Bar,d.Bar ) &&
        Objects.equals(this.Rain,d.Rain ) &&
        Objects.equals(this.RainRate,d.RainRate ) &&
        Objects.equals(this.SolarRad,d.SolarRad ) &&
        Objects.equals(this.SolarEnergy,d.SolarEnergy ) &&
        Objects.equals(this.HiSolarRad,d.HiSolarRad ) &&
        Objects.equals(this.UVIndex,d.UVIndex ) &&
        Objects.equals(this.UVDose,d.UVDose ) &&
        Objects.equals(this.HiUV,d.HiUV ) &&
        Objects.equals(this.HeatDD,d.HeatDD ) &&
        Objects.equals(this.CoolDD,d.CoolDD ) &&
        Objects.equals(this.InTemp,d.InTemp ) &&
        Objects.equals(this.InHum,d.InHum ) &&
        Objects.equals(this.InDew,d.InDew ) &&
        Objects.equals(this.InHeat,d.InHeat ) &&
        Objects.equals(this.InEMC,d.InEMC ) &&
        Objects.equals(this.InAirDensity,d.InAirDensity ) &&
        Objects.equals(this.ET,d.ET ) &&
        Objects.equals(this.Soil1Moist,d.Soil1Moist ) &&
        Objects.equals(this.Soil2Moist,d.Soil2Moist ) &&
        Objects.equals(this.Soil3Moist,d.Soil3Moist ) &&
        Objects.equals(this.Soil4Moist,d.Soil4Moist ) &&
        Objects.equals(this.SoilTemp1,d.SoilTemp1 ) &&
        Objects.equals(this.SoilTemp2,d.SoilTemp2 ) &&
        Objects.equals(this.SoilTemp3,d.SoilTemp3 ) &&
        Objects.equals(this.SoilTemp4,d.SoilTemp4 ) &&
        Objects.equals(this.WindSamp,d.WindSamp ) &&
        Objects.equals(this.WindTx,d.WindTx ) &&
        Objects.equals(this.ISSRecept,d.ISSRecept ) &&
        Objects.equals(this.ArcInt, d.ArcInt );
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, 
        this.MeteoDate,
        this.MeteoTime,
        this.TempOut,
        this.HiTemp,
        this.LowTemp,
        this.OutHum,
        this.DewPt,
        this.WindSpeed,
        this.WindDir,
        this.WindRun,
        this.HiSpeed,
        this.HiDir,
        this.WindChill,
        this.HeatIndex,
        this.THWIndex,
        this.THSWIndex,
        this.Bar,
        this.Rain,
        this.RainRate,
        this.SolarRad,
        this.SolarEnergy,
        this.HiSolarRad,
        this.UVIndex,
        this.UVDose,
        this.HiUV,
        this.HeatDD,
        this.CoolDD,
        this.InTemp,
        this.InHum,
        this.InDew,
        this.InHeat,
        this.InEMC,
        this.InAirDensity,
        this.ET,
        this.Soil1Moist,
        this.Soil2Moist,
        this.Soil3Moist,
        this.Soil4Moist,
        this.SoilTemp1,
        this.SoilTemp2,
        this.SoilTemp3,
        this.SoilTemp4,
        this.WindSamp,
        this.WindTx,
        this.ISSRecept,
        this.ArcInt
        );
    }
      
    @Override
    public String toString() {
      return "Davis{" + "id=" + this.id + ", date='" + this.MeteoDate + '\'' + ", time='" + this.MeteoTime + '\'' + '}';
    }

    public String toJSON() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"id\":\""); sb.append(this.id);sb.append("\",");
        sb.append("\"MeteoDate\":\""); sb.append(this.MeteoDate);sb.append("\",");
        sb.append("\"MeteoTime\":\""); sb.append(this.MeteoTime);sb.append("\",");
        sb.append("\"TempOut\":\""); sb.append(this.TempOut);sb.append("\",");
        sb.append("\"HiTemp\":\""); sb.append(this.HiTemp);sb.append("\",");
        sb.append("\"LowTemp\":\""); sb.append(this.LowTemp);sb.append("\",");
        sb.append("\"OutHum\":\""); sb.append(this.OutHum);sb.append("\",");
        sb.append("\"DewPt\":\""); sb.append(this.DewPt);sb.append("\",");
        sb.append("\"WindSpeed\":\""); sb.append(this.WindSpeed);sb.append("\",");
        sb.append("\"WindDir\":\""); sb.append(this.WindDir);sb.append("\",");
        sb.append("\"WindRun\":\""); sb.append(this.WindRun);sb.append("\",");
        sb.append("\"HiSpeed\":\""); sb.append(this.HiSpeed);sb.append("\",");
        sb.append("\"HiDir\":\""); sb.append(this.HiDir);sb.append("\",");
        sb.append("\"WindChill\":\""); sb.append(this.WindChill);sb.append("\",");
        sb.append("\"HeatIndex\":\""); sb.append(this.HeatIndex);sb.append("\",");
        sb.append("\"THWIndex\":\""); sb.append(this.THWIndex);sb.append("\",");
        sb.append("\"THSWIndex\":\""); sb.append(this.THSWIndex);sb.append("\",");
        sb.append("\"Bar\":\""); sb.append(this.Bar);sb.append("\",");
        sb.append("\"Rain\":\""); sb.append(this.Rain);sb.append("\",");
        sb.append("\"RainRate\":\""); sb.append(this.RainRate);sb.append("\",");
        sb.append("\"SolarRad\":\""); sb.append(this.SolarRad);sb.append("\",");
        sb.append("\"SolarEnergy\":\""); sb.append(this.SolarEnergy);sb.append("\",");
        sb.append("\"HiSolarRad\":\""); sb.append(this.HiSolarRad);sb.append("\",");
        sb.append("\"UVIndex\":\""); sb.append(this.UVIndex);sb.append("\",");
        sb.append("\"UVDose\":\""); sb.append(this.UVDose);sb.append("\",");
        sb.append("\"HiUV\":\""); sb.append(this.HiUV);sb.append("\",");
        sb.append("\"HeatDD\":\""); sb.append(this.HeatDD);sb.append("\",");
        sb.append("\"CoolDD\":\""); sb.append(this.CoolDD);sb.append("\",");
        sb.append("\"InTemp\":\""); sb.append(this.InTemp);sb.append("\",");
        sb.append("\"InHum\":\""); sb.append(this.InHum);sb.append("\",");
        sb.append("\"InDew\":\""); sb.append(this.InDew);sb.append("\",");
        sb.append("\"InHeat\":\""); sb.append(this.InHeat);sb.append("\",");
        sb.append("\"InEMC\":\""); sb.append(this.InEMC);sb.append("\",");
        sb.append("\"InAirDensity\":\""); sb.append(this.InAirDensity);sb.append("\",");
        sb.append("\"ET\":\""); sb.append(this.ET);sb.append("\",");
        sb.append("\"Soil1Moist\":\""); sb.append(this.Soil1Moist);sb.append("\",");
        sb.append("\"Soil2Moist\":\""); sb.append(this.Soil2Moist);sb.append("\",");
        sb.append("\"Soil3Moist\":\""); sb.append(this.Soil3Moist);sb.append("\",");
        sb.append("\"Soil4Moist\":\""); sb.append(this.Soil4Moist);sb.append("\",");
        sb.append("\"SoilTemp1\":\""); sb.append(this.SoilTemp1);sb.append("\",");
        sb.append("\"SoilTemp2\":\""); sb.append(this.SoilTemp2);sb.append("\",");
        sb.append("\"SoilTemp3\":\""); sb.append(this.SoilTemp3);sb.append("\",");
        sb.append("\"SoilTemp4\":\""); sb.append(this.SoilTemp4);sb.append("\",");
        sb.append("\"WindSamp\":\""); sb.append(this.WindSamp);sb.append("\",");
        sb.append("\"WindTx\":\""); sb.append(this.WindTx);sb.append("\",");
        sb.append("\"ISSRecept\":\""); sb.append(this.ISSRecept);sb.append("\",");
        sb.append("\"ArcInt\":\""); sb.append(this.ArcInt);sb.append("\"");
        sb.append("}");

        return sb.toString();
        
    }

}
