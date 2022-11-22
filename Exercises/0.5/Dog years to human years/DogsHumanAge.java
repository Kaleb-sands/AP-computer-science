public class DogsHumanAge{
    public static int convertToHumanYears(int dogYears){
        double humanYearsAcurate;
        if (dogYears == 1){
            humanYearsAcurate = 13.0;
        }
        else {
            humanYearsAcurate = ((dogYears - 1) / 3.0 * 16.0) + 13.0;
        }
        int humanYearsRound = (int)humanYearsAcurate;
        return Math.round(humanYearsRound);
    }
}