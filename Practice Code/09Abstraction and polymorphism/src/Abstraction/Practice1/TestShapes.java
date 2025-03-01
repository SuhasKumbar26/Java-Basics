package Abstraction.Practice1;

public class TestShapes {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Circle circle = new Circle(5);
        System.out.printf("Circle Area: %5.2f",circle.calculateArea());
        System.out.println();
        Square square = new Square(10.3);
        System.out.printf("Square Area: %5.2f",square.calculateArea());
    }
}
