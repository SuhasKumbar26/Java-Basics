package developer.utils;

import com.developer.geometry.Circle;
import com.developer.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter circle radius: ");
        double radius = scan.nextDouble();
        circle.setRadius(radius);
        double circleArea = Math.PI * Math.pow(circle.getRadius(),2);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter rectangle length: ");
        double length = scan.nextDouble();
        rectangle.setLength(length);

        System.out.print("Enter rectangle breadth: ");
        double breadth = scan.nextDouble();
        rectangle.setBreadth(breadth);
        double rectangleArea = rectangle.getBreadth() * rectangle.getLength();

        System.out.println("Circle area: "+circleArea);
        System.out.println("Rectangle area: "+rectangleArea);


    }
}
