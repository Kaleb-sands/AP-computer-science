import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter String");
        String str = kb.nextLine();
        ConsecutiveCharacter.longestStreak(str);
        kb.close();
    }
}