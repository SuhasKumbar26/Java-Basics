package Polymorphism.Overriding;

public class Car extends Vehicle{

    @Override
    public void service() {
        super.service();
        System.out.println("Car service is going on...");
    }
}
