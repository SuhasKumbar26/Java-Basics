import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        int sum = num1+num2;
        System.out.println("Sum: " +sum);
    }
}
