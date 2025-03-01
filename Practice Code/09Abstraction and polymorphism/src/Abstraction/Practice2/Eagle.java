package Abstraction.Practice2;

public class Eagle extends Bird{

    public Eagle(String breed){
        super(breed);
    }

    private int Speed;

    @Override
    public void fly(){
        System.out.printf("Eagle(%s) is flying...",super.breed);
    }
}
