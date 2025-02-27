package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int count = scan.nextInt();
        for (int i = 1; i <= count;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }

    }
    // method to print fibonacci series
    public static long fibonacciSeries(int position){
        if(position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fibonacciSeries(position-1) + fibonacciSeries(position - 2);
    }
}
