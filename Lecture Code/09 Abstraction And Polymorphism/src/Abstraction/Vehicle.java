package Abstraction;

// abstract classes object can't be created they are just built to extend
public abstract class Vehicle implements Transport {
    private int noOfTyres;

    Vehicle(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }
    public int getNoOfTyres(){
        return this.noOfTyres;
    }

    public void commute(){
        System.out.println("Going from point A to Point B using: "+this.noOfTyres+" Tyres");
    }
    //we can declare abstract methods without implementation
    public abstract void makeStartSound();

}
