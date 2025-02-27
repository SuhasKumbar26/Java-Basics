package TernaryOperator;

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num = scan.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("number "+num+" is "+result);
    }
}
