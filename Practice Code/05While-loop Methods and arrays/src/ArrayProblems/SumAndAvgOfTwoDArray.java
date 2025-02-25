package ArrayProblems;

import java.util.Scanner;

public class SumAndAvgOfTwoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to sum and average of 2D array: ");
        System.out.print("Rows: ");
        int rows = scan.nextInt();
        System.out.print("columns: ");
        int col = scan.nextInt();

        int[][] array = SearchIn2dArray.input2dElement(rows,col);
        sumAndAvgOfTwoDArray(array);
    }

    //Searching Array element
    public static void sumAndAvgOfTwoDArray(int[][] arr){
        int i = 0;
        float sum = 0, avg = 0;
        int noOfElements = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                sum += arr[i][j];
                noOfElements++;
                j++;
            }
            i++;
        }
        avg = sum / noOfElements;
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+avg);
    }
}
