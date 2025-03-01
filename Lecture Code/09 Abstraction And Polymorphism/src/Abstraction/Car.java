package Abstraction;

public class Car extends Vehicle{

    private int noOfDoors;

    //Vehicle class has parameterized constructor,
    //so we have to call parents constructor using Super keyword by calling Car's constructor.
    Car(int noOfTyres){
        super(noOfTyres);
    }

    @Override
    public void getSetGo(){
        System.out.println("Going to different places...");
    }

    //To be child off vehicle we have to define it's all abstract methods.
    @Override
    public void makeStartSound() {
        System.out.println("Yeh i'm started...");
    }
}
