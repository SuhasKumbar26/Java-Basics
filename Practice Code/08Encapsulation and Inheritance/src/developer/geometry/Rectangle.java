package developer.geometry;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(){

    }

    public Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setBreadth(double breadth) {
        if( breadth >= 0){
            this.breadth = breadth;
        } else System.out.println("Sorry can't set Breadth");
    }

    public double getBreadth() {
        return this.breadth;
    }

    public void setLength(double length){
        if(length >= 0){
            this.length = length;
        } else System.out.println("Sorry can't set Length");
    }

    public double getLength() {
        return this.length;
    }
}
