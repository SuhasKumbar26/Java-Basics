package Recursion;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scan.next();
        System.out.println(
                "Your string is "
                +((isPalindrome(str)) ? "Palindrome"
                                      :"Not palindrome"));
    }

    //method to check palindrome
    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }

        int lastPos = str.length()-1;
        if (str.charAt(0) != str.charAt(lastPos)){
            return false;
        }

        String newStr = str.substring(1,lastPos);
//        System.out.println("subStr: "+newStr);
        return isPalindrome(newStr);
    }
}
