package ThisKeyword;

public class ThisCar {

    int maxSpeed;
    String color;
    String model;
    float mileage;
    float fuelLevel;

    // here we're returning Same object using THIS keyword
    public ThisCar Star(){

        if (fuelLevel == 0){
            System.out.println("Add fuel...");
        } else if (fuelLevel <= 5) {
            System.out.println("Car is in reserve Mode");
        } else System.out.println("Car is started...");

        return this; // this keyword
    }

    public void drive(){
        System.out.println("Car is Moving...");
    }

    public void addFuel(float fuelLevel){
        this.fuelLevel += fuelLevel;
        //this keyword refers current object
    }

    public void getFuelLevel(){
        System.out.println("car has Fuel: "+fuelLevel);
    }
}
