package Polymorphism.UpcastingAndDownCasting;

public class TestTransportation {
    public static void main(String[] args) {
        Car car = new Car();
        //Vehicle vehicle = new Vehicle();

        /*
        UPCASTING:
        1.Converts subclass to superclass reference
        2.automatic and safe
        3.access only to superclass methods
        */

        // Here subclass is Car() and superClass reference is vCar();
        Vehicle vCar = new Car();

        //Object oRef = new Vehicle();

//      ----------------------------------------------------------------------------

        /*
        DOWN CASTING:
        1.Converts Superclass to subclass reference
        2.manual and risky
        3.access to  subclass - specific methods
        */

        //throws error (compile time error)
        // Car car1 = new Vehicle();

        // castTest(vehicle); // method expects vehicle object that is given here
        castTest(car); // method expects vehicle object But car object also accepted
        Plane p = new Plane();
        castTest(p);
    }

    public static void castTest(Vehicle veh){
        //veh.start();
//       Car cVehicle = (Car) veh; // down casting
//       cVehicle.start();
        veh.start();

        if (veh instanceof Car){
            System.out.println("car instance is passed to the method");
        }
    }
}
