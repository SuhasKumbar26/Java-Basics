import java.util.Scanner;

public class GreatestOf3Num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();

        if(num1>num2){
            System.out.print("num1: "+num1);
        } else if (num2 > num3) {
            System.out.print("num2: "+num2);
        } else System.out.print("num3: "+num3);
    }
}
