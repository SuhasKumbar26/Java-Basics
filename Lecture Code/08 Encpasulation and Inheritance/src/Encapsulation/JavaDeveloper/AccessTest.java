package Encapsulation.JavaDeveloper;

public class AccessTest {
    public static void main(String[] args){
        Car swift = new Car();
        swift.color = "Black";
        swift.Model = "Suv123";
//      swift.fuelLevel = 23.56;
        System.out.println(swift);
        System.out.println("Cost Price: "+swift.costOfPurchase); // accessed bcz we are in same package.

        Car newCar = new Car("Black","BMW-D12",10.3,50000);
        System.out.println(newCar);
        System.out.println("Cost Price: "+newCar.costOfPurchase); // accessed bcz we are in same package

        Default def = new Default();// we access bcz its default Class
    }
}
