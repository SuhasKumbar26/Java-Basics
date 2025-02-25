package ArrayProblems;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = ArrayUtility.inputElements();
        ArrayUtility.displayElements(array);

        int max = maximum(array);
        System.out.println("\nMaximum is: "+ max);

        int min = minimum(array);
        System.out.println("Minimum is: "+ min);
    }

    // Maximum method
    public static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length){
            if(arr[i]>=max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    // Minimum method
    public static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        int j = 0;
        while (j < arr.length){
            if (arr[j]<=min){
                min = arr[j];
            }
            j++;
        }
        return min;
    }
}
