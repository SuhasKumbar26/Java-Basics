package MathClass;

import java.util.Scanner;

public class Circle {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double getCircumference(){
        return 2 * radius * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle props: "
                +"Radius in mm:"+radius
                +" Circumference in mm:"+getCircumference()
                +" Area in mm:"+getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.9);
        System.out.println("Circle circumference is: "+circle.getCircumference());
        System.out.println("Circle Area is: "+circle.getArea());
        System.out.println(circle);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = scan.nextDouble();

        Circle circle1 = new Circle(radius);
        System.out.println(circle1);
    }
}
