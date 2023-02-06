import java.util.Scanner;
public class BeatThatFinal{
    public static void main(String[] args){
        int winCount = 0;
        int p1Wins = 0;
        int p2Wins = 0;
    
        Scanner kb = new Scanner(System.in);

        System.out.println("|----Welcome to Beat it!----|");
        System.out.println("|-Please enter name 1:      |");
        String p1 = kb.nextLine();
        System.out.println("|-Player 1: " + p1);
        System.out.println("|-Please enter name 2:      |");
        String p2 = kb.nextLine();
        System.out.println("|-Player 2: " + p2);
        System.out.println("|-Get ready to play!        |");
        System.out.println("|---------------------------|\n ");
        for(boolean playGame = true; playGame; ){
            int p1total = 0;
            int p2total = 0;
            System.out.println(p1 + " press enter to roll dice: ");
            kb.nextLine();
            p1total = doPlayerTurn(p1);
            System.out.println("Now its time for " + p2 + " to roll!");
            System.out.println(p2 + " press enter to roll dice: ");
            kb.nextLine();
            p2total = doPlayerTurn(p2);
            if(p1total > p2total){
                System.out.println(p1 + " won the game with " + p1total + " points!\n");
                winCount++;
                p1Wins++;
            }else if(p2total > p1total){
                System.out.println(p2 + " won the game with " + p2total + " points!\n");
                winCount--;
                p2Wins++;
            }else{
                System.out.println("You both tied with " + p1total + " points!\n");
            }
            System.out.println(p1 + " has " + p1Wins + " wins");
            System.out.println(p2 + " has " + p2Wins + " wins\n");
            System.out.println("Press 1 to play again or 2 to stop playing\n------------------------------------------");
            int keepPlaying = kb.nextInt();
            if(keepPlaying == 1){
                playGame = true; 
            }else{
                playGame = false;
            }
            }
        if(winCount < 0){
            System.out.println(p2 + " won the game with " + p2Wins + " wins!\n|-Good game!");
        }else if(winCount > 0){
            System.out.println(p1 + " won the game with " + p1Wins + " wins!\n|-Good game!");
        }else{
            System.out.println("You both tied with " + p1Wins + " wins!");
        }
        kb.close();
    }

    public static int rollDice(){
        int roll = (int)(Math.random() * 6 + 1);
        return roll;
    }
    
    public static int doPlayerTurn(String playerName){
        int playerTotal = 0;
        Scanner kb = new Scanner(System.in);
        for(int x = 0; x < 2; ){
            int p1roll1 = rollDice();
            int p1roll2 = rollDice();
            if(p1roll1 > p1roll2){
                playerTotal = p1roll1 * 10 + p1roll2;
            }else{
                playerTotal = p1roll2 * 10 + p1roll1;
            }
            System.out.println(playerName + " rolled a " + playerTotal);
            if(x == 0){
                System.out.println("Press 1 to roll again and 2 to continue: ");
                int rollAgain = kb.nextInt();
                if(rollAgain == 2){
                    x = 2;
                }
            }
            x++;
        }
        kb.close();
        return playerTotal;
    }
}