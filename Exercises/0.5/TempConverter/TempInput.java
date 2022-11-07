import java.util.Scanner;

public class TempInput{

    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("1 to convert to Celcius or 2 to convert to Fahrenheit");
        int choice = kb.nextInt();

        if (choice == 1){
            System.out.println("Enter degrees in Fahrenheit:");
            int tempF = kb.nextInt();
            double celciusAns = TempConversions.convertToCelcius(tempF);
            System.out.println(tempF + " in Fahrenheit, is " + celciusAns + " in Celcius");
        }
        if (choice == 2){
            System.out.println("Enter degrees in Celcius:");
            int tempC = kb.nextInt();
            double fahrenheitAns = TempConversions.convertToFehrenheit(tempC);
            System.out.println(tempC + " in Celcius, is " + fahrenheitAns + " in Fahrenheit");
        }
        kb.close();
    }
}