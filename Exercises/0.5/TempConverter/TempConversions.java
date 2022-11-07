public class TempConversions{
    
    public static double convertToCelcius(int tempF){
        double fToC = ((double)tempF - 32) * ((double)5/9);
        return fToC;
    }

    public static double convertToFehrenheit(int tempC){
        double cToF = ((double)tempC * ((double)9/5)) + 32;
        return cToF;
    }
}