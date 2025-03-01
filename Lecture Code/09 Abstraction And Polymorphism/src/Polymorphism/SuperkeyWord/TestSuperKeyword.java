package Polymorphism.SuperkeyWord;

public class TestSuperKeyword {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("No.of Doors: "+car.noOfDoors());
        car.start();

        Car raceCar = new Car(4);
        System.out.println("No.of Doors: "+raceCar.noOfDoors());
        raceCar.start();
    }
}
