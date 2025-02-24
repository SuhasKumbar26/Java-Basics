import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        int noOfLines = scan.nextInt();
        leftHalfPyramid(noOfLines);
    }

    //Method to print Left half Pyramid
    public static void leftHalfPyramid(int maxRows){
        int rows = maxRows;
        while (rows > 0){

            //this loop prints Spaces
            int j = 0;
            while (j < rows-1){
                System.out.print("  ");
                j++;
            }

            //This loops prints Stars
            int i = 0;
            while (i <= maxRows-rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
