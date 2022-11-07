/*
 * This class calculates gas mileage based on user input
 */
public class GasMileage
{
    public static double mileageCalculator(int milesTravled, double gallonsSpent)
    {
        double milesPerGallon = milesTravled / gallonsSpent;
        return milesPerGallon;
    }
    public static double gallonCalculator(int miles, double mPG)
    {
        double gallonsSpent = miles / mPG;
        return gallonsSpent;
    }
}