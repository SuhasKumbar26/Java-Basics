package Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        System.out.println();
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute();
        twoWheeler.balance();

        System.out.println();
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();  // --> vehicle
        motorCycle.balance(); // --> two-wheeler.
        motorCycle.start();  // --> motorcycle.
    }
}
