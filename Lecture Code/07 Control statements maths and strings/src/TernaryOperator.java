import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int greatestNum = (num1 > num2) ? num1  : num2;
                        //(condition) ? True : False
        System.out.println(greatestNum+" is greatest Number");
    }
}
