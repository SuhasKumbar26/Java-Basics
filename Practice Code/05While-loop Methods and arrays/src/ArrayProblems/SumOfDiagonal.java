package ArrayProblems;

import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to Sum of DiagonalSum");
        System.out.print("Rows: ");
        int rows = scan.nextInt();
        System.out.print("columns: ");
        int col = scan.nextInt();

        int[][] array = SearchIn2dArray.input2dElement(rows,col);
        SearchIn2dArray.displayElements(array);

        int sum = sum(array);
        System.out.println("Diagonal element sum is: "+sum);

    }

    //Left diagonal Sum
    public static int leftDiagonalSum(int[][] arr){
        int LeftSum = 0;
        int i = 0;
        while (i < arr.length){
            LeftSum += arr[i][i];
            i++;
        }
        System.out.println("Left diagonal sum: "+LeftSum);
        return LeftSum;
    }

    //Right diagonal Sum
    public static int rightDiagonalSum(int[][] arr){
        int RightSum = 0;
        int i = 0;
        while (i < arr.length){
            RightSum += arr[i][(arr.length-1)-i];
            i++;
        }
        System.out.println("Right diagonal sum: "+ RightSum);
        return RightSum;
    }

    // Sum of both right and left diagonal
    public static int sum(int[][] arr){
        int LeftSum = leftDiagonalSum(arr);
        int RightSum = rightDiagonalSum(arr);

        int diagonalSum = LeftSum+RightSum;

        if (arr.length % 2 != 0){
            int arrayMid = arr.length/2;
            return diagonalSum - arr[arrayMid][arrayMid];
        }
        return diagonalSum;
    }
}
