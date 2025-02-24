import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        PrintFibonacci(num);
    }

    //Fibonacci Series method
    public static void PrintFibonacci(int n){
        if (n < 0 || n == 0) return;
        System.out.print("0 1 ");

        int first = 0 , second = 1,third = 0;

        while (first + second <= n) {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
