public class BikeRider{
    public static void main(String[] Args){
        MountainBike downHill = new MountainBike(10, 45, 5);
        downHill.setSeatHeight(10);
        downHill.applyBrake(5);
        downHill.downShift();
        System.out.println(downHill.toString());
    }
}