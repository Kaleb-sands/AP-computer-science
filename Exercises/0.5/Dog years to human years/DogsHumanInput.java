import java.util.Scanner;

public class DogsHumanInput{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("How old is your dog:");
        int dogYears = kb.nextInt();

        int humanYears = DogsHumanAge.convertToHumanYears(dogYears);
        System.out.println("Your dog is " + humanYears + " in human years");

        kb.close();
    }
}