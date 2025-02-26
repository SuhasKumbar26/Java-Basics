package ObjectAndClasses;

public class Car {

    //instance Variables
    int maxSpeed;
    String color;
    String model;
    float mileage;
    float fuelLevel;

    //instance methods
    public void Star(){
        if (fuelLevel == 0){
            System.out.println("Add fuel...");
        } else if (fuelLevel <= 5) {
            System.out.println("Car is in reserve Mode");
        } else System.out.println("Car is started...");
    }

    public void drive(){
        System.out.println("Car is Moving...");
    }

    public void addFuel(float fuel){
        fuelLevel += fuel;
    }

    public void getFuelLevel(){
        System.out.println("car has Fuel: "+fuelLevel);
    }
}
