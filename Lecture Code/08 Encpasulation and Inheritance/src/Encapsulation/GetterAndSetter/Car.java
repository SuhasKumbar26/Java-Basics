package Encapsulation.GetterAndSetter;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfPurchase;

    Car (String color,String model,double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }

    void setColor(String color){
        if (color.equals("Yellow")){
            System.out.println("\nNot possible");
        } else {
            this.color = color;
        }
    }

    public String getModel(){
        return model;
    }
}
