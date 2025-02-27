package BreakAndContinue;

import ArrayProblems.ArrayUtility;

import java.util.Scanner;

public class SumOfPositive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = ArrayUtility.inputElements();
        int sum = sumPositive(arr);
        System.out.println("Positive number sum is: "+sum);
    }

    //method to sum positive number from array
    public static int sumPositive(int[] arr){
        int sum = 0;
        for (int n: arr){
            if (n < 0){
                continue;
            }
            sum += n;
        }
        return sum;
    }
}
