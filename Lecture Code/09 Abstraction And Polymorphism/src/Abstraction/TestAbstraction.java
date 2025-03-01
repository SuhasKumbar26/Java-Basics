package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        // Vehicle' is abstract; cannot be instantiated
        // Vehicle vehicle = new Vehicle(2);

        Car car = new Car(4);
        System.out.println(car.getNoOfTyres());
        car.commute();
        car.makeStartSound();

        // static method in Transport(interface) so we can call without object creation
//      Transport.go();
    }
}
