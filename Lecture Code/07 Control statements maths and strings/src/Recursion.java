import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();

        long iResult = iterativeMethod(num);
        System.out.println("Result: "+iResult);

        long rResult = factorial(num);
        System.out.println("Recursion Result: "+rResult);
    }

    //iterative method to find factorial
    public static long iterativeMethod(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //Recursion method to find factorial
    public static long factorial(int n){
        if (n == 1 ){
            return 1;
        }

        return n * factorial(n-1);
    }
}
