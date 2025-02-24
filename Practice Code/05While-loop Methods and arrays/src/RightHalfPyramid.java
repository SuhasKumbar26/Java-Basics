import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int noOfLines = scan.nextInt();
        rightHalfPyramid(noOfLines);
    }

    //method for printing right half pyramid
    public static void rightHalfPyramid(int n){
        int rows = 0;
        while(rows < n){
            System.out.print("*");

            int i = 0;
            while (rows > i){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows ++;
        }
    }
}
