import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Breadth: ");
        float breadth = input.nextFloat();
        System.out.print("Enter height: ");
        float height = input.nextFloat();

        float area =  1.0f / 2 * breadth * height;
        System.out.println("Area: "+ area);
    }
}
