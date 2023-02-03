import java.util.Scanner;
public class BeatThat{
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
        System.out.println("|-Get ready to play!      |");
        System.out.println("|---------------------------|");
        for(boolean playGame = true; playGame; ){
            int p1total = 0;
            int p2total = 0;
            System.out.println("|-" + p1 + " please press 1 to roll dice: ");
            int roll = kb.nextInt();
            if(roll == 1){
                p1total = doPlayerturn(p1);
                System.out.println("|-" + p1 + " rolled a " + p1total);
                System.out.println("|-Now its time for " + p2 + " to roll!");
            }
            System.out.println("|-" + p2 + " please press 1 to roll dice: ");
            int roll2 = kb.nextInt();
            if(roll2 == 1){
                p2total = doPlayerturn(p2);
                System.out.println("|-" + p2 + " rolled a " + p2total);
            }
            if(p1total > p2total){
                System.out.println("|-" + p1 + " won the game with " + p1total + " points!");
                winCount++;
                p1Wins++;
            }else if(p2total > p1total){
                System.out.println("|-" + p2 + " won the game with " + p2total + " points!");
                winCount--;
                p2Wins++;
            }else{
                System.out.println("|-You both tied with " + p1total + " points!");
            }
            System.out.println("|-Press 1 to play again or 2 to stop playing");
            int keepPlaying = kb.nextInt();
            if(keepPlaying == 1){
                playGame = true; 
            }else{
                playGame = false;
            }
            }
        if(winCount < 0){
            System.out.println("|-" + p2 + " Won the game with " + p2Wins + " wins!\n|-Good game!");
        }else if(winCount > 0){
            System.out.println("|-" + p1 + " Won the game with " + p1Wins + " wins!\n|-Good game!");
        }else{
            System.out.println("|-You both tied with " + p1Wins + " wins!");
        }
        kb.close();
    }
    public static int rollDice(){
        int roll = (int)(Math.random() * 6 + 1);
        return roll;
    }
    public static int doPlayerturn(String playerName){
        int playerTotal =0;
        Scanner kboard = new Scanner(System.in);
            int p1roll1 = rollDice();
            int p1roll2 = rollDice();
            if(p1roll1 > p1roll2){
                playerTotal = p1roll1 * 10 + p1roll2;
            }else{
                playerTotal = p1roll2 * 10 + p1roll1;
            }
            System.out.println("|-" + playerName + " rolled a " + playerTotal);
            System.out.println("|-Press 1 if you would like to roll again and 2 to continue: ");
            int choice1 = kboard.nextInt();
            if(choice1 == 1){
                p1roll1 = rollDice();
                p1roll2 = rollDice();
                if(p1roll1 > p1roll2){
                    playerTotal = p1roll1 * 10 + p1roll2;
                }else{
                    playerTotal = p1roll2 * 10 + p1roll1;
                }
            }
        kboard.close();
        return playerTotal;
    }
}