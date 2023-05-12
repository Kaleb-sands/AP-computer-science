public class TicTacToe{
    private String board[][] = new String[3][3];
    public TicTacToe(){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                board[r][c] = "";
            }
        }
    }

    public void initializeBoard(){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                board[r][c] = "";
            }
        }
    }

    public boolean isBoardFull(){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c].equals("")){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isEmpty(int r, int c){
        if(board[r][c].equals("")){
            return true;
        }
        return false;
    }

    public boolean placeMarker(int r, int c, String marker){
        if(r > 2 || c > 2){
            return false;
        }else if(isEmpty(r,c)){
            board[r][c] = marker;
            return true;
        }
        return false;
    }

    private boolean checkDiagsForWin(String player){
        if(board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)){
            return true;
        }else if(board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)){
            return true;
        }else{
            return false;
        }
    }

    private boolean checkRowsForWin(String player){
        for(int i = 0; i < board.length; i++){
            if(board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)){
                return true;
            }
        }
        return false;
    }

    private boolean checkColsForWin(String player){
        for(int i = 0; i < board.length; i++){
            if(board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)){
                return true;
            }
        }
        return false;
    }

    public boolean checkForWin(String player){
        if(checkDiagsForWin(player) || checkRowsForWin(player) || checkColsForWin(player)){
            return true;
        }
        return false;
    }

    public void displayboard(){
        System.out.print("    1   2   3");
        for(int row = 0; row < board.length; row++){
            System.out.println("\n  -------------");
            System.out.print((row+1) + " |");
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col].equalsIgnoreCase("x")){
                    System.out.print(" x ");
                }else if(board[row][col].equalsIgnoreCase("o")){
                    System.out.print(" o ");
                }else{
                    System.out.print("   ");
                }
                System.out.print("|");
            }
        }
        System.out.println("\n  -------------");
    }
}