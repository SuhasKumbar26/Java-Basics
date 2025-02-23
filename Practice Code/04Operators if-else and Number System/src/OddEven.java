import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        if(num%2==1){
            System.out.print("Odd");
        } else System.out.println("Even");
    }
}
