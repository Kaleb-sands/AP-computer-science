import java.util.Scanner;

public class BankApp{

    public static void main(String[] Args){
        Scanner kb = new Scanner(System.in);

        System.out.println("What is the account name:");
        String name = kb.nextLine();
        System.out.println("What is the account num:");
        int num = kb.nextInt();
        System.out.println("What is the current Balance");
        double bal = kb.nextDouble();
        
        BankAccount account1 = new BankAccount(name, num, false, bal);
        System.out.println(account1.toString());
        System.out.println("Press 1 to withdrawl or 2 to deposit");
        int choice1 = kb.nextInt();

        if(choice1 == 1){
            System.out.println("How much would you like to withdrawl:");
            double withdrawlamt = kb.nextDouble();
            System.out.println(account1.withdraw(withdrawlamt));
        }
        if(choice1 == 2){
            System.out.println("How much would you like to deposit:");
            double depositamt = kb.nextDouble();
            System.out.println(account1.deposit(depositamt));
        }
        kb.close();
    }
}