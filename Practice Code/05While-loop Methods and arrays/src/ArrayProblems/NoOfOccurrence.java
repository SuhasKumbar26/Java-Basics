package ArrayProblems;

import java.util.Scanner;

public class NoOfOccurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to No of Occurrence calculation");
        int[] array = ArrayUtility.inputElements();
        ArrayUtility.displayElements(array);
        System.out.print("\nEnter number: ");
        int num = scan.nextInt();
        int occurrence = occurrenceOfNum(array,num);
        System.out.println(num+" Occurrence is: "+occurrence);
    }

    //method to find number of occurrence
    public static int occurrenceOfNum(int[] arr, int element){
        int occurrence = 0;
        int i = 0;
        while (i < arr.length){
            if (arr[i] == element){
                occurrence++;
            }
            i++;
        }
        return occurrence;
    }
}
