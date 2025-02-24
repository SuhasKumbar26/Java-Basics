import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        int reversedNum = reverseNum(num);
        System.out.println("Reversed number: "+reversedNum);
        isPalindrome(num,reversedNum);
    }
    //Method to revers a Number
    public static int reverseNum(int n){
        int finalNum = 0;
        while(n>0){
            int lastDigit = n % 10;
            finalNum = finalNum * 10 +lastDigit;
            n /= 10;
        }
        return finalNum;
    }

    // method to Check Palindrome Number
    public static void isPalindrome(int firstNum ,int finalNum ){
        if (firstNum == finalNum){
            System.out.println("Yes it's palindrome");
        } else System.out.println("No...");
    }
}
