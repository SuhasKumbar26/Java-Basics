import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int num = input.nextInt();
        System.out.println(num);

        System.out.print("Enter char: ");
        char myChar = input.next().charAt(0);
        System.out.println(myChar);

        System.out.print("Enter boolean: ");
        boolean bool = input.nextBoolean();
        System.out.println(bool);

        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println(myFloat);

        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println(myDouble);

        System.out.print("Enter String: ");
        String myName = input.nextLine();
        System.out.println(myName);

        System.out.println("Hello " +myName);
    }
}
