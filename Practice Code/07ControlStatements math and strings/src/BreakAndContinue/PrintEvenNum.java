package BreakAndContinue;

import java.util.Scanner;

public class PrintEvenNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number till you want EVEN numbers: ");
        int num = scan.nextInt();
        for (int i = 0 ; i <= num; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
