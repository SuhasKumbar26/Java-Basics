package TernaryOperator;

import java.util.Scanner;

public class AbsoluteNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();

        int absNum = (num >= 0) ? num : -num;

        System.out.println("Your absolute number is: "+absNum);
    }
}
