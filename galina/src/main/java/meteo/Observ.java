package galina;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Observ {
	private @Id @GeneratedValue Long id;
    private String MeteoDate; // Дата наблюдения
    private String MeteoTime; // Время наблюдения
    private String WindDir; // Направление ветра
    private Double WindSpeed; // скорость ветра
    private Integer Pressure; // давление
    private Double TempMin; // температура минимальная
    private Double TempMax; // температура максимальная
    private Integer Precipitation; // Количество осадков
    private String SunshineDuration; // Продолжительность солнечного сияния
    private Double DewPoint; // Точка росы (в пожароопасный период)
    private Integer SnowLevelWeatherSite; // Уровень снега на метеоплощадке 
    private String SnowCoverage; // Определение покрытия земли снегом в баллах
    private Integer SnowLevelForest; // Уровень снега в лесу
    private Double AverageSnowDensity; // средняя плотность снега
    private String MoistureWaterInSnow; // влагозапас воды в снеге
    private String SnowCover; // Характер залегания снежного покрова
    private String SnowState; // характеристика состояния снега

    private Integer NRustayskoyeWaterLevel; // Нижнее Рустайское - Уровень воды 
    private Integer NRustayskoyeTemp; // Нижнее Рустайское - Температура
    private Double NRustayskoyepH; // Нижнее Рустайское - рН
    private Double NRustayskoyeElConduct; // Нижнее Рустайское - электропроводность
    private String NRustayskoyeWaterColor; // Нижнее Рустайское - цветность воды
    private Double NRustayskoyeOxygen; // Нижнее Рустайское - кислород
    private Double NRustayskoyeBPK5; // Нижнее Рустайское - БПК-5

    private Integer KrugloeWaterLevel; // Круглое - Уровень воды
    private Integer KrugloeTemp; // Круглое - Температура
    private Double KrugloepH; // Круглое - рН
    private Double KrugloeElConduct; // Круглое - электропроводность
    private String KrugloeWaterColor; // Круглое - цветность воды
    private Double KrugloeOxygen; // Круглое - кислород
    private Double KrugloeBPK5; // Круглое - БПК-5

    private Integer KalachikWaterLevel; // Калачик - Уровень воды
    private Integer KalachikTemp; // Калачик - Температура
    private Double KalachikpH; // Калачик - рН
    private Double KalachikElConduct; // Калачик - электропроводность
    private String KalachikWaterColor; // Калачик - цветность воды
    private Double KalachikOxygen; // Калачик - кислород
    private Double KalachikBPK5; // Калачик - БПК-5

    private Integer MakhovskoeWaterLevel; // Маховское - Уровень воды
    private Integer MakhovskoeTemp; // Маховское - Температура
    private Double MakhovskoepH; // Маховское - рН
    private Double MakhovskoeElConduct; // Маховское - электропроводность
    private String MakhovskoeWaterColor; // Маховское - цветность воды
    private Double MakhovskoeOxygen; // Маховское - кислород
    private Double MakhovskoeBPK5; // Маховское - БПК-5

    private Integer KerzhenetsWaterLevel; // Керженец - Уровень воды
    private Integer KerzhenetsTemp; // Керженец - Температура
    private Double KerzhenetspH; // Керженец - рН
    private Double KerzhenetsElConduct; // Керженец - электропроводность
    private String KerzhenetsWaterColor; // Керженец - цветность воды
    private Double KerzhenetsOxygen; // Керженец - кислород
    private Double KerzhenetsBPK5; // Керженец - БПК-5

    private Integer VishnyaWaterLevel; // Вишня - Уровень воды
    private Integer VishnyaTemp; // Вишня - Температура
    private Double VishnyapH; // Вишня - рН
    private Double VishnyaElConduct; // Вишня - электропроводность
    private String VishnyaWaterColor; // Вишня - цветность воды
    private Double VishnyaOxygen; // Вишня - кислород
    private Double VishnyaBPK5; // Вишня - БПК-5

    private Integer WellWaterLevel; // Колодец - Уровень воды
    private Integer WellTemp; // Колодец - Температура
    private Double WellpH; // Колодец - рН
    private Double WellElConduct; // Колодец - электропроводность
    private String WellWaterColor; // Колодец - цветность воды
    private Double WellOxygen; // Колодец - кислород
    private Double WellBPK5; // Колодец - БПК-5

    private Integer VishenskoeWaterLevel; // Вишёнское - Уровень воды
    private Integer VishenskoeTemp; // Вишёнское - Температура
    private Double VishenskoepH; // Вишёнское - рН
    private Double VishenskoeElConduct; // Вишёнское - электропроводность
    private String VishenskoeWaterColor; // Вишёнское - цветность воды
    private Double VishenskoeOxygen; // Вишёнское - кислород
    private Double VishenskoeBPK5; // Вишёнское - БПК-5


    
    public Observ(){}

    public Observ(
        String MeteoDate,
        String MeteoTime,
        String WindDir,
        Double WindSpeed,
        Integer Pressure,
        Double TempMin,
        Double TempMax,
        Integer Precipitation,
        String SunshineDuration,
        Double DewPoint,
        Integer SnowLevelWeatherSite,
        String SnowCoverage,
        Integer SnowLevelForest,
        Double AverageSnowDensity,
        String MoistureWaterInSnow,
        String SnowCover,
        String SnowState,
        Integer NRustayskoyeWaterLevel,
        Integer NRustayskoyeTemp,
        Double NRustayskoyepH,
        Double NRustayskoyeElConduct,
        String NRustayskoyeWaterColor,
        Double NRustayskoyeOxygen,
        Double NRustayskoyeBPK5,
        Integer KrugloeWaterLevel,
        Integer KrugloeTemp,
        Double KrugloepH,
        Double KrugloeElConduct,
        String KrugloeWaterColor,
        Double KrugloeOxygen,
        Double KrugloeBPK5,
        Integer KalachikWaterLevel,
        Integer KalachikTemp,
        Double KalachikpH,
        Double KalachikElConduct,
        String KalachikWaterColor,
        Double KalachikOxygen,
        Double KalachikBPK5,
        Integer MakhovskoeWaterLevel,
        Integer MakhovskoeTemp,
        Double MakhovskoepH,
        Double MakhovskoeElConduct,
        String MakhovskoeWaterColor,
        Double MakhovskoeOxygen,
        Double MakhovskoeBPK5,
        Integer KerzhenetsWaterLevel,
        Integer KerzhenetsTemp,
        Double KerzhenetspH,
        Double KerzhenetsElConduct,
        String KerzhenetsWaterColor,
        Double KerzhenetsOxygen,
        Double KerzhenetsBPK5,
        Integer VishnyaWaterLevel,
        Integer VishnyaTemp,
        Double VishnyapH,
        Double VishnyaElConduct,
        String VishnyaWaterColor,
        Double VishnyaOxygen,
        Double VishnyaBPK5,
        Integer WellWaterLevel,
        Integer WellTemp,
        Double WellpH,
        Double WellElConduct,
        String WellWaterColor,
        Double WellOxygen,
        Double WellBPK5,
        Integer VishenskoeWaterLevel,
        Integer VishenskoeTemp,
        Double VishenskoepH,
        Double VishenskoeElConduct,
        String VishenskoeWaterColor,
        Double VishenskoeOxygen,
        Double VishenskoeBPK5
    ) {
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

    public Double getWindSpeed() {
        return this.WindSpeed;
    }

    public Integer getPressure() {
        return this.Pressure;
    }

    public Double getTempMin() {
        return this.TempMin;
    }

    public Double getTempMax() {
        return this.TempMax;
    }

    public Integer getPrecipitation() {
        return this.Precipitation;
    }

    public String getSunshineDuration() {
        return this.SunshineDuration;
    }

    public Double getDewPoint() {
        return this.DewPoint;
    }
    
    public Integer getSnowLevelWeatherSite() {
        return this.SnowLevelWeatherSite;
    }

    public String getSnowCoverage() {
        return this.SnowCoverage;
    }

    public Integer getSnowLevelForest() {
        return this.SnowLevelForest;
    }
    
    public Double getAverageSnowDensity() {
        return this.AverageSnowDensity;
    }

    public String getMoistureWaterInSnow() {
        return this.MoistureWaterInSnow;
    }

    public String getSnowCover() {
        return this.SnowCover;
    }

    public String getSnowState() {
        return this.SnowState;
    }

    public Integer getNRustayskoyeWaterLevel() {
        return this.NRustayskoyeWaterLevel;
    }
    
    public Integer getNRustayskoyeTemp() {
        return this.NRustayskoyeTemp;
    }

    public Double getNRustayskoyepH() {
        return this.NRustayskoyepH;
    }
    
    public Double getNRustayskoyeElConduct() {
        return this.NRustayskoyeElConduct;
    }

    public String getNRustayskoyeWaterColor() {
        return this.NRustayskoyeWaterColor;
    }

    public Double getNRustayskoyeOxygen() {
        return this.NRustayskoyeOxygen;
    }

    public Double getNRustayskoyeBPK5() {
        return this.NRustayskoyeBPK5;
    }

    public Integer getKrugloeWaterLevel() {
        return this.KrugloeWaterLevel;
    }

    public Integer getKrugloeTemp() {
        return this.KrugloeTemp;
    }

    public Double getKrugloepH() {
        return this.KrugloepH;
    }

    public Double getKrugloeElConduct() {
        return this.KrugloeElConduct;
    }

    public String getKrugloeWaterColor() {
        return this.KrugloeWaterColor;
    }

    public Double getKrugloeOxygen() {
        return this.KrugloeOxygen;
    }

    public Double getKrugloeBPK5() {
        return this.KrugloeBPK5;
    }

    public Integer getKalachikWaterLevel() {
        return this.KalachikWaterLevel;
    }

    public Integer getKalachikTemp() {
        return this.KalachikTemp;
    }

    public Double getKalachikpH() {
        return this.KalachikpH;
    }

    public Double getKalachikElConduct() {
        return this.KalachikElConduct;
    }

    public String getKalachikWaterColor() {
        return this.KalachikWaterColor;
    }

    public Double getKalachikOxygen() {
        return this.KalachikOxygen;
    }

    public Double getKalachikBPK5() {
        return this.KalachikBPK5;
    }

    public Integer getMakhovskoeWaterLevel() {
        return this.MakhovskoeWaterLevel;
    }

    public Integer getMakhovskoeTemp() {
        return this.MakhovskoeTemp;
    }

    public Double getMakhovskoepH() {
        return this.MakhovskoepH;
    }

    public Double getMakhovskoeElConduct() {
        return this.MakhovskoeElConduct;
    }

    public String getMakhovskoeWaterColor() {
        return this.MakhovskoeWaterColor;
    }

    public Double getMakhovskoeOxygen() {
        return this.MakhovskoeOxygen;
    }

    public Double getMakhovskoeBPK5() {
        return this.MakhovskoeBPK5;
    }

    public Integer getKerzhenetsWaterLevel() {
        return this.KerzhenetsWaterLevel;
    }

    public Integer getKerzhenetsTemp() {
        return this.KerzhenetsTemp;
    }

    public Double getKerzhenetspH() {
        return this.KerzhenetspH;
    }

    public Double getKerzhenetsElConduct() {
        return this.KerzhenetsElConduct;
    }

    public String getKerzhenetsWaterColor() {
        return this.KerzhenetsWaterColor;
    }

    public Double getKerzhenetsOxygen() {
        return this.KerzhenetsOxygen;
    }

    public Double getKerzhenetsBPK5() {
        return this.KerzhenetsBPK5;
    }

    public Integer getVishnyaWaterLevel() {
        return this.VishnyaWaterLevel;
    }

    public Integer getVishnyaTemp() {
        return this.VishnyaTemp;
    }

    public Double getVishnyapH() {
        return this.VishnyapH;
    }

    public Double getVishnyaElConduct() {
        return this.VishnyaElConduct;
    }

    public String getVishnyaWaterColor() {
        return this.VishnyaWaterColor;
    }

    public Double getVishnyaOxygen() {
        return this.VishnyaOxygen;
    }

    public Double getVishnyaBPK5() {
        return this.VishnyaBPK5;
    }

    public Integer getWellWaterLevel() {
        return this.WellWaterLevel;
    }

    public Integer getWellTemp() {
        return this.WellTemp;
    }

    public Double getWellpH() {
        return this.WellpH;
    }

    public Double getWellElConduct() {
        return this.WellElConduct;
    }

    public String getWellWaterColor() {
        return this.WellWaterColor;
    }

    public Double getWellOxygen() {
        return this.WellOxygen;
    }

    public Double getWellBPK5() {
        return this.WellBPK5;
    }

    public Integer getVishenskoeWaterLevel() {
        return this.VishenskoeWaterLevel;
    }

    public Integer getVishenskoeTemp() {
        return this.VishenskoeTemp;
    }

    public Double getVishenskoepH() {
        return this.VishenskoepH;
    }
    public Double getVishenskoeElConduct() {
        return this.VishenskoeElConduct;
    }

    public String getVishenskoeWaterColor() {
        return this.VishenskoeWaterColor;
    }

    public Double getVishenskoeOxygen() {
        return this.VishenskoeOxygen;
    }

    public Double getVishenskoeBPK5() {
        return this.VishenskoeBPK5;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMeteoDate(String MeteoDate) {
        this.MeteoDate = MeteoDate;
    }
    
    public void setMeteoTime(String MeteoTime) {
        this.MeteoTime = MeteoTime;
    }
    
       
    public void setWindDir(String WindDir) {
        this.WindDir = WindDir;
    }

    public void setWindSpeed(Double WindSpeed) {
        this.WindSpeed = WindSpeed;
    }

    public void setPressure(Integer Pressure) {
        this.Pressure = Pressure;
    }

    public void setTempMin(Double TempMin) {
        this.TempMin = TempMin;
    }

    public void setTempMax(Double TempMax) {
        this.TempMax = TempMax;
    }

    public void setPrecipitation(Integer Precipitation) {
        this.Precipitation = Precipitation;
    }

    public void setSunshineDuration(String SunshineDuration) {
        this.SunshineDuration = SunshineDuration;
    }

    public void setDewPoint(Double DewPoint) {
        this.DewPoint = DewPoint;
    }
    
    public void setSnowLevelWeatherSite(Integer SnowLevelWeatherSite) {
        this.SnowLevelWeatherSite = SnowLevelWeatherSite;
    }

    public void setSnowCoverage(String SnowCoverage) {
        this.SnowCoverage = SnowCoverage;
    }

    public void setSnowLevelForest(Integer SnowLevelForest) {
        this.SnowLevelForest=SnowLevelForest;
    }
    
    public void setAverageSnowDensity(Double AverageSnowDensity) {
        this.AverageSnowDensity=AverageSnowDensity;
    }

    public void setMoistureWaterInSnow(String MoistureWaterInSnow) {
        this.MoistureWaterInSnow=MoistureWaterInSnow;
    }

    public void setSnowCover(String SnowCover) {
        this.SnowCover=SnowCover;
    }

    public void setSnowState(String SnowState) {
        this.SnowState=SnowState;
    }

    public void setNRustayskoyeWaterLevel(Integer NRustayskoyeWaterLevel) {
        this.NRustayskoyeWaterLevel=NRustayskoyeWaterLevel;
    }
    
    public void setNRustayskoyeTemp(Integer NRustayskoyeTemp) {
        this.NRustayskoyeTemp=NRustayskoyeTemp;
    }

    public void setNRustayskoyepH(Double NRustayskoyepH) {
        this.NRustayskoyepH=NRustayskoyepH;
    }
    
    public void setNRustayskoyeElConduct(Double NRustayskoyeElConduct) {
        this.NRustayskoyeElConduct=NRustayskoyeElConduct;
    }

    public void setNRustayskoyeWaterColor(String NRustayskoyeWaterColor) {
        this.NRustayskoyeWaterColor=NRustayskoyeWaterColor;
    }

    public void setNRustayskoyeOxygen(Double NRustayskoyeOxygen) {
        this.NRustayskoyeOxygen=NRustayskoyeOxygen;
    }

    public void setNRustayskoyeBPK5(Double NRustayskoyeBPK5) {
        this.NRustayskoyeBPK5=NRustayskoyeBPK5;
    }

    public void setKrugloeWaterLevel(Integer KrugloeWaterLevel) {
        this.KrugloeWaterLevel=KrugloeWaterLevel;
    }

    public void setKrugloeTemp(Integer KrugloeTemp) {
        this.KrugloeTemp=KrugloeTemp;
    }

    public void setKrugloepH(Double KrugloepH) {
        this.KrugloepH=KrugloepH;
    }

    public void setKrugloeElConduct(Double KrugloeElConduct) {
        this.KrugloeElConduct=KrugloeElConduct;
    }

    public void setKrugloeWaterColor(String KrugloeWaterColor) {
        this.KrugloeWaterColor=KrugloeWaterColor;
    }

    public void setKrugloeOxygen(Double KrugloeOxygen) {
        this.KrugloeOxygen=KrugloeOxygen;
    }

    public void setKrugloeBPK5(Double KrugloeBPK5) {
        this.KrugloeBPK5=KrugloeBPK5;
    }

    public void setKalachikWaterLevel(Integer KalachikWaterLevel) {
        this.KalachikWaterLevel=KalachikWaterLevel;
    }

    public void setKalachikTemp(Integer KalachikTemp) {
        this.KalachikTemp=KalachikTemp;
    }

    public void setKalachikpH(Double KalachikpH) {
        this.KalachikpH=KalachikpH;
    }

    public void setKalachikElConduct(Double KalachikElConduct) {
        this.KalachikElConduct=KalachikElConduct;
    }

    public void setKalachikWaterColor(String KalachikWaterColor) {
        this.KalachikWaterColor=KalachikWaterColor;
    }

    public void setKalachikOxygen(Double KalachikOxygen) {
        this.KalachikOxygen=KalachikOxygen;
    }

    public void setKalachikBPK5(Double KalachikBPK5) {
        this.KalachikBPK5=KalachikBPK5;
    }

    public void setMakhovskoeWaterLevel(Integer MakhovskoeWaterLevel) {
        this.MakhovskoeWaterLevel=MakhovskoeWaterLevel;
    }

    public void setMakhovskoeTemp(Integer MakhovskoeTemp) {
        this.MakhovskoeTemp=MakhovskoeTemp;
    }

    public void setMakhovskoepH(Double MakhovskoepH) {
        this.MakhovskoepH=MakhovskoepH;
    }

    public void setMakhovskoeElConduct(Double MakhovskoeElConduct) {
        this.MakhovskoeElConduct=MakhovskoeElConduct;
    }

    public void setMakhovskoeWaterColor(String MakhovskoeWaterColor) {
        this.MakhovskoeWaterColor=MakhovskoeWaterColor;
    }

    public void setMakhovskoeOxygen(Double MakhovskoeOxygen) {
        this.MakhovskoeOxygen=MakhovskoeOxygen;
    }

    public void setMakhovskoeBPK5(Double MakhovskoeBPK5) {
        this.MakhovskoeBPK5=MakhovskoeBPK5;
    }

    public void setKerzhenetsWaterLevel(Integer KerzhenetsWaterLevel) {
        this.KerzhenetsWaterLevel=KerzhenetsWaterLevel;
    }

    public void setKerzhenetsTemp(Integer KerzhenetsTemp) {
        this.KerzhenetsTemp=KerzhenetsTemp;
    }

    public void setKerzhenetspH(Double KerzhenetspH) {
        this.KerzhenetspH=KerzhenetspH;
    }

    public void setKerzhenetsElConduct(Double KerzhenetsElConduct) {
        this.KerzhenetsElConduct=KerzhenetsElConduct;
    }

    public void setKerzhenetsWaterColor(String KerzhenetsWaterColor) {
        this.KerzhenetsWaterColor=KerzhenetsWaterColor;
    }

    public void setKerzhenetsOxygen(Double KerzhenetsOxygen) {
        this.KerzhenetsOxygen=KerzhenetsOxygen;
    }

    public void setKerzhenetsBPK5(Double KerzhenetsBPK5) {
        this.KerzhenetsBPK5=KerzhenetsBPK5;
    }

    public void setVishnyaWaterLevel(Integer VishnyaWaterLevel) {
        this.VishnyaWaterLevel=VishnyaWaterLevel;
    }

    public void setVishnyaTemp(Integer VishnyaTemp) {
        this.VishnyaTemp=VishnyaTemp;
    }

    public void setVishnyapH(Double VishnyapH) {
        this.VishnyapH=VishnyapH;
    }

    public void setVishnyaElConduct(Double VishnyaElConduct) {
        this.VishnyaElConduct=VishnyaElConduct;
    }

    public void setVishnyaWaterColor(String VishnyaWaterColor) {
        this.VishnyaWaterColor=VishnyaWaterColor;
    }

    public void setVishnyaOxygen(Double VishnyaOxygen) {
        this.VishnyaOxygen=VishnyaOxygen;
    }

    public void setVishnyaBPK5(Double VishnyaBPK5) {
        this.VishnyaBPK5=VishnyaBPK5;
    }

    public void setWellWaterLevel(Integer WellWaterLevel) {
        this.WellWaterLevel=WellWaterLevel;
    }

    public void setWellTemp(Integer WellTemp) {
        this.WellTemp=WellTemp;
    }

    public void setWellpH(Double WellpH) {
        this.WellpH=WellpH;
    }

    public void setWellElConduct(Double WellElConduct) {
        this.WellElConduct=WellElConduct;
    }

    public void setWellWaterColor(String WellWaterColor) {
        this.WellWaterColor=WellWaterColor;
    }

    public void setWellOxygen(Double WellOxygen) {
        this.WellOxygen=WellOxygen;
    }

    public void setWellBPK5(Double WellBPK5) {
        this.WellBPK5=WellBPK5;
    }

    public void setVishenskoeWaterLevel(Integer VishenskoeWaterLevel) {
        this.VishenskoeWaterLevel=VishenskoeWaterLevel;
    }

    public void setVishenskoeTemp(Integer VishenskoeTemp) {
        this.VishenskoeTemp=VishenskoeTemp;
    }

    public void setVishenskoepH(Double VishenskoepH) {
        this.VishenskoepH=VishenskoepH;
    }
    public void setVishenskoeElConduct(Double VishenskoeElConduct) {
        this.VishenskoeElConduct=VishenskoeElConduct;
    }

    public void setVishenskoeWaterColor(String VishenskoeWaterColor) {
        this.VishenskoeWaterColor=VishenskoeWaterColor;
    }

    public void setVishenskoeOxygen(Double VishenskoeOxygen) {
        this.VishenskoeOxygen=VishenskoeOxygen;
    }

    public void setVishenskoeBPK5(Double VishenskoeBPK5) {
        this.VishenskoeBPK5=VishenskoeBPK5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;

        if (!(o instanceof Observ))
        return false;

        Observ observ = (Observ) o;
        return Objects.equals(this.MeteoDate, observ.MeteoDate) && Objects.equals(this.MeteoTime, observ.MeteoTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.MeteoDate, this.MeteoTime);
    }
      
    @Override
    public String toString() {
      return "Наблюдение {" + "id=" + this.id + ", date='" + this.MeteoDate + '\'' + ", time='" + this.MeteoTime + '\'' + '}';
    }
}
