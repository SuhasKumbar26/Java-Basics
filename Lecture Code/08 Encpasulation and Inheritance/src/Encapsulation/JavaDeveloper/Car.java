package Encapsulation.JavaDeveloper;

public class Car {
    public String color;
    public String Model;
    private double fuelLevel;
    long costOfPurchase; //default so it can be accessed in same class and Same packages(in.JavaDeveloper)

    public Car(){

    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        Model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", Model='").append(Model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }


}
