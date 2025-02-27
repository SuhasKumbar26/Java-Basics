package ForEachLoop;

import ArrayProblems.ArrayUtility;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = ArrayUtility.inputElements();
        System.out.print("Enter element to count: ");
        int element = scan.nextInt();
        int count = occurrenceCount(arr,element);
        System.out.println("Element "+element+" count is: "+count);
    }

    //Occurrence of counting method
    public static int occurrenceCount(int[] arr, int ele){
        int count = 0;
        for(int n: arr){
            if(n == ele){
                count++;
            }
        }
        return count;
    }
}
