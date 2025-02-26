package ObjectAndClasses;

public class Driver {
    public static void main(String[] args) {

        Car myCar ; // Declaration --> Reference(myCar)
        myCar = new Car(); // initialization -->
                           // where new keyword creates Obj of class and stores it in myCar reference.


        /*
        here " . " (dot) operator is used access
        the method and instance variables of class
        */

        Car swift = new Car();

        swift.Star();

        swift.addFuel(10);

        swift.Star();

        swift.getFuelLevel();

        swift.drive();
    }
}
