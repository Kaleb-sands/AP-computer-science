public class Elevator
{
   private String name;
   private int currentFloor;          // the floor the elevator is currently at
   private int capacity;     // number of people that this elevator can hold
   private int numPeople;     // current number of people on the elevator
   private int topFloor;      // number of floors for this elevator
   private boolean doorOpen;   //true if doors are open,  false means doors are closed
   
   public Elevator(){ // Empty constructor
    this.name = "Null";
    this.capacity = 0;
    this.topFloor = 0;
   }
   public Elevator(String title, int numPeople, int totalFloor){ // 3 variable constructor
    this.name = title;
    this.capacity = numPeople;
    this.topFloor = totalFloor;
   }
   // Setters and Getters for the field variables 
   public void setName(String n) {
        this.name = n;
   }

   public void setCurrentFloor(int newFloor) {
        this.currentFloor = newFloor;
   }
   

   
   
public void setCapacity(int cap) {
        this.capacity = cap;
   }
   
   public void setNumPeople(int p) {
        this.numPeople = p;
   }
 
   public void setTopFloor(int maxFloor) {
        this.topFloor = maxFloor;
   }
   public String getName() {
       return this.name;
   }

   public void setDoorOpen(boolean d) {
        this.doorOpen = d;
   }
   public int getCurrentFloor() {
        return this.currentFloor;
   }
        
   public int getCapacity() {
        return this.capacity;
   }
   
   public int getNumPeople() {
        return this.numPeople;
   }
   
   public int getTopFloor() {
        return this.topFloor;
   }
   
   public boolean getDoorOpen() {
        return this.doorOpen;
   }
   
   //METHOD ACTIONS

   public void goUp() {    // go up one floor
        this.currentFloor++;
   }
   
   
   public void goDown() {  // go down one floor
        this.currentFloor--;
   }
   
   public void goToFloor(int requestedFloor) {    // go to requested floor
        this.currentFloor = requestedFloor;
   }
   
   public void addPeople(int numP) {    // add the number of people getting on
        this.numPeople += numP;
   }
    
   public void removePeople(int numP) {   // subtract the number of people getting off
        this.numPeople -= numP;
   }
    
   public void openDoor(){     //open the doors
        this.doorOpen = true;
    }
    
    public void closeDoor() {  //close the doors
        this.doorOpen = false;
    }
    public void displayInfo(){
        System.out.println("----" + this.name + "----");
        System.out.println("The current floor is: " + this.currentFloor);
        System.out.println("The top floor is: " + this.topFloor);
        System.out.println("The capacity is: " + this.capacity);
        System.out.println("The doors are open: " + this.doorOpen);
        System.out.println("There are " + this.numPeople + " on the elevator");
        System.out.println("");
    }
    public String toString(){
        return "Name: " 
        + this.name + "\nCapacity: "
        + this.capacity + "\nCurrent Floor: "
        + this.currentFloor;
    }
}
