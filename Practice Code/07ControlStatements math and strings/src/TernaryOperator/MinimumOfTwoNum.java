package TernaryOperator;

import java.util.Scanner;

public class MinimumOfTwoNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = scan.nextInt();

        int minimumNum = (num1 < num2) ? num1 : num2;
        System.out.println("Minimum number is: "+minimumNum);
    }
}
