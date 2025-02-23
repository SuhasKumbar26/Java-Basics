import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 number: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2 number: ");
        int num2 = input.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.printf("num1: %d and num2: %d",num1,num2);
    }
}
