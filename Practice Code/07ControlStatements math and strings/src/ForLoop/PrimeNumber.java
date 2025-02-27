package ForLoop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        boolean isPrime = isPrime(num);

        if (isPrime){
            System.out.println("Yes it's prime number");
        } else System.out.println("No sorry");
    }

    //Method to check prime or not
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
