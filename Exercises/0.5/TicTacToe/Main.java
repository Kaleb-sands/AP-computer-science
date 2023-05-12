import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        int count = 1, col,row;
        boolean play = true;
        String player = "";
        System.out.println("Welcome to TicTacToe! Player X starts first");
        game.displayboard();

        while(play){
            if(count % 2 != 0){
                player = "X";
            }else{
                player = "O";
            }
            System.out.println("Player " + player + " enter a column");
            col = kb.nextInt();
            System.out.println("Player " + player + " enter a row");
            row = kb.nextInt();

            if(game.placeMarker(row - 1, col - 1, player)){
                game.displayboard();
            }else{
                System.out.println("There is already a marker there. You have one more try.");
                System.out.println("Player " + player + " enter a column");
                col = kb.nextInt();
                System.out.println("Player " + player + " enter a row");
                row = kb.nextInt();

                game.placeMarker(row - 1, col - 1, player);
                game.displayboard();
            }
            if(game.checkForWin(player)){
                System.out.println("Player " + player + " won the game!");
                play = false;
            }
            if(game.isBoardFull()){
                System.out.println("Its a Tie!");
                play = false;
            }
            count++;
        } 
        kb.close();
    }
}