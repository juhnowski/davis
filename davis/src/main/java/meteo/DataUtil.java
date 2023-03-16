package payroll;


public class DataUtil {
    public static Integer parseInt(String val){
        if (val.isEmpty() || val.contains("---")) return 0;
        
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e){
            return 0;
        }
    }

    public static Double parseDouble(String val){
        if (val.isEmpty() || val.contains("---")) return 0.0;
        
        try {
            return Double.parseDouble(val);
        } catch (NumberFormatException e){
            return 0.0;
        }
    }
}
