public class Main{
    public static void petCreator(){
        Pet[] arr = new Pet[5];
        arr[0] = new Pet("Jeffery", 5);
        arr[1] = new Pet("Chuck", 10);
        arr[2] = new Pet("Deveen", 12);
        arr[3] = new Pet("Owen the Whale", 4);
        arr[4] = new Pet("Josh the living all you can eat buffet", 9);
        for(int column = 0; column < arr.length; column++){
            System.out.println("Animal Name: " + arr[column].getName() + ", Animal Age: " + arr[column].getAge());
        }
    }
    public static void boxCreator(){
        Box[] arr = new Box[5];
        for(int column = 0; column < arr.length; column++){
            arr[column] = new Box(3, 3, 3);
        }
    }
    public static void main(String[] args){
        boxCreator();
        petCreator();
    }
}