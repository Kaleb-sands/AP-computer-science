import java.util.Scanner;

public class EmployeeTester{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("What is the employee name: ");
        String name = kb.nextLine();
        
        System.out.println("What is the insurance number: ");
        String insNum = kb.nextLine();
        System.out.println("What is the salary: ");
        double sal = kb.nextDouble();
        System.out.println("What is starting year: ");
        int date = kb.nextInt();
        
        Employee a = new Employee(name, sal, date, insNum);

        a.display();
        kb.close();
    }
}