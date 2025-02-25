package ArrayProblems;

import java.util.Scanner;

public class SearchIn2dArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter no.of columns: ");
        int col = scanner.nextInt();
        int[][] array = input2dElement(rows,col);
        displayElements(array);
        System.out.print("Enter element to Search: ");
        int element = scanner.nextInt();
        boolean isFound = elementIsFound(array,element);
        if (isFound){
            System.out.println("yes it's FOUND");
        } else System.out.println("No Sorry...");
    }

    //Inputting 2D array elements
    public static int[][] input2dElement(int rows,int col){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int[][] arr = new int[rows][col];
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.print("index ["+i+"]"+"["+j+"]: ");
                arr[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        System.out.println();
        return arr;
    }

    //Displaying 2d array elements
    public static void displayElements(int[][] arr){
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    //Searching element in 2D array
    public static boolean elementIsFound(int[][] arr,int element){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                if (arr[i][j] == element){
                    return true;
                }
                j++;
            }
            i++;
        }
        System.out.println();
        return false;
    }
}
