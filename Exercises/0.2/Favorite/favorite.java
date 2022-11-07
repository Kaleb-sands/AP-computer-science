import java.util.Scanner;

public class favorite
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("What is your favorite food?");
        String food = kb.nextLine();
        System.out.println(food + "!?");
        System.out.println("Thats gross! " + food + " is all slimy!");
        System.out.println("Plus, " + food + " tastes horrible");

        System.out.println("Ok well what is your favorite movie?");
        String movie = kb.nextLine();
        System.out.println("Wait your favorite food is " + food + ", and your favorite movie is " + movie + "!");
        System.out.println("Why would you want to watch " + movie + ", its so boring and long.");
        System.out.println("You have horrible taste in things");
        kb.close();
    }
}