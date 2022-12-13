public class ElevatorTest{
    public static void main(String[] args){
        Elevator southWing = new Elevator("South Wing", 15, 100);
        System.out.println(southWing.toString());
        /*System.out.println("The name is: " + southWing.getName());
        System.out.println("The maximum floor is: " + southWing.getTopFloor());
        System.out.println("The capacity is: " + southWing.getCapacity());
        System.out.println("");*/

        Elevator northTower = new Elevator("North Tower", 20, 125);
        System.out.println(northTower.toString());
        /*System.out.println("The name is: " + northTower.getName());
        System.out.println("The maximum floor is: " + northTower.getTopFloor());
        System.out.println("The capacity is: " + northTower.getCapacity());
        System.out.println("");*/

        Elevator centralWing = new Elevator("Central Wing", 10, 175);
        System.out.println(centralWing.toString());
        /*System.out.println("The name is: " + centralWing.getName());
        System.out.println("The maximum floor is: " + centralWing.getTopFloor());
        System.out.println("The capacity is: " + centralWing.getCapacity());
        System.out.println("");*/
    }
}