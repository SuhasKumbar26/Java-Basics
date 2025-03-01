package Polymorphism.UpcastingAndDownCasting;

public class Plane implements Vehicle{

    @Override
    public void start() {
        System.out.println("Plane is taking off...");
    }
}
