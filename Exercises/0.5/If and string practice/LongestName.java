import java.util.Scanner;
public class LongestName{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String name1 = kb.nextLine();
        System.out.println("Enter the second name: ");
        String name2 = kb.nextLine();
        System.out.println("Enter the third name: ");
        String name3 = kb.nextLine();

        if(name1.length() > name2.length() && name1.length() > name3.length()){
            System.out.println(name1 + " " + name1.length());
        }else if(name2.length() > name1.length() && name2.length() > name3.length()){
            System.out.println(name2 + " " + name2.length());
        }else if(name3.length() > name1.length() && name3.length() > name2.length()){
            System.out.println(name3 + " " + name3.length());
        }else{
            System.out.println(name1 + " " + name1.length());
        }
        kb.close();
    }
}