import java.util.Scanner;

public class ReverseTheDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed Num: "+reversedNum);
    }

    //Method for Reversing number
    public static int reverseNumber(int n){
        int reversedNum= 0;
        while(n>0){
            int lastDigit = n % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            n /= 10;
        }
        return reversedNum ;
    }
}
