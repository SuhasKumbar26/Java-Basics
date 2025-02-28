package developer.geometry;

public class Circle {
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        if(radius >= 0){
            this.radius = radius;
        } else System.out.println("Sorry can't set radius");
    }

    public double getRadius() {
        return this.radius;
    }
}
