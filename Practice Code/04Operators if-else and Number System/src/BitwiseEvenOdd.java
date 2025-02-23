import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        if((num & 1) == 1 ){
            System.out.println("Odd");
        } else System.out.println("Even");
    }
}
