package ArrayProblems;

import java.util.Scanner;

public class ArrayUtility {

    // Inputting Array elements
    public static int[] inputElements(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int size = scan.nextInt();
        int[] numberArray = new int[size];

        int i = 0;
        while (i < numberArray.length){
            System.out.print("index ["+i+"]: ");
            numberArray[i] = scan.nextInt();
            i++;
        }
        return numberArray;
    }

    // Displaying Array elements
    public static void displayElements(int[] arr){
        int j = 0;
        System.out.println("\nDisplaying Array Elements");
        while (j < arr.length){
            System.out.println("index ["+ j +"]: "+arr[j]);
            j++;
        }
    }
}
