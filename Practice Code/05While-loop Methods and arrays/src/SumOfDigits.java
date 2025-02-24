import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("sum of Number "+num+" is: "+sum);
    }

    // Method for Calculation of Sum of digits
    public static int sumOfDigits(int n){
        int sum = 0;
        int reminder = 0;
        while(n>0){
            reminder = n%10;
            sum += reminder;
            n /= 10;
        }
        return sum;
    }
}
