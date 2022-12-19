public class MountainBike extends Bicycle{
    private int seatHeight;

    public MountainBike(int gear, int speed, int startSeatHeight){
        super(gear, speed);
        this.seatHeight = startSeatHeight;
    }
    public void shiftUp(){
        setGear(getGear() + 1);
    }
    public void downShift(){
        setGear(getGear() - 1);
    }
    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }
    public int getSeatHeight(){
        return this.seatHeight;
    }
}