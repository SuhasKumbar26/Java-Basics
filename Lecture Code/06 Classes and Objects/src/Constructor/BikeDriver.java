package Constructor;

public class BikeDriver {
    public static void main(String[] args) {
        Bike newBike = new Bike();
        System.out.println(newBike.color);
        System.out.println(newBike.maxSpeed);
        newBike.start();
        System.out.println(Bike.noOfBikeSold);

        System.out.println("--------------");

        Bike yamaha = new Bike("Grey");
        System.out.println(yamaha.color);
        System.out.println(yamaha.maxSpeed);
        yamaha.start();
        System.out.println(Bike.noOfBikeSold);

    }
}
