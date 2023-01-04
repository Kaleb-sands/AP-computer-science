import java.util.Scanner;

public class BearTester {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        Bear mamaBear = new Bear("Mama Bear");
        Bear papaBear = new Bear("Papa Bear");
        Bear babyBear = new Bear("Baby Bear");

        System.out.println("How many hugs does the Mama bear get: ");
        int mBearHugs = kb.nextInt();
        System.out.println("How many hugs does the Papa bear get: ");
        int pBearHugs = kb.nextInt();
        System.out.println("How many hugs does the Baby bear get: ");
        int bBearHugs = kb.nextInt();

        mamaBear.addHugs(mBearHugs);
        papaBear.addHugs(pBearHugs);
        babyBear.addHugs(bBearHugs);

        System.out.println(mamaBear.toString());
        System.out.println(papaBear.toString());
        System.out.println(babyBear.toString());

        System.out.println("The total amount of hugs from all three bears is : " + Bear.getTotalHugs());

        kb.close();
}
}
