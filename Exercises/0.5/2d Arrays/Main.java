public class Main{
    public static void main(String[] args){
        char[][] square = new char[10][10];
        for(int row = 0; row < square.length; row++){
            for(int column = 0; column < square[0].length; column++){
                square[row][column] = '-';
            }
        }
        printArray(square);
    }
    public static void printArray(char arr[][]){
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[0].length; column++){
                if(column == arr[0].length-1){
                    System.out.println(arr[row][column]);
                }else{
                    System.out.print(arr[row][column] + " ");
                }
            }
        }
    }
}