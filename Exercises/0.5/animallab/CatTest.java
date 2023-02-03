public class CatTest{
    public static void main(String[] args){
        Cat tuxedoCat = new Cat("Black", true);
        tuxedoCat.makeSound(true);
        System.out.println("The cat is black: " + tuxedoCat.isBlack());
    }
}