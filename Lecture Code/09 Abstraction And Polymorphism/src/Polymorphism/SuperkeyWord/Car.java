package Polymorphism.SuperkeyWord;

class Car extends Vehicle {

    Car(){
        super();
    }

    //2.Super keyword for calling parent Constructor
    Car(int noOfTyres){
        super(noOfTyres);
    }

    public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        //1.super keyword for accessing parent variable
        System.out.println("vehicle no.of tyres is : "+super.getNoOfTyres());
        System.out.println("Car is started...");
    }
}
