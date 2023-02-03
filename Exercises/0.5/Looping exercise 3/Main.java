import java.util.Scanner;
public class Main{
public int getInput(Scanner kb, int limit){
    int input;
    do{
        System.out.println("Enter a positive integer <= " + limit);
        input = kb.nextInt();
    }while(input > limit);
    return input;
}
public static int calculateYearsTo3000(double amt){
    int years = 0;
    for(;amt < 3000; years++){
        amt += amt*0.05;
    }
    System.out.println("It will take " + years + " years");
    return years;
}
}