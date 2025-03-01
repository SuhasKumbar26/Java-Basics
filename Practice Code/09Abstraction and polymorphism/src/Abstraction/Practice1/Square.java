package Abstraction.Practice1;

public class Square extends Shape{
    private final double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    @Override
    public double calculateArea(){
        return Math.pow(side,2);
    }
}
