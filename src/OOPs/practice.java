package OOPs;

public class practice {
    public static void main(String[] args) {
        Bicycle hero=new Bicycle();
        System.out.println("Ready To Ride Your Bicycle");
        hero.Gear(0);
        System.out.println();
        Bike shine=new Bike();
        System.out.println("Ready To Ride Your Bike");
        shine.Gear(2);
        System.out.println();
        Car Baleno=new Car();
        System.out.println("Ready To Drive Your Car");
        Baleno.Gear(4);
    }
}
interface Vehicle{
    void Gear(int Mygear);
}
class Bicycle implements Vehicle {
    @Override
    public void Gear(int Mygear) {
        if (Mygear>2){
            System.out.println("NOT VAIELID GEAR ON BiCyCLE");
        }
        if (Mygear==0){
            System.out.println("START TO RIDE YOUR BICYCLE GEAR IS :"+Mygear);
        }
        if (Mygear==1){
            Mygear=Mygear-1;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
            }
        if (Mygear==2){
            Mygear=Mygear-2;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
    }
}
class Bike implements Vehicle {
    @Override
    public void Gear(int Mygear) {
        if (Mygear>3){
            System.out.println("NOT VAIELID GEAR ON BIKE");
        }
        if (Mygear==0){
            System.out.println("START YOUR BIKE GEAR IS :"+Mygear);
        }
        if (Mygear==1){
            Mygear=Mygear-1;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
        if (Mygear==2){
            Mygear=Mygear-2;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
        if (Mygear==3){
            Mygear=Mygear-3;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
    }
}
class Car implements Vehicle {
    @Override
    public void Gear(int Mygear) {
        if (Mygear>5){
            System.out.println("NOT VAIELID GEAR ON CAR");
        }
        if (Mygear==0){
            System.out.println("START YOUR CAR GEAR IS :"+Mygear);
        }
        if (Mygear==1){
            Mygear=Mygear-1;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
        if (Mygear==2){
            Mygear=Mygear-2;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
        if (Mygear==3){
            Mygear=Mygear-3;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
        if (Mygear==4){
            Mygear=Mygear-4;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
        if (Mygear==5){
            Mygear=Mygear-5;
            System.out.println("GO ON THE WAY YOUR GEAR IS :"+Mygear);
        }
    }
}