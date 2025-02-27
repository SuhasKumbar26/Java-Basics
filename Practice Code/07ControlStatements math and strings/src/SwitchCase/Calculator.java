package SwitchCase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter operator: ");
        char operator = scan.next().charAt(0);

        int result = calculatorSwitch(num1,num2,operator);
        System.out.println("Your result is: "+result);
    }

    //method to calculator
    public static int calculatorSwitch(int n1 , int n2,int op){
        int result = 0;
        switch (op){
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '*':
                result = n1*n2;
                break;
            case '/':
                result = n1/n2;
                break;
            case '%':
                result = n1%n2;
                break;
            default:
                System.out.println("Nothing");
        }
        return result;
    }
}
