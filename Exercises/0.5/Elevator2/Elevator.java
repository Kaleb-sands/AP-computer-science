public class Elevator
{
   private String name;
   private int currentFloor;          // the floor the elevator is currently at
   private int capacity;     // number of people that this elevator can hold
   private int numPeople;     // current number of people on the elevator
   private int topFloor;      // number of floors for this elevator
   private boolean doorOpen;   //true if doors are open,  false means doors are closed
   
   //Setters and Getters for the field variables 

   public void setName(String n) {
       name = n;
   }

   public void setCurrentFloor(int newFloor) {
       currentFloor = newFloor;
   }
   

   
   
public void setCapacity(int cap) {
       capacity = cap;
   }
   
   public void setNumPeople(int p) {
       numPeople = p;
   }
 
   public void setTopFloor(int maxFloor) {
        topFloor = maxFloor;
   }
   public String getName() {
       return name;
   }

   public void setDoorOpen(boolean d) {
       doorOpen = d;
   }
   public int getCurrentFloor() {
       return currentFloor;
   }
        
   public int getCapacity() {
       return capacity;
   }
   
   public int getNumPeople() {
       return numPeople;
   }
   
   public int getTopFloor() {
        return topFloor;
   }
   
   public boolean getDoorOpen() {
       return doorOpen;
   }
   
   //METHOD ACTIONS

   public void goUp() {    // go up one floor
       currentFloor++;
   }
   
   
   public void goDown() {  // go down one floor
       currentFloor--;
   }
   
   public void goToFloor(int requestedFloor) {    // go to requested floor
       currentFloor = requestedFloor;
   }
   
   public void addPeople(int numP) {    // add the number of people getting on
       numPeople += numP;
   }
    
   public void removePeople(int numP) {   // subtract the number of people getting off
       numPeople -= numP;
   }
    
   public void openDoor(){     //open the doors
       doorOpen = true;
    }
    
    public void closeDoor() {  //close the doors
        doorOpen = false;
    }
    public void displayInfo(){
        System.out.println("----" + name + "----");
        System.out.println("The current floor is: " + currentFloor);
        System.out.println("The top floor is: " + topFloor);
        System.out.println("The capacity is: " + capacity);
        System.out.println("The doors are open: " + doorOpen);
        System.out.println("There are " + numPeople + " on the elevator");
        System.out.println("");
    }

}
