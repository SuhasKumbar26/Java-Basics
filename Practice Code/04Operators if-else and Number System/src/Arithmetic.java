import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();

        System.out.println("a+b:"+ (a+b));
        System.out.println("a-b:"+ (a-b));
        System.out.println("a*b:"+ (a*b));
        System.out.println("a/b:"+ (a/b));
        System.out.println("a%b:"+ (a%b));
    }
}
