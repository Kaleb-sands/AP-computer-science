public class Numbers3{
    public static double averageCalc(int num1, int num2, int num3){
        double average = (num1+num2+num3) / 3.0;
        return average;
    }
    public static int surfaceArea(int l, int w, int h){
        int surface = 2*(w*l + h*l + h*w);
        return surface;
    }
}