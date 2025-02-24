import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        long fact = factorialOfNum(num);
        System.out.println("Factorial is: "+fact);
    }

    // Method to calculate Factorial of number
    public static long factorialOfNum(int n){
        if (n<2){
            return 1;
        }

        long fact = 1;
        int i = 1;
        while (i <= n){
            fact *=i;
            i++;
        }
        return fact;
    }
}
