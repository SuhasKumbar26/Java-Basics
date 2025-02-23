import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] aegs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num1: ");
        int num2 = scanner.nextInt();

        System.out.println("num1 & num2: "+(num1 & num2));
        System.out.println("num1 | num2: "+(num1 | num2));
        System.out.println("num1 >> num2: "+(num1 >>2));
        System.out.println("num1 << num2: "+(num1 << 2));
        System.out.println("num1 ^ num2: "+(num1 ^ num2));
    }
}
