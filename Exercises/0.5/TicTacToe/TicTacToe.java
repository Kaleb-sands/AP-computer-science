public class TicTacToe{
    private String board[][] = {
        {"","",""},
        {"","",""},
        {"","","",},
    };
    public void print(){
        for(int row = 0; row < board.length; row++){
            System.out.println("-----");
            System.out.print("|");
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col].equalsIgnoreCase("x")){
                    System.out.print("x");
                }else if(board[row][col].equalsIgnoreCase("o")){
                    System.out.print("o");
                }else{
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println("-----");
        }
    }
}