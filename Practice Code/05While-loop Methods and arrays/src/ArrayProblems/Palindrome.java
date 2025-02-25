package ArrayProblems;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Welcome to palindrome Checker");
        int[] array = ArrayUtility.inputElements();
        ArrayUtility.displayElements(array);
        boolean isPalindrome = isPalindrome(array);
        if (isPalindrome){
            System.out.println("Yes it's Palindrome Number");
        } else System.out.println("no it's NOT");
    }

    //Method to check palindrome
    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            if (arr[i] != arr[(arr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
