import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter 2nd Number: ");
        float num2 = input.nextFloat();

        System.out.println("Product is: "+(num1*num2));
    }
}
