package ArrayProblems;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] array = ArrayUtility.inputElements();
        ArrayUtility.displayElements(array);

        System.out.print("Enter number to delete: ");
        int num = scan.nextInt();

        int occ = occurrenceOfNum(array,num);

        int[] newArray = deleteElement(array,occ,num);

        ArrayUtility.displayElements(newArray);
    }

    //delete element from Array
    public static int[] deleteElement(int[] arr,int occurrence,int element){
        if (occurrence == 0){
            return arr;
        }
        int[] newArr = new int[arr.length - occurrence];
        int i = 0 , k = 0;
        while (i < arr.length){
            if (arr[i] != element){
                newArr[k]=arr[i];
                k++;
            }
            i++;
        }
        return newArr;
    }

    //count no of occurrences
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
