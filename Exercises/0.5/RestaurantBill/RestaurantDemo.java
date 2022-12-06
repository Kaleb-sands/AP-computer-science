/*
 * Main method for RestaurantBill class
 */
import java.util.Scanner;

public class RestaurantDemo{

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("What is the cost of the meal:"); // User input for recipt
        double mealPrice = kb.nextDouble();
        System.out.println("What is your age:");
        int age = kb.nextInt();
        System.out.println("What is the tip percentage:");
        double tip = kb.nextDouble();

        RestaurantBill myBill = new RestaurantBill(); // creates new bill class
        myBill.calculateRecipt(mealPrice, tip, age); // calculates and print recipt
        kb.close();
    }
}