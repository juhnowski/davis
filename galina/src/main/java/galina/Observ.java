package galina;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Observ {
	private @Id long id;
    @JsonProperty
    private String MeteoDate; // Дата наблюдения '2011-12-03'
    @JsonProperty private String MeteoTime; // Время наблюдения '10:15:30'
    @JsonProperty private String WindDir; // Направление ветра
    @JsonProperty private double WindSpeed; // Скорость ветра
    @JsonProperty private int Pressure; // Давление
    @JsonProperty private double TempMin; // температура минимальная
    @JsonProperty private double TempMax; // температура максимальная
    @JsonProperty private double Precipitation; // Количество осадков
    @JsonProperty private double SunshineDuration; // Продолжительность солнечного сияния
    @JsonProperty private double DewPoint; // Точка росы (в пожароопасный период)
    @JsonProperty private int SnowLevelWeatherSite; // Уровень снега на метеоплощадке
    @JsonProperty private String SnowCoverage; // Определение покрытия земли снегом в баллах
    @JsonProperty private int SnowLevelForest; // Уровень снега в лесу
    @JsonProperty private double AverageSnowDensity; // средняя плотность снега
    @JsonProperty private int MoistureWaterInSnow; // влагозапас воды в снеге
    @JsonProperty private String SnowCover; // Характер залегания снежного покрова
    @JsonProperty private String SnowState; // характеристика состояния снега

    @JsonProperty private int NRustayskoyeWaterLevel; // Нижнее Рустайское - Уровень воды
    @JsonProperty private double NRustayskoyeTemp; // Нижнее Рустайское - Температура
    @JsonProperty private double NRustayskoyepH; // Нижнее Рустайское - рН
    @JsonProperty private int NRustayskoyeElConduct; // Нижнее Рустайское - электропроводность
    @JsonProperty private int NRustayskoyeWaterColor; // Нижнее Рустайское - цветность воды
    @JsonProperty private double NRustayskoyeOxygen; // Нижнее Рустайское - кислород
    @JsonProperty private double NRustayskoyeBPK5; // Нижнее Рустайское - БПК-5

    @JsonProperty private int KrugloeWaterLevel; // Круглое - Уровень воды
    @JsonProperty private double KrugloeTemp; // Круглое - Температура
    @JsonProperty private double KrugloepH; // Круглое - рН
    @JsonProperty private int KrugloeElConduct; // Круглое - электропроводность
    @JsonProperty private int KrugloeWaterColor; // Круглое - цветность воды
    @JsonProperty private double KrugloeOxygen; // Круглое - кислород
    @JsonProperty private double KrugloeBPK5; // Круглое - БПК-5

    @JsonProperty private int KalachikWaterLevel; // Калачик - Уровень воды
    @JsonProperty private double KalachikTemp; // Калачик - Температура
    @JsonProperty private double KalachikpH; // Калачик - рН
    @JsonProperty private int KalachikElConduct; // Калачик - электропроводность
    @JsonProperty private int KalachikWaterColor; // Калачик - цветность воды
    @JsonProperty private double KalachikOxygen; // Калачик - кислород
    @JsonProperty private double KalachikBPK5; // Калачик - БПК-5

    @JsonProperty private int MakhovskoeWaterLevel; // Маховское - Уровень воды
    @JsonProperty private double MakhovskoeTemp; // Маховское - Температура
    @JsonProperty private double MakhovskoepH; // Маховское - рН
    @JsonProperty private int MakhovskoeElConduct; // Маховское - электропроводность
    @JsonProperty private int MakhovskoeWaterColor; // Маховское - цветность воды
    @JsonProperty private double MakhovskoeOxygen; // Маховское - кислород
    @JsonProperty private double MakhovskoeBPK5; // Маховское - БПК-5

    @JsonProperty private int KerzhenetsWaterLevel; // Керженец - Уровень воды
    @JsonProperty private double KerzhenetsTemp; // Керженец - Температура
    @JsonProperty private double KerzhenetspH; // Керженец - рН
    @JsonProperty private int KerzhenetsElConduct; // Керженец - электропроводность
    @JsonProperty private int KerzhenetsWaterColor; // Керженец - цветность воды
    @JsonProperty private double KerzhenetsOxygen; // Керженец - кислород
    @JsonProperty private double KerzhenetsBPK5; // Керженец - БПК-5

    @JsonProperty private int VishnyaWaterLevel; // Вишня - Уровень воды
    @JsonProperty private double VishnyaTemp; // Вишня - Температура
    @JsonProperty private double VishnyapH; // Вишня - рН
    @JsonProperty private int VishnyaElConduct; // Вишня - электропроводность
    @JsonProperty private int VishnyaWaterColor; // Вишня - цветность воды
    @JsonProperty private double VishnyaOxygen; // Вишня - кислород
    @JsonProperty private double VishnyaBPK5; // Вишня - БПК-5

    @JsonProperty private int WellWaterLevel; // Колодец - Уровень воды
    @JsonProperty private double WellTemp; // Колодец - Температура
    @JsonProperty private double WellpH; // Колодец - рН
    @JsonProperty private int WellElConduct; // Колодец - электропроводность
    @JsonProperty private int WellWaterColor; // Колодец - цветность воды
    @JsonProperty private double WellOxygen; // Колодец - кислород
    @JsonProperty private double WellBPK5; // Колодец - БПК-5

    @JsonProperty private int VishenskoeWaterLevel; // Вишёнское - Уровень воды
    @JsonProperty private double VishenskoeTemp; // Вишёнское - Температура
    @JsonProperty private double VishenskoepH; // Вишёнское - рН
    @JsonProperty private int VishenskoeElConduct; // Вишёнское - электропроводность
    @JsonProperty private int VishenskoeWaterColor; // Вишёнское - цветность воды
    @JsonProperty private double VishenskoeOxygen; // Вишёнское - кислород
    @JsonProperty private double VishenskoeBPK5; // Вишёнское - БПК-5

    @Transient
    private LocalDate parsedDate;
    @Transient
    private LocalTime parsedTime;


    public Observ(){
    }

    public Observ(
        String MeteoDate,
        String MeteoTime,
        String WindDir,
        double WindSpeed,
        int Pressure,
        double TempMin,
        double TempMax,
        double Precipitation,
        double SunshineDuration,
        double DewPoint,
        int SnowLevelWeatherSite,
        String SnowCoverage,
        int SnowLevelForest,
        double AverageSnowDensity,
        int MoistureWaterInSnow,
        String SnowCover,
        String SnowState,
        int NRustayskoyeWaterLevel,
        double NRustayskoyeTemp,
        double NRustayskoyepH,
        int NRustayskoyeElConduct,
        int NRustayskoyeWaterColor,
        double NRustayskoyeOxygen,
        double NRustayskoyeBPK5,
        int KrugloeWaterLevel,
        double KrugloeTemp,
        double KrugloepH,
        int KrugloeElConduct,
        int KrugloeWaterColor,
        double KrugloeOxygen,
        double KrugloeBPK5,
        int KalachikWaterLevel,
        double KalachikTemp,
        double KalachikpH,
        int KalachikElConduct,
        int KalachikWaterColor,
        double KalachikOxygen,
        double KalachikBPK5,
        int MakhovskoeWaterLevel,
        double MakhovskoeTemp,
        double MakhovskoepH,
        int MakhovskoeElConduct,
        int MakhovskoeWaterColor,
        double MakhovskoeOxygen,
        double MakhovskoeBPK5,
        int KerzhenetsWaterLevel,
        double KerzhenetsTemp,
        double KerzhenetspH,
        int KerzhenetsElConduct,
        int KerzhenetsWaterColor,
        double KerzhenetsOxygen,
        double KerzhenetsBPK5,
        int VishnyaWaterLevel,
        double VishnyaTemp,
        double VishnyapH,
        int VishnyaElConduct,
        int VishnyaWaterColor,
        double VishnyaOxygen,
        double VishnyaBPK5,
        int WellWaterLevel,
        double WellTemp,
        double WellpH,
        int WellElConduct,
        int WellWaterColor,
        double WellOxygen,
        double WellBPK5,
        int VishenskoeWaterLevel,
        double VishenskoeTemp,
        double VishenskoepH,
        int VishenskoeElConduct,
        int VishenskoeWaterColor,
        double VishenskoeOxygen,
        double VishenskoeBPK5
    ) {
        setMeteoDate(MeteoDate);
        setMeteoTime(MeteoTime);
        this.MeteoDate = MeteoDate;
        this.MeteoTime = MeteoTime;
        this.WindDir = WindDir;
        this.WindSpeed = WindSpeed;
        this.Pressure = Pressure;
        this.TempMin = TempMin;
        this.TempMax = TempMax;
        this.Precipitation = Precipitation;
        this.SunshineDuration = SunshineDuration;
        this.DewPoint = DewPoint;
        this.SnowLevelWeatherSite = SnowLevelWeatherSite;
        this.SnowCoverage = SnowCoverage;
        this.SnowLevelForest = SnowLevelForest;
        this.AverageSnowDensity = AverageSnowDensity;
        this.MoistureWaterInSnow = MoistureWaterInSnow;
        this.SnowCover = SnowCover;
        this.SnowState = SnowState;
        this.NRustayskoyeWaterLevel = NRustayskoyeWaterLevel;
        this.NRustayskoyeTemp = NRustayskoyeTemp;
        this.NRustayskoyepH = NRustayskoyepH;
        this.NRustayskoyeElConduct = NRustayskoyeElConduct;
        this.NRustayskoyeWaterColor = NRustayskoyeWaterColor;
        this.NRustayskoyeOxygen = NRustayskoyeOxygen;
        this.NRustayskoyeBPK5 = NRustayskoyeBPK5;
        this.KrugloeWaterLevel = KrugloeWaterLevel;
        this.KrugloeTemp = KrugloeTemp;
        this.KrugloepH = KrugloepH;
        this.KrugloeElConduct = KrugloeElConduct;
        this.KrugloeWaterColor = KrugloeWaterColor;
        this.KrugloeOxygen = KrugloeOxygen;
        this.KrugloeBPK5 = KrugloeBPK5;
        this.KalachikWaterLevel = KalachikWaterLevel;
        this.KalachikTemp = KalachikTemp;
        this.KalachikpH = KalachikpH;
        this.KalachikElConduct = KalachikElConduct;
        this.KalachikWaterColor = KalachikWaterColor;
        this.KalachikOxygen = KalachikOxygen;
        this.KalachikBPK5 = KalachikBPK5;
        this.MakhovskoeWaterLevel = MakhovskoeWaterLevel;
        this.MakhovskoeTemp = MakhovskoeTemp;
        this.MakhovskoepH = MakhovskoepH;
        this.MakhovskoeElConduct = MakhovskoeElConduct;
        this.MakhovskoeWaterColor = MakhovskoeWaterColor;
        this.MakhovskoeOxygen = MakhovskoeOxygen;
        this.MakhovskoeBPK5 = MakhovskoeBPK5;
        this.KerzhenetsWaterLevel = KerzhenetsWaterLevel;
        this.KerzhenetsTemp = KerzhenetsTemp;
        this.KerzhenetspH = KerzhenetspH;
        this.KerzhenetsElConduct = KerzhenetsElConduct;
        this.KerzhenetsWaterColor = KerzhenetsWaterColor;
        this.KerzhenetsOxygen = KerzhenetsOxygen;
        this.KerzhenetsBPK5 = KerzhenetsBPK5;
        this.VishnyaWaterLevel = VishnyaWaterLevel;
        this.VishnyaTemp = VishnyaTemp;
        this.VishnyapH = VishnyapH;
        this.VishnyaElConduct = VishnyaElConduct;
        this.VishnyaWaterColor = VishnyaWaterColor;
        this.VishnyaOxygen = VishnyaOxygen;
        this.VishnyaBPK5 = VishnyaBPK5;
        this.WellWaterLevel = WellWaterLevel;
        this.WellTemp = WellTemp;
        this.WellpH = WellpH;
        this.WellElConduct = WellElConduct;
        this.WellWaterColor = WellWaterColor;
        this.WellOxygen = WellOxygen;
        this.WellBPK5 = WellBPK5;
        this.VishenskoeWaterLevel = VishenskoeWaterLevel;
        this.VishenskoeTemp = VishenskoeTemp;
        this.VishenskoepH = VishenskoepH;
        this.VishenskoeElConduct = VishenskoeElConduct;
        this.VishenskoeWaterColor = VishenskoeWaterColor;
        this.VishenskoeOxygen = VishenskoeOxygen; 
        this.VishenskoeBPK5 = VishenskoeBPK5;
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
       
    public String getWindDir() {
        return this.WindDir;
    }

    public double getWindSpeed() {
        return this.WindSpeed;
    }

    public int getPressure() {
        return this.Pressure;
    }

    public double getTempMin() {
        return this.TempMin;
    }

    public double getTempMax() {
        return this.TempMax;
    }

    public double getPrecipitation() {
        return this.Precipitation;
    }

    public double getSunshineDuration() {
        return this.SunshineDuration;
    }

    public double getDewPoint() {
        return this.DewPoint;
    }
    
    public int getSnowLevelWeatherSite() {
        return this.SnowLevelWeatherSite;
    }

    public String getSnowCoverage() {
        return this.SnowCoverage;
    }

    public int getSnowLevelForest() {
        return this.SnowLevelForest;
    }
    
    public double getAverageSnowDensity() {
        return this.AverageSnowDensity;
    }

    public int getMoistureWaterInSnow() {
        return this.MoistureWaterInSnow;
    }

    public String getSnowCover() {
        return this.SnowCover;
    }

    public String getSnowState() {
        return this.SnowState;
    }

    public int getNRustayskoyeWaterLevel() {
        return this.NRustayskoyeWaterLevel;
    }
    
    public double getNRustayskoyeTemp() {
        return this.NRustayskoyeTemp;
    }

    public double getNRustayskoyepH() {
        return this.NRustayskoyepH;
    }
    
    public int getNRustayskoyeElConduct() {
        return this.NRustayskoyeElConduct;
    }

    public int getNRustayskoyeWaterColor() {
        return this.NRustayskoyeWaterColor;
    }

    public double getNRustayskoyeOxygen() {
        return this.NRustayskoyeOxygen;
    }

    public double getNRustayskoyeBPK5() {
        return this.NRustayskoyeBPK5;
    }

    public int getKrugloeWaterLevel() {
        return this.KrugloeWaterLevel;
    }

    public double getKrugloeTemp() {
        return this.KrugloeTemp;
    }

    public double getKrugloepH() {
        return this.KrugloepH;
    }

    public int getKrugloeElConduct() {
        return this.KrugloeElConduct;
    }

    public int getKrugloeWaterColor() {
        return this.KrugloeWaterColor;
    }

    public double getKrugloeOxygen() {
        return this.KrugloeOxygen;
    }

    public double getKrugloeBPK5() {
        return this.KrugloeBPK5;
    }

    public int getKalachikWaterLevel() {
        return this.KalachikWaterLevel;
    }

    public double getKalachikTemp() {
        return this.KalachikTemp;
    }

    public double getKalachikpH() {
        return this.KalachikpH;
    }

    public int getKalachikElConduct() {
        return this.KalachikElConduct;
    }

    public int getKalachikWaterColor() {
        return this.KalachikWaterColor;
    }

    public double getKalachikOxygen() {
        return this.KalachikOxygen;
    }

    public double getKalachikBPK5() {
        return this.KalachikBPK5;
    }

    public int getMakhovskoeWaterLevel() {
        return this.MakhovskoeWaterLevel;
    }

    public double getMakhovskoeTemp() {
        return this.MakhovskoeTemp;
    }

    public double getMakhovskoepH() {
        return this.MakhovskoepH;
    }

    public int getMakhovskoeElConduct() {
        return this.MakhovskoeElConduct;
    }

    public int getMakhovskoeWaterColor() {
        return this.MakhovskoeWaterColor;
    }

    public double getMakhovskoeOxygen() {
        return this.MakhovskoeOxygen;
    }

    public double getMakhovskoeBPK5() {
        return this.MakhovskoeBPK5;
    }

    public int getKerzhenetsWaterLevel() {
        return this.KerzhenetsWaterLevel;
    }

    public double getKerzhenetsTemp() {
        return this.KerzhenetsTemp;
    }

    public double getKerzhenetspH() {
        return this.KerzhenetspH;
    }

    public int getKerzhenetsElConduct() {
        return this.KerzhenetsElConduct;
    }

    public int getKerzhenetsWaterColor() {
        return this.KerzhenetsWaterColor;
    }

    public double getKerzhenetsOxygen() {
        return this.KerzhenetsOxygen;
    }

    public double getKerzhenetsBPK5() {
        return this.KerzhenetsBPK5;
    }

    public int getVishnyaWaterLevel() {
        return this.VishnyaWaterLevel;
    }

    public double getVishnyaTemp() {
        return this.VishnyaTemp;
    }

    public double getVishnyapH() {
        return this.VishnyapH;
    }

    public int getVishnyaElConduct() {
        return this.VishnyaElConduct;
    }

    public int getVishnyaWaterColor() {
        return this.VishnyaWaterColor;
    }

    public double getVishnyaOxygen() {
        return this.VishnyaOxygen;
    }

    public double getVishnyaBPK5() {
        return this.VishnyaBPK5;
    }

    public int getWellWaterLevel() {
        return this.WellWaterLevel;
    }

    public double getWellTemp() {
        return this.WellTemp;
    }

    public double getWellpH() {
        return this.WellpH;
    }

    public int getWellElConduct() {
        return this.WellElConduct;
    }

    public int getWellWaterColor() {
        return this.WellWaterColor;
    }

    public double getWellOxygen() {
        return this.WellOxygen;
    }

    public double getWellBPK5() {
        return this.WellBPK5;
    }

    public int getVishenskoeWaterLevel() {
        return this.VishenskoeWaterLevel;
    }

    public double getVishenskoeTemp() {
        return this.VishenskoeTemp;
    }

    public double getVishenskoepH() {
        return this.VishenskoepH;
    }
    public int getVishenskoeElConduct() {
        return this.VishenskoeElConduct;
    }

    public int getVishenskoeWaterColor() {
        return this.VishenskoeWaterColor;
    }

    public double getVishenskoeOxygen() {
        return this.VishenskoeOxygen;
    }

    public double getVishenskoeBPK5() {
        return this.VishenskoeBPK5;
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

        updateId();;
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

        updateId();;
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
    
       
    public void setWindDir(String WindDir) {
        this.WindDir = WindDir;
    }

    public void setWindSpeed(double WindSpeed) {
        this.WindSpeed = WindSpeed;
    }

    public void setPressure(int Pressure) {
        this.Pressure = Pressure;
    }

    public void setTempMin(double TempMin) {
        this.TempMin = TempMin;
    }

    public void setTempMax(double TempMax) {
        this.TempMax = TempMax;
    }

    public void setPrecipitation(double Precipitation) {
        this.Precipitation = Precipitation;
    }

    public void setSunshineDuration(double SunshineDuration) {
        this.SunshineDuration = SunshineDuration;
    }

    public void setDewPoint(double DewPoint) {
        this.DewPoint = DewPoint;
    }
    
    public void setSnowLevelWeatherSite(int SnowLevelWeatherSite) {
        this.SnowLevelWeatherSite = SnowLevelWeatherSite;
    }

    public void setSnowCoverage(String SnowCoverage) {
        this.SnowCoverage = SnowCoverage;
    }

    public void setSnowLevelForest(int SnowLevelForest) {
        this.SnowLevelForest=SnowLevelForest;
    }
    
    public void setAverageSnowDensity(double AverageSnowDensity) {
        this.AverageSnowDensity=AverageSnowDensity;
    }

    public void setMoistureWaterInSnow(int MoistureWaterInSnow) {
        this.MoistureWaterInSnow=MoistureWaterInSnow;
    }

    public void setSnowCover(String SnowCover) {
        this.SnowCover=SnowCover;
    }

    public void setSnowState(String SnowState) {
        this.SnowState=SnowState;
    }

    public void setNRustayskoyeWaterLevel(int NRustayskoyeWaterLevel) {
        this.NRustayskoyeWaterLevel=NRustayskoyeWaterLevel;
    }
    
    public void setNRustayskoyeTemp(double NRustayskoyeTemp) {
        this.NRustayskoyeTemp=NRustayskoyeTemp;
    }

    public void setNRustayskoyepH(double NRustayskoyepH) {
        this.NRustayskoyepH=NRustayskoyepH;
    }
    
    public void setNRustayskoyeElConduct(int NRustayskoyeElConduct) {
        this.NRustayskoyeElConduct=NRustayskoyeElConduct;
    }

    public void setNRustayskoyeWaterColor(int NRustayskoyeWaterColor) {
        this.NRustayskoyeWaterColor=NRustayskoyeWaterColor;
    }

    public void setNRustayskoyeOxygen(double NRustayskoyeOxygen) {
        this.NRustayskoyeOxygen=NRustayskoyeOxygen;
    }

    public void setNRustayskoyeBPK5(double NRustayskoyeBPK5) {
        this.NRustayskoyeBPK5=NRustayskoyeBPK5;
    }

    public void setKrugloeWaterLevel(int KrugloeWaterLevel) {
        this.KrugloeWaterLevel=KrugloeWaterLevel;
    }

    public void setKrugloeTemp(double KrugloeTemp) {
        this.KrugloeTemp=KrugloeTemp;
    }

    public void setKrugloepH(double KrugloepH) {
        this.KrugloepH=KrugloepH;
    }

    public void setKrugloeElConduct(int KrugloeElConduct) {
        this.KrugloeElConduct=KrugloeElConduct;
    }

    public void setKrugloeWaterColor(int KrugloeWaterColor) {
        this.KrugloeWaterColor=KrugloeWaterColor;
    }

    public void setKrugloeOxygen(double KrugloeOxygen) {
        this.KrugloeOxygen=KrugloeOxygen;
    }

    public void setKrugloeBPK5(double KrugloeBPK5) {
        this.KrugloeBPK5=KrugloeBPK5;
    }

    public void setKalachikWaterLevel(int KalachikWaterLevel) {
        this.KalachikWaterLevel=KalachikWaterLevel;
    }

    public void setKalachikTemp(double KalachikTemp) {
        this.KalachikTemp=KalachikTemp;
    }

    public void setKalachikpH(double KalachikpH) {
        this.KalachikpH=KalachikpH;
    }

    public void setKalachikElConduct(int KalachikElConduct) {
        this.KalachikElConduct=KalachikElConduct;
    }

    public void setKalachikWaterColor(int KalachikWaterColor) {
        this.KalachikWaterColor=KalachikWaterColor;
    }

    public void setKalachikOxygen(double KalachikOxygen) {
        this.KalachikOxygen=KalachikOxygen;
    }

    public void setKalachikBPK5(double KalachikBPK5) {
        this.KalachikBPK5=KalachikBPK5;
    }

    public void setMakhovskoeWaterLevel(int MakhovskoeWaterLevel) {
        this.MakhovskoeWaterLevel=MakhovskoeWaterLevel;
    }

    public void setMakhovskoeTemp(double MakhovskoeTemp) {
        this.MakhovskoeTemp=MakhovskoeTemp;
    }

    public void setMakhovskoepH(double MakhovskoepH) {
        this.MakhovskoepH=MakhovskoepH;
    }

    public void setMakhovskoeElConduct(int MakhovskoeElConduct) {
        this.MakhovskoeElConduct=MakhovskoeElConduct;
    }

    public void setMakhovskoeWaterColor(int MakhovskoeWaterColor) {
        this.MakhovskoeWaterColor=MakhovskoeWaterColor;
    }

    public void setMakhovskoeOxygen(double MakhovskoeOxygen) {
        this.MakhovskoeOxygen=MakhovskoeOxygen;
    }

    public void setMakhovskoeBPK5(double MakhovskoeBPK5) {
        this.MakhovskoeBPK5=MakhovskoeBPK5;
    }

    public void setKerzhenetsWaterLevel(int KerzhenetsWaterLevel) {
        this.KerzhenetsWaterLevel=KerzhenetsWaterLevel;
    }

    public void setKerzhenetsTemp(double KerzhenetsTemp) {
        this.KerzhenetsTemp=KerzhenetsTemp;
    }

    public void setKerzhenetspH(double KerzhenetspH) {
        this.KerzhenetspH=KerzhenetspH;
    }

    public void setKerzhenetsElConduct(int KerzhenetsElConduct) {
        this.KerzhenetsElConduct=KerzhenetsElConduct;
    }

    public void setKerzhenetsWaterColor(int KerzhenetsWaterColor) {
        this.KerzhenetsWaterColor=KerzhenetsWaterColor;
    }

    public void setKerzhenetsOxygen(double KerzhenetsOxygen) {
        this.KerzhenetsOxygen=KerzhenetsOxygen;
    }

    public void setKerzhenetsBPK5(double KerzhenetsBPK5) {
        this.KerzhenetsBPK5=KerzhenetsBPK5;
    }

    public void setVishnyaWaterLevel(int VishnyaWaterLevel) {
        this.VishnyaWaterLevel=VishnyaWaterLevel;
    }

    public void setVishnyaTemp(double VishnyaTemp) {
        this.VishnyaTemp=VishnyaTemp;
    }

    public void setVishnyapH(double VishnyapH) {
        this.VishnyapH=VishnyapH;
    }

    public void setVishnyaElConduct(int VishnyaElConduct) {
        this.VishnyaElConduct=VishnyaElConduct;
    }

    public void setVishnyaWaterColor(int VishnyaWaterColor) {
        this.VishnyaWaterColor=VishnyaWaterColor;
    }

    public void setVishnyaOxygen(double VishnyaOxygen) {
        this.VishnyaOxygen=VishnyaOxygen;
    }

    public void setVishnyaBPK5(double VishnyaBPK5) {
        this.VishnyaBPK5=VishnyaBPK5;
    }

    public void setWellWaterLevel(int WellWaterLevel) {
        this.WellWaterLevel=WellWaterLevel;
    }

    public void setWellTemp(double WellTemp) {
        this.WellTemp=WellTemp;
    }

    public void setWellpH(double WellpH) {
        this.WellpH=WellpH;
    }

    public void setWellElConduct(int WellElConduct) {
        this.WellElConduct=WellElConduct;
    }

    public void setWellWaterColor(int WellWaterColor) {
        this.WellWaterColor=WellWaterColor;
    }

    public void setWellOxygen(double WellOxygen) {
        this.WellOxygen=WellOxygen;
    }

    public void setWellBPK5(double WellBPK5) {
        this.WellBPK5=WellBPK5;
    }

    public void setVishenskoeWaterLevel(int VishenskoeWaterLevel) {
        this.VishenskoeWaterLevel=VishenskoeWaterLevel;
    }

    public void setVishenskoeTemp(double VishenskoeTemp) {
        this.VishenskoeTemp=VishenskoeTemp;
    }

    public void setVishenskoepH(double VishenskoepH) {
        this.VishenskoepH=VishenskoepH;
    }
    public void setVishenskoeElConduct(int VishenskoeElConduct) {
        this.VishenskoeElConduct=VishenskoeElConduct;
    }

    public void setVishenskoeWaterColor(int VishenskoeWaterColor) {
        this.VishenskoeWaterColor=VishenskoeWaterColor;
    }

    public void setVishenskoeOxygen(double VishenskoeOxygen) {
        this.VishenskoeOxygen=VishenskoeOxygen;
    }

    public void setVishenskoeBPK5(double VishenskoeBPK5) {
        this.VishenskoeBPK5=VishenskoeBPK5;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;

        if (!(o instanceof Observ))
        return false;

        Observ observ = (Observ) o;
        return Objects.equals(this.id, observ.id) &&
                Objects.equals(this.MeteoDate, observ.MeteoDate) &&
                Objects.equals(this.MeteoTime, observ.MeteoTime) &&
                Objects.equals(this.WindDir, observ.WindDir) &&
                Objects.equals(this.WindSpeed, observ.WindSpeed) &&
                Objects.equals(this.Pressure, observ.Pressure) &&
                Objects.equals(this.TempMin, observ.TempMin) &&
                Objects.equals(this.TempMax, observ.TempMax) &&
                Objects.equals(this.Precipitation,observ.Precipitation) &&
                Objects.equals(this.SunshineDuration, observ.SunshineDuration) &&
                Objects.equals(this.DewPoint, observ.DewPoint) &&
                Objects.equals(this.SnowLevelWeatherSite, observ.SnowLevelWeatherSite) &&
                Objects.equals(this.SnowCoverage, observ.SnowCoverage) &&
                Objects.equals(this.SnowLevelForest, observ.SnowLevelForest) &&
                Objects.equals(this.AverageSnowDensity, observ.AverageSnowDensity) &&
                Objects.equals(this.MoistureWaterInSnow, observ.MoistureWaterInSnow) &&
                Objects.equals(this.SnowCover, observ.SnowCover) &&
                Objects.equals(this.SnowState, observ.SnowState) &&
                Objects.equals(this.NRustayskoyeWaterLevel, observ.NRustayskoyeWaterLevel) &&
                Objects.equals(this.NRustayskoyeTemp, observ.NRustayskoyeTemp) &&
                Objects.equals(this.NRustayskoyepH, observ.NRustayskoyepH) &&
                Objects.equals(this.NRustayskoyeElConduct, observ.NRustayskoyeElConduct) &&
                Objects.equals(this.NRustayskoyeWaterColor, observ.NRustayskoyeWaterColor) &&
                Objects.equals(this.NRustayskoyeOxygen, observ.NRustayskoyeOxygen) &&
                Objects.equals(this.NRustayskoyeBPK5, observ.NRustayskoyeBPK5) &&
                Objects.equals(this.KrugloeWaterLevel, observ.KrugloeWaterLevel) &&
                Objects.equals(this.KrugloeTemp, observ.KrugloeTemp) &&
                Objects.equals(this.KrugloepH, observ.KrugloepH) &&
                Objects.equals(this.KrugloeElConduct, observ.KrugloeElConduct) &&
                Objects.equals(this.KrugloeWaterColor, observ.KrugloeWaterColor) &&
                Objects.equals(this.KrugloeOxygen, observ.KrugloeOxygen) &&
                Objects.equals(this.KrugloeBPK5, observ.KrugloeBPK5) &&
                Objects.equals(this.KalachikWaterLevel, observ.KalachikWaterLevel) &&
                Objects.equals(this.KalachikTemp, observ.KalachikTemp) &&
                Objects.equals(this.KalachikpH, observ.KalachikpH) &&
                Objects.equals(this.KalachikElConduct, observ.KalachikElConduct) &&
                Objects.equals(this.KalachikWaterColor, observ.KalachikWaterColor) &&
                Objects.equals(this.KalachikOxygen, observ.KalachikOxygen) &&
                Objects.equals(this.KalachikBPK5, observ.KalachikBPK5) &&
                Objects.equals(this.MakhovskoeWaterLevel, observ.MakhovskoeWaterLevel) &&
                Objects.equals(this.MakhovskoeTemp, observ.MakhovskoeTemp) &&
                Objects.equals(this.MakhovskoepH, observ.MakhovskoepH) &&
                Objects.equals(this.MakhovskoeElConduct, observ.MakhovskoeElConduct) &&
                Objects.equals(this.MakhovskoeWaterColor, observ.MakhovskoeWaterColor) &&
                Objects.equals(this.MakhovskoeOxygen, observ.MakhovskoeOxygen) &&
                Objects.equals(this.MakhovskoeBPK5, observ.MakhovskoeBPK5) &&
                Objects.equals(this.KerzhenetsWaterLevel, observ.KerzhenetsWaterLevel) &&
                Objects.equals(this.KerzhenetsTemp, observ.KerzhenetsTemp) &&
                Objects.equals(this.KerzhenetspH, observ.KerzhenetspH) &&
                Objects.equals(this.KerzhenetsElConduct, observ.KerzhenetsElConduct) &&
                Objects.equals(this.KerzhenetsWaterColor, observ.KerzhenetsWaterColor) &&
                Objects.equals(this.KerzhenetsOxygen, observ.KerzhenetsOxygen) &&
                Objects.equals(this.KerzhenetsBPK5, observ.KerzhenetsBPK5) &&
                Objects.equals(this.VishnyaWaterLevel, observ.VishnyaWaterLevel) &&
                Objects.equals(this.VishnyaTemp, observ.VishnyaTemp) &&
                Objects.equals(this.VishnyapH, observ.VishnyapH) &&
                Objects.equals(this.VishnyaElConduct, observ.VishnyaElConduct) &&
                Objects.equals(this.VishnyaWaterColor, observ.VishnyaWaterColor) &&
                Objects.equals(this.VishnyaOxygen, observ.VishnyaOxygen) &&
                Objects.equals(this.VishnyaBPK5, observ.VishnyaBPK5) &&
                Objects.equals(this.WellWaterLevel, observ.WellWaterLevel) &&
                Objects.equals(this.WellTemp, observ.WellTemp) &&
                Objects.equals(this.WellpH, observ.WellpH) &&
                Objects.equals(this.WellElConduct, observ.WellElConduct) &&
                Objects.equals(this.WellWaterColor, observ.WellWaterColor) &&
                Objects.equals(this.WellOxygen, observ.WellOxygen) &&
                Objects.equals(this.WellBPK5, observ.WellBPK5) &&
                Objects.equals(this.VishenskoeWaterLevel, observ.VishenskoeWaterLevel) &&
                Objects.equals(this.VishenskoeTemp, observ.VishenskoeTemp) &&
                Objects.equals(this.VishenskoepH, observ.VishenskoepH) &&
                Objects.equals(this.VishenskoeElConduct, observ.VishenskoeElConduct) &&
                Objects.equals(this.VishenskoeWaterColor, observ.VishenskoeWaterColor) &&
                Objects.equals(this.VishenskoeOxygen, observ.VishenskoeOxygen) &&
                Objects.equals(this.VishenskoeBPK5, observ.VishenskoeBPK5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//        return true;
//
//        if (!(o instanceof Observ))
//        return false;
//
//        Observ observ = (Observ) o;
//        return Objects.equals(this.MeteoDate, observ.MeteoDate)&& Objects.equals(this.MeteoTime, observ.MeteoTime);
//    }
//
//    @Override
//    public int hashCode() {
//        parsedDate = LocalDate.parse(MeteoDate, DateTimeFormatter.ofPattern("dd.MM.yy"));
//        parsedTime = LocalTime.parse(MeteoTime, DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
//
//        long longHash = LocalDateTime.of(parsedDate, parsedTime)
//                 .atZone(ZoneId.systemDefault())
//                 .toInstant()
//                 .toEpochMilli();
//
//        return Objects.hash(longHash);
//    }
      
    @Override
    public String toString() {
      return "Наблюдение {" + "id=" + this.id + ", date='" + this.MeteoDate + '\'' + ", time='" + this.MeteoTime + '\'' + '}';
    }

}
