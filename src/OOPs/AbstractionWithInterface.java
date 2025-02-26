package OOPs;

public class AbstractionWithInterface{
    public static void main(String[] args) {
        Bicycle b1=new Bicycle();
        b1.Gear(true);
        b1.Gear(true);
        b1.Gear(true);

        Bike shine=new Bike();
        shine.Gear(true);
        shine.Gear(false);
        shine.Gear(false);

        Car fortuner=new Car();
        fortuner.Gear(false);
        fortuner.Gear(true);

    }
}
interface Vehicle{
    void Gear(boolean Mygear);
}
class Bicycle implements Vehicle{
    private int Currentgear;
    @Override
    public void Gear(boolean Mygear) {
        if (Currentgear==0 && !Mygear){
            System.out.println("YOUR BICYCLE GEAR IS ALREADY 2");
        } else if (Currentgear==2 && Mygear) {
            System.out.println("YOUR MAXIMUM GEAR IS 2");
        } else if (Mygear) {
            Currentgear++;
            System.out.println("GO TO RIDE YOUR GEAR IS :"+Currentgear);
        } else if (!Mygear) {
            Currentgear--;
            System.out.println("GO TO RIDE YOUR GEAR IS :"+Currentgear);
        }
    }
}
class Bike implements Vehicle{
    private int Currentgear;
    @Override
    public void Gear(boolean Mygear) {
        if (Currentgear==0 && !Mygear){
            System.out.println("YOUR BIKE GEAR IS ALREADY 0");
        } else if (Currentgear==3 && Mygear) {
            System.out.println("YOUR MAXIMUM GEAR IS 3");
        } else if (Mygear) {
            Currentgear++;
            System.out.println("GO TO RIDE YOUR GEAR IS :"+Currentgear);
        } else if (!Mygear) {
            Currentgear--;
            System.out.println("GOT TO RIDE YOUR GEAR IS :"+Currentgear);
        }
    }
}
class Car implements Vehicle{
    private int Currentgear;
    @Override
    public void Gear(boolean Mygear) {
        if (Currentgear==0 && !Mygear){
            System.out.println("YOUR CAR GEAR IS ALREADY 0");
        } else if (Currentgear==5 && Mygear) {
            System.out.println("YOUR MAXIMUM GEAR IS 5");
        } else if (Mygear) {
            Currentgear++;
            System.out.println("GO TO DRIVE YOUR GEAR IS :"+Currentgear);
        } else if (!Mygear) {
            Currentgear--;
            System.out.println("GO TO DRIVE YOUR GEAR IS :"+Currentgear);
        }
    }
}