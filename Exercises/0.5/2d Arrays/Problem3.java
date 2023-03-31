public class Problem3{
    public static void main(String[]args){
        int[][] arr = new int[5][5];
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[0].length; column++){
                if(column == row){
                    arr[row][column] = row + 1;
                }else{
                    arr[row][column] = 0;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[][]){
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