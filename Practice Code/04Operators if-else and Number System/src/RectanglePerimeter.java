import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st side length of Rectangle: ");
        double firstSide = input.nextDouble();
        System.out.print("Enter 2nd side length of Rectangle: ");
        double secondSide = input.nextDouble();
        System.out.print("Enter 3rd side length of Rectangle: ");
        double thirdSide = input.nextDouble();
        System.out.print("Enter 4th side length of Rectangle: ");
        double fourthSide = input.nextDouble();

        double perimeter = firstSide+secondSide+thirdSide+fourthSide;
        System.out.println("Perimeter: "+perimeter);
    }
}
