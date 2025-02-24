import java.util.Scanner;

public class ReverseRightHalfPyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        int noOfLines = scan.nextInt();
        reverseRHP(noOfLines);
    }

    //method for printing right half pyramid
    public static void reverseRHP(int n){
        int rows = 0;
        while(rows < n){
            System.out.print("*");
            int i = n;

            while (rows<i-1){
                System.out.print(" *");
                i--;
            }

            System.out.println();
            rows++;
        }
    }
}
