public class ElevatorApp{
    public static void main(String[] args){
        Elevator east = new Elevator();
        east.setName("east Elevator");
        east.setTopFloor(50);
        east.setCapacity(10);
        east.setCurrentFloor(1);
        east.setDoorOpen(false);
        east.setNumPeople(0);

        east.openDoor();
        east.addPeople(2);
        east.closeDoor();
        east.goUp();
        east.openDoor();
        east.removePeople(1);
        east.closeDoor();
        east.goUp();
        east.openDoor();
        east.addPeople(1);
        east.closeDoor();

        east.displayInfo();

        Elevator west = new Elevator();
        west.setName("west Elevator");
        west.setTopFloor(100);
        west.setCapacity(20);
        west.setCurrentFloor(75);
        west.setDoorOpen(true);
        west.setNumPeople(5);

        west.addPeople(3);
        west.closeDoor();
        west.goToFloor(32);
        west.openDoor();
        west.removePeople(6);
        west.closeDoor();
        west.goDown();
        west.openDoor();
        west.addPeople(2);
        west.closeDoor();
        west.goToFloor(5);
        west.openDoor();
        west.removePeople(1);

        west.displayInfo();
    }
}