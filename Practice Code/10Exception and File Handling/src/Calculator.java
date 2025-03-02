import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        int result = 0;

        try {
            //int[] arr = new int[2];
            //System.out.println(arr[2]);
            result = num1 / num2;
            System.out.printf("Result is: %d",result);
        } catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Divide by Zero occurred.");
            } else {
                throw exception;
            }
        } /*catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("ArrayIndexOutOfBoundsException");
        } */ finally {
            System.out.println("\nI am in finally block");
        }

    }
}
