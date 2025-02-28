package Inheritance;

public class Vehicle {
    protected int noOfWheels;

    public void commute(){
        System.out.printf("A'm going from place A to Place B using %d wheels\n",this.noOfWheels);
    }

}
