package Final;

public class CarFinal {

    final int noOfWheels;
    int model;
    String company;

    CarFinal(int noOfWheels){
        this.noOfWheels = noOfWheels;
    }

    public static void main(String[] args) {
        CarFinal car = new CarFinal(4);
        System.out.println("No of wheels: "+car.noOfWheels);
    }
}
