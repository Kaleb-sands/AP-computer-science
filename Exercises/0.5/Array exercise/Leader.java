public class Leader{
    public static void main(String[] args){
        int[] arr = {16,17,4,3,5,2};
        int[] arr2 = {10,20,30,40};
        int[] arr3 = {50,60,70,80};
        printLeaders(arr);
        mergeArrays(arr2, arr3);
    }

    public static void printLeaders(int arr[]){
        for(int x = 0; x < arr.length; x++){
            for(int i = x+1; i < arr.length; i++){
                if(arr[x] < arr[i]){
                    break;
                }else if(i == arr.length-1){
                    System.out.println(arr[x]);
                }
            }
            
        }
        System.out.print(arr[arr.length-1]);
    }

    public static int[] mergeArrays(int arr[], int arr2[]){
        int finalArr[] = new int[arr.length + arr2.length];
        for(int x = 0; x < arr.length; x++){
            finalArr[x] = arr[x];
        }
        for(int i = 0; i < arr2.length; i++){
            finalArr[(arr.length)+i] = arr2[i];
        }
        System.out.print("\nArray 1: ");
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.print("\nArray 2: ");
        for(int x = 0; x < arr2.length; x++){
            System.out.print(arr2[x] + " ");
        }
        System.out.print("\nFinal Array: ");
        for(int x = 0; x < finalArr.length; x++){
            System.out.print(finalArr[x] + " ");
        }
        
        return finalArr;
    }
}