package Polymorphism.UpcastingAndDownCasting;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is starting..");
    }

    public int noOfDoors(){
        return 5;
    }
}
