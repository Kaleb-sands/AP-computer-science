import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.println("Number of rows: ");
    int rows = kb.nextInt();
    
    for(int x = 1; x <= rows; x++){
        for(int y = 1; y<=x; y++){
            System.out.print(y);
        }
        System.out.println();
    }
}
}