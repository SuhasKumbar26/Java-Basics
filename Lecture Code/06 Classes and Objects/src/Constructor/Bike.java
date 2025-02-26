package Constructor;

public class Bike {

    static int noOfBikeSold;

    String color;
    float maxSpeed;
    String model;

    //code block
    static { //Runs only one time in the program before constructor called
        noOfBikeSold = 0;
        System.out.println("I'm in static block.....");
    }

    { //runs everyTime when new object is created
        noOfBikeSold++;
        System.out.println("I'm in Init block.....");
    }


    // default constructor
    Bike (){
        this("Black"); // calls parameterized Bike (String color){....} constructor
        maxSpeed = 125;
    }

    // parameterized constructor
    Bike (String color){
        this.color = color;
        maxSpeed = 100;
    }

    public void start(){
        System.out.println("Bike is started");
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("I'm in finalize block");
//    }
}
