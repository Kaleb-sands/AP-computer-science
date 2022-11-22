/*
 * This is a class about an elevator
 */
public class ElevatorClass{

    private String name;
    private int currentFloor;
    private int capacity;
    private int currentPassengers;
    private int highestFloor;
    private boolean doorOpen;

    public void setName(String elevatorName){
        name = elevatorName;
    }
    public String getName(){
        return name;
    }
    public void setCurrentFloor(int floorLevel){
        currentFloor = floorLevel;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void setCapacity(int elevatorCapacity){
        capacity = elevatorCapacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setPassengers(int occupants){
        currentPassengers = occupants;
    }
    public int getPassengers(){
        return currentPassengers;
    }
    public void setHighestFloor(int topFloor){
        highestFloor = topFloor;
    }
    public int getHighestFloor(){
        return highestFloor;
    }
    public void setDoors(boolean doorPosition){
        doorOpen = doorPosition;
    }
    public boolean getDoorPosition(){
        return doorOpen;
    }
    public void goUp(){
        if (currentFloor == highestFloor){
            System.out.println("You can't go higher");
        }
        else {
            currentFloor = currentFloor + 1;
        }
    }
    public void goDown(){
        currentFloor = currentFloor - 1;
    }
    public void goToFloor(int requestedFloor){
        currentFloor = requestedFloor;
    }
    public void addPeople(int peopleEntered){
        currentPassengers = currentPassengers + peopleEntered;
    }
    public void removePeople(int peopleLeft){
        currentPassengers = currentPassengers - peopleLeft;
    }
    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
}